package aspect.chou.aric.com.mvpactivityfragmentasview.dagger.component;


import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.ActivityScope;
import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.module.MainFragmentModule;
import aspect.chou.aric.com.mvpactivityfragmentasview.view.fragment.Fragment1;
import dagger.Component;

/**
 * Created by aric on 2015/6/10.
 */
@ActivityScope
@Component(modules ={MainFragmentModule.class},dependencies = AppComponent.class)
public interface MainFragmentComponent {

    Fragment1 inject(Fragment1 fragment1);

}

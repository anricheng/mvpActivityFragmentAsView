package aspect.chou.aric.com.mvpactivityfragmentasview.dagger.component;


import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.ActivityScope;
import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.module.MainActivityModule;
import aspect.chou.aric.com.mvpactivityfragmentasview.view.activity.MainActivity;
import dagger.Component;

/**
 * Created by aric on 2015/6/10.
 */
@ActivityScope
@Component(modules ={ MainActivityModule.class},dependencies = AppComponent.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);


}

package aspect.chou.aric.com.mvpactivityfragmentasview.dagger.module;

import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.ActivityScope;
import aspect.chou.aric.com.mvpactivityfragmentasview.presenter.MainFragmentPresenter;
import aspect.chou.aric.com.mvpactivityfragmentasview.view.fragment.Fragment1;
import dagger.Module;
import dagger.Provides;

/**
 * Created by aric on 2015/6/10.
 */
@Module
public class MainFragmentModule {

    private Fragment1 mFragment1;

    public MainFragmentModule(Fragment1 fragment) {
        this.mFragment1 = fragment;
    }

    @Provides
    @ActivityScope
    Fragment1 provideMainFragment() {
        return this.mFragment1;
    }

    @Provides
    @ActivityScope
    MainFragmentPresenter provideMainFragmentPresenter(Fragment1 mFragment1) {
        return new MainFragmentPresenter(mFragment1);
    }




}

package aspect.chou.aric.com.mvpactivityfragmentasview.dagger.module;

import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.ActivityScope;
import aspect.chou.aric.com.mvpactivityfragmentasview.presenter.MainActivityPresenter;
import aspect.chou.aric.com.mvpactivityfragmentasview.view.activity.MainActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by aric on 2017/11/15.
 */
@Module
public class MainActivityModule {

    private MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    @ActivityScope
    MainActivity provideMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    MainActivityPresenter provideMainActivityPresenter(MainActivity mainActivity){
        return new MainActivityPresenter(mainActivity);
    }

}

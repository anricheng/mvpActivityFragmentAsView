package aspect.chou.aric.com.mvpactivityfragmentasview.dagger.component;

import android.app.Application;

import javax.inject.Singleton;

import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.module.ApiServiceModule;
import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.module.AppModule;
import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.module.AppServiceModule;
import dagger.Component;

/**
 * Created by aric on 2015/6/9.
 */
@Singleton
@Component(modules = {AppModule.class, ApiServiceModule.class, AppServiceModule.class})
public interface AppComponent {


    Application getApplication();


}

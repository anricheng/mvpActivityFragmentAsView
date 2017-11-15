package aspect.chou.aric.com.mvpactivityfragmentasview;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.component.AppComponent;
import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.component.DaggerAppComponent;
import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.module.AppModule;

/**
 * Created by aric on 2015/6/9.
 */
public class MyApplication extends Application {

    private static AppComponent appComponent;
    private RefWatcher mRefWatcher;


    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        mRefWatcher = LeakCanary.install(this);

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }


    public static RefWatcher getRefWatcher(Context context) {
        MyApplication application = (MyApplication) context.getApplicationContext();
        return application.mRefWatcher;
    }
}

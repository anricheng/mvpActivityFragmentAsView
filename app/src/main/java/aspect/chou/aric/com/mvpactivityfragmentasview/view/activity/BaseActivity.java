package aspect.chou.aric.com.mvpactivityfragmentasview.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityComponent();
        initView();
    }

    public abstract void setActivityComponent();

    protected void initView(){}

    protected void Navigator(Class<? extends BaseActivity> clazz){
        startActivity(new Intent(this,clazz));
    }



}

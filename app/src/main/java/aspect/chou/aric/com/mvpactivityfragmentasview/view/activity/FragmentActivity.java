package aspect.chou.aric.com.mvpactivityfragmentasview.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import aspect.chou.aric.com.mvpactivityfragmentasview.R;
import aspect.chou.aric.com.mvpactivityfragmentasview.view.fragment.Fragment1;

public class FragmentActivity extends BaseActivity    {

    @Override
    public void setActivityComponent() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, Fragment1.newInstance("来自Activity的数据"))
                .commit();
    }
}

package aspect.chou.aric.com.mvpactivityfragmentasview.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import aspect.chou.aric.com.mvpactivityfragmentasview.MyApplication;
import aspect.chou.aric.com.mvpactivityfragmentasview.R;
import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.component.DaggerMainActivityComponent;
import aspect.chou.aric.com.mvpactivityfragmentasview.dagger.module.MainActivityModule;
import aspect.chou.aric.com.mvpactivityfragmentasview.model.Student;
import aspect.chou.aric.com.mvpactivityfragmentasview.model.User;
import aspect.chou.aric.com.mvpactivityfragmentasview.presenter.MainActivityPresenter;
import aspect.chou.aric.com.mvpactivityfragmentasview.view.ViewInterface;

public class MainActivity extends BaseActivity implements ViewInterface, View.OnClickListener {
    private TextView tvStudent;
    private TextView tvUser;
    private Button mButton;
    private static final String TAG = "MainActivityTag";
    @Inject
    MainActivityPresenter mPresenter;

    @Override
    public void setActivityComponent() {
        DaggerMainActivityComponent.builder()
                .appComponent(MyApplication.getAppComponent())
                .mainActivityModule(new MainActivityModule(MainActivity.this))
                .build().inject(MainActivity.this);
    }

    @Override
    public void showInfo(User user, Student student) {
        tvStudent.setText("student info:" + student.toString());
        tvUser.setText("user info" + user.toString());
    }

    @Override
    public Student loadStudent() {
        return new Student("studentName", "stuentId");
    }

    @Override
    public User loadUser() {
        return new User("userId", "userName");
    }

    @Override
    protected void initView() {
        super.initView();
        setContentView(R.layout.activity_main);
        tvStudent = (TextView) findViewById(R.id.tv_student);
        tvUser = (TextView) findViewById(R.id.tv_user);
        mButton =findViewById(R.id.bt_navi);
        mButton.setOnClickListener(this);
        mPresenter.loadData();
        mPresenter.showUserName();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case  R.id.bt_navi:
                Navigator(FragmentActivity.class);
            default:break;
        }

    }
}

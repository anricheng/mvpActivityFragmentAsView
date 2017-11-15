package aspect.chou.aric.com.mvpactivityfragmentasview.presenter;


import javax.inject.Inject;

import aspect.chou.aric.com.mvpactivityfragmentasview.model.Student;
import aspect.chou.aric.com.mvpactivityfragmentasview.model.User;
import aspect.chou.aric.com.mvpactivityfragmentasview.view.ViewInterface;

/**
 * Created by aric on 2015/6/10.
 */
public class MainFragmentPresenter {

    private ViewInterface mViewInterface;
    private User user;
    private Student student;
    @Inject
    public MainFragmentPresenter(ViewInterface viewInterface) {
        this.mViewInterface = viewInterface;
    }

    public void loadData(){
        this.user=mViewInterface.loadUser();
        this.student=mViewInterface.loadStudent();
    }


    public void showUserName(){
        mViewInterface.showInfo(this.user,this.student);
    }

}

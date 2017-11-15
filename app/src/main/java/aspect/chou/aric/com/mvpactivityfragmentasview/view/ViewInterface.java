package aspect.chou.aric.com.mvpactivityfragmentasview.view;
import aspect.chou.aric.com.mvpactivityfragmentasview.model.Student;
import aspect.chou.aric.com.mvpactivityfragmentasview.model.User;

/**
 *
 * Created by Aric on 下午2:23.
 */

public interface ViewInterface {

    void showInfo(User user, Student student);

    Student loadStudent();

    User loadUser();
}

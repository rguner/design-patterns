package p_2_interface;

import java.util.ArrayList;
import java.util.List;

public class MainInterface {
    public static void main(String[] args) {

        ArrayList<String> lsx = new ArrayList<>();
        List<String> ls = new ArrayList<>();

        UserImpl user = new UserImpl();
        IUserPassword userPassword = new UserImpl();
        IUser iUser = new UserImpl();


        // instanseOf
        if ( userPassword instanceof UserImpl ) {
            UserImpl newUser = (UserImpl) userPassword;
            newUser.userAge(10);
        }


    }
}

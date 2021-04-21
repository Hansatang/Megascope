package client.model;

import shared.NewRegisteredUser;
import shared.PropertyChangeSubject;

public interface UserModel extends PropertyChangeSubject {
    void register(NewRegisteredUser user);
    void login(String username, String password);

}

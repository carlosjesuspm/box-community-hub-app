package user.application.create;

import user.domain.User;

public interface CreateUserCase {
    
    User createUser(User user);
}

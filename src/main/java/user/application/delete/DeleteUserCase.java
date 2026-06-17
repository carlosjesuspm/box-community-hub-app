package user.application.delete;

import user.domain.User;

public interface DeleteUserCase {
    
    void delete(User user);
}

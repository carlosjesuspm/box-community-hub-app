package user.application.find;

import java.util.List;

import user.domain.User;
import user.domain.vo.UserEmail;
import user.domain.vo.UserId;
import user.domain.vo.UserName;
import user.domain.vo.UserRole;

public interface FindUserCase {
    
    User findById (UserId userId);
    User findByEmail(UserEmail email);
    List<User> findByRole(UserRole role);
    List<User> findByName(UserName name);
    List<User> findAll();
}

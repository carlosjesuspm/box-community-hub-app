package user.application.find;

import java.util.List;
import java.util.UUID;

import user.domain.User;
import user.domain.vo.UserRole;

public interface FindUserCase {

    User findById(UUID id);
    User findByEmail(String email);
    List<User> findByRole(UserRole role);
    List<User> findByName(String name);
    List<User> findAll();
}

package user.domain.repository;

import java.util.List;
import java.util.Optional;

import user.domain.User;
import user.domain.vo.UserEmail;
import user.domain.vo.UserId;
import user.domain.vo.UserName;
import user.domain.vo.UserRole;

/**
 * Repository interface for {@link User} aggregate root.
 *
 * @since 1.0
 */
public interface UserRepository {

    User save(User user);

    Optional<User> findById(UserId userId);

    Optional<User> findByEmail(UserEmail email);

    List<User> findByRole(UserRole role);

    List<User> findByName(UserName name);

    List<User> findAll();

    void delete(User user);
}
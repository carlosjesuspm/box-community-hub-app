package user.application.find;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import user.domain.User;
import user.domain.repository.UserRepositoryPort;
import user.domain.vo.UserEmail;
import user.domain.vo.UserId;
import user.domain.vo.UserName;
import user.domain.vo.UserRole;

@Component
@RequiredArgsConstructor
public class FindUserCaseImp implements FindUserCase {

    private final UserRepositoryPort userRepositoryPort;

    @Override
    public User findById(UUID id) {
        return userRepositoryPort.findById(new UserId(id));
    }

    @Override
    public User findByEmail(String email) {
        return userRepositoryPort.findByEmail(new UserEmail(email));
    }

    @Override
    public List<User> findByRole(UserRole role) {
        return userRepositoryPort.findByRole(role);
    }

    @Override
    public List<User> findByName(String name) {
        return userRepositoryPort.findByName(new UserName(name, name, name));
    }

    @Override
    public List<User> findAll() {
        return userRepositoryPort.findAll();
    }

}

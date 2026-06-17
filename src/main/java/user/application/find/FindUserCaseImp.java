package user.application.find;

import java.util.List;

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
public class FindUserCaseImp implements FindUserCase{

    private final UserRepositoryPort userRepositoryPort; 

    @Override
    public User findById(UserId userId) {
        return userRepositoryPort.findById(userId);
    }

    @Override
    public User findByEmail(UserEmail email) {
        return userRepositoryPort.findByEmail(email);
    }

    @Override
    public List<User> findByRole(UserRole role) {
        return userRepositoryPort.findByRole(role);
    }

    @Override
    public List<User> findByName(UserName name) {
        return userRepositoryPort.findByName(name);
    }

    @Override
    public List<User> findAll() {
        return userRepositoryPort.findAll();
    }
    
}

package user.application.create;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import user.domain.User;
import user.domain.repository.UserRepositoryPort;

@RequiredArgsConstructor
@Component
public class CreateUserCaseImp implements CreateUserCase {

    private final UserRepositoryPort userRepositoryPort;

    @Override
    public User createUser(User user) {
        return userRepositoryPort.save(user);
    }
    
}

package user.application.delete;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import user.domain.User;
import user.domain.repository.UserRepositoryPort;

@Component
@RequiredArgsConstructor
public class DeleteUserCaseImp implements DeleteUserCase {

    private final UserRepositoryPort userRepositoryPort;

    @Override
    public void delete(User user) {
        userRepositoryPort.delete(user);
    }
    
}

package com.personal.box_community_hub.user.application.create;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import com.personal.box_community_hub.shared.exception.user.InvalidUserException;
import com.personal.box_community_hub.user.domain.User;
import com.personal.box_community_hub.user.domain.repository.UserRepositoryPort;

@RequiredArgsConstructor
@Component
public class CreateUserCaseImp implements CreateUserCase {

    private final UserRepositoryPort userRepositoryPort;

    @Override
    public User createUser(User user) {
        if (user == null) {
            throw new InvalidUserException("El usuario no puede ser nulo");
        }
        return userRepositoryPort.save(user);
    }

}

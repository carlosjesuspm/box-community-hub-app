package com.personal.box_community_hub.user.application.delete;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import com.personal.box_community_hub.user.domain.User;
import com.personal.box_community_hub.user.domain.repository.UserRepositoryPort;

@Component
@RequiredArgsConstructor
public class DeleteUserCaseImp implements DeleteUserCase {

    private final UserRepositoryPort userRepositoryPort;

    @Override
    public void delete(User user) {
        userRepositoryPort.delete(user);
    }
    
}

package com.personal.box_community_hub.user.application.find;

import java.util.List;
import java.util.UUID;

import com.personal.box_community_hub.user.domain.User;
import com.personal.box_community_hub.user.domain.vo.UserRole;

public interface FindUserCase {

    User findById(UUID id);
    User findByEmail(String email);
    List<User> findByRole(UserRole role);
    List<User> findByName(String name);
    List<User> findAll();
}

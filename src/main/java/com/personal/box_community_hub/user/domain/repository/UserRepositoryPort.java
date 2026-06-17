package com.personal.box_community_hub.user.domain.repository;

import java.util.List;

import com.personal.box_community_hub.user.domain.User;
import com.personal.box_community_hub.user.domain.vo.UserEmail;
import com.personal.box_community_hub.user.domain.vo.UserId;
import com.personal.box_community_hub.user.domain.vo.UserName;
import com.personal.box_community_hub.user.domain.vo.UserRole;

/**
 * Repository interface for {@link User} aggregate root.
 *
 * @since 1.0
 */
public interface UserRepositoryPort {

    User save(User user);

    User findById(UserId userId);

    User findByEmail(UserEmail email);

    List<User> findByRole(UserRole role);

    List<User> findByName(UserName name);

    List<User> findAll();

    void delete(User user);
}
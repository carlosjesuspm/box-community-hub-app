package com.personal.box_community_hub.user.domain;

import lombok.Builder;
import lombok.Getter;
import com.personal.box_community_hub.user.domain.vo.*;

/**
 * Aggregate root representing a user in the system.
 *
 * @since 1.0
 */
@Getter
@Builder
public class User {

    private final UserId userId;
    private UserName name;
    private UserAddress address;
    private UserEmail email;
    private UserPhone phone;
    private UserRole role;
    private UserPhoto photo;

    /**
     * Creates a new {@code User} with all its value objects.
     *
     * @param userId  the unique identifier
     * @param name    the user name
     * @param address the user address
     * @param email   the user email
     * @param phone   the user phone
     * @param role    the user role
     * @param photo   the user photo
     */
    public User(
            final UserId userId,
            final UserName name,
            final UserAddress address,
            final UserEmail email,
            final UserPhone phone,
            final UserRole role,
            final UserPhoto photo
    ) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.photo = photo;
    }
}


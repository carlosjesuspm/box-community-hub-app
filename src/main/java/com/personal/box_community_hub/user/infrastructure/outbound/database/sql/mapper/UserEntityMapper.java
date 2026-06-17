package com.personal.box_community_hub.user.infrastructure.outbound.database.sql.mapper;

import com.personal.box_community_hub.user.domain.User;
import com.personal.box_community_hub.user.domain.vo.UserAddress;
import com.personal.box_community_hub.user.domain.vo.UserEmail;
import com.personal.box_community_hub.user.domain.vo.UserId;
import com.personal.box_community_hub.user.domain.vo.UserName;
import com.personal.box_community_hub.user.domain.vo.UserPhone;
import com.personal.box_community_hub.user.domain.vo.UserPhoto;
import com.personal.box_community_hub.user.infrastructure.outbound.database.sql.entity.UserEntity;

public class UserEntityMapper {

    public static UserEntity fromUserToUserEntity(User user) {
        return UserEntity.builder()
                .id(user.getUserId().id())
                .name(user.getName().name())
                .firstName(user.getName().firstName())
                .lastName(user.getName().lastName())
                .street(user.getAddress().street())
                .city(user.getAddress().city())
                .zip(user.getAddress().zip())
                .country(user.getAddress().country())
                .email(user.getEmail().email())
                .phonePrefix(user.getPhone() != null ? user.getPhone().prefix() : null)
                .phoneNumber(user.getPhone() != null ? user.getPhone().phoneNumber() : null)
                .role(user.getRole())
                .photo(user.getPhoto() != null ? user.getPhoto().userPhoto() : null)
                .build();
    }

    public static User fromUserEntityToUser(UserEntity entity) {
        return User.builder()
                .userId(new UserId(entity.getId()))
                .name(new UserName(entity.getName(), entity.getFirstName(), entity.getLastName()))
                .address(new UserAddress(entity.getStreet(), entity.getCity(), entity.getZip(), entity.getCountry()))
                .email(new UserEmail(entity.getEmail()))
                .phone(entity.getPhonePrefix() != null
                        ? new UserPhone(entity.getPhonePrefix(), entity.getPhoneNumber())
                        : null)
                .role(entity.getRole())
                .photo(entity.getPhoto() != null ? new UserPhoto(entity.getPhoto()) : null)
                .build();
    }
}


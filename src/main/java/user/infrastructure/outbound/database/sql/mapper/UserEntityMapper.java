package user.infrastructure.outbound.database.sql.mapper;

import user.domain.User;
import user.domain.vo.UserAddress;
import user.domain.vo.UserEmail;
import user.domain.vo.UserId;
import user.domain.vo.UserName;
import user.domain.vo.UserPhone;
import user.domain.vo.UserPhoto;
import user.infrastructure.outbound.database.sql.entity.UserEntity;

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


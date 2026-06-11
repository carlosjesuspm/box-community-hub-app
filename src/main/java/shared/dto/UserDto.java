package shared.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import user.domain.vo.UserAddress;
import user.domain.vo.UserEmail;
import user.domain.vo.UserId;
import user.domain.vo.UserName;
import user.domain.vo.UserPhone;
import user.domain.vo.UserPhoto;
import user.domain.vo.UserRole;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class UserDto {
    
    private final UserId userId;
    private UserName name;
    private UserAddress address;
    private UserEmail email;
    private UserPhone phone;
    private UserRole role;
    private UserPhoto photo;
}

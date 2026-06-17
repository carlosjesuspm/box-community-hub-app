package user.infrastructure.inbound.mapper;

import shared.dto.UserDto;
import user.domain.User;

public class UserDtoMapper {
    
    public static UserDto fromUserToDto (User user){
        return new UserDto(user.getUserId(), 
        user.getName(), user.getAddress(), user.getEmail(), 
        user.getPhone(), user.getRole(), user.getPhoto());
    }
}

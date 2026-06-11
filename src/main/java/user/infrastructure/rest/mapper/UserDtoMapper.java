package user.infrastructure.rest.mapper;

import shared.dto.UserDto;
import user.domain.User;

public class UserDtoMapper {
    
    public static UserDto fromUserEntityToDto (User user){
        return new UserDto(user.getUserId(), 
        user.getName(), user.getAddress(), user.getEmail(), 
        user.getPhone(), user.getRole(), user.getPhoto());
    }
}

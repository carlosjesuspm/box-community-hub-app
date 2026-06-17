package com.personal.box_community_hub.user.infrastructure.inbound.mapper;

import com.personal.box_community_hub.shared.dto.UserDto;
import com.personal.box_community_hub.user.domain.User;

public class UserDtoMapper {
    
    public static UserDto fromUserToDto (User user){
        return new UserDto(user.getUserId(), 
        user.getName(), user.getAddress(), user.getEmail(), 
        user.getPhone(), user.getRole(), user.getPhoto());
    }
}

package com.personal.box_community_hub.shared.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import com.personal.box_community_hub.user.domain.vo.UserAddress;
import com.personal.box_community_hub.user.domain.vo.UserEmail;
import com.personal.box_community_hub.user.domain.vo.UserId;
import com.personal.box_community_hub.user.domain.vo.UserName;
import com.personal.box_community_hub.user.domain.vo.UserPhone;
import com.personal.box_community_hub.user.domain.vo.UserPhoto;
import com.personal.box_community_hub.user.domain.vo.UserRole;

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

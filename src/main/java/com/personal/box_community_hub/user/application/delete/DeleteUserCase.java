package com.personal.box_community_hub.user.application.delete;

import com.personal.box_community_hub.user.domain.User;

public interface DeleteUserCase {
    
    void delete(User user);
}

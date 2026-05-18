package users.domain;

import jakarta.validation.constraints.Email;
import users.domain.vo.User_AddressVO;
import users.domain.vo.User_NameVO;

import javax.management.relation.Role;

public class User {

    private String userId;
    private User_NameVO name;
    private User_AddressVO address;
    private Email email;
    private Phone phone;
    private Role role;
    private Photo photo;
}

package user.infrastructure.inbound.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shared.dto.UserDto;
import user.application.create.CreateUserCase;
import user.application.delete.DeleteUserCase;
import user.application.find.FindUserCase;
import user.domain.User;
import user.domain.vo.UserEmail;
import user.domain.vo.UserId;
import user.domain.vo.UserName;
import user.domain.vo.UserRole;
import user.infrastructure.inbound.mapper.UserDtoMapper;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final CreateUserCase postCreateUser;
    private final FindUserCase getUser;
    private final DeleteUserCase deleteUser;

    @PostMapping(value = "/save", version = "1")
    public UserDto saveUser(@RequestBody User user) {
        return UserDtoMapper.fromUserToDto(postCreateUser.createUser(user));
    }

    @GetMapping(version = "1")
    public List<UserDto> findAll() {
        return getUser.findAll().stream()
                .map(UserDtoMapper::fromUserToDto)
                .toList();
    }

    @GetMapping(value = "/{id}", version = "1")
    public UserDto findById(@PathVariable UUID id) {
        return UserDtoMapper.fromUserToDto(getUser.findById(new UserId(id)));
    }

    @GetMapping(value = "/email/{email}", version = "1")
    public UserDto findByEmail(@PathVariable String email) {
        return UserDtoMapper.fromUserToDto(getUser.findByEmail(new UserEmail(email)));
    }

    @GetMapping(value = "/role/{role}", version = "1")
    public List<UserDto> findByRole(@PathVariable UserRole role) {
        return getUser.findByRole(role).stream()
                .map(UserDtoMapper::fromUserToDto)
                .toList();
    }

    @GetMapping(value = "/name", version = "1")
    public List<UserDto> findByName(@RequestParam String name) {
        UserName userName = new UserName(name, name, name);
        return getUser.findByName(userName).stream()
                .map(UserDtoMapper::fromUserToDto)
                .toList();
    }

    @DeleteMapping(value = "/{id}", version = "1")
    public void deleteById(@PathVariable UUID id) {
        deleteUser.delete(getUser.findById(new UserId(id)));
    }
}

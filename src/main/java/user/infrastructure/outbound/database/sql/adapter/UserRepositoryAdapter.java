package user.infrastructure.outbound.database.sql.adapter;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;
import user.domain.User;
import user.domain.repository.UserRepositoryPort;
import user.domain.vo.UserEmail;
import user.domain.vo.UserId;
import user.domain.vo.UserName;
import user.domain.vo.UserRole;
import user.infrastructure.outbound.database.sql.mapper.UserEntityMapper;
import user.infrastructure.outbound.database.sql.repository.UserJpaRepository;

import java.util.List;

import shared.exception.user.UserNotFoundException;

@RequiredArgsConstructor
@Component
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserJpaRepository userJpaRepository;

    @Override
    public User save(User user) {
        var entity = UserEntityMapper.fromUserToUserEntity(user);
        return UserEntityMapper.fromUserEntityToUser(userJpaRepository.save(entity));
    }

    @Override
    public User findById(UserId userId) {
        return userJpaRepository.findById(userId.id())
                .map(UserEntityMapper::fromUserEntityToUser)
                .orElseThrow(() -> new UserNotFoundException(userId.id()));
    }

    @Override
    public User findByEmail(UserEmail email) {
        return userJpaRepository.findByEmail(email.email())
                .map(UserEntityMapper::fromUserEntityToUser)
                .orElseThrow(() -> new UserNotFoundException(email.email()));
    }


    @Override
    public List<User> findByRole(UserRole role) {
        return userJpaRepository.findByRole(role)
                .stream()
                .map(UserEntityMapper::fromUserEntityToUser)
                .toList();
    }

    @Override
    public List<User> findByName(UserName name) {
        return userJpaRepository.findByNameContaining(name.name())
                .stream()
                .map(UserEntityMapper::fromUserEntityToUser)
                .toList();
    }

    @Override
    public List<User> findAll() {
        return userJpaRepository.findAll()
                .stream()
                .map(UserEntityMapper::fromUserEntityToUser)
                .toList();
    }

    @Override
    public void delete(User user) {
        userJpaRepository.deleteById(user.getUserId().id());
    }
}

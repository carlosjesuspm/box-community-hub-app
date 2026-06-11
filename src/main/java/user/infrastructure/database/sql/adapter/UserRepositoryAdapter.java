package user.infrastructure.database.sql.adapter;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;
import user.domain.User;
import user.domain.repository.UserRepositoryPort;
import user.domain.vo.UserEmail;
import user.domain.vo.UserId;
import user.domain.vo.UserName;
import user.domain.vo.UserRole;
import user.infrastructure.database.sql.mapper.UserEntityMapper;
import user.infrastructure.database.sql.repository.UserJpaRepository;

import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Component
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserJpaRepository userJpaRepository;

    @Override
    public User save(User user) {
        var entity = UserEntityMapper.fromUserToEntity(user);
        return UserEntityMapper.fromEntityToUser(userJpaRepository.save(entity));
    }

    @Override
    public User findById(UserId userId) {
        return userJpaRepository.findById(userId.id())
                .map(UserEntityMapper::fromEntityToUser)
                .orElseThrow(()-> new NoSuchElementException("User not found"));
    }

    @Override
    public User findByEmail(UserEmail email) {
        return userJpaRepository.findByEmail(email.email())
                .map(UserEntityMapper::fromEntityToUser)
                .orElseThrow(()-> new NoSuchElementException("Email not found"));
    }


    @Override
    public List<User> findByRole(UserRole role) {
        return userJpaRepository.findByRole(role)
                .stream()
                .map(UserEntityMapper::fromEntityToUser)
                .toList();
    }

    @Override
    public List<User> findByName(UserName name) {
        return userJpaRepository.findByNameContaining(name.name())
                .stream()
                .map(UserEntityMapper::fromEntityToUser)
                .toList();
    }

    @Override
    public List<User> findAll() {
        return userJpaRepository.findAll()
                .stream()
                .map(UserEntityMapper::fromEntityToUser)
                .toList();
    }

    @Override
    public void delete(User user) {
        userJpaRepository.deleteById(user.getUserId().id());
    }
}

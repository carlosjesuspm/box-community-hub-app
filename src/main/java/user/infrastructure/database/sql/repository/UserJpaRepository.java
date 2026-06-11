package user.infrastructure.database.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import user.domain.vo.UserRole;
import user.infrastructure.database.sql.entity.UserEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<UserEntity, UUID> {

    Optional<UserEntity> findByEmail(String email);

    List<UserEntity> findByRole(UserRole role);

    @Query("""
            SELECT u FROM UserJpaEntity u
            WHERE LOWER(u.name)      LIKE LOWER(CONCAT('%', :query, '%'))
               OR LOWER(u.firstName) LIKE LOWER(CONCAT('%', :query, '%'))
               OR LOWER(u.lastName)  LIKE LOWER(CONCAT('%', :query, '%'))
            """)
    List<UserEntity> findByNameContaining(@Param("query") String query);
}

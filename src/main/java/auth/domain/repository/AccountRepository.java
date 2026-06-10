package auth.domain.repository;

import java.util.Optional;

import auth.domain.auth.Account;
import auth.domain.vo.AccountId;
import auth.domain.vo.Username;

/**
 * Repository interface for {@link Account} aggregate root.
 *
 * @since 1.0
 */

public interface AccountRepository {
    
    Account save(Account account);

    Optional<Account> findById(AccountId id);

    Optional<Account> findByUsername(Username username);

    void delete(Account account);
}

package com.personal.box_community_hub.auth.domain.repository;

import java.util.Optional;

import com.personal.box_community_hub.auth.domain.auth.Account;
import com.personal.box_community_hub.auth.domain.vo.AccountId;
import com.personal.box_community_hub.auth.domain.vo.Username;



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

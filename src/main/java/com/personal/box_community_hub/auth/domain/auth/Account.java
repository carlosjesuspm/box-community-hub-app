package com.personal.box_community_hub.auth.domain.auth;


import com.personal.box_community_hub.auth.domain.vo.AccountId;
import com.personal.box_community_hub.auth.domain.vo.Password;
import com.personal.box_community_hub.auth.domain.vo.Token;
import com.personal.box_community_hub.auth.domain.vo.Username;

import lombok.Builder;
import lombok.Getter;

/**
 * Aggregate root representing an Account in the system.
 *
 * @since 1.0
 */

@Getter
@Builder
public class Account {

    private final AccountId accountId;
    private Username username;
    private Password password;
    private Token token;

    /**
     * Creates a new {@code Account} with all its value objects.
     *
     * @param accountId the unique identifier
     * @param username  the username
     * @param password  the password
     * @param token     the token
     */
    public Account(
            final AccountId accountId,
            final Username username,
            final Password password,
            final Token token

    ) {
        this.accountId = accountId;
        this.username = username;
        this.password = password;
        this.token = token;
    }
}

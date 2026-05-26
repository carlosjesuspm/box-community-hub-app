package auth.domain.auth;

import auth.domain.vo.AccountId;
import auth.domain.vo.Password;
import auth.domain.vo.Token;
import auth.domain.vo.Username;
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

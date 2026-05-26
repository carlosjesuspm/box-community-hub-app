package classSession.domain;

import classSession.domain.vo.ClassSessionId;
import lombok.Builder;
import lombok.Getter;
import user.domain.vo.UserId;

/**
 * Aggregate root representing a Class Session in the system.
 *
 * @since 1.0
 */

@Getter
@Builder
public class ClassSession {

    private final ClassSessionId classSessionId;
    private UserId coachId;

    /**
     * Creates a new {@code Box} with all its value objects.
     *
     * @param classSessionId   the unique identifier
     * @param coachId          the box address
     */
    public ClassSession(
            final ClassSessionId classSessionId,
            final UserId coachId
    ) {
        this.classSessionId = classSessionId;
        this.coachId = coachId;
    }
}

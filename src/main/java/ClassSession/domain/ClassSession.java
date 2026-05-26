package classSession.domain;

import classSession.domain.vo.*;
import facility.domain.vo.FacilityId;
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
    private final FacilityId facilityId;
    private final UserId coachId;
    private final WodId wodId;
    private ClassSessionSchedule classSessionSchedule;
    private ClassSessionDuration classSessionDuration;
    private ClassSessionCapacity classSessionCapacity;
    private ClassSessionStatus classSessionStatus;



    /**
     * Creates a new {@code ClassSession} with all its value objects.
     *
     * @param classSessionId        the unique identifier
     * @param facilityId            the unique identifier of the facility
     * @param coachId               the unique identifier of the coach
     * @param wodId                 the unique identifier of the wod
     * @param classSessionSchedule  the schedule of the session class
     * @param classSessionDuration  the duration of the session class
     * @param classSessionCapacity  the capacity of the session class
     * @param classSessionStatus    the status of the session status
     */
    public ClassSession(
            final ClassSessionId classSessionId,
            final FacilityId facilityId,
            final UserId coachId,
            final WodId WodId,
            final ClassSessionSchedule classSessionSchedule,
            final ClassSessionDuration classSessionDuration,
            final ClassSessionCapacity classSessionCapacity,
            final ClassSessionStatus classSessionStatus

    ) {
        this.classSessionId = classSessionId;
        this.facilityId = facilityId;
        this.coachId = coachId;
        this.wodId = wodId;
        this.classSessionSchedule = classSessionSchedule;
        this.classSessionDuration=classSessionDuration;
        this.classSessionCapacity=classSessionCapacity;
        this.classSessionStatus=classSessionStatus;


    }
}

package com.personal.box_community_hub.classSession.domain.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.personal.box_community_hub.classSession.domain.ClassSession;
import com.personal.box_community_hub.classSession.domain.vo.ClassSessionId;
import com.personal.box_community_hub.classSession.domain.vo.ClassSessionStatus;
import com.personal.box_community_hub.user.domain.vo.UserId;

/**
 * Repository interface for {@link ClassSession} aggregate root.
 *
 * @since 1.0
 */
public interface ClassSessionRepository {
    
    ClassSession save(ClassSession classSession);

    Optional<ClassSession> findById(ClassSessionId classSessionId);

    List<ClassSession> findByCoachId(UserId coachId);

    List<ClassSession> findByStatus(ClassSessionStatus status);

    List<ClassSession> findByDate(LocalDate date);

    List<ClassSession> findByCoachIdAndDate(UserId coachId, LocalDate date);

    void delete(ClassSession classSession);

}

package com.personal.box_community_hub.membership.domain.repository;

import java.util.List;
import java.util.Optional;

import com.personal.box_community_hub.membership.domain.Payment;
import com.personal.box_community_hub.membership.domain.vo.PaymentId;
import com.personal.box_community_hub.membership.domain.vo.PaymentStatus;
import com.personal.box_community_hub.user.domain.vo.UserId;

/**
 * Repository interface for {@link Payment} aggregate root.
 *
 * @since 1.0
 */
public interface PaymentRepository {

    Payment save(Payment payment);

    Optional<Payment> findById(PaymentId paymentId);

    List<Payment> findByUserId(UserId userId);

    List<Payment> findByStatus(PaymentStatus status);

    List<Payment> findAll();
}

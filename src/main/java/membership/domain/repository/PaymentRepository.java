package membership.domain.repository;

import java.util.List;
import java.util.Optional;

import membership.domain.Payment;
import membership.domain.vo.PaymentId;
import membership.domain.vo.PaymentStatus;
import user.domain.vo.UserId;

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

package booking.repository;

import booking.domain.Booking;
import booking.domain.vo.BookingDate;
import booking.domain.vo.BookingId;
import booking.domain.vo.BookingStatus;
import user.domain.vo.UserId;
import java.util.List;
import java.util.Optional;

/**
 * Repository interface for {@link Booking} aggregate root.
 *
 * @since 1.0
 */
public interface BookingRepository {
    

    Booking save(Booking booking);

    Optional<Booking> findById(BookingId id);

    List<Booking> findByUserId(UserId userId);

    Optional<Booking> findByStatus(BookingStatus bookingStatus);

    List<Booking> findByDateBetween(BookingDate start, BookingDate end);

}

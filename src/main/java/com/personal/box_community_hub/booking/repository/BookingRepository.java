package com.personal.box_community_hub.booking.repository;


import com.personal.box_community_hub.user.domain.vo.UserId;
import java.util.List;
import java.util.Optional;

import com.personal.box_community_hub.booking.domain.Booking;
import com.personal.box_community_hub.booking.domain.vo.BookingDate;
import com.personal.box_community_hub.booking.domain.vo.BookingId;
import com.personal.box_community_hub.booking.domain.vo.BookingStatus;

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

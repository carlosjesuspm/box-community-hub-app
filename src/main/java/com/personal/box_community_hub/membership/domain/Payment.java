package com.personal.box_community_hub.membership.domain;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;
import com.personal.box_community_hub.membership.domain.vo.*;
import com.personal.box_community_hub.user.domain.vo.UserId;

@Getter
@Builder
public class Payment {

    private final PaymentId paymentId;
    private final UserId userId;
    private final PaymentMoney paymentMoney;
    private final PaymentCurrency paymentCurrency;
    private final PaymentMembershipType paymentMembershipType;
    private final PaymentStatus paymentStatus;

    /**
     * Creates a new {@code Payment} with all its value objects.
     *
     * @param paymentId             the unique identifier
     * @param userId                the user who made the payment
     * @param paymentMoney          the amount paid
     * @param paymentCurrency       the currency of the payment
     * @param paymentMembershipType the type of membership purchased
     * @param paymentStatus         the current status of the payment
     */
    public Payment(
            final PaymentId paymentId,
            final UserId userId,
            final PaymentMoney paymentMoney,
            final PaymentCurrency paymentCurrency,
            final PaymentMembershipType paymentMembershipType,
            final PaymentStatus paymentStatus
    ) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.paymentMoney = paymentMoney;
        this.paymentCurrency = paymentCurrency;
        this.paymentMembershipType = paymentMembershipType;
        this.paymentStatus = paymentStatus;
    }

    public PaymentMoney paymentDiscount() {
    if ("YEARLY".equals(this.paymentMembershipType.type())) {
        return new PaymentMoney(this.paymentMoney.amount()
                .multiply(new BigDecimal("0.80")));
    }
    if ("QUARTERLY".equals(this.paymentMembershipType.type())) {
        return new PaymentMoney(this.paymentMoney.amount()
                .multiply(new BigDecimal("0.90")));
    }
    return this.paymentMoney;
    }
}

package org.snowcamp.university.springmodulith.payment.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class InitPaymentHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(InitPaymentHandler.class);

    public void initPayment(String orderId) {
        LOGGER.info("Init payment {}", orderId);
    }

}

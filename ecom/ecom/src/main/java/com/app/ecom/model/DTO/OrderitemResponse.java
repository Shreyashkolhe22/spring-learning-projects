package com.app.ecom.model.DTO;

import java.math.BigDecimal;

public record OrderitemResponse(
        String productName,
        int quantity,
        BigDecimal totalPrice
)  {
}

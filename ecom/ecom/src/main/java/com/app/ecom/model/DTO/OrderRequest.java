package com.app.ecom.model.DTO;

import java.util.List;

public record OrderRequest(
        String customerName,
        String email,
        List<OrderitemRequest> items
)  {
}

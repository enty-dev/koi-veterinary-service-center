package com.KoiHealthService.Koi.demo.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FishSpecialtyResponse {
    String fishSpecialtyId;
    String fishSpecialtyName;
    String description;
    String category;
    String experience;
}

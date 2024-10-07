package com.KoiHealthService.Koi.demo.dto.request;

import com.KoiHealthService.Koi.demo.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class FishCreationRequest {

    String fishId;
    String species;
    @Min(value = 1, message = "FISH_AGE_INVALID")
    @Max(value = 40, message = "FISH_AGE_INVALID")
    Integer age;
    String customerId;
}

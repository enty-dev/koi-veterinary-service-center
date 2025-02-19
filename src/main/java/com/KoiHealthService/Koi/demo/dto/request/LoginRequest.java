package com.KoiHealthService.Koi.demo.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginRequest {
    String username;
    @Size(min = 7, message = "PASSWORD_INVALID")
    String password;
}

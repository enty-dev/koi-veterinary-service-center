package com.KoiHealthService.Koi.demo.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {
    String id;
    String firstname;
    String lastname;
    @Size(min =5 , message = "USERNAME_INVALID")
    String username;
    @Size(min = 7, message = "PASSWORD_INVALID")
    String password;
    @Email(message = "EMAIL_INVALID")
    String email;
}

package com.KoiHealthService.Koi.demo.dto.request.user;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LinkVeterinarianToScheduleRequest {
    String scheduleId;
    String veterinarianId;
}

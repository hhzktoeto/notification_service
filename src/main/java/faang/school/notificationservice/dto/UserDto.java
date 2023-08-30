package faang.school.notificationservice.dto;

import faang.school.notificationservice.entity.PreferredContact;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private long id;
    private String username;
    private String email;
    private PreferredContact preferredContact;
}
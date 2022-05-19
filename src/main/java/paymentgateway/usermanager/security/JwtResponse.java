package paymentgateway.usermanager.security;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JwtResponse {
    private String token;
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    private String email;
    private List<String> roles;
    private String fistName;
    private String lastName;
    private Boolean active;


}

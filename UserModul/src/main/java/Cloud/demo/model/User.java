package Cloud.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private Integer id;
    private String fioUser;
    private String address;
    private String phoneNumber;
    private String email;
}

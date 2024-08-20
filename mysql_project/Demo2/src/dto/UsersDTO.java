package dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class UsersDTO {
    private String userId;
    private String userName;
    private String userPassword;
    private String userEmail;
    private int userAge;
}

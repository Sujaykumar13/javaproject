package instagramLombok;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class AccountInfo {

    private String userName;
    private String emailId;
    private long phoneNumber;
    private String psw;
    private String dob;
    private int age;
    private String gender;
}

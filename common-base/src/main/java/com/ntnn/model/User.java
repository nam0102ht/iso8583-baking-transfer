package com.ntnn.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    private String name;
    private String username;
    private String cardNumber;
    private String password;
    private String pin; //need hashing by argon2
    private long balanceId;
    private String idNumber; // accountId, CMND
    private String phone;
    private String email;
    private boolean isAuthenticate;
    private String dateOfBirth;
    private String createDate;
    private String updateDate;
}

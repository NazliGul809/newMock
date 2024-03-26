package com.example.newMock.Model;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class RequestDTO {
    private String rqUID;

    public String getRqUID() {
        return rqUID;
    }

    public String getClientId() {
        return clientId;
    }

    public String getAccount() {
        return account;
    }

    public String getOpenDate() {
        return openDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    private String clientId;
    private String account;
    private String openDate;
    private String closeDate;
}

package com.ntnn.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Balance {
    public long id;
    public long userId;
    public String cardNumber;
    public double lastAmount;
    public double currentAmount;
    public String lastUpdate;
}

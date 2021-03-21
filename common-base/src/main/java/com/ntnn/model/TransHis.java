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
public class TransHis {
    private long id;
    private String cardNumber;
    private long userId;
    private long typeId;
    private double amount;
    private double feeAmount;
    private String reference1;
    private String reference2;
    private String lastUpdate;
    private String extras;
}

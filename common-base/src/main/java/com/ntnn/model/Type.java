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
public class Type {
    private long id;
    private String name;
    private double feeAmount;
    private String lastUpdate;
}

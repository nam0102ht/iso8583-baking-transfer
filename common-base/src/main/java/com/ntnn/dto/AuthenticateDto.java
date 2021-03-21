package com.ntnn.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ntnn.utils.ISOFieldUtils;
import lombok.*;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;

@Data
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticateDto {
    private String MTTI;
    private String cardNumber;
    private String pin;
    private String transactionDate;
    private String settleDate;
    private String secureToken;
    private String response;

    public ISOMsg toMsg() throws ISOException {
        ISOMsg msg = new ISOMsg();
        if(this.MTTI.equals(ISOFieldUtils.MTI_AUTHOR_REQ)) {
            msg.setMTI(ISOFieldUtils.MTI_AUTHOR_REQ);
        } else {
            msg.setMTI(ISOFieldUtils.MTI_AUTHOR_RES);
            msg.set(ISOFieldUtils.RESPONSE, this.response);
        }
        msg.set(ISOFieldUtils.CARD_NUMBER, this.cardNumber);
        msg.set(ISOFieldUtils.PIN, this.cardNumber);
        msg.set(ISOFieldUtils.TRANSACTIONS_DATE, this.transactionDate);
        msg.set(ISOFieldUtils.SETTLE_DATE, this.settleDate);
        msg.set(ISOFieldUtils.MESSAGE_SECURITY_CODE, this.secureToken);
        return msg;
    }

}

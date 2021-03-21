package com.ntnn.utils;

public class ISOFieldUtils {
    /*
    0100	Authorization Request	Request from a point-of-sale terminal for authorization for a cardholder purchase
    0110	Authorization Response	Request response to a point-of-sale terminal for authorization for a cardholder purchase
    0120	Authorization Advice	When the point-of-sale device breaks down and you have to sign a voucher
    0121	Authorization Advice Repeat	If the advice times out
    0130	Issuer Response to Authorization Advice	Confirmation of receipt of authorization advice
    0200	Acquirer Financial Request	Request for funds, typically from an ATM or pinned point-of-sale device
    0210	Issuer Response to Financial Request	Issuer response to request for funds
    0220	Acquirer Financial Advice	e.g. Checkout at a hotel. Used to complete transaction initiated with authorization request
    0221	Acquirer Financial Advice Repeat	If the advice times out
    0230	Issuer Response to Financial Advice	Confirmation of receipt of financial advice
    0320	Batch Upload	File update/transfer advice
    0330	Batch Upload Response	File update/transfer advice response
    0400	Acquirer Reversal Request	Reverses a transaction
    0420	Acquirer Reversal Advice
    0430	Acquirer Reversal Advice Response
    0510	Batch Settlement Response	Card acceptor reconciliation request response
    0800	Network Management Request	Hypercom terminals initialize request. Echo test, logon, logoff etc.
    0810	Network Management Response	Hypercom terminals initialize response. Echo test, logon, logoff etc.
    0820	Network Management Advice	Key change
    * */
    public static final String MTI_AUTHOR_REQ = "0100";
    public static final String MTI_AUTHOR_RES = "0110";
    public static final Integer CARD_NUMBER = 2;
    public static final Integer PIN = 3;
    public static final Integer AMOUNT = 4;
    public static final Integer TRANSACTIONS_DATE = 7;
    public static final Integer AMOUNT_FEE = 8;
    public static final Integer SYSTEM_AUDIT_NUMBER = 11;
    public static final Integer EXPIRE_DATE = 14;
    public static final Integer SETTLE_DATE = 15;
    public static final Integer RESPONSE = 39;
    public static final Integer TOTAL_AMOUNT_CREDITS = 86;
    public static final Integer TOTAL_AMOUNT_DEBITS = 88;
    public static final Integer MESSAGE_SECURITY_CODE = 96;
    public static final Integer NAME_USER = 123;
}

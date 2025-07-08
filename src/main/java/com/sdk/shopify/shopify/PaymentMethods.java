// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Some of the payment methods used in Shopify.
*/
public enum PaymentMethods {
    AMERICAN_EXPRESS,

    /**
    * The payment method for Bancontact payment.
    */
    BANCONTACT,

    BITCOIN,

    BOGUS,

    /**
    * The payment method for Cartes Bancaires payment.
    */
    CARTES_BANCAIRES,

    DANKORT,

    DINERS_CLUB,

    DISCOVER,

    DOGECOIN,

    /**
    * The payment method for eftpos_au payment.
    */
    EFTPOS,

    /**
    * The payment method for Elo payment.
    */
    ELO,

    FORBRUGSFORENINGEN,

    /**
    * The payment method for Interac payment.
    */
    INTERAC,

    JCB,

    LITECOIN,

    MAESTRO,

    MASTERCARD,

    PAYPAL,

    /**
    * The payment method for UnionPay payment.
    */
    UNIONPAY,

    VISA,

    UNKNOWN_VALUE;

    public static PaymentMethods fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AMERICAN_EXPRESS": {
                return AMERICAN_EXPRESS;
            }

            case "BANCONTACT": {
                return BANCONTACT;
            }

            case "BITCOIN": {
                return BITCOIN;
            }

            case "BOGUS": {
                return BOGUS;
            }

            case "CARTES_BANCAIRES": {
                return CARTES_BANCAIRES;
            }

            case "DANKORT": {
                return DANKORT;
            }

            case "DINERS_CLUB": {
                return DINERS_CLUB;
            }

            case "DISCOVER": {
                return DISCOVER;
            }

            case "DOGECOIN": {
                return DOGECOIN;
            }

            case "EFTPOS": {
                return EFTPOS;
            }

            case "ELO": {
                return ELO;
            }

            case "FORBRUGSFORENINGEN": {
                return FORBRUGSFORENINGEN;
            }

            case "INTERAC": {
                return INTERAC;
            }

            case "JCB": {
                return JCB;
            }

            case "LITECOIN": {
                return LITECOIN;
            }

            case "MAESTRO": {
                return MAESTRO;
            }

            case "MASTERCARD": {
                return MASTERCARD;
            }

            case "PAYPAL": {
                return PAYPAL;
            }

            case "UNIONPAY": {
                return UNIONPAY;
            }

            case "VISA": {
                return VISA;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AMERICAN_EXPRESS: {
                return "AMERICAN_EXPRESS";
            }

            case BANCONTACT: {
                return "BANCONTACT";
            }

            case BITCOIN: {
                return "BITCOIN";
            }

            case BOGUS: {
                return "BOGUS";
            }

            case CARTES_BANCAIRES: {
                return "CARTES_BANCAIRES";
            }

            case DANKORT: {
                return "DANKORT";
            }

            case DINERS_CLUB: {
                return "DINERS_CLUB";
            }

            case DISCOVER: {
                return "DISCOVER";
            }

            case DOGECOIN: {
                return "DOGECOIN";
            }

            case EFTPOS: {
                return "EFTPOS";
            }

            case ELO: {
                return "ELO";
            }

            case FORBRUGSFORENINGEN: {
                return "FORBRUGSFORENINGEN";
            }

            case INTERAC: {
                return "INTERAC";
            }

            case JCB: {
                return "JCB";
            }

            case LITECOIN: {
                return "LITECOIN";
            }

            case MAESTRO: {
                return "MAESTRO";
            }

            case MASTERCARD: {
                return "MASTERCARD";
            }

            case PAYPAL: {
                return "PAYPAL";
            }

            case UNIONPAY: {
                return "UNIONPAY";
            }

            case VISA: {
                return "VISA";
            }

            default: {
                return "";
            }
        }
    }
}


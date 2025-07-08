// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The business type of a Shopify Payments account.
*/
public enum ShopifyPaymentsBusinessType {
    /**
    * The business type is a corporation.
    */
    CORPORATION,

    /**
    * The business type is a free zone establishment.
    */
    FREE_ZONE_ESTABLISHMENT,

    /**
    * The business type is a free zone LLC.
    */
    FREE_ZONE_LLC,

    /**
    * The business type is a government.
    */
    GOVERNMENT,

    /**
    * The business type is an incorporated partnership.
    */
    INCORPORATED_PARTNERSHIP,

    /**
    * The business is an individual.
    */
    INDIVIDUAL,

    /**
    * The business type is a Limited Liability Company.
    */
    LLC,

    /**
    * The business type is a non profit.
    */
    NON_PROFIT,

    /**
    * The business type is a non profit (incorporated).
    */
    NON_PROFIT_INCORPORATED,

    /**
    * The business type is a non profit (registered charity).
    */
    NON_PROFIT_REGISTERED_CHARITY,

    /**
    * The business type is a non profit (unincorporated).
    */
    NON_PROFIT_UNINCORPORATED,

    /**
    * The business type is a non profit (unincorporated_association).
    */
    NON_PROFIT_UNINCORPORATED_ASSOCIATION,

    /**
    * The business type is not set. This is usually because onboarding is incomplete.
    */
    NOT_SET,

    /**
    * The business type is a partnership.
    */
    PARTNERSHIP,

    /**
    * The business type is a private corporation.
    */
    PRIVATE_CORPORATION,

    /**
    * The business type is a private multi member LLC.
    */
    PRIVATE_MULTI_MEMBER_LLC,

    /**
    * The business type is a private partnership.
    */
    PRIVATE_PARTNERSHIP,

    /**
    * The business type is a private single member LLC.
    */
    PRIVATE_SINGLE_MEMBER_LLC,

    /**
    * The business type is a private unincorporated association.
    */
    PRIVATE_UNINCORPORATED_ASSOCIATION,

    /**
    * The business type is a public company.
    */
    PUBLIC_COMPANY,

    /**
    * The business type is a public corporation.
    */
    PUBLIC_CORPORATION,

    /**
    * The business type is a public partnership.
    */
    PUBLIC_PARTNERSHIP,

    /**
    * The business type is a sole establishment.
    */
    SOLE_ESTABLISHMENT,

    /**
    * The business type is a sole proprietorship.
    */
    SOLE_PROP,

    /**
    * The business type is an unincorporated partnership.
    */
    UNINCORPORATED_PARTNERSHIP,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsBusinessType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CORPORATION": {
                return CORPORATION;
            }

            case "FREE_ZONE_ESTABLISHMENT": {
                return FREE_ZONE_ESTABLISHMENT;
            }

            case "FREE_ZONE_LLC": {
                return FREE_ZONE_LLC;
            }

            case "GOVERNMENT": {
                return GOVERNMENT;
            }

            case "INCORPORATED_PARTNERSHIP": {
                return INCORPORATED_PARTNERSHIP;
            }

            case "INDIVIDUAL": {
                return INDIVIDUAL;
            }

            case "LLC": {
                return LLC;
            }

            case "NON_PROFIT": {
                return NON_PROFIT;
            }

            case "NON_PROFIT_INCORPORATED": {
                return NON_PROFIT_INCORPORATED;
            }

            case "NON_PROFIT_REGISTERED_CHARITY": {
                return NON_PROFIT_REGISTERED_CHARITY;
            }

            case "NON_PROFIT_UNINCORPORATED": {
                return NON_PROFIT_UNINCORPORATED;
            }

            case "NON_PROFIT_UNINCORPORATED_ASSOCIATION": {
                return NON_PROFIT_UNINCORPORATED_ASSOCIATION;
            }

            case "NOT_SET": {
                return NOT_SET;
            }

            case "PARTNERSHIP": {
                return PARTNERSHIP;
            }

            case "PRIVATE_CORPORATION": {
                return PRIVATE_CORPORATION;
            }

            case "PRIVATE_MULTI_MEMBER_LLC": {
                return PRIVATE_MULTI_MEMBER_LLC;
            }

            case "PRIVATE_PARTNERSHIP": {
                return PRIVATE_PARTNERSHIP;
            }

            case "PRIVATE_SINGLE_MEMBER_LLC": {
                return PRIVATE_SINGLE_MEMBER_LLC;
            }

            case "PRIVATE_UNINCORPORATED_ASSOCIATION": {
                return PRIVATE_UNINCORPORATED_ASSOCIATION;
            }

            case "PUBLIC_COMPANY": {
                return PUBLIC_COMPANY;
            }

            case "PUBLIC_CORPORATION": {
                return PUBLIC_CORPORATION;
            }

            case "PUBLIC_PARTNERSHIP": {
                return PUBLIC_PARTNERSHIP;
            }

            case "SOLE_ESTABLISHMENT": {
                return SOLE_ESTABLISHMENT;
            }

            case "SOLE_PROP": {
                return SOLE_PROP;
            }

            case "UNINCORPORATED_PARTNERSHIP": {
                return UNINCORPORATED_PARTNERSHIP;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CORPORATION: {
                return "CORPORATION";
            }

            case FREE_ZONE_ESTABLISHMENT: {
                return "FREE_ZONE_ESTABLISHMENT";
            }

            case FREE_ZONE_LLC: {
                return "FREE_ZONE_LLC";
            }

            case GOVERNMENT: {
                return "GOVERNMENT";
            }

            case INCORPORATED_PARTNERSHIP: {
                return "INCORPORATED_PARTNERSHIP";
            }

            case INDIVIDUAL: {
                return "INDIVIDUAL";
            }

            case LLC: {
                return "LLC";
            }

            case NON_PROFIT: {
                return "NON_PROFIT";
            }

            case NON_PROFIT_INCORPORATED: {
                return "NON_PROFIT_INCORPORATED";
            }

            case NON_PROFIT_REGISTERED_CHARITY: {
                return "NON_PROFIT_REGISTERED_CHARITY";
            }

            case NON_PROFIT_UNINCORPORATED: {
                return "NON_PROFIT_UNINCORPORATED";
            }

            case NON_PROFIT_UNINCORPORATED_ASSOCIATION: {
                return "NON_PROFIT_UNINCORPORATED_ASSOCIATION";
            }

            case NOT_SET: {
                return "NOT_SET";
            }

            case PARTNERSHIP: {
                return "PARTNERSHIP";
            }

            case PRIVATE_CORPORATION: {
                return "PRIVATE_CORPORATION";
            }

            case PRIVATE_MULTI_MEMBER_LLC: {
                return "PRIVATE_MULTI_MEMBER_LLC";
            }

            case PRIVATE_PARTNERSHIP: {
                return "PRIVATE_PARTNERSHIP";
            }

            case PRIVATE_SINGLE_MEMBER_LLC: {
                return "PRIVATE_SINGLE_MEMBER_LLC";
            }

            case PRIVATE_UNINCORPORATED_ASSOCIATION: {
                return "PRIVATE_UNINCORPORATED_ASSOCIATION";
            }

            case PUBLIC_COMPANY: {
                return "PUBLIC_COMPANY";
            }

            case PUBLIC_CORPORATION: {
                return "PUBLIC_CORPORATION";
            }

            case PUBLIC_PARTNERSHIP: {
                return "PUBLIC_PARTNERSHIP";
            }

            case SOLE_ESTABLISHMENT: {
                return "SOLE_ESTABLISHMENT";
            }

            case SOLE_PROP: {
                return "SOLE_PROP";
            }

            case UNINCORPORATED_PARTNERSHIP: {
                return "UNINCORPORATED_PARTNERSHIP";
            }

            default: {
                return "";
            }
        }
    }
}


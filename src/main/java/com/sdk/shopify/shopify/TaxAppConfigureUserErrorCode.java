// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `TaxAppConfigureUserError`.
*/
public enum TaxAppConfigureUserErrorCode {
    /**
    * Unable to update already active tax partner.
    */
    TAX_PARTNER_ALREADY_ACTIVE,

    /**
    * Unable to find the tax partner record.
    */
    TAX_PARTNER_NOT_FOUND,

    /**
    * Unable to update tax partner state.
    */
    TAX_PARTNER_STATE_UPDATE_FAILED,

    UNKNOWN_VALUE;

    public static TaxAppConfigureUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "TAX_PARTNER_ALREADY_ACTIVE": {
                return TAX_PARTNER_ALREADY_ACTIVE;
            }

            case "TAX_PARTNER_NOT_FOUND": {
                return TAX_PARTNER_NOT_FOUND;
            }

            case "TAX_PARTNER_STATE_UPDATE_FAILED": {
                return TAX_PARTNER_STATE_UPDATE_FAILED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case TAX_PARTNER_ALREADY_ACTIVE: {
                return "TAX_PARTNER_ALREADY_ACTIVE";
            }

            case TAX_PARTNER_NOT_FOUND: {
                return "TAX_PARTNER_NOT_FOUND";
            }

            case TAX_PARTNER_STATE_UPDATE_FAILED: {
                return "TAX_PARTNER_STATE_UPDATE_FAILED";
            }

            default: {
                return "";
            }
        }
    }
}


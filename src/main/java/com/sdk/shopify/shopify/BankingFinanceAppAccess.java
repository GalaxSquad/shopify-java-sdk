// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The valid types of actions a user should be able to perform in an financial app.
*/
public enum BankingFinanceAppAccess {
    /**
    * Indication that the user has blocked money movement due to MFA disabled.
    */
    MONEY_MOVEMENT_BLOCKED_MFA,

    /**
    * Indication that the user has restricted money movement.
    */
    MONEY_MOVEMENT_RESTRICTED,

    /**
    * Ability to perform actions that moves money.
    */
    MOVE_MONEY,

    /**
    * Read access in the financial app.
    */
    READ_ACCESS,

    UNKNOWN_VALUE;

    public static BankingFinanceAppAccess fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MONEY_MOVEMENT_BLOCKED_MFA": {
                return MONEY_MOVEMENT_BLOCKED_MFA;
            }

            case "MONEY_MOVEMENT_RESTRICTED": {
                return MONEY_MOVEMENT_RESTRICTED;
            }

            case "MOVE_MONEY": {
                return MOVE_MONEY;
            }

            case "READ_ACCESS": {
                return READ_ACCESS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MONEY_MOVEMENT_BLOCKED_MFA: {
                return "MONEY_MOVEMENT_BLOCKED_MFA";
            }

            case MONEY_MOVEMENT_RESTRICTED: {
                return "MONEY_MOVEMENT_RESTRICTED";
            }

            case MOVE_MONEY: {
                return "MOVE_MONEY";
            }

            case READ_ACCESS: {
                return "READ_ACCESS";
            }

            default: {
                return "";
            }
        }
    }
}


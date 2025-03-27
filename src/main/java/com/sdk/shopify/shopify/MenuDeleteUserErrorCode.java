// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `MenuDeleteUserError`.
*/
public enum MenuDeleteUserErrorCode {
    /**
    * Menu does not exist.
    */
    MENU_DOES_NOT_EXIST,

    /**
    * Default menu cannot be deleted.
    */
    UNABLE_TO_DELETE_DEFAULT_MENU,

    UNKNOWN_VALUE;

    public static MenuDeleteUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MENU_DOES_NOT_EXIST": {
                return MENU_DOES_NOT_EXIST;
            }

            case "UNABLE_TO_DELETE_DEFAULT_MENU": {
                return UNABLE_TO_DELETE_DEFAULT_MENU;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MENU_DOES_NOT_EXIST: {
                return "MENU_DOES_NOT_EXIST";
            }

            case UNABLE_TO_DELETE_DEFAULT_MENU: {
                return "UNABLE_TO_DELETE_DEFAULT_MENU";
            }

            default: {
                return "";
            }
        }
    }
}


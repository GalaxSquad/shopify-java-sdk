// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


/**
* The set of valid sort keys for the StaffMembers query.
*/
public enum StaffMembersSortKeys {
    /**
    * Sort by the `email` value.
    */
    EMAIL,

    /**
    * Sort by the `first_name` value.
    */
    FIRST_NAME,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `last_name` value.
    */
    LAST_NAME,

    UNKNOWN_VALUE;

    public static StaffMembersSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "EMAIL": {
                return EMAIL;
            }

            case "FIRST_NAME": {
                return FIRST_NAME;
            }

            case "ID": {
                return ID;
            }

            case "LAST_NAME": {
                return LAST_NAME;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case EMAIL: {
                return "EMAIL";
            }

            case FIRST_NAME: {
                return "FIRST_NAME";
            }

            case ID: {
                return "ID";
            }

            case LAST_NAME: {
                return "LAST_NAME";
            }

            default: {
                return "";
            }
        }
    }
}


// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Specifies the relationship between the `column` and the `condition`.
*/
public enum CollectionRuleRelation {
    /**
    * The attribute contains the condition.
    */
    CONTAINS,

    /**
    * The attribute ends with the condition.
    */
    ENDS_WITH,

    /**
    * The attribute is equal to the condition.
    */
    EQUALS,

    /**
    * The attribute is greater than the condition.
    */
    GREATER_THAN,

    /**
    * The attribute is not set (equal to `null`).
    */
    IS_NOT_SET,

    /**
    * The attribute is set (not equal to `null`).
    */
    IS_SET,

    /**
    * The attribute is less than the condition.
    */
    LESS_THAN,

    /**
    * The attribute does not contain the condition.
    */
    NOT_CONTAINS,

    /**
    * The attribute does not equal the condition.
    */
    NOT_EQUALS,

    /**
    * The attribute starts with the condition.
    */
    STARTS_WITH,

    UNKNOWN_VALUE;

    public static CollectionRuleRelation fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CONTAINS": {
                return CONTAINS;
            }

            case "ENDS_WITH": {
                return ENDS_WITH;
            }

            case "EQUALS": {
                return EQUALS;
            }

            case "GREATER_THAN": {
                return GREATER_THAN;
            }

            case "IS_NOT_SET": {
                return IS_NOT_SET;
            }

            case "IS_SET": {
                return IS_SET;
            }

            case "LESS_THAN": {
                return LESS_THAN;
            }

            case "NOT_CONTAINS": {
                return NOT_CONTAINS;
            }

            case "NOT_EQUALS": {
                return NOT_EQUALS;
            }

            case "STARTS_WITH": {
                return STARTS_WITH;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CONTAINS: {
                return "CONTAINS";
            }

            case ENDS_WITH: {
                return "ENDS_WITH";
            }

            case EQUALS: {
                return "EQUALS";
            }

            case GREATER_THAN: {
                return "GREATER_THAN";
            }

            case IS_NOT_SET: {
                return "IS_NOT_SET";
            }

            case IS_SET: {
                return "IS_SET";
            }

            case LESS_THAN: {
                return "LESS_THAN";
            }

            case NOT_CONTAINS: {
                return "NOT_CONTAINS";
            }

            case NOT_EQUALS: {
                return "NOT_EQUALS";
            }

            case STARTS_WITH: {
                return "STARTS_WITH";
            }

            default: {
                return "";
            }
        }
    }
}


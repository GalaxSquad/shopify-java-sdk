// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The reason for returning the return line item.
*/
public enum ReturnReason {
    /**
    * The item is returned because the buyer did not like the color. Displays as **Color**.
    */
    COLOR,

    /**
    * The item is returned because it is damaged or defective. Displays as **Damaged or defective**.
    */
    DEFECTIVE,

    /**
    * The item is returned because it was not as described. Displays as **Item not as described**.
    */
    NOT_AS_DESCRIBED,

    /**
    * The item is returned for another reason. For this value, a return reason note is also provided.
    * Displays as **Other**.
    */
    OTHER,

    /**
    * The item is returned because the size was too large. Displays as **Size was too large**.
    */
    SIZE_TOO_LARGE,

    /**
    * The item is returned because the size was too small. Displays as **Size was too small**.
    */
    SIZE_TOO_SMALL,

    /**
    * The item is returned because the buyer did not like the style. Displays as **Style**.
    */
    STYLE,

    /**
    * The item is returned because of an unknown reason. Displays as **Unknown**.
    */
    UNKNOWN,

    /**
    * The item is returned because the customer changed their mind. Displays as **Customer changed their
    * mind**.
    */
    UNWANTED,

    /**
    * The item is returned because the customer received the wrong one. Displays as **Received the wrong
    * item**.
    */
    WRONG_ITEM,

    UNKNOWN_VALUE;

    public static ReturnReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COLOR": {
                return COLOR;
            }

            case "DEFECTIVE": {
                return DEFECTIVE;
            }

            case "NOT_AS_DESCRIBED": {
                return NOT_AS_DESCRIBED;
            }

            case "OTHER": {
                return OTHER;
            }

            case "SIZE_TOO_LARGE": {
                return SIZE_TOO_LARGE;
            }

            case "SIZE_TOO_SMALL": {
                return SIZE_TOO_SMALL;
            }

            case "STYLE": {
                return STYLE;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            case "UNWANTED": {
                return UNWANTED;
            }

            case "WRONG_ITEM": {
                return WRONG_ITEM;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COLOR: {
                return "COLOR";
            }

            case DEFECTIVE: {
                return "DEFECTIVE";
            }

            case NOT_AS_DESCRIBED: {
                return "NOT_AS_DESCRIBED";
            }

            case OTHER: {
                return "OTHER";
            }

            case SIZE_TOO_LARGE: {
                return "SIZE_TOO_LARGE";
            }

            case SIZE_TOO_SMALL: {
                return "SIZE_TOO_SMALL";
            }

            case STYLE: {
                return "STYLE";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            case UNWANTED: {
                return "UNWANTED";
            }

            case WRONG_ITEM: {
                return "WRONG_ITEM";
            }

            default: {
                return "";
            }
        }
    }
}


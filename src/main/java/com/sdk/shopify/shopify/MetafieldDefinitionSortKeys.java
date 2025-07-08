// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the MetafieldDefinition query.
*/
public enum MetafieldDefinitionSortKeys {
    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `name` value.
    */
    NAME,

    /**
    * Sort by the `pinned_position` value.
    */
    PINNED_POSITION,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ID": {
                return ID;
            }

            case "NAME": {
                return NAME;
            }

            case "PINNED_POSITION": {
                return PINNED_POSITION;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ID: {
                return "ID";
            }

            case NAME: {
                return "NAME";
            }

            case PINNED_POSITION: {
                return "PINNED_POSITION";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            default: {
                return "";
            }
        }
    }
}


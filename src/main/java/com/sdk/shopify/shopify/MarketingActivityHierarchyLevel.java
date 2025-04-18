// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Hierarchy levels for external marketing activities.
*/
public enum MarketingActivityHierarchyLevel {
    /**
    * An advertisement activity. Must be parented by an ad group or a campaign activity, and must be
    * assigned tracking parameters (URL or UTM).
    */
    AD,

    /**
    * A group of advertisement activities. Must be parented by a campaign activity.
    */
    AD_GROUP,

    /**
    * A campaign activity. May contain either ad groups or ads as child activities. If childless, then the
    * campaign activity should have tracking parameters assigned (URL or UTM) otherwise it won't appear in
    * marketing reports.
    */
    CAMPAIGN,

    UNKNOWN_VALUE;

    public static MarketingActivityHierarchyLevel fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AD": {
                return AD;
            }

            case "AD_GROUP": {
                return AD_GROUP;
            }

            case "CAMPAIGN": {
                return CAMPAIGN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AD: {
                return "AD";
            }

            case AD_GROUP: {
                return "AD_GROUP";
            }

            case CAMPAIGN: {
                return "CAMPAIGN";
            }

            default: {
                return "";
            }
        }
    }
}


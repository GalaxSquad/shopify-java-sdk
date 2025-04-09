// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible account types that a staff member can have.
*/
public enum AccountType {
    /**
    * The account of a partner who collaborates with the merchant.
    */
    COLLABORATOR,

    /**
    * The account of a partner collaborator team member.
    */
    COLLABORATOR_TEAM_MEMBER,

    /**
    * The user has not yet accepted the invitation to create an account.
    */
    INVITED,

    /**
    * The user has not yet accepted the invitation to become the store owner.
    */
    INVITED_STORE_OWNER,

    /**
    * The account can access the Shopify admin.
    */
    REGULAR,

    /**
    * The admin has not yet accepted the request to create a collaborator account.
    */
    REQUESTED,

    /**
    * The account cannot access the Shopify admin.
    */
    RESTRICTED,

    /**
    * The account can be signed into via a SAML provider.
    */
    SAML,

    UNKNOWN_VALUE;

    public static AccountType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COLLABORATOR": {
                return COLLABORATOR;
            }

            case "COLLABORATOR_TEAM_MEMBER": {
                return COLLABORATOR_TEAM_MEMBER;
            }

            case "INVITED": {
                return INVITED;
            }

            case "INVITED_STORE_OWNER": {
                return INVITED_STORE_OWNER;
            }

            case "REGULAR": {
                return REGULAR;
            }

            case "REQUESTED": {
                return REQUESTED;
            }

            case "RESTRICTED": {
                return RESTRICTED;
            }

            case "SAML": {
                return SAML;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COLLABORATOR: {
                return "COLLABORATOR";
            }

            case COLLABORATOR_TEAM_MEMBER: {
                return "COLLABORATOR_TEAM_MEMBER";
            }

            case INVITED: {
                return "INVITED";
            }

            case INVITED_STORE_OWNER: {
                return "INVITED_STORE_OWNER";
            }

            case REGULAR: {
                return "REGULAR";
            }

            case REQUESTED: {
                return "REQUESTED";
            }

            case RESTRICTED: {
                return "RESTRICTED";
            }

            case SAML: {
                return "SAML";
            }

            default: {
                return "";
            }
        }
    }
}


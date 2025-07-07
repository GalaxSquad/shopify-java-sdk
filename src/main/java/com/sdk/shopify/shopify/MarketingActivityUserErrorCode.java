// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `MarketingActivityUserError`.
*/
public enum MarketingActivityUserErrorCode {
    /**
    * The marketing activity must be an external activity.
    */
    ACTIVITY_NOT_EXTERNAL,

    /**
    * This activity has child activities and thus cannot be deleted. Child activities must be deleted
    * before a parent activity.
    */
    CANNOT_DELETE_ACTIVITY_WITH_CHILD_EVENTS,

    /**
    * The activity's tactic can not be updated from STOREFRONT_APP.
    */
    CANNOT_UPDATE_TACTIC_IF_ORIGINALLY_STOREFRONT_APP,

    /**
    * The activity's tactic can not be updated to STOREFRONT_APP. This type of tactic can only be
    * specified when creating a new activity.
    */
    CANNOT_UPDATE_TACTIC_TO_STOREFRONT_APP,

    /**
    * All currency codes provided in the input need to match.
    */
    CURRENCY_CODE_MISMATCH_INPUT,

    /**
    * A mutation can not be ran because a job to delete all external activities has been enqueued, which
    * happens either from calling the marketingActivitiesDeleteAllExternal mutation or as a result of an
    * app uninstall.
    */
    DELETE_JOB_ENQUEUED,

    /**
    * The job to delete all external activities failed to enqueue.
    */
    DELETE_JOB_FAILED_TO_ENQUEUE,

    /**
    * The channel handle value cannot be modified.
    */
    IMMUTABLE_CHANNEL_HANDLE,

    /**
    * The hierarchy level cannot be modified.
    */
    IMMUTABLE_HIERARCHY_LEVEL,

    /**
    * The parent activity cannot be modified.
    */
    IMMUTABLE_PARENT_ID,

    /**
    * The URL parameter value cannot be modified.
    */
    IMMUTABLE_URL_PARAMETER,

    /**
    * The UTM parameters cannot be modified.
    */
    IMMUTABLE_UTM_PARAMETERS,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The channel handle is not recognized.
    */
    INVALID_CHANNEL_HANDLE,

    /**
    * Either the marketing activity ID or remote ID must be provided for the activity to be deleted.
    */
    INVALID_DELETE_ACTIVITY_EXTERNAL_ARGUMENTS,

    /**
    * Either the channel_handle or delete_engagements_for_all_channels must be provided when deleting a
    * marketing engagement.
    */
    INVALID_DELETE_ENGAGEMENTS_ARGUMENTS,

    /**
    * Either the marketing activity ID, remote ID, or UTM must be provided.
    */
    INVALID_MARKETING_ACTIVITY_EXTERNAL_ARGUMENTS,

    /**
    * For activity level engagement, either the marketing activity ID or remote ID must be provided. For
    * channel level engagement, the channel handle must be provided.
    */
    INVALID_MARKETING_ENGAGEMENT_ARGUMENTS,

    /**
    * No identifier found. For activity level engagement, either the marketing activity ID or remote ID
    * must be provided. For channel level engagement, the channel handle must be provided.
    */
    INVALID_MARKETING_ENGAGEMENT_ARGUMENT_MISSING,

    /**
    * The remote ID does not correspond to an existing activity.
    */
    INVALID_REMOTE_ID,

    /**
    * The currency codes provided need to match the referenced marketing activity's currency code.
    */
    MARKETING_ACTIVITY_CURRENCY_CODE_MISMATCH,

    /**
    * Marketing activity does not exist.
    */
    MARKETING_ACTIVITY_DOES_NOT_EXIST,

    /**
    * A marketing activity with the same remote ID already exists.
    */
    MARKETING_ACTIVITY_WITH_REMOTE_ID_ALREADY_EXISTS,

    /**
    * A marketing activity with the same URL parameter value already exists.
    */
    MARKETING_ACTIVITY_WITH_URL_PARAMETER_VALUE_ALREADY_EXISTS,

    /**
    * A marketing activity with the same UTM campaign, medium, and source already exists.
    */
    MARKETING_ACTIVITY_WITH_UTM_CAMPAIGN_ALREADY_EXISTS,

    /**
    * Marketing activity is not valid, the associated marketing event does not exist.
    */
    MARKETING_EVENT_DOES_NOT_EXIST,

    /**
    * Non-hierarchical marketing activities must have UTM parameters or a URL parameter value.
    */
    NON_HIERARCHIAL_REQUIRES_UTM_URL_PARAMETER,

    /**
    * The input value is already taken.
    */
    TAKEN,

    UNKNOWN_VALUE;

    public static MarketingActivityUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVITY_NOT_EXTERNAL": {
                return ACTIVITY_NOT_EXTERNAL;
            }

            case "CANNOT_DELETE_ACTIVITY_WITH_CHILD_EVENTS": {
                return CANNOT_DELETE_ACTIVITY_WITH_CHILD_EVENTS;
            }

            case "CANNOT_UPDATE_TACTIC_IF_ORIGINALLY_STOREFRONT_APP": {
                return CANNOT_UPDATE_TACTIC_IF_ORIGINALLY_STOREFRONT_APP;
            }

            case "CANNOT_UPDATE_TACTIC_TO_STOREFRONT_APP": {
                return CANNOT_UPDATE_TACTIC_TO_STOREFRONT_APP;
            }

            case "CURRENCY_CODE_MISMATCH_INPUT": {
                return CURRENCY_CODE_MISMATCH_INPUT;
            }

            case "DELETE_JOB_ENQUEUED": {
                return DELETE_JOB_ENQUEUED;
            }

            case "DELETE_JOB_FAILED_TO_ENQUEUE": {
                return DELETE_JOB_FAILED_TO_ENQUEUE;
            }

            case "IMMUTABLE_CHANNEL_HANDLE": {
                return IMMUTABLE_CHANNEL_HANDLE;
            }

            case "IMMUTABLE_HIERARCHY_LEVEL": {
                return IMMUTABLE_HIERARCHY_LEVEL;
            }

            case "IMMUTABLE_PARENT_ID": {
                return IMMUTABLE_PARENT_ID;
            }

            case "IMMUTABLE_URL_PARAMETER": {
                return IMMUTABLE_URL_PARAMETER;
            }

            case "IMMUTABLE_UTM_PARAMETERS": {
                return IMMUTABLE_UTM_PARAMETERS;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_CHANNEL_HANDLE": {
                return INVALID_CHANNEL_HANDLE;
            }

            case "INVALID_DELETE_ACTIVITY_EXTERNAL_ARGUMENTS": {
                return INVALID_DELETE_ACTIVITY_EXTERNAL_ARGUMENTS;
            }

            case "INVALID_DELETE_ENGAGEMENTS_ARGUMENTS": {
                return INVALID_DELETE_ENGAGEMENTS_ARGUMENTS;
            }

            case "INVALID_MARKETING_ACTIVITY_EXTERNAL_ARGUMENTS": {
                return INVALID_MARKETING_ACTIVITY_EXTERNAL_ARGUMENTS;
            }

            case "INVALID_MARKETING_ENGAGEMENT_ARGUMENTS": {
                return INVALID_MARKETING_ENGAGEMENT_ARGUMENTS;
            }

            case "INVALID_MARKETING_ENGAGEMENT_ARGUMENT_MISSING": {
                return INVALID_MARKETING_ENGAGEMENT_ARGUMENT_MISSING;
            }

            case "INVALID_REMOTE_ID": {
                return INVALID_REMOTE_ID;
            }

            case "MARKETING_ACTIVITY_CURRENCY_CODE_MISMATCH": {
                return MARKETING_ACTIVITY_CURRENCY_CODE_MISMATCH;
            }

            case "MARKETING_ACTIVITY_DOES_NOT_EXIST": {
                return MARKETING_ACTIVITY_DOES_NOT_EXIST;
            }

            case "MARKETING_ACTIVITY_WITH_REMOTE_ID_ALREADY_EXISTS": {
                return MARKETING_ACTIVITY_WITH_REMOTE_ID_ALREADY_EXISTS;
            }

            case "MARKETING_ACTIVITY_WITH_URL_PARAMETER_VALUE_ALREADY_EXISTS": {
                return MARKETING_ACTIVITY_WITH_URL_PARAMETER_VALUE_ALREADY_EXISTS;
            }

            case "MARKETING_ACTIVITY_WITH_UTM_CAMPAIGN_ALREADY_EXISTS": {
                return MARKETING_ACTIVITY_WITH_UTM_CAMPAIGN_ALREADY_EXISTS;
            }

            case "MARKETING_EVENT_DOES_NOT_EXIST": {
                return MARKETING_EVENT_DOES_NOT_EXIST;
            }

            case "NON_HIERARCHIAL_REQUIRES_UTM_URL_PARAMETER": {
                return NON_HIERARCHIAL_REQUIRES_UTM_URL_PARAMETER;
            }

            case "TAKEN": {
                return TAKEN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVITY_NOT_EXTERNAL: {
                return "ACTIVITY_NOT_EXTERNAL";
            }

            case CANNOT_DELETE_ACTIVITY_WITH_CHILD_EVENTS: {
                return "CANNOT_DELETE_ACTIVITY_WITH_CHILD_EVENTS";
            }

            case CANNOT_UPDATE_TACTIC_IF_ORIGINALLY_STOREFRONT_APP: {
                return "CANNOT_UPDATE_TACTIC_IF_ORIGINALLY_STOREFRONT_APP";
            }

            case CANNOT_UPDATE_TACTIC_TO_STOREFRONT_APP: {
                return "CANNOT_UPDATE_TACTIC_TO_STOREFRONT_APP";
            }

            case CURRENCY_CODE_MISMATCH_INPUT: {
                return "CURRENCY_CODE_MISMATCH_INPUT";
            }

            case DELETE_JOB_ENQUEUED: {
                return "DELETE_JOB_ENQUEUED";
            }

            case DELETE_JOB_FAILED_TO_ENQUEUE: {
                return "DELETE_JOB_FAILED_TO_ENQUEUE";
            }

            case IMMUTABLE_CHANNEL_HANDLE: {
                return "IMMUTABLE_CHANNEL_HANDLE";
            }

            case IMMUTABLE_HIERARCHY_LEVEL: {
                return "IMMUTABLE_HIERARCHY_LEVEL";
            }

            case IMMUTABLE_PARENT_ID: {
                return "IMMUTABLE_PARENT_ID";
            }

            case IMMUTABLE_URL_PARAMETER: {
                return "IMMUTABLE_URL_PARAMETER";
            }

            case IMMUTABLE_UTM_PARAMETERS: {
                return "IMMUTABLE_UTM_PARAMETERS";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_CHANNEL_HANDLE: {
                return "INVALID_CHANNEL_HANDLE";
            }

            case INVALID_DELETE_ACTIVITY_EXTERNAL_ARGUMENTS: {
                return "INVALID_DELETE_ACTIVITY_EXTERNAL_ARGUMENTS";
            }

            case INVALID_DELETE_ENGAGEMENTS_ARGUMENTS: {
                return "INVALID_DELETE_ENGAGEMENTS_ARGUMENTS";
            }

            case INVALID_MARKETING_ACTIVITY_EXTERNAL_ARGUMENTS: {
                return "INVALID_MARKETING_ACTIVITY_EXTERNAL_ARGUMENTS";
            }

            case INVALID_MARKETING_ENGAGEMENT_ARGUMENTS: {
                return "INVALID_MARKETING_ENGAGEMENT_ARGUMENTS";
            }

            case INVALID_MARKETING_ENGAGEMENT_ARGUMENT_MISSING: {
                return "INVALID_MARKETING_ENGAGEMENT_ARGUMENT_MISSING";
            }

            case INVALID_REMOTE_ID: {
                return "INVALID_REMOTE_ID";
            }

            case MARKETING_ACTIVITY_CURRENCY_CODE_MISMATCH: {
                return "MARKETING_ACTIVITY_CURRENCY_CODE_MISMATCH";
            }

            case MARKETING_ACTIVITY_DOES_NOT_EXIST: {
                return "MARKETING_ACTIVITY_DOES_NOT_EXIST";
            }

            case MARKETING_ACTIVITY_WITH_REMOTE_ID_ALREADY_EXISTS: {
                return "MARKETING_ACTIVITY_WITH_REMOTE_ID_ALREADY_EXISTS";
            }

            case MARKETING_ACTIVITY_WITH_URL_PARAMETER_VALUE_ALREADY_EXISTS: {
                return "MARKETING_ACTIVITY_WITH_URL_PARAMETER_VALUE_ALREADY_EXISTS";
            }

            case MARKETING_ACTIVITY_WITH_UTM_CAMPAIGN_ALREADY_EXISTS: {
                return "MARKETING_ACTIVITY_WITH_UTM_CAMPAIGN_ALREADY_EXISTS";
            }

            case MARKETING_EVENT_DOES_NOT_EXIST: {
                return "MARKETING_EVENT_DOES_NOT_EXIST";
            }

            case NON_HIERARCHIAL_REQUIRES_UTM_URL_PARAMETER: {
                return "NON_HIERARCHIAL_REQUIRES_UTM_URL_PARAMETER";
            }

            case TAKEN: {
                return "TAKEN";
            }

            default: {
                return "";
            }
        }
    }
}


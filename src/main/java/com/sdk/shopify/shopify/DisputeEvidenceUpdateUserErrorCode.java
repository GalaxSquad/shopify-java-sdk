// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `DisputeEvidenceUpdateUserError`.
*/
public enum DisputeEvidenceUpdateUserErrorCode {
    /**
    * Dispute evidence could not be found.
    */
    DISPUTE_EVIDENCE_NOT_FOUND,

    /**
    * Evidence already accepted.
    */
    EVIDENCE_ALREADY_ACCEPTED,

    /**
    * Evidence past due date.
    */
    EVIDENCE_PAST_DUE_DATE,

    /**
    * Combined files size is too large.
    */
    FILES_SIZE_EXCEEDED_LIMIT,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Individual file size is too large.
    */
    TOO_LARGE,

    UNKNOWN_VALUE;

    public static DisputeEvidenceUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DISPUTE_EVIDENCE_NOT_FOUND": {
                return DISPUTE_EVIDENCE_NOT_FOUND;
            }

            case "EVIDENCE_ALREADY_ACCEPTED": {
                return EVIDENCE_ALREADY_ACCEPTED;
            }

            case "EVIDENCE_PAST_DUE_DATE": {
                return EVIDENCE_PAST_DUE_DATE;
            }

            case "FILES_SIZE_EXCEEDED_LIMIT": {
                return FILES_SIZE_EXCEEDED_LIMIT;
            }

            case "INVALID": {
                return INVALID;
            }

            case "TOO_LARGE": {
                return TOO_LARGE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DISPUTE_EVIDENCE_NOT_FOUND: {
                return "DISPUTE_EVIDENCE_NOT_FOUND";
            }

            case EVIDENCE_ALREADY_ACCEPTED: {
                return "EVIDENCE_ALREADY_ACCEPTED";
            }

            case EVIDENCE_PAST_DUE_DATE: {
                return "EVIDENCE_PAST_DUE_DATE";
            }

            case FILES_SIZE_EXCEEDED_LIMIT: {
                return "FILES_SIZE_EXCEEDED_LIMIT";
            }

            case INVALID: {
                return "INVALID";
            }

            case TOO_LARGE: {
                return "TOO_LARGE";
            }

            default: {
                return "";
            }
        }
    }
}


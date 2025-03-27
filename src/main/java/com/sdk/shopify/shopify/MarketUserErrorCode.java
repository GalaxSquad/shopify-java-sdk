// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `MarketUserError`.
*/
public enum MarketUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Can't add customer account domain to a market.
    */
    CANNOT_ADD_CUSTOMER_DOMAIN,

    /**
    * Can't add regions to the primary market.
    */
    CANNOT_ADD_REGIONS_TO_PRIMARY_MARKET,

    /**
    * Can't add the web presence to the primary market.
    */
    CANNOT_ADD_WEB_PRESENCE_TO_PRIMARY_MARKET,

    /**
    * Can't delete the only region in a market.
    */
    CANNOT_DELETE_ONLY_REGION,

    /**
    * Can't delete the primary market.
    */
    CANNOT_DELETE_PRIMARY_MARKET,

    /**
    * Can't delete the primary market's web presence.
    */
    CANNOT_DELETE_PRIMARY_MARKET_WEB_PRESENCE,

    /**
    * Can't disable the primary market.
    */
    CANNOT_DISABLE_PRIMARY_MARKET,

    /**
    * Can't have both subfolder and domain web presences.
    */
    CANNOT_HAVE_BOTH_SUBFOLDER_AND_DOMAIN_WEB_PRESENCES,

    /**
    * Can't have multiple subfolder web presences per market.
    */
    CANNOT_HAVE_MULTIPLE_SUBFOLDERS_PER_MARKET,

    /**
    * Can't pass both `subfolderSuffix` and `domainId`.
    */
    CANNOT_HAVE_SUBFOLDER_AND_DOMAIN,

    /**
    * Can't set default locale to null.
    */
    CANNOT_SET_DEFAULT_LOCALE_TO_NULL,

    /**
    * The language isn't enabled on the store.
    */
    DISABLED_LANGUAGE,

    /**
    * Domain was not found.
    */
    DOMAIN_NOT_FOUND,

    /**
    * Duplicates found in languages.
    */
    DUPLICATE_LANGUAGES,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The market wasn't found.
    */
    MARKET_NOT_FOUND,

    /**
    * Can't add another web presence to the market.
    */
    MARKET_REACHED_WEB_PRESENCE_LIMIT,

    /**
    * No languages selected.
    */
    NO_LANGUAGES,

    /**
    * The primary market must use the primary domain.
    */
    PRIMARY_MARKET_MUST_USE_PRIMARY_DOMAIN,

    /**
    * The market region wasn't found.
    */
    REGION_NOT_FOUND,

    /**
    * Cannot add region-specific language.
    */
    REGION_SPECIFIC_LANGUAGE,

    /**
    * One of `subfolderSuffix` or `domainId` is required.
    */
    REQUIRES_DOMAIN_OR_SUBFOLDER,

    /**
    * Exactly one input option is required.
    */
    REQUIRES_EXACTLY_ONE_OPTION,

    /**
    * Can't have more than 50 markets.
    */
    SHOP_REACHED_MARKETS_LIMIT,

    /**
    * The subfolder suffix is invalid, please provide a different value.
    */
    SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE,

    /**
    * The subfolder suffix must contain only letters.
    */
    SUBFOLDER_SUFFIX_MUST_CONTAIN_ONLY_LETTERS,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * The input value is too short.
    */
    TOO_SHORT,

    /**
    * The language isn't published to the store.
    */
    UNPUBLISHED_LANGUAGE,

    /**
    * Can't add unsupported country or region.
    */
    UNSUPPORTED_COUNTRY_REGION,

    /**
    * The market web presence wasn't found.
    */
    WEB_PRESENCE_NOT_FOUND,

    UNKNOWN_VALUE;

    public static MarketUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "CANNOT_ADD_CUSTOMER_DOMAIN": {
                return CANNOT_ADD_CUSTOMER_DOMAIN;
            }

            case "CANNOT_ADD_REGIONS_TO_PRIMARY_MARKET": {
                return CANNOT_ADD_REGIONS_TO_PRIMARY_MARKET;
            }

            case "CANNOT_ADD_WEB_PRESENCE_TO_PRIMARY_MARKET": {
                return CANNOT_ADD_WEB_PRESENCE_TO_PRIMARY_MARKET;
            }

            case "CANNOT_DELETE_ONLY_REGION": {
                return CANNOT_DELETE_ONLY_REGION;
            }

            case "CANNOT_DELETE_PRIMARY_MARKET": {
                return CANNOT_DELETE_PRIMARY_MARKET;
            }

            case "CANNOT_DELETE_PRIMARY_MARKET_WEB_PRESENCE": {
                return CANNOT_DELETE_PRIMARY_MARKET_WEB_PRESENCE;
            }

            case "CANNOT_DISABLE_PRIMARY_MARKET": {
                return CANNOT_DISABLE_PRIMARY_MARKET;
            }

            case "CANNOT_HAVE_BOTH_SUBFOLDER_AND_DOMAIN_WEB_PRESENCES": {
                return CANNOT_HAVE_BOTH_SUBFOLDER_AND_DOMAIN_WEB_PRESENCES;
            }

            case "CANNOT_HAVE_MULTIPLE_SUBFOLDERS_PER_MARKET": {
                return CANNOT_HAVE_MULTIPLE_SUBFOLDERS_PER_MARKET;
            }

            case "CANNOT_HAVE_SUBFOLDER_AND_DOMAIN": {
                return CANNOT_HAVE_SUBFOLDER_AND_DOMAIN;
            }

            case "CANNOT_SET_DEFAULT_LOCALE_TO_NULL": {
                return CANNOT_SET_DEFAULT_LOCALE_TO_NULL;
            }

            case "DISABLED_LANGUAGE": {
                return DISABLED_LANGUAGE;
            }

            case "DOMAIN_NOT_FOUND": {
                return DOMAIN_NOT_FOUND;
            }

            case "DUPLICATE_LANGUAGES": {
                return DUPLICATE_LANGUAGES;
            }

            case "INVALID": {
                return INVALID;
            }

            case "MARKET_NOT_FOUND": {
                return MARKET_NOT_FOUND;
            }

            case "MARKET_REACHED_WEB_PRESENCE_LIMIT": {
                return MARKET_REACHED_WEB_PRESENCE_LIMIT;
            }

            case "NO_LANGUAGES": {
                return NO_LANGUAGES;
            }

            case "PRIMARY_MARKET_MUST_USE_PRIMARY_DOMAIN": {
                return PRIMARY_MARKET_MUST_USE_PRIMARY_DOMAIN;
            }

            case "REGION_NOT_FOUND": {
                return REGION_NOT_FOUND;
            }

            case "REGION_SPECIFIC_LANGUAGE": {
                return REGION_SPECIFIC_LANGUAGE;
            }

            case "REQUIRES_DOMAIN_OR_SUBFOLDER": {
                return REQUIRES_DOMAIN_OR_SUBFOLDER;
            }

            case "REQUIRES_EXACTLY_ONE_OPTION": {
                return REQUIRES_EXACTLY_ONE_OPTION;
            }

            case "SHOP_REACHED_MARKETS_LIMIT": {
                return SHOP_REACHED_MARKETS_LIMIT;
            }

            case "SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE": {
                return SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE;
            }

            case "SUBFOLDER_SUFFIX_MUST_CONTAIN_ONLY_LETTERS": {
                return SUBFOLDER_SUFFIX_MUST_CONTAIN_ONLY_LETTERS;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TOO_SHORT": {
                return TOO_SHORT;
            }

            case "UNPUBLISHED_LANGUAGE": {
                return UNPUBLISHED_LANGUAGE;
            }

            case "UNSUPPORTED_COUNTRY_REGION": {
                return UNSUPPORTED_COUNTRY_REGION;
            }

            case "WEB_PRESENCE_NOT_FOUND": {
                return WEB_PRESENCE_NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BLANK: {
                return "BLANK";
            }

            case CANNOT_ADD_CUSTOMER_DOMAIN: {
                return "CANNOT_ADD_CUSTOMER_DOMAIN";
            }

            case CANNOT_ADD_REGIONS_TO_PRIMARY_MARKET: {
                return "CANNOT_ADD_REGIONS_TO_PRIMARY_MARKET";
            }

            case CANNOT_ADD_WEB_PRESENCE_TO_PRIMARY_MARKET: {
                return "CANNOT_ADD_WEB_PRESENCE_TO_PRIMARY_MARKET";
            }

            case CANNOT_DELETE_ONLY_REGION: {
                return "CANNOT_DELETE_ONLY_REGION";
            }

            case CANNOT_DELETE_PRIMARY_MARKET: {
                return "CANNOT_DELETE_PRIMARY_MARKET";
            }

            case CANNOT_DELETE_PRIMARY_MARKET_WEB_PRESENCE: {
                return "CANNOT_DELETE_PRIMARY_MARKET_WEB_PRESENCE";
            }

            case CANNOT_DISABLE_PRIMARY_MARKET: {
                return "CANNOT_DISABLE_PRIMARY_MARKET";
            }

            case CANNOT_HAVE_BOTH_SUBFOLDER_AND_DOMAIN_WEB_PRESENCES: {
                return "CANNOT_HAVE_BOTH_SUBFOLDER_AND_DOMAIN_WEB_PRESENCES";
            }

            case CANNOT_HAVE_MULTIPLE_SUBFOLDERS_PER_MARKET: {
                return "CANNOT_HAVE_MULTIPLE_SUBFOLDERS_PER_MARKET";
            }

            case CANNOT_HAVE_SUBFOLDER_AND_DOMAIN: {
                return "CANNOT_HAVE_SUBFOLDER_AND_DOMAIN";
            }

            case CANNOT_SET_DEFAULT_LOCALE_TO_NULL: {
                return "CANNOT_SET_DEFAULT_LOCALE_TO_NULL";
            }

            case DISABLED_LANGUAGE: {
                return "DISABLED_LANGUAGE";
            }

            case DOMAIN_NOT_FOUND: {
                return "DOMAIN_NOT_FOUND";
            }

            case DUPLICATE_LANGUAGES: {
                return "DUPLICATE_LANGUAGES";
            }

            case INVALID: {
                return "INVALID";
            }

            case MARKET_NOT_FOUND: {
                return "MARKET_NOT_FOUND";
            }

            case MARKET_REACHED_WEB_PRESENCE_LIMIT: {
                return "MARKET_REACHED_WEB_PRESENCE_LIMIT";
            }

            case NO_LANGUAGES: {
                return "NO_LANGUAGES";
            }

            case PRIMARY_MARKET_MUST_USE_PRIMARY_DOMAIN: {
                return "PRIMARY_MARKET_MUST_USE_PRIMARY_DOMAIN";
            }

            case REGION_NOT_FOUND: {
                return "REGION_NOT_FOUND";
            }

            case REGION_SPECIFIC_LANGUAGE: {
                return "REGION_SPECIFIC_LANGUAGE";
            }

            case REQUIRES_DOMAIN_OR_SUBFOLDER: {
                return "REQUIRES_DOMAIN_OR_SUBFOLDER";
            }

            case REQUIRES_EXACTLY_ONE_OPTION: {
                return "REQUIRES_EXACTLY_ONE_OPTION";
            }

            case SHOP_REACHED_MARKETS_LIMIT: {
                return "SHOP_REACHED_MARKETS_LIMIT";
            }

            case SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE: {
                return "SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE";
            }

            case SUBFOLDER_SUFFIX_MUST_CONTAIN_ONLY_LETTERS: {
                return "SUBFOLDER_SUFFIX_MUST_CONTAIN_ONLY_LETTERS";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TOO_SHORT: {
                return "TOO_SHORT";
            }

            case UNPUBLISHED_LANGUAGE: {
                return "UNPUBLISHED_LANGUAGE";
            }

            case UNSUPPORTED_COUNTRY_REGION: {
                return "UNSUPPORTED_COUNTRY_REGION";
            }

            case WEB_PRESENCE_NOT_FOUND: {
                return "WEB_PRESENCE_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}


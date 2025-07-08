// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `MarketUserError`.
*/
public enum MarketUserErrorCode {
    /**
    * B2B markets must be merchant managed.
    */
    B2B_MARKET_MUST_BE_MERCHANT_MANAGED,

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
    * Catalogs with volume pricing or quantity rules are not supported for the specified condition types.
    */
    CATALOGS_WITH_VOLUME_PRICING_OR_QUANTITY_RULES_NOT_SUPPORTED,

    /**
    * Catalog condition types must be the same for all conditions on a catalog.
    */
    CATALOG_CONDITION_TYPES_MUST_BE_THE_SAME,

    /**
    * Catalogs and condition types are not compatible with each other.
    */
    CATALOG_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

    /**
    * A market can only have market catalogs.
    */
    CATALOG_TYPE_NOT_SUPPORTED,

    /**
    * One or more condition IDs were not found.
    */
    CONDITIONS_NOT_FOUND,

    /**
    * Contains regions that cannot be managed.
    */
    CONTAINS_REGIONS_THAT_CANNOT_BE_MANAGED,

    /**
    * One or more customizations were not found.
    */
    CUSTOMIZATIONS_NOT_FOUND,

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
    * Duplicate region market.
    */
    DUPLICATE_REGION_MARKET,

    /**
    * Duplicate unique market.
    */
    DUPLICATE_UNIQUE_MARKET,

    /**
    * Exceeds max multi-context markets.
    */
    EXCEEDS_MAX_MULTI_CONTEXT_MARKETS,

    /**
    * An error occurred. See the message for details.
    */
    GENERIC_ERROR,

    /**
    * The input value isn't included in the list.
    */
    INCLUSION,

    /**
    * Inclusive pricing cannot be added to a market with the specified condition types.
    */
    INCLUSIVE_PRICING_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

    /**
    * The specified conditions are not compatible with each other.
    */
    INCOMPATIBLE_CONDITIONS,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Invalid combination of status and enabled.
    */
    INVALID_STATUS_AND_ENABLED_COMBINATION,

    /**
    * Location match all is only valid with one non-match all region.
    */
    LOCATION_MATCH_ALL_REQUIRES_ONE_SPECIFIC_REGION,

    /**
    * A location's country does not match the region's country.
    */
    LOCATION_REGION_COUNTRY_MISMATCH,

    /**
    * The currency settings of the given market cannot be changed because the market manager has exclusive
    * control of pricing.
    */
    MANAGED_MARKET,

    /**
    * Catalogs created by Managed Markets cannot be added to a market.
    */
    MANAGED_MARKETS_CATALOG_NOT_ALLOWED,

    /**
    * A direct connection catalog can't be attached to a market.
    */
    MARKET_CANT_HAVE_DIRECT_CONNECTION_CATALOG,

    /**
    * Market and condition types are not compatible with each other.
    */
    MARKET_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

    /**
    * The market wasn't found.
    */
    MARKET_NOT_FOUND,

    /**
    * Can't add another web presence to the market.
    */
    MARKET_REACHED_WEB_PRESENCE_LIMIT,

    /**
    * All retail locations in a market must be in the same country.
    */
    MIXED_COUNTRY_LOCATIONS_NOT_ALLOWED,

    /**
    * The shop's payment gateway does not support enabling more than one currency.
    */
    MULTIPLE_CURRENCIES_NOT_SUPPORTED,

    /**
    * Can’t delete, disable, or change the type of the last region market.
    */
    MUST_HAVE_AT_LEAST_ONE_ACTIVE_REGION_MARKET,

    /**
    * Your shop is not entitled to activate markets of this type.
    */
    NOT_ENTITLED_TO_ACTIVATE_MARKET,

    /**
    * No languages selected.
    */
    NO_LANGUAGES,

    /**
    * Can't enable or disable local currencies on a single country market.
    */
    NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET,

    /**
    * Rounding is not supported if unified markets are not enabled.
    */
    NO_ROUNDING_ON_LEGACY_MARKET,

    /**
    * POS location markets must be merchant managed.
    */
    POS_LOCATION_MARKET_MUST_BE_MERCHANT_MANAGED,

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
    * Retail location currency must be local.
    */
    RETAIL_LOCATION_CURRENCY_MUST_BE_LOCAL,

    /**
    * The shop must have a web presence that uses the primary domain.
    */
    SHOP_MUST_HAVE_PRIMARY_DOMAIN_WEB_PRESENCE,

    /**
    * Can't have more than 50 markets.
    */
    SHOP_REACHED_MARKETS_LIMIT,

    /**
    * Specified conditions cannot be empty.
    */
    SPECIFIED_CONDITIONS_CANNOT_BE_EMPTY,

    /**
    * With an ID list in input, SPECIFIED is not needed.
    */
    SPECIFIED_NOT_VALID_FOR_INPUT,

    /**
    * The subfolder suffix is invalid, please provide a different value.
    */
    SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE,

    /**
    * The subfolder suffix must be at least 2 letters.
    */
    SUBFOLDER_SUFFIX_MUST_BE_AT_LEAST_2_LETTERS,

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
    * Unified markets are not enabled.
    */
    UNIFIED_MARKETS_NOT_ENABLED,

    /**
    * Managing this catalog is not supported by your plan.
    */
    UNPERMITTED_ENTITLEMENTS_MARKET_CATALOGS,

    /**
    * The language isn't published to the store.
    */
    UNPUBLISHED_LANGUAGE,

    /**
    * Can't add unsupported country or region.
    */
    UNSUPPORTED_COUNTRY_REGION,

    /**
    * The specified currency is not supported.
    */
    UNSUPPORTED_CURRENCY,

    /**
    * The user doesn't have permission access to create or edit markets.
    */
    USER_LACKS_PERMISSION,

    /**
    * Web presences and condition types are not compatible with each other.
    */
    WEB_PRESENCE_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

    /**
    * The market web presence wasn't found.
    */
    WEB_PRESENCE_NOT_FOUND,

    /**
    * Can't add web presence to the another market.
    */
    WEB_PRESENCE_REACHED_MARKETS_LIMIT,

    /**
    * Matching ALL or NONE isn't supported for this driver type.
    */
    WILDCARD_NOT_SUPPORTED,

    UNKNOWN_VALUE;

    public static MarketUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "B2B_MARKET_MUST_BE_MERCHANT_MANAGED": {
                return B2B_MARKET_MUST_BE_MERCHANT_MANAGED;
            }

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

            case "CATALOGS_WITH_VOLUME_PRICING_OR_QUANTITY_RULES_NOT_SUPPORTED": {
                return CATALOGS_WITH_VOLUME_PRICING_OR_QUANTITY_RULES_NOT_SUPPORTED;
            }

            case "CATALOG_CONDITION_TYPES_MUST_BE_THE_SAME": {
                return CATALOG_CONDITION_TYPES_MUST_BE_THE_SAME;
            }

            case "CATALOG_NOT_COMPATIBLE_WITH_CONDITION_TYPES": {
                return CATALOG_NOT_COMPATIBLE_WITH_CONDITION_TYPES;
            }

            case "CATALOG_TYPE_NOT_SUPPORTED": {
                return CATALOG_TYPE_NOT_SUPPORTED;
            }

            case "CONDITIONS_NOT_FOUND": {
                return CONDITIONS_NOT_FOUND;
            }

            case "CONTAINS_REGIONS_THAT_CANNOT_BE_MANAGED": {
                return CONTAINS_REGIONS_THAT_CANNOT_BE_MANAGED;
            }

            case "CUSTOMIZATIONS_NOT_FOUND": {
                return CUSTOMIZATIONS_NOT_FOUND;
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

            case "DUPLICATE_REGION_MARKET": {
                return DUPLICATE_REGION_MARKET;
            }

            case "DUPLICATE_UNIQUE_MARKET": {
                return DUPLICATE_UNIQUE_MARKET;
            }

            case "EXCEEDS_MAX_MULTI_CONTEXT_MARKETS": {
                return EXCEEDS_MAX_MULTI_CONTEXT_MARKETS;
            }

            case "GENERIC_ERROR": {
                return GENERIC_ERROR;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INCLUSIVE_PRICING_NOT_COMPATIBLE_WITH_CONDITION_TYPES": {
                return INCLUSIVE_PRICING_NOT_COMPATIBLE_WITH_CONDITION_TYPES;
            }

            case "INCOMPATIBLE_CONDITIONS": {
                return INCOMPATIBLE_CONDITIONS;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_STATUS_AND_ENABLED_COMBINATION": {
                return INVALID_STATUS_AND_ENABLED_COMBINATION;
            }

            case "LOCATION_MATCH_ALL_REQUIRES_ONE_SPECIFIC_REGION": {
                return LOCATION_MATCH_ALL_REQUIRES_ONE_SPECIFIC_REGION;
            }

            case "LOCATION_REGION_COUNTRY_MISMATCH": {
                return LOCATION_REGION_COUNTRY_MISMATCH;
            }

            case "MANAGED_MARKET": {
                return MANAGED_MARKET;
            }

            case "MANAGED_MARKETS_CATALOG_NOT_ALLOWED": {
                return MANAGED_MARKETS_CATALOG_NOT_ALLOWED;
            }

            case "MARKET_CANT_HAVE_DIRECT_CONNECTION_CATALOG": {
                return MARKET_CANT_HAVE_DIRECT_CONNECTION_CATALOG;
            }

            case "MARKET_NOT_COMPATIBLE_WITH_CONDITION_TYPES": {
                return MARKET_NOT_COMPATIBLE_WITH_CONDITION_TYPES;
            }

            case "MARKET_NOT_FOUND": {
                return MARKET_NOT_FOUND;
            }

            case "MARKET_REACHED_WEB_PRESENCE_LIMIT": {
                return MARKET_REACHED_WEB_PRESENCE_LIMIT;
            }

            case "MIXED_COUNTRY_LOCATIONS_NOT_ALLOWED": {
                return MIXED_COUNTRY_LOCATIONS_NOT_ALLOWED;
            }

            case "MULTIPLE_CURRENCIES_NOT_SUPPORTED": {
                return MULTIPLE_CURRENCIES_NOT_SUPPORTED;
            }

            case "MUST_HAVE_AT_LEAST_ONE_ACTIVE_REGION_MARKET": {
                return MUST_HAVE_AT_LEAST_ONE_ACTIVE_REGION_MARKET;
            }

            case "NOT_ENTITLED_TO_ACTIVATE_MARKET": {
                return NOT_ENTITLED_TO_ACTIVATE_MARKET;
            }

            case "NO_LANGUAGES": {
                return NO_LANGUAGES;
            }

            case "NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET": {
                return NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET;
            }

            case "NO_ROUNDING_ON_LEGACY_MARKET": {
                return NO_ROUNDING_ON_LEGACY_MARKET;
            }

            case "POS_LOCATION_MARKET_MUST_BE_MERCHANT_MANAGED": {
                return POS_LOCATION_MARKET_MUST_BE_MERCHANT_MANAGED;
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

            case "RETAIL_LOCATION_CURRENCY_MUST_BE_LOCAL": {
                return RETAIL_LOCATION_CURRENCY_MUST_BE_LOCAL;
            }

            case "SHOP_MUST_HAVE_PRIMARY_DOMAIN_WEB_PRESENCE": {
                return SHOP_MUST_HAVE_PRIMARY_DOMAIN_WEB_PRESENCE;
            }

            case "SHOP_REACHED_MARKETS_LIMIT": {
                return SHOP_REACHED_MARKETS_LIMIT;
            }

            case "SPECIFIED_CONDITIONS_CANNOT_BE_EMPTY": {
                return SPECIFIED_CONDITIONS_CANNOT_BE_EMPTY;
            }

            case "SPECIFIED_NOT_VALID_FOR_INPUT": {
                return SPECIFIED_NOT_VALID_FOR_INPUT;
            }

            case "SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE": {
                return SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE;
            }

            case "SUBFOLDER_SUFFIX_MUST_BE_AT_LEAST_2_LETTERS": {
                return SUBFOLDER_SUFFIX_MUST_BE_AT_LEAST_2_LETTERS;
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

            case "UNIFIED_MARKETS_NOT_ENABLED": {
                return UNIFIED_MARKETS_NOT_ENABLED;
            }

            case "UNPERMITTED_ENTITLEMENTS_MARKET_CATALOGS": {
                return UNPERMITTED_ENTITLEMENTS_MARKET_CATALOGS;
            }

            case "UNPUBLISHED_LANGUAGE": {
                return UNPUBLISHED_LANGUAGE;
            }

            case "UNSUPPORTED_COUNTRY_REGION": {
                return UNSUPPORTED_COUNTRY_REGION;
            }

            case "UNSUPPORTED_CURRENCY": {
                return UNSUPPORTED_CURRENCY;
            }

            case "USER_LACKS_PERMISSION": {
                return USER_LACKS_PERMISSION;
            }

            case "WEB_PRESENCE_NOT_COMPATIBLE_WITH_CONDITION_TYPES": {
                return WEB_PRESENCE_NOT_COMPATIBLE_WITH_CONDITION_TYPES;
            }

            case "WEB_PRESENCE_NOT_FOUND": {
                return WEB_PRESENCE_NOT_FOUND;
            }

            case "WEB_PRESENCE_REACHED_MARKETS_LIMIT": {
                return WEB_PRESENCE_REACHED_MARKETS_LIMIT;
            }

            case "WILDCARD_NOT_SUPPORTED": {
                return WILDCARD_NOT_SUPPORTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case B2B_MARKET_MUST_BE_MERCHANT_MANAGED: {
                return "B2B_MARKET_MUST_BE_MERCHANT_MANAGED";
            }

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

            case CATALOGS_WITH_VOLUME_PRICING_OR_QUANTITY_RULES_NOT_SUPPORTED: {
                return "CATALOGS_WITH_VOLUME_PRICING_OR_QUANTITY_RULES_NOT_SUPPORTED";
            }

            case CATALOG_CONDITION_TYPES_MUST_BE_THE_SAME: {
                return "CATALOG_CONDITION_TYPES_MUST_BE_THE_SAME";
            }

            case CATALOG_NOT_COMPATIBLE_WITH_CONDITION_TYPES: {
                return "CATALOG_NOT_COMPATIBLE_WITH_CONDITION_TYPES";
            }

            case CATALOG_TYPE_NOT_SUPPORTED: {
                return "CATALOG_TYPE_NOT_SUPPORTED";
            }

            case CONDITIONS_NOT_FOUND: {
                return "CONDITIONS_NOT_FOUND";
            }

            case CONTAINS_REGIONS_THAT_CANNOT_BE_MANAGED: {
                return "CONTAINS_REGIONS_THAT_CANNOT_BE_MANAGED";
            }

            case CUSTOMIZATIONS_NOT_FOUND: {
                return "CUSTOMIZATIONS_NOT_FOUND";
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

            case DUPLICATE_REGION_MARKET: {
                return "DUPLICATE_REGION_MARKET";
            }

            case DUPLICATE_UNIQUE_MARKET: {
                return "DUPLICATE_UNIQUE_MARKET";
            }

            case EXCEEDS_MAX_MULTI_CONTEXT_MARKETS: {
                return "EXCEEDS_MAX_MULTI_CONTEXT_MARKETS";
            }

            case GENERIC_ERROR: {
                return "GENERIC_ERROR";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INCLUSIVE_PRICING_NOT_COMPATIBLE_WITH_CONDITION_TYPES: {
                return "INCLUSIVE_PRICING_NOT_COMPATIBLE_WITH_CONDITION_TYPES";
            }

            case INCOMPATIBLE_CONDITIONS: {
                return "INCOMPATIBLE_CONDITIONS";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_STATUS_AND_ENABLED_COMBINATION: {
                return "INVALID_STATUS_AND_ENABLED_COMBINATION";
            }

            case LOCATION_MATCH_ALL_REQUIRES_ONE_SPECIFIC_REGION: {
                return "LOCATION_MATCH_ALL_REQUIRES_ONE_SPECIFIC_REGION";
            }

            case LOCATION_REGION_COUNTRY_MISMATCH: {
                return "LOCATION_REGION_COUNTRY_MISMATCH";
            }

            case MANAGED_MARKET: {
                return "MANAGED_MARKET";
            }

            case MANAGED_MARKETS_CATALOG_NOT_ALLOWED: {
                return "MANAGED_MARKETS_CATALOG_NOT_ALLOWED";
            }

            case MARKET_CANT_HAVE_DIRECT_CONNECTION_CATALOG: {
                return "MARKET_CANT_HAVE_DIRECT_CONNECTION_CATALOG";
            }

            case MARKET_NOT_COMPATIBLE_WITH_CONDITION_TYPES: {
                return "MARKET_NOT_COMPATIBLE_WITH_CONDITION_TYPES";
            }

            case MARKET_NOT_FOUND: {
                return "MARKET_NOT_FOUND";
            }

            case MARKET_REACHED_WEB_PRESENCE_LIMIT: {
                return "MARKET_REACHED_WEB_PRESENCE_LIMIT";
            }

            case MIXED_COUNTRY_LOCATIONS_NOT_ALLOWED: {
                return "MIXED_COUNTRY_LOCATIONS_NOT_ALLOWED";
            }

            case MULTIPLE_CURRENCIES_NOT_SUPPORTED: {
                return "MULTIPLE_CURRENCIES_NOT_SUPPORTED";
            }

            case MUST_HAVE_AT_LEAST_ONE_ACTIVE_REGION_MARKET: {
                return "MUST_HAVE_AT_LEAST_ONE_ACTIVE_REGION_MARKET";
            }

            case NOT_ENTITLED_TO_ACTIVATE_MARKET: {
                return "NOT_ENTITLED_TO_ACTIVATE_MARKET";
            }

            case NO_LANGUAGES: {
                return "NO_LANGUAGES";
            }

            case NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET: {
                return "NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET";
            }

            case NO_ROUNDING_ON_LEGACY_MARKET: {
                return "NO_ROUNDING_ON_LEGACY_MARKET";
            }

            case POS_LOCATION_MARKET_MUST_BE_MERCHANT_MANAGED: {
                return "POS_LOCATION_MARKET_MUST_BE_MERCHANT_MANAGED";
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

            case RETAIL_LOCATION_CURRENCY_MUST_BE_LOCAL: {
                return "RETAIL_LOCATION_CURRENCY_MUST_BE_LOCAL";
            }

            case SHOP_MUST_HAVE_PRIMARY_DOMAIN_WEB_PRESENCE: {
                return "SHOP_MUST_HAVE_PRIMARY_DOMAIN_WEB_PRESENCE";
            }

            case SHOP_REACHED_MARKETS_LIMIT: {
                return "SHOP_REACHED_MARKETS_LIMIT";
            }

            case SPECIFIED_CONDITIONS_CANNOT_BE_EMPTY: {
                return "SPECIFIED_CONDITIONS_CANNOT_BE_EMPTY";
            }

            case SPECIFIED_NOT_VALID_FOR_INPUT: {
                return "SPECIFIED_NOT_VALID_FOR_INPUT";
            }

            case SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE: {
                return "SUBFOLDER_SUFFIX_CANNOT_BE_SCRIPT_CODE";
            }

            case SUBFOLDER_SUFFIX_MUST_BE_AT_LEAST_2_LETTERS: {
                return "SUBFOLDER_SUFFIX_MUST_BE_AT_LEAST_2_LETTERS";
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

            case UNIFIED_MARKETS_NOT_ENABLED: {
                return "UNIFIED_MARKETS_NOT_ENABLED";
            }

            case UNPERMITTED_ENTITLEMENTS_MARKET_CATALOGS: {
                return "UNPERMITTED_ENTITLEMENTS_MARKET_CATALOGS";
            }

            case UNPUBLISHED_LANGUAGE: {
                return "UNPUBLISHED_LANGUAGE";
            }

            case UNSUPPORTED_COUNTRY_REGION: {
                return "UNSUPPORTED_COUNTRY_REGION";
            }

            case UNSUPPORTED_CURRENCY: {
                return "UNSUPPORTED_CURRENCY";
            }

            case USER_LACKS_PERMISSION: {
                return "USER_LACKS_PERMISSION";
            }

            case WEB_PRESENCE_NOT_COMPATIBLE_WITH_CONDITION_TYPES: {
                return "WEB_PRESENCE_NOT_COMPATIBLE_WITH_CONDITION_TYPES";
            }

            case WEB_PRESENCE_NOT_FOUND: {
                return "WEB_PRESENCE_NOT_FOUND";
            }

            case WEB_PRESENCE_REACHED_MARKETS_LIMIT: {
                return "WEB_PRESENCE_REACHED_MARKETS_LIMIT";
            }

            case WILDCARD_NOT_SUPPORTED: {
                return "WILDCARD_NOT_SUPPORTED";
            }

            default: {
                return "";
            }
        }
    }
}


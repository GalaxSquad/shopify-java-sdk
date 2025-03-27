// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* The role of the theme.
*/
public enum ThemeRole {
    /**
    * The theme is archived if a merchant changes their plan and exceeds the maximum number of themes
    * allowed. Archived themes can be downloaded by merchant, but can not be customized or published until
    * the plan is upgraded.
    */
    ARCHIVED,

    /**
    * The theme is installed as a trial from the Shopify Theme Store. It can be customized using the theme
    * editor, but access to the code editor and the ability to publish the theme are restricted until it
    * is purchased.
    */
    DEMO,

    /**
    * The theme is automatically created by the CLI for previewing purposes when in a development session.
    */
    DEVELOPMENT,

    /**
    * The theme is locked if it is identified as unlicensed. Customization and publishing are restricted
    * until the merchant resolves the licensing issue.
    */
    LOCKED,

    /**
    * The currently published theme. There can only be one main theme at any time.
    */
    MAIN,

    /**
    * The theme is currently not published. It can be transitioned to the main role if it is published by
    * the merchant.
    */
    UNPUBLISHED,

    UNKNOWN_VALUE;

    public static ThemeRole fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ARCHIVED": {
                return ARCHIVED;
            }

            case "DEMO": {
                return DEMO;
            }

            case "DEVELOPMENT": {
                return DEVELOPMENT;
            }

            case "LOCKED": {
                return LOCKED;
            }

            case "MAIN": {
                return MAIN;
            }

            case "UNPUBLISHED": {
                return UNPUBLISHED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ARCHIVED: {
                return "ARCHIVED";
            }

            case DEMO: {
                return "DEMO";
            }

            case DEVELOPMENT: {
                return "DEVELOPMENT";
            }

            case LOCKED: {
                return "LOCKED";
            }

            case MAIN: {
                return "MAIN";
            }

            case UNPUBLISHED: {
                return "UNPUBLISHED";
            }

            default: {
                return "";
            }
        }
    }
}


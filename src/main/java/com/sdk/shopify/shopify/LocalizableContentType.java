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
* Specifies the type of the underlying localizable content. This can be used to conditionally render
* different UI elements such as input fields.
*/
public enum LocalizableContentType {
    /**
    * A file reference.
    */
    FILE_REFERENCE,

    /**
    * An HTML.
    */
    HTML,

    /**
    * An inline rich text.
    */
    INLINE_RICH_TEXT,

    /**
    * A JSON.
    */
    JSON,

    /**
    * A JSON string.
    */
    JSON_STRING,

    /**
    * A link.
    */
    LINK,

    /**
    * A list of file references.
    */
    LIST_FILE_REFERENCE,

    /**
    * A list of links.
    */
    LIST_LINK,

    /**
    * A list of multi-line texts.
    */
    LIST_MULTI_LINE_TEXT_FIELD,

    /**
    * A list of single-line texts.
    */
    LIST_SINGLE_LINE_TEXT_FIELD,

    /**
    * A list of URLs.
    */
    LIST_URL,

    /**
    * A multi-line text.
    */
    MULTI_LINE_TEXT_FIELD,

    /**
    * A rich text.
    */
    RICH_TEXT_FIELD,

    /**
    * A single-line text.
    */
    SINGLE_LINE_TEXT_FIELD,

    /**
    * A string.
    */
    STRING,

    /**
    * A URI.
    */
    URI,

    /**
    * A URL.
    */
    URL,

    UNKNOWN_VALUE;

    public static LocalizableContentType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FILE_REFERENCE": {
                return FILE_REFERENCE;
            }

            case "HTML": {
                return HTML;
            }

            case "INLINE_RICH_TEXT": {
                return INLINE_RICH_TEXT;
            }

            case "JSON": {
                return JSON;
            }

            case "JSON_STRING": {
                return JSON_STRING;
            }

            case "LINK": {
                return LINK;
            }

            case "LIST_FILE_REFERENCE": {
                return LIST_FILE_REFERENCE;
            }

            case "LIST_LINK": {
                return LIST_LINK;
            }

            case "LIST_MULTI_LINE_TEXT_FIELD": {
                return LIST_MULTI_LINE_TEXT_FIELD;
            }

            case "LIST_SINGLE_LINE_TEXT_FIELD": {
                return LIST_SINGLE_LINE_TEXT_FIELD;
            }

            case "LIST_URL": {
                return LIST_URL;
            }

            case "MULTI_LINE_TEXT_FIELD": {
                return MULTI_LINE_TEXT_FIELD;
            }

            case "RICH_TEXT_FIELD": {
                return RICH_TEXT_FIELD;
            }

            case "SINGLE_LINE_TEXT_FIELD": {
                return SINGLE_LINE_TEXT_FIELD;
            }

            case "STRING": {
                return STRING;
            }

            case "URI": {
                return URI;
            }

            case "URL": {
                return URL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FILE_REFERENCE: {
                return "FILE_REFERENCE";
            }

            case HTML: {
                return "HTML";
            }

            case INLINE_RICH_TEXT: {
                return "INLINE_RICH_TEXT";
            }

            case JSON: {
                return "JSON";
            }

            case JSON_STRING: {
                return "JSON_STRING";
            }

            case LINK: {
                return "LINK";
            }

            case LIST_FILE_REFERENCE: {
                return "LIST_FILE_REFERENCE";
            }

            case LIST_LINK: {
                return "LIST_LINK";
            }

            case LIST_MULTI_LINE_TEXT_FIELD: {
                return "LIST_MULTI_LINE_TEXT_FIELD";
            }

            case LIST_SINGLE_LINE_TEXT_FIELD: {
                return "LIST_SINGLE_LINE_TEXT_FIELD";
            }

            case LIST_URL: {
                return "LIST_URL";
            }

            case MULTI_LINE_TEXT_FIELD: {
                return "MULTI_LINE_TEXT_FIELD";
            }

            case RICH_TEXT_FIELD: {
                return "RICH_TEXT_FIELD";
            }

            case SINGLE_LINE_TEXT_FIELD: {
                return "SINGLE_LINE_TEXT_FIELD";
            }

            case STRING: {
                return "STRING";
            }

            case URI: {
                return "URI";
            }

            case URL: {
                return "URL";
            }

            default: {
                return "";
            }
        }
    }
}


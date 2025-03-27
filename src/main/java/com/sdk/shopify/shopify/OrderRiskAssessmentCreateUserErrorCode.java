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
* Possible error codes that can be returned by `OrderRiskAssessmentCreateUserError`.
*/
public enum OrderRiskAssessmentCreateUserErrorCode {
    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * The order is marked as fulfilled and can no longer accept new risk assessments.
    */
    ORDER_ALREADY_FULFILLED,

    /**
    * Too many facts were provided for the risk assessment.
    */
    TOO_MANY_FACTS,

    UNKNOWN_VALUE;

    public static OrderRiskAssessmentCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INVALID": {
                return INVALID;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "ORDER_ALREADY_FULFILLED": {
                return ORDER_ALREADY_FULFILLED;
            }

            case "TOO_MANY_FACTS": {
                return TOO_MANY_FACTS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INVALID: {
                return "INVALID";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case ORDER_ALREADY_FULFILLED: {
                return "ORDER_ALREADY_FULFILLED";
            }

            case TOO_MANY_FACTS: {
                return "TOO_MANY_FACTS";
            }

            default: {
                return "";
            }
        }
    }
}


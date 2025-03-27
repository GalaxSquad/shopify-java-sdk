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
* The types of the hard blockers preventing a customer from being merged to another customer.
*/
public enum CustomerMergeErrorFieldType {
    /**
    * The customer is a company contact.
    */
    COMPANY_CONTACT,

    /**
    * The customer has payment methods.
    */
    CUSTOMER_PAYMENT_METHODS,

    /**
    * The customer does not exist.
    */
    DELETED_AT,

    /**
    * The customer has gift cards.
    */
    GIFT_CARDS,

    /**
    * The customer has a merge in progress.
    */
    MERGE_IN_PROGRESS,

    /**
    * The customer has a multipass identifier.
    */
    MULTIPASS_IDENTIFIER,

    /**
    * The customer has a pending data request.
    */
    PENDING_DATA_REQUEST,

    /**
    * The customer has a pending or completed redaction.
    */
    REDACTED_AT,

    /**
    * The customer has store credit.
    */
    STORE_CREDIT,

    /**
    * The customer has a subscription history.
    */
    SUBSCRIPTIONS,

    UNKNOWN_VALUE;

    public static CustomerMergeErrorFieldType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COMPANY_CONTACT": {
                return COMPANY_CONTACT;
            }

            case "CUSTOMER_PAYMENT_METHODS": {
                return CUSTOMER_PAYMENT_METHODS;
            }

            case "DELETED_AT": {
                return DELETED_AT;
            }

            case "GIFT_CARDS": {
                return GIFT_CARDS;
            }

            case "MERGE_IN_PROGRESS": {
                return MERGE_IN_PROGRESS;
            }

            case "MULTIPASS_IDENTIFIER": {
                return MULTIPASS_IDENTIFIER;
            }

            case "PENDING_DATA_REQUEST": {
                return PENDING_DATA_REQUEST;
            }

            case "REDACTED_AT": {
                return REDACTED_AT;
            }

            case "STORE_CREDIT": {
                return STORE_CREDIT;
            }

            case "SUBSCRIPTIONS": {
                return SUBSCRIPTIONS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COMPANY_CONTACT: {
                return "COMPANY_CONTACT";
            }

            case CUSTOMER_PAYMENT_METHODS: {
                return "CUSTOMER_PAYMENT_METHODS";
            }

            case DELETED_AT: {
                return "DELETED_AT";
            }

            case GIFT_CARDS: {
                return "GIFT_CARDS";
            }

            case MERGE_IN_PROGRESS: {
                return "MERGE_IN_PROGRESS";
            }

            case MULTIPASS_IDENTIFIER: {
                return "MULTIPASS_IDENTIFIER";
            }

            case PENDING_DATA_REQUEST: {
                return "PENDING_DATA_REQUEST";
            }

            case REDACTED_AT: {
                return "REDACTED_AT";
            }

            case STORE_CREDIT: {
                return "STORE_CREDIT";
            }

            case SUBSCRIPTIONS: {
                return "SUBSCRIPTIONS";
            }

            default: {
                return "";
            }
        }
    }
}


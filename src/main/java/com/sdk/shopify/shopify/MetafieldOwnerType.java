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
* Possible types of a metafield's owner resource.
*/
public enum MetafieldOwnerType {
    /**
    * The Api Permission metafield owner type.
    */
    API_PERMISSION,

    /**
    * The Article metafield owner type.
    */
    ARTICLE,

    /**
    * The Blog metafield owner type.
    */
    BLOG,

    /**
    * The Cart Transform metafield owner type.
    */
    CARTTRANSFORM,

    /**
    * The Collection metafield owner type.
    */
    COLLECTION,

    /**
    * The Company metafield owner type.
    */
    COMPANY,

    /**
    * The Company Location metafield owner type.
    */
    COMPANY_LOCATION,

    /**
    * The Customer metafield owner type.
    */
    CUSTOMER,

    /**
    * The Delivery Customization metafield owner type.
    */
    DELIVERY_CUSTOMIZATION,

    /**
    * The Discount metafield owner type.
    */
    DISCOUNT,

    /**
    * The draft order metafield owner type.
    */
    DRAFTORDER,

    /**
    * The Fulfillment Constraint Rule metafield owner type.
    */
    FULFILLMENT_CONSTRAINT_RULE,

    /**
    * The GiftCardTransaction metafield owner type.
    */
    GIFT_CARD_TRANSACTION,

    /**
    * The Location metafield owner type.
    */
    LOCATION,

    /**
    * The Market metafield owner type.
    */
    MARKET,

    /**
    * The Order metafield owner type.
    */
    ORDER,

    /**
    * The Order Routing Location Rule metafield owner type.
    */
    ORDER_ROUTING_LOCATION_RULE,

    /**
    * The Page metafield owner type.
    */
    PAGE,

    /**
    * The Payment Customization metafield owner type.
    */
    PAYMENT_CUSTOMIZATION,

    /**
    * The Product metafield owner type.
    */
    PRODUCT,

    /**
    * The Product Variant metafield owner type.
    */
    PRODUCTVARIANT,

    /**
    * The Selling Plan metafield owner type.
    */
    SELLING_PLAN,

    /**
    * The Shop metafield owner type.
    */
    SHOP,

    /**
    * The Validation metafield owner type.
    */
    VALIDATION,

    UNKNOWN_VALUE;

    public static MetafieldOwnerType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "API_PERMISSION": {
                return API_PERMISSION;
            }

            case "ARTICLE": {
                return ARTICLE;
            }

            case "BLOG": {
                return BLOG;
            }

            case "CARTTRANSFORM": {
                return CARTTRANSFORM;
            }

            case "COLLECTION": {
                return COLLECTION;
            }

            case "COMPANY": {
                return COMPANY;
            }

            case "COMPANY_LOCATION": {
                return COMPANY_LOCATION;
            }

            case "CUSTOMER": {
                return CUSTOMER;
            }

            case "DELIVERY_CUSTOMIZATION": {
                return DELIVERY_CUSTOMIZATION;
            }

            case "DISCOUNT": {
                return DISCOUNT;
            }

            case "DRAFTORDER": {
                return DRAFTORDER;
            }

            case "FULFILLMENT_CONSTRAINT_RULE": {
                return FULFILLMENT_CONSTRAINT_RULE;
            }

            case "GIFT_CARD_TRANSACTION": {
                return GIFT_CARD_TRANSACTION;
            }

            case "LOCATION": {
                return LOCATION;
            }

            case "MARKET": {
                return MARKET;
            }

            case "ORDER": {
                return ORDER;
            }

            case "ORDER_ROUTING_LOCATION_RULE": {
                return ORDER_ROUTING_LOCATION_RULE;
            }

            case "PAGE": {
                return PAGE;
            }

            case "PAYMENT_CUSTOMIZATION": {
                return PAYMENT_CUSTOMIZATION;
            }

            case "PRODUCT": {
                return PRODUCT;
            }

            case "PRODUCTVARIANT": {
                return PRODUCTVARIANT;
            }

            case "SELLING_PLAN": {
                return SELLING_PLAN;
            }

            case "SHOP": {
                return SHOP;
            }

            case "VALIDATION": {
                return VALIDATION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case API_PERMISSION: {
                return "API_PERMISSION";
            }

            case ARTICLE: {
                return "ARTICLE";
            }

            case BLOG: {
                return "BLOG";
            }

            case CARTTRANSFORM: {
                return "CARTTRANSFORM";
            }

            case COLLECTION: {
                return "COLLECTION";
            }

            case COMPANY: {
                return "COMPANY";
            }

            case COMPANY_LOCATION: {
                return "COMPANY_LOCATION";
            }

            case CUSTOMER: {
                return "CUSTOMER";
            }

            case DELIVERY_CUSTOMIZATION: {
                return "DELIVERY_CUSTOMIZATION";
            }

            case DISCOUNT: {
                return "DISCOUNT";
            }

            case DRAFTORDER: {
                return "DRAFTORDER";
            }

            case FULFILLMENT_CONSTRAINT_RULE: {
                return "FULFILLMENT_CONSTRAINT_RULE";
            }

            case GIFT_CARD_TRANSACTION: {
                return "GIFT_CARD_TRANSACTION";
            }

            case LOCATION: {
                return "LOCATION";
            }

            case MARKET: {
                return "MARKET";
            }

            case ORDER: {
                return "ORDER";
            }

            case ORDER_ROUTING_LOCATION_RULE: {
                return "ORDER_ROUTING_LOCATION_RULE";
            }

            case PAGE: {
                return "PAGE";
            }

            case PAYMENT_CUSTOMIZATION: {
                return "PAYMENT_CUSTOMIZATION";
            }

            case PRODUCT: {
                return "PRODUCT";
            }

            case PRODUCTVARIANT: {
                return "PRODUCTVARIANT";
            }

            case SELLING_PLAN: {
                return "SELLING_PLAN";
            }

            case SHOP: {
                return "SHOP";
            }

            case VALIDATION: {
                return "VALIDATION";
            }

            default: {
                return "";
            }
        }
    }
}


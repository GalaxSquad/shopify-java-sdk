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
* Additional information included on a delivery method that will help during the delivery process.
*/
public class DeliveryMethodAdditionalInformationQuery extends Query<DeliveryMethodAdditionalInformationQuery> {
    DeliveryMethodAdditionalInformationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The delivery instructions to follow when performing the delivery.
    */
    public DeliveryMethodAdditionalInformationQuery instructions() {
        startField("instructions");

        return this;
    }

    /**
    * The phone number to contact when performing the delivery.
    */
    public DeliveryMethodAdditionalInformationQuery phone() {
        startField("phone");

        return this;
    }
}

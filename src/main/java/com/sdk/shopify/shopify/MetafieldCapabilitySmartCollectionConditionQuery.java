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
* Information about the smart collection condition capability on a metafield definition.
*/
public class MetafieldCapabilitySmartCollectionConditionQuery extends Query<MetafieldCapabilitySmartCollectionConditionQuery> {
    MetafieldCapabilitySmartCollectionConditionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Indicates if the definition is eligible to have the capability.
    */
    public MetafieldCapabilitySmartCollectionConditionQuery eligible() {
        startField("eligible");

        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */
    public MetafieldCapabilitySmartCollectionConditionQuery enabled() {
        startField("enabled");

        return this;
    }
}

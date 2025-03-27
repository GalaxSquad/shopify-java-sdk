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
* The delivery method and artifacts associated with a reverse delivery.
*/
public class ReverseDeliveryDeliverableQuery extends Query<ReverseDeliveryDeliverableQuery> {
    ReverseDeliveryDeliverableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public ReverseDeliveryDeliverableQuery onReverseDeliveryShippingDeliverable(ReverseDeliveryShippingDeliverableQueryDefinition queryDef) {
        startInlineFragment("ReverseDeliveryShippingDeliverable");
        queryDef.define(new ReverseDeliveryShippingDeliverableQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

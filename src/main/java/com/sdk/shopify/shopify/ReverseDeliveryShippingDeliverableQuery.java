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
* A reverse shipping deliverable that may include a label and tracking information.
*/
public class ReverseDeliveryShippingDeliverableQuery extends Query<ReverseDeliveryShippingDeliverableQuery> {
    ReverseDeliveryShippingDeliverableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The return label attached to the reverse delivery.
    */
    public ReverseDeliveryShippingDeliverableQuery label(ReverseDeliveryLabelV2QueryDefinition queryDef) {
        startField("label");

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryLabelV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The information to track the reverse delivery.
    */
    public ReverseDeliveryShippingDeliverableQuery tracking(ReverseDeliveryTrackingV2QueryDefinition queryDef) {
        startField("tracking");

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryTrackingV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

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
* Custom subscription discount.
*/
public class SubscriptionManualDiscountQuery extends Query<SubscriptionManualDiscountQuery> {
    SubscriptionManualDiscountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Entitled line items used to apply the subscription discount on.
    */
    public SubscriptionManualDiscountQuery entitledLines(SubscriptionDiscountEntitledLinesQueryDefinition queryDef) {
        startField("entitledLines");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountEntitledLinesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique ID.
    */
    public SubscriptionManualDiscountQuery id() {
        startField("id");

        return this;
    }

    /**
    * The maximum number of times the subscription discount will be applied on orders.
    */
    public SubscriptionManualDiscountQuery recurringCycleLimit() {
        startField("recurringCycleLimit");

        return this;
    }

    /**
    * The reason that the discount on the subscription draft is rejected.
    */
    public SubscriptionManualDiscountQuery rejectionReason() {
        startField("rejectionReason");

        return this;
    }

    /**
    * Type of line the discount applies on.
    */
    public SubscriptionManualDiscountQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The title associated with the subscription discount.
    */
    public SubscriptionManualDiscountQuery title() {
        startField("title");

        return this;
    }

    /**
    * The type of the subscription discount.
    */
    public SubscriptionManualDiscountQuery type() {
        startField("type");

        return this;
    }

    /**
    * The number of times the discount was applied.
    */
    public SubscriptionManualDiscountQuery usageCount() {
        startField("usageCount");

        return this;
    }

    /**
    * The value of the subscription discount.
    */
    public SubscriptionManualDiscountQuery value(SubscriptionDiscountValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

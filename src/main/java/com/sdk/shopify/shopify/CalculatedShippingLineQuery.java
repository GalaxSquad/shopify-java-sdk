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
* A shipping line item involved in order editing that may be newly added or have new changes applied.
*/
public class CalculatedShippingLineQuery extends Query<CalculatedShippingLineQuery> {
    CalculatedShippingLineQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedShippingLineQuery id() {
        startField("id");

        return this;
    }

    /**
    * The price of the shipping line when sold and before applying discounts. This field includes taxes if
    * `Order.taxesIncluded` is true. Otherwise, this field doesn't include taxes for the shipping line.
    */
    public CalculatedShippingLineQuery price(MoneyBagQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The staged status of the shipping line.
    */
    public CalculatedShippingLineQuery stagedStatus() {
        startField("stagedStatus");

        return this;
    }

    /**
    * The title of the shipping line.
    */
    public CalculatedShippingLineQuery title() {
        startField("title");

        return this;
    }
}

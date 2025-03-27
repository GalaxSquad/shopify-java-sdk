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
* A calculated return.
*/
public class CalculatedReturnQuery extends Query<CalculatedReturnQuery> {
    CalculatedReturnQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of calculated exchange line items.
    */
    public CalculatedReturnQuery exchangeLineItems(CalculatedExchangeLineItemQueryDefinition queryDef) {
        startField("exchangeLineItems");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedExchangeLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedReturnQuery id() {
        startField("id");

        return this;
    }

    /**
    * A list of calculated return line items.
    */
    public CalculatedReturnQuery returnLineItems(CalculatedReturnLineItemQueryDefinition queryDef) {
        startField("returnLineItems");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedReturnLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The calulated return shipping fee.
    */
    public CalculatedReturnQuery returnShippingFee(CalculatedReturnShippingFeeQueryDefinition queryDef) {
        startField("returnShippingFee");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedReturnShippingFeeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

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
* A calculated return fee.
*/
public class CalculatedReturnFeeQuery extends Query<CalculatedReturnFeeQuery> {
    CalculatedReturnFeeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The calculated amount of the return fee, in shop and presentment currencies.
    */
    public CalculatedReturnFeeQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedReturnFeeQuery id() {
        startField("id");

        return this;
    }

    public CalculatedReturnFeeQuery onCalculatedRestockingFee(CalculatedRestockingFeeQueryDefinition queryDef) {
        startInlineFragment("CalculatedRestockingFee");
        queryDef.define(new CalculatedRestockingFeeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CalculatedReturnFeeQuery onCalculatedReturnShippingFee(CalculatedReturnShippingFeeQueryDefinition queryDef) {
        startInlineFragment("CalculatedReturnShippingFee");
        queryDef.define(new CalculatedReturnShippingFeeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

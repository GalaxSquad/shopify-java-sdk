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
* An amount discounting the line that has been allocated by an associated discount application.
*/
public class CalculatedDiscountAllocationQuery extends Query<CalculatedDiscountAllocationQuery> {
    CalculatedDiscountAllocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The money amount that's allocated by the discount application in shop and presentment currencies.
    */
    public CalculatedDiscountAllocationQuery allocatedAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("allocatedAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The discount that the allocated amount originated from.
    */
    public CalculatedDiscountAllocationQuery discountApplication(CalculatedDiscountApplicationQueryDefinition queryDef) {
        startField("discountApplication");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedDiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

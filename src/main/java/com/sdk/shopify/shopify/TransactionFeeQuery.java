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
* Transaction fee related to an order transaction.
*/
public class TransactionFeeQuery extends Query<TransactionFeeQuery> {
    TransactionFeeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Amount of the fee.
    */
    public TransactionFeeQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Flat rate charge for a transaction.
    */
    public TransactionFeeQuery flatFee(MoneyV2QueryDefinition queryDef) {
        startField("flatFee");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Name of the credit card flat fee.
    */
    public TransactionFeeQuery flatFeeName() {
        startField("flatFeeName");

        return this;
    }

    /**
    * Percentage charge.
    */
    public TransactionFeeQuery rate() {
        startField("rate");

        return this;
    }

    /**
    * Name of the credit card rate.
    */
    public TransactionFeeQuery rateName() {
        startField("rateName");

        return this;
    }

    /**
    * Tax amount charged on the fee.
    */
    public TransactionFeeQuery taxAmount(MoneyV2QueryDefinition queryDef) {
        startField("taxAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Name of the type of fee.
    */
    public TransactionFeeQuery type() {
        startField("type");

        return this;
    }
}

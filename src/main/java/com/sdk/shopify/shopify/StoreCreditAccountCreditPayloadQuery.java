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
* Return type for `storeCreditAccountCredit` mutation.
*/
public class StoreCreditAccountCreditPayloadQuery extends Query<StoreCreditAccountCreditPayloadQuery> {
    StoreCreditAccountCreditPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The store credit account transaction that was created.
    */
    public StoreCreditAccountCreditPayloadQuery storeCreditAccountTransaction(StoreCreditAccountCreditTransactionQueryDefinition queryDef) {
        startField("storeCreditAccountTransaction");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountCreditTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public StoreCreditAccountCreditPayloadQuery userErrors(StoreCreditAccountCreditUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountCreditUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

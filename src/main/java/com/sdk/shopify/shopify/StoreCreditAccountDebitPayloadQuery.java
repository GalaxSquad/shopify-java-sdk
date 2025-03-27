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
* Return type for `storeCreditAccountDebit` mutation.
*/
public class StoreCreditAccountDebitPayloadQuery extends Query<StoreCreditAccountDebitPayloadQuery> {
    StoreCreditAccountDebitPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The store credit account transaction that was created.
    */
    public StoreCreditAccountDebitPayloadQuery storeCreditAccountTransaction(StoreCreditAccountDebitTransactionQueryDefinition queryDef) {
        startField("storeCreditAccountTransaction");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountDebitTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public StoreCreditAccountDebitPayloadQuery userErrors(StoreCreditAccountDebitUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountDebitUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

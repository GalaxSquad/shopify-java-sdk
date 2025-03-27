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
* Return type for `flowGenerateSignature` mutation.
*/
public class FlowGenerateSignaturePayloadQuery extends Query<FlowGenerateSignaturePayloadQuery> {
    FlowGenerateSignaturePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The payload used to generate the signature.
    */
    public FlowGenerateSignaturePayloadQuery payload() {
        startField("payload");

        return this;
    }

    /**
    * The generated signature.
    */
    public FlowGenerateSignaturePayloadQuery signature() {
        startField("signature");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FlowGenerateSignaturePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

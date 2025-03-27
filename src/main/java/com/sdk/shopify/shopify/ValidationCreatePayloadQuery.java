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
* Return type for `validationCreate` mutation.
*/
public class ValidationCreatePayloadQuery extends Query<ValidationCreatePayloadQuery> {
    ValidationCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ValidationCreatePayloadQuery userErrors(ValidationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ValidationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The created validation.
    */
    public ValidationCreatePayloadQuery validation(ValidationQueryDefinition queryDef) {
        startField("validation");

        _queryBuilder.append('{');
        queryDef.define(new ValidationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

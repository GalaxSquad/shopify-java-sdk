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
* Return type for `metafieldDefinitionUpdate` mutation.
*/
public class MetafieldDefinitionUpdatePayloadQuery extends Query<MetafieldDefinitionUpdatePayloadQuery> {
    MetafieldDefinitionUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The metafield definition that was updated.
    */
    public MetafieldDefinitionUpdatePayloadQuery updatedDefinition(MetafieldDefinitionQueryDefinition queryDef) {
        startField("updatedDefinition");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetafieldDefinitionUpdatePayloadQuery userErrors(MetafieldDefinitionUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The asynchronous job updating the metafield definition's validation_status.
    */
    public MetafieldDefinitionUpdatePayloadQuery validationJob(JobQueryDefinition queryDef) {
        startField("validationJob");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

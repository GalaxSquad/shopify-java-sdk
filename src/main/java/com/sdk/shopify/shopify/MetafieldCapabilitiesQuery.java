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
* Provides the capabilities of a metafield definition.
*/
public class MetafieldCapabilitiesQuery extends Query<MetafieldCapabilitiesQuery> {
    MetafieldCapabilitiesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Indicate whether a metafield definition is configured for filtering.
    */
    public MetafieldCapabilitiesQuery adminFilterable(MetafieldCapabilityAdminFilterableQueryDefinition queryDef) {
        startField("adminFilterable");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldCapabilityAdminFilterableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Indicate whether a metafield definition can be used as a smart collection condition.
    */
    public MetafieldCapabilitiesQuery smartCollectionCondition(MetafieldCapabilitySmartCollectionConditionQueryDefinition queryDef) {
        startField("smartCollectionCondition");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldCapabilitySmartCollectionConditionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Indicate whether the metafield values for a metafield definition are required to be unique.
    */
    public MetafieldCapabilitiesQuery uniqueValues(MetafieldCapabilityUniqueValuesQueryDefinition queryDef) {
        startField("uniqueValues");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldCapabilityUniqueValuesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

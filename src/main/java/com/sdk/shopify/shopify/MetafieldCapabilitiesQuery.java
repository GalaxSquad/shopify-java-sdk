// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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

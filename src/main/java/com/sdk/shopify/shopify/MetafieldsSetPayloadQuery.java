// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metafieldsSet` mutation.
*/
public class MetafieldsSetPayloadQuery extends Query<MetafieldsSetPayloadQuery> {
    MetafieldsSetPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of metafields that were set.
    */
    public MetafieldsSetPayloadQuery metafields(MetafieldQueryDefinition queryDef) {
        startField("metafields");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetafieldsSetPayloadQuery userErrors(MetafieldsSetUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldsSetUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

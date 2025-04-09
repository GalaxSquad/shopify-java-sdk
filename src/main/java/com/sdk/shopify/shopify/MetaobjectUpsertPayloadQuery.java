// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metaobjectUpsert` mutation.
*/
public class MetaobjectUpsertPayloadQuery extends Query<MetaobjectUpsertPayloadQuery> {
    MetaobjectUpsertPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created or updated metaobject.
    */
    public MetaobjectUpsertPayloadQuery metaobject(MetaobjectQueryDefinition queryDef) {
        startField("metaobject");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetaobjectUpsertPayloadQuery userErrors(MetaobjectUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

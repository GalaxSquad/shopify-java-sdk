// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metaobjectCreate` mutation.
*/
public class MetaobjectCreatePayloadQuery extends Query<MetaobjectCreatePayloadQuery> {
    MetaobjectCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created metaobject.
    */
    public MetaobjectCreatePayloadQuery metaobject(MetaobjectQueryDefinition queryDef) {
        startField("metaobject");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetaobjectCreatePayloadQuery userErrors(MetaobjectUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

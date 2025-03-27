// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metaobjectDelete` mutation.
*/
public class MetaobjectDeletePayloadQuery extends Query<MetaobjectDeletePayloadQuery> {
    MetaobjectDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted metaobject.
    */
    public MetaobjectDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetaobjectDeletePayloadQuery userErrors(MetaobjectUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

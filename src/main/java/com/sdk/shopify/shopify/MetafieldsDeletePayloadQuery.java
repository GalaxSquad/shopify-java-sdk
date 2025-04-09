// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metafieldsDelete` mutation.
*/
public class MetafieldsDeletePayloadQuery extends Query<MetafieldsDeletePayloadQuery> {
    MetafieldsDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * List of metafield identifiers that were deleted, null if the corresponding metafield isn't found.
    */
    public MetafieldsDeletePayloadQuery deletedMetafields(MetafieldIdentifierQueryDefinition queryDef) {
        startField("deletedMetafields");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldIdentifierQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetafieldsDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

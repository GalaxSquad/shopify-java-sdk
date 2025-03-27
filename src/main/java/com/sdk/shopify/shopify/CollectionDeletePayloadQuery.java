// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `collectionDelete` mutation.
*/
public class CollectionDeletePayloadQuery extends Query<CollectionDeletePayloadQuery> {
    CollectionDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the collection that was deleted. Returns `null` if the collection doesn't exist.
    */
    public CollectionDeletePayloadQuery deletedCollectionId() {
        startField("deletedCollectionId");

        return this;
    }

    /**
    * The shop associated with the collection.
    */
    public CollectionDeletePayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CollectionDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

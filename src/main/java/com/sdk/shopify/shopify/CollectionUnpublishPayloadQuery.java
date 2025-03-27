// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `collectionUnpublish` mutation.
*/
public class CollectionUnpublishPayloadQuery extends Query<CollectionUnpublishPayloadQuery> {
    CollectionUnpublishPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The collection that has been unpublished.
    */
    public CollectionUnpublishPayloadQuery collection(CollectionQueryDefinition queryDef) {
        startField("collection");

        _queryBuilder.append('{');
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop associated with the collection.
    */
    public CollectionUnpublishPayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CollectionUnpublishPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

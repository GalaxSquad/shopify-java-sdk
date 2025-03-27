// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `collectionPublish` mutation.
*/
public class CollectionPublishPayloadQuery extends Query<CollectionPublishPayloadQuery> {
    CollectionPublishPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The published collection.
    */
    public CollectionPublishPayloadQuery collection(CollectionQueryDefinition queryDef) {
        startField("collection");

        _queryBuilder.append('{');
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The channels where the collection has been published.
    */
    public CollectionPublishPayloadQuery collectionPublications(CollectionPublicationQueryDefinition queryDef) {
        startField("collectionPublications");

        _queryBuilder.append('{');
        queryDef.define(new CollectionPublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop associated with the collection.
    */
    public CollectionPublishPayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CollectionPublishPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `collectionCreate` mutation.
*/
public class CollectionCreatePayloadQuery extends Query<CollectionCreatePayloadQuery> {
    CollectionCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The collection that has been created.
    */
    public CollectionCreatePayloadQuery collection(CollectionQueryDefinition queryDef) {
        startField("collection");

        _queryBuilder.append('{');
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CollectionCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

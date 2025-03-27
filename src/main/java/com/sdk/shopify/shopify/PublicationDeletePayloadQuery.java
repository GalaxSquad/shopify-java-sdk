// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `publicationDelete` mutation.
*/
public class PublicationDeletePayloadQuery extends Query<PublicationDeletePayloadQuery> {
    PublicationDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the publication that was deleted.
    */
    public PublicationDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PublicationDeletePayloadQuery userErrors(PublicationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PublicationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

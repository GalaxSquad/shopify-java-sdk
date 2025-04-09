// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `publicationUpdate` mutation.
*/
public class PublicationUpdatePayloadQuery extends Query<PublicationUpdatePayloadQuery> {
    PublicationUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The publication that's been updated.
    */
    public PublicationUpdatePayloadQuery publication(PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PublicationUpdatePayloadQuery userErrors(PublicationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PublicationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

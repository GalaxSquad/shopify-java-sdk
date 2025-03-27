// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `abandonmentEmailStateUpdate` mutation.
*/
public class AbandonmentEmailStateUpdatePayloadQuery extends Query<AbandonmentEmailStateUpdatePayloadQuery> {
    AbandonmentEmailStateUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated abandonment.
    */
    public AbandonmentEmailStateUpdatePayloadQuery abandonment(AbandonmentQueryDefinition queryDef) {
        startField("abandonment");

        _queryBuilder.append('{');
        queryDef.define(new AbandonmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public AbandonmentEmailStateUpdatePayloadQuery userErrors(AbandonmentEmailStateUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new AbandonmentEmailStateUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

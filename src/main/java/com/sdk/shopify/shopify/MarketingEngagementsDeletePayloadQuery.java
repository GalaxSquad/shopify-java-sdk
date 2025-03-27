// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketingEngagementsDelete` mutation.
*/
public class MarketingEngagementsDeletePayloadQuery extends Query<MarketingEngagementsDeletePayloadQuery> {
    MarketingEngagementsDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Informational message about the engagement data that has been marked for deletion.
    */
    public MarketingEngagementsDeletePayloadQuery result() {
        startField("result");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketingEngagementsDeletePayloadQuery userErrors(MarketingActivityUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

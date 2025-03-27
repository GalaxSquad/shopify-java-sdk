// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The app plan that the merchant is subscribed to.
*/
public class AppPlanV2Query extends Query<AppPlanV2Query> {
    AppPlanV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The plan billed to a shop on a recurring basis.
    */
    public AppPlanV2Query pricingDetails(AppPricingDetailsQueryDefinition queryDef) {
        startField("pricingDetails");

        _queryBuilder.append('{');
        queryDef.define(new AppPricingDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

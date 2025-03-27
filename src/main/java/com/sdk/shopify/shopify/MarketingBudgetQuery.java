// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* This type combines budget amount and its marketing budget type.
*/
public class MarketingBudgetQuery extends Query<MarketingBudgetQuery> {
    MarketingBudgetQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The budget type for a marketing activity.
    */
    public MarketingBudgetQuery budgetType() {
        startField("budgetType");

        return this;
    }

    /**
    * The amount of budget for marketing activity.
    */
    public MarketingBudgetQuery total(MoneyV2QueryDefinition queryDef) {
        startField("total");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

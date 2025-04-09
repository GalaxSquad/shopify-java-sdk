// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Configuration of the deposit.
*/
public class DepositConfigurationQuery extends Query<DepositConfigurationQuery> {
    DepositConfigurationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DepositConfigurationQuery onDepositPercentage(DepositPercentageQueryDefinition queryDef) {
        startInlineFragment("DepositPercentage");
        queryDef.define(new DepositPercentageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

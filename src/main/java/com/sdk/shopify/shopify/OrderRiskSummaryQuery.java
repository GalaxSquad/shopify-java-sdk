// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Summary of risk characteristics for an order.
* See the [example query "Retrieves a list of all order risks for an
* order"](https://shopify.dev/docs/api/admin-graphql/unstable/queries/order?example=Retrieves+a+list+o
* f+all+order+risks+for+an+order).
*/
public class OrderRiskSummaryQuery extends Query<OrderRiskSummaryQuery> {
    OrderRiskSummaryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of risk assessments for the order.
    */
    public OrderRiskSummaryQuery assessments(OrderRiskAssessmentQueryDefinition queryDef) {
        startField("assessments");

        _queryBuilder.append('{');
        queryDef.define(new OrderRiskAssessmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The recommendation for the order based on the results of the risk assessments. This suggests the
    * action the merchant should take with regards to its risk of fraud.
    */
    public OrderRiskSummaryQuery recommendation() {
        startField("recommendation");

        return this;
    }
}

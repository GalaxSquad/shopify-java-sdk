// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderRiskAssessmentCreate` mutation.
*/
public class OrderRiskAssessmentCreatePayloadQuery extends Query<OrderRiskAssessmentCreatePayloadQuery> {
    OrderRiskAssessmentCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The order risk assessment created.
    */
    public OrderRiskAssessmentCreatePayloadQuery orderRiskAssessment(OrderRiskAssessmentQueryDefinition queryDef) {
        startField("orderRiskAssessment");

        _queryBuilder.append('{');
        queryDef.define(new OrderRiskAssessmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderRiskAssessmentCreatePayloadQuery userErrors(OrderRiskAssessmentCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderRiskAssessmentCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

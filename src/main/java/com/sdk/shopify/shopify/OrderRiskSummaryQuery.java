// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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

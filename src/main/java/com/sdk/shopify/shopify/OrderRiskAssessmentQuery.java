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
* The risk assessments for an order.
* See the [example query "Retrieves a list of all order risks for an
* order"](https://shopify.dev/docs/api/admin-graphql/unstable/queries/order?example=Retrieves+a+list+o
* f+all+order+risks+for+an+order).
*/
public class OrderRiskAssessmentQuery extends Query<OrderRiskAssessmentQuery> {
    OrderRiskAssessmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Optional facts used to describe the risk assessment. The values in here are specific to the
    * provider.
    * See the [examples for the mutation
    * orderRiskAssessmentCreate](https://shopify.dev/api/admin-graphql/unstable/mutations/orderRiskAssessm
    * entCreate#section-examples).
    */
    public OrderRiskAssessmentQuery facts(RiskFactQueryDefinition queryDef) {
        startField("facts");

        _queryBuilder.append('{');
        queryDef.define(new RiskFactQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The app that provided the assessment, `null` if the assessment was provided by Shopify.
    */
    public OrderRiskAssessmentQuery provider(AppQueryDefinition queryDef) {
        startField("provider");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The likelihood that the order is fraudulent, based on this risk assessment.
    */
    public OrderRiskAssessmentQuery riskLevel() {
        startField("riskLevel");

        return this;
    }
}

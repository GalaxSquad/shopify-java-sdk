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
* Represents a fraud check on an order.
* As of version 2024-04 this resource is deprecated. Risk Assessments can be queried via the
* [OrderRisk Assessments
* API](https://shopify.dev/api/admin-graphql/2024-04/objects/OrderRiskAssessment).
*/
public class OrderRiskQuery extends Query<OrderRiskQuery> {
    OrderRiskQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }
}

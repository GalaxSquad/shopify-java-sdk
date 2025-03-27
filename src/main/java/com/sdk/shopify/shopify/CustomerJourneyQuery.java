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
* Represents a customer's visiting activities on a shop's online store.
*/
public class CustomerJourneyQuery extends Query<CustomerJourneyQuery> {
    CustomerJourneyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of the current order within the customer's order history.
    */
    public CustomerJourneyQuery customerOrderIndex() {
        startField("customerOrderIndex");

        return this;
    }

    /**
    * The amount of days between first session and order creation date. First session represents first
    * session since the last order, or first session within the 30 day attribution window, if more than 30
    * days has passed since the last order.
    */
    public CustomerJourneyQuery daysToConversion() {
        startField("daysToConversion");

        return this;
    }

    /**
    * The customer's first session going into the shop.
    */
    public CustomerJourneyQuery firstVisit(CustomerVisitQueryDefinition queryDef) {
        startField("firstVisit");

        _queryBuilder.append('{');
        queryDef.define(new CustomerVisitQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The last session before an order is made.
    */
    public CustomerJourneyQuery lastVisit(CustomerVisitQueryDefinition queryDef) {
        startField("lastVisit");

        _queryBuilder.append('{');
        queryDef.define(new CustomerVisitQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Events preceding a customer order, such as shop sessions.
    */
    public CustomerJourneyQuery moments(CustomerMomentQueryDefinition queryDef) {
        startField("moments");

        _queryBuilder.append('{');
        queryDef.define(new CustomerMomentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

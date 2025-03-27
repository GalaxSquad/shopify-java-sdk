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
* Represents the payment schedule for a single payment defined in the payment terms.
*/
public class PaymentScheduleQuery extends Query<PaymentScheduleQuery> {
    PaymentScheduleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Date and time when the payment schedule is paid or fulfilled.
    */
    public PaymentScheduleQuery completedAt() {
        startField("completedAt");

        return this;
    }

    /**
    * Date and time when the payment schedule is due.
    */
    public PaymentScheduleQuery dueAt() {
        startField("dueAt");

        return this;
    }

    /**
    * Date and time when the invoice is sent.
    */
    public PaymentScheduleQuery issuedAt() {
        startField("issuedAt");

        return this;
    }

    /**
    * The payment terms the payment schedule belongs to.
    */
    public PaymentScheduleQuery paymentTerms(PaymentTermsQueryDefinition queryDef) {
        startField("paymentTerms");

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

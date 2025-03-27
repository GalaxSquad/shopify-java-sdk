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
* Represents app revenue that was captured externally by the partner.
*/
public class AppRevenueAttributionRecordQuery extends Query<AppRevenueAttributionRecordQuery> {
    AppRevenueAttributionRecordQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The financial amount captured in this attribution.
    */
    public AppRevenueAttributionRecordQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The timestamp when the financial amount was captured.
    */
    public AppRevenueAttributionRecordQuery capturedAt() {
        startField("capturedAt");

        return this;
    }

    /**
    * The timestamp at which this revenue attribution was issued.
    */
    public AppRevenueAttributionRecordQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The unique value submitted during the creation of the app revenue attribution record.
    * For more information, refer to
    * [Idempotent requests](https://shopify.dev/api/usage/idempotent-requests).
    */
    public AppRevenueAttributionRecordQuery idempotencyKey() {
        startField("idempotencyKey");

        return this;
    }

    /**
    * Indicates whether this is a test submission.
    */
    public AppRevenueAttributionRecordQuery test() {
        startField("test");

        return this;
    }

    /**
    * The type of revenue attribution.
    */
    public AppRevenueAttributionRecordQuery type() {
        startField("type");

        return this;
    }
}

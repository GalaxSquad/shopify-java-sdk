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
* Represents information about the purchasing entity for the order or draft order.
*/
public class PurchasingEntityQuery extends Query<PurchasingEntityQuery> {
    PurchasingEntityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PurchasingEntityQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PurchasingEntityQuery onPurchasingCompany(PurchasingCompanyQueryDefinition queryDef) {
        startInlineFragment("PurchasingCompany");
        queryDef.define(new PurchasingCompanyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

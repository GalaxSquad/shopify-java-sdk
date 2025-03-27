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
* Represents a merchant's Business Entity.
*/
public class BusinessEntityQuery extends Query<BusinessEntityQuery> {
    BusinessEntityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The address of the merchant's Business Entity.
    */
    public BusinessEntityQuery address(BusinessEntityAddressQueryDefinition queryDef) {
        startField("address");

        _queryBuilder.append('{');
        queryDef.define(new BusinessEntityAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the company associated with the merchant's Business Entity.
    */
    public BusinessEntityQuery companyName() {
        startField("companyName");

        return this;
    }

    /**
    * The display name of the merchant's Business Entity.
    */
    public BusinessEntityQuery displayName() {
        startField("displayName");

        return this;
    }

    /**
    * Whether it's the merchant's primary Business Entity.
    */
    public BusinessEntityQuery primary() {
        startField("primary");

        return this;
    }

    /**
    * Shopify Payments account information, including balances and payouts.
    */
    public BusinessEntityQuery shopifyPaymentsAccount(ShopifyPaymentsAccountQueryDefinition queryDef) {
        startField("shopifyPaymentsAccount");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsAccountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

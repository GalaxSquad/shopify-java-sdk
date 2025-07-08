// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
    * Whether the Business Entity is archived from the shop.
    */
    public BusinessEntityQuery archived() {
        startField("archived");

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

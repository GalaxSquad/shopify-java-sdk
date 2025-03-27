// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The details about the app extension that's providing the
* [discount type](https://help.shopify.com/manual/discounts/discount-types).
* This information includes the app extension's name and
* [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
* [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
* [discount
* class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
* [function
* ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
* and other metadata about the discount type, including the discount type's name and description.
*/
public class AppDiscountTypeQuery extends Query<AppDiscountTypeQuery> {
    AppDiscountTypeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The name of the app extension that's providing the
    * [discount type](https://help.shopify.com/manual/discounts/discount-types).
    */
    public AppDiscountTypeQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [App Bridge configuration](https://shopify.dev/docs/api/app-bridge)
    * for the [discount type](https://help.shopify.com/manual/discounts/discount-types).
    */
    public AppDiscountTypeQuery appBridge(FunctionsAppBridgeQueryDefinition queryDef) {
        startField("appBridge");

        _queryBuilder.append('{');
        queryDef.define(new FunctionsAppBridgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets)
    * of the app extension that's providing the [discount
    * type](https://help.shopify.com/manual/discounts/discount-types).
    */
    public AppDiscountTypeQuery appKey() {
        startField("appKey");

        return this;
    }

    /**
    * A description of the
    * [discount type](https://help.shopify.com/manual/discounts/discount-types)
    * provided by the app extension.
    */
    public AppDiscountTypeQuery description() {
        startField("description");

        return this;
    }

    /**
    * The
    * [function
    * ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries)
    * associated with the app extension providing the
    * [discount type](https://help.shopify.com/manual/discounts/discount-types).
    */
    public AppDiscountTypeQuery functionId() {
        startField("functionId");

        return this;
    }

    /**
    * The name of the [discount type](https://help.shopify.com/manual/discounts/discount-types)
    * that the app extension is providing.
    */
    public AppDiscountTypeQuery title() {
        startField("title");

        return this;
    }
}

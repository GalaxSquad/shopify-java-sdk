// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

public class CheckoutQuery extends Query<CheckoutQuery> {
    CheckoutQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public CheckoutQuery shippingAddress(MailingAddressQueryDefinition queryDef) {
        startField("shippingAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CheckoutQuery discountApplication(DiscountApplicationQueryDefinition queryDef) {
        startField("discountApplication");

        _queryBuilder.append('{');
        queryDef.define(new DiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

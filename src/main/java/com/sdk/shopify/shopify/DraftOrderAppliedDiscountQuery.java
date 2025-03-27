// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The order-level discount applied to a draft order.
*/
public class DraftOrderAppliedDiscountQuery extends Query<DraftOrderAppliedDiscountQuery> {
    DraftOrderAppliedDiscountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The amount of money discounted, with values shown in both shop currency and presentment currency.
    */
    public DraftOrderAppliedDiscountQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Description of the order-level discount.
    */
    public DraftOrderAppliedDiscountQuery description() {
        startField("description");

        return this;
    }

    /**
    * Name of the order-level discount.
    */
    public DraftOrderAppliedDiscountQuery title() {
        startField("title");

        return this;
    }

    /**
    * The order level discount amount. If `valueType` is `"percentage"`,
    * then `value` is the percentage discount.
    */
    public DraftOrderAppliedDiscountQuery value() {
        startField("value");

        return this;
    }

    /**
    * Type of the order-level discount.
    */
    public DraftOrderAppliedDiscountQuery valueType() {
        startField("valueType");

        return this;
    }
}

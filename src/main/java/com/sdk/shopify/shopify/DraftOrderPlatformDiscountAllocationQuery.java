// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Price reduction allocations across the draft order's lines.
*/
public class DraftOrderPlatformDiscountAllocationQuery extends Query<DraftOrderPlatformDiscountAllocationQuery> {
    DraftOrderPlatformDiscountAllocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the allocation.
    */
    public DraftOrderPlatformDiscountAllocationQuery id() {
        startField("id");

        return this;
    }

    /**
    * The quantity of the target being discounted.
    */
    public DraftOrderPlatformDiscountAllocationQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Amount of the discount allocated to the target.
    */
    public DraftOrderPlatformDiscountAllocationQuery reductionAmount(MoneyV2QueryDefinition queryDef) {
        startField("reductionAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Amount of the discount allocated to the target in both shop currency and presentment currency.
    */
    public DraftOrderPlatformDiscountAllocationQuery reductionAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("reductionAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The element of the draft being discounted.
    */
    public DraftOrderPlatformDiscountAllocationQuery target(DraftOrderPlatformDiscountAllocationTargetQueryDefinition queryDef) {
        startField("target");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderPlatformDiscountAllocationTargetQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

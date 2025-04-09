// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The element of the draft being discounted.
*/
public class DraftOrderPlatformDiscountAllocationTargetQuery extends Query<DraftOrderPlatformDiscountAllocationTargetQuery> {
    DraftOrderPlatformDiscountAllocationTargetQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DraftOrderPlatformDiscountAllocationTargetQuery onCalculatedDraftOrderLineItem(CalculatedDraftOrderLineItemQueryDefinition queryDef) {
        startInlineFragment("CalculatedDraftOrderLineItem");
        queryDef.define(new CalculatedDraftOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DraftOrderPlatformDiscountAllocationTargetQuery onDraftOrderLineItem(DraftOrderLineItemQueryDefinition queryDef) {
        startInlineFragment("DraftOrderLineItem");
        queryDef.define(new DraftOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DraftOrderPlatformDiscountAllocationTargetQuery onShippingLine(ShippingLineQueryDefinition queryDef) {
        startInlineFragment("ShippingLine");
        queryDef.define(new ShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The available delivery options for a draft order.
*/
public class DraftOrderAvailableDeliveryOptionsQuery extends Query<DraftOrderAvailableDeliveryOptionsQuery> {
    DraftOrderAvailableDeliveryOptionsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The available local delivery rates for the draft order. Requires a customer with a valid shipping
    * address and at least one line item.
    */
    public DraftOrderAvailableDeliveryOptionsQuery availableLocalDeliveryRates(DraftOrderShippingRateQueryDefinition queryDef) {
        startField("availableLocalDeliveryRates");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderShippingRateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The available local pickup options for the draft order. Requires a customer with a valid shipping
    * address and at least one line item.
    */
    public DraftOrderAvailableDeliveryOptionsQuery availableLocalPickupOptions(PickupInStoreLocationQueryDefinition queryDef) {
        startField("availableLocalPickupOptions");

        _queryBuilder.append('{');
        queryDef.define(new PickupInStoreLocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The available shipping rates for the draft order. Requires a customer with a valid shipping address
    * and at least one line item.
    */
    public DraftOrderAvailableDeliveryOptionsQuery availableShippingRates(DraftOrderShippingRateQueryDefinition queryDef) {
        startField("availableShippingRates");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderShippingRateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns information about pagination of local pickup options.
    */
    public DraftOrderAvailableDeliveryOptionsQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

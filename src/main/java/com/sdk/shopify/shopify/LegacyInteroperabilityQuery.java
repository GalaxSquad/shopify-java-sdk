// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Interoperability metadata for types that directly correspond to a REST Admin API resource.
* For example, on the Product type, LegacyInteroperability returns metadata for the corresponding
* [Product object](https://shopify.dev/api/admin-graphql/latest/objects/product) in the REST Admin
* API.
*/
public class LegacyInteroperabilityQuery extends Query<LegacyInteroperabilityQuery> {
    LegacyInteroperabilityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public LegacyInteroperabilityQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    public LegacyInteroperabilityQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onDraftOrder(DraftOrderQueryDefinition queryDef) {
        startInlineFragment("DraftOrder");
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onFulfillment(FulfillmentQueryDefinition queryDef) {
        startInlineFragment("Fulfillment");
        queryDef.define(new FulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onInventoryItem(InventoryItemQueryDefinition queryDef) {
        startInlineFragment("InventoryItem");
        queryDef.define(new InventoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onLocation(LocationQueryDefinition queryDef) {
        startInlineFragment("Location");
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onMarketingEvent(MarketingEventQueryDefinition queryDef) {
        startInlineFragment("MarketingEvent");
        queryDef.define(new MarketingEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onMetafield(MetafieldQueryDefinition queryDef) {
        startInlineFragment("Metafield");
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onOrder(OrderQueryDefinition queryDef) {
        startInlineFragment("Order");
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onPriceRule(PriceRuleQueryDefinition queryDef) {
        startInlineFragment("PriceRule");
        queryDef.define(new PriceRuleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onProductVariant(ProductVariantQueryDefinition queryDef) {
        startInlineFragment("ProductVariant");
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onRefund(RefundQueryDefinition queryDef) {
        startInlineFragment("Refund");
        queryDef.define(new RefundQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onSavedSearch(SavedSearchQueryDefinition queryDef) {
        startInlineFragment("SavedSearch");
        queryDef.define(new SavedSearchQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onScriptTag(ScriptTagQueryDefinition queryDef) {
        startInlineFragment("ScriptTag");
        queryDef.define(new ScriptTagQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onShopifyPaymentsDispute(ShopifyPaymentsDisputeQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsDispute");
        queryDef.define(new ShopifyPaymentsDisputeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onShopifyPaymentsPayout(ShopifyPaymentsPayoutQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsPayout");
        queryDef.define(new ShopifyPaymentsPayoutQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LegacyInteroperabilityQuery onWebhookSubscription(WebhookSubscriptionQueryDefinition queryDef) {
        startInlineFragment("WebhookSubscription");
        queryDef.define(new WebhookSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

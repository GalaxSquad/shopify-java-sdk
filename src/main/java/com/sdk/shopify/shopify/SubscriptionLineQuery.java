// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a Subscription Line.
*/
public class SubscriptionLineQuery extends Query<SubscriptionLineQuery> {
    SubscriptionLineQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The origin contract of the line if it was concatenated from another contract.
    */
    public SubscriptionLineQuery concatenatedOriginContract(SubscriptionContractQueryDefinition queryDef) {
        startField("concatenatedOriginContract");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price per unit for the subscription line in the contract's currency.
    */
    public SubscriptionLineQuery currentPrice(MoneyV2QueryDefinition queryDef) {
        startField("currentPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * List of custom attributes associated to the line item.
    */
    public SubscriptionLineQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Discount allocations.
    */
    public SubscriptionLineQuery discountAllocations(SubscriptionDiscountAllocationQueryDefinition queryDef) {
        startField("discountAllocations");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountAllocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique ID.
    */
    public SubscriptionLineQuery id() {
        startField("id");

        return this;
    }

    /**
    * Total line price including all discounts.
    */
    public SubscriptionLineQuery lineDiscountedPrice(MoneyV2QueryDefinition queryDef) {
        startField("lineDiscountedPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Describe the price changes of the line over time.
    */
    public SubscriptionLineQuery pricingPolicy(SubscriptionPricingPolicyQueryDefinition queryDef) {
        startField("pricingPolicy");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionPricingPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product ID associated with the subscription line.
    */
    public SubscriptionLineQuery productId() {
        startField("productId");

        return this;
    }

    /**
    * The quantity of the unit selected for the subscription line.
    */
    public SubscriptionLineQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */
    public SubscriptionLineQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * The selling plan ID associated to the line.
    * Indicates which selling plan was used to create this
    * contract line initially. The selling plan ID is also used to
    * find the associated delivery profile.
    * The subscription contract, subscription line, or selling plan might have
    * changed. As a result, the selling plan's attributes might not
    * match the information on the contract.
    */
    public SubscriptionLineQuery sellingPlanId() {
        startField("sellingPlanId");

        return this;
    }

    /**
    * The selling plan name associated to the line. This name describes
    * the order line items created from this subscription line
    * for both merchants and customers.
    * The value can be different from the selling plan's name, because both
    * the selling plan's name and the subscription line's selling_plan_name
    * attribute can be updated independently.
    */
    public SubscriptionLineQuery sellingPlanName() {
        startField("sellingPlanName");

        return this;
    }

    /**
    * Variant SKU number of the item associated with the subscription line.
    */
    public SubscriptionLineQuery sku() {
        startField("sku");

        return this;
    }

    /**
    * Whether the variant is taxable.
    */
    public SubscriptionLineQuery taxable() {
        startField("taxable");

        return this;
    }

    /**
    * Product title of the item associated with the subscription line.
    */
    public SubscriptionLineQuery title() {
        startField("title");

        return this;
    }

    /**
    * The product variant ID associated with the subscription line.
    */
    public SubscriptionLineQuery variantId() {
        startField("variantId");

        return this;
    }

    /**
    * The image associated with the line item's variant or product.
    */
    public SubscriptionLineQuery variantImage(ImageQueryDefinition queryDef) {
        startField("variantImage");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Product variant title of the item associated with the subscription line.
    */
    public SubscriptionLineQuery variantTitle() {
        startField("variantTitle");

        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A single line item in an abandoned checkout.
*/
public class AbandonedCheckoutLineItemQuery extends Query<AbandonedCheckoutLineItemQuery> {
    AbandonedCheckoutLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A list of line item components for this line item.
    */
    public AbandonedCheckoutLineItemQuery components(AbandonedCheckoutLineItemComponentQueryDefinition queryDef) {
        startField("components");

        _queryBuilder.append('{');
        queryDef.define(new AbandonedCheckoutLineItemComponentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of extra information that has been added to the line item.
    */
    public AbandonedCheckoutLineItemQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountAllocationsArguments extends Arguments {
        DiscountAllocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountAllocationsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountAllocationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountAllocationsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come before the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountAllocationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DiscountAllocationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DiscountAllocationsArgumentsDefinition {
        void define(DiscountAllocationsArguments args);
    }

    /**
    * Discount allocations that have been applied on the line item.
    */
    public AbandonedCheckoutLineItemQuery discountAllocations(DiscountAllocationConnectionQueryDefinition queryDef) {
        return discountAllocations(args -> {}, queryDef);
    }

    /**
    * Discount allocations that have been applied on the line item.
    */
    public AbandonedCheckoutLineItemQuery discountAllocations(DiscountAllocationsArgumentsDefinition argsDef, DiscountAllocationConnectionQueryDefinition queryDef) {
        startField("discountAllocations");

        DiscountAllocationsArguments args = new DiscountAllocationsArguments(_queryBuilder);
        argsDef.define(args);
        DiscountAllocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountAllocationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Final total price for the entire quantity of this line item, including discounts.
    */
    public AbandonedCheckoutLineItemQuery discountedTotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedTotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price for the entire quantity of this line item, after all discounts are applied, at both
    * the line item and code-based line item level.
    */
    public AbandonedCheckoutLineItemQuery discountedTotalPriceWithCodeDiscount(MoneyBagQueryDefinition queryDef) {
        startField("discountedTotalPriceWithCodeDiscount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price of a single variant unit after discounts are applied at the line item level, in shop and
    * presentment currencies.
    */
    public AbandonedCheckoutLineItemQuery discountedUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price of a single variant unit after all discounts are applied, at both the line item and
    * code-based line item level.
    */
    public AbandonedCheckoutLineItemQuery discountedUnitPriceWithCodeDiscount(MoneyBagQueryDefinition queryDef) {
        startField("discountedUnitPriceWithCodeDiscount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The image associated with the line item's variant or product.
    * NULL if the line item has no product, or if neither the variant nor the product have an image.
    */
    public AbandonedCheckoutLineItemQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Original total price for the entire quantity of this line item, before discounts.
    */
    public AbandonedCheckoutLineItemQuery originalTotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalTotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Original price for a single unit of this line item, before discounts.
    */
    public AbandonedCheckoutLineItemQuery originalUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Product for this line item.
    * NULL for custom line items and products that were deleted after checkout began.
    */
    public AbandonedCheckoutLineItemQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of the line item.
    */
    public AbandonedCheckoutLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * SKU for the inventory item associated with the variant, if any.
    */
    public AbandonedCheckoutLineItemQuery sku() {
        startField("sku");

        return this;
    }

    /**
    * Title of the line item. Defaults to the product's title.
    */
    public AbandonedCheckoutLineItemQuery title() {
        startField("title");

        return this;
    }

    /**
    * Product variant for this line item.
    * NULL for custom line items and variants that were deleted after checkout began.
    */
    public AbandonedCheckoutLineItemQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Title of the variant for this line item.
    * NULL for custom line items and products that don't have distinct variants.
    */
    public AbandonedCheckoutLineItemQuery variantTitle() {
        startField("variantTitle");

        return this;
    }
}

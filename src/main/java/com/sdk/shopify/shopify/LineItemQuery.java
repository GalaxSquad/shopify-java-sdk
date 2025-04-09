// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents individual products and quantities purchased in the associated order.
*/
public class LineItemQuery extends Query<LineItemQuery> {
    LineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The subscription contract associated with this line item.
    */
    public LineItemQuery contract(SubscriptionContractQueryDefinition queryDef) {
        startField("contract");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of units ordered, excluding refunded and removed units.
    */
    public LineItemQuery currentQuantity() {
        startField("currentQuantity");

        return this;
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */
    public LineItemQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The discounts that have been allocated to the line item by discount applications, including
    * discounts allocated to refunded and removed quantities.
    */
    public LineItemQuery discountAllocations(DiscountAllocationQueryDefinition queryDef) {
        startField("discountAllocations");

        _queryBuilder.append('{');
        queryDef.define(new DiscountAllocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountedTotalSetArguments extends Arguments {
        DiscountedTotalSetArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to include code-based discounts in the total.
        */
        public DiscountedTotalSetArguments withCodeDiscounts(Boolean value) {
            if (value != null) {
                startArgument("withCodeDiscounts");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DiscountedTotalSetArgumentsDefinition {
        void define(DiscountedTotalSetArguments args);
    }

    /**
    * The total discounted price of the line item in shop and presentment currencies, including refunded
    * and removed quantities. This value doesn't include order-level discounts. Code-based discounts
    * aren't included by default.
    */
    public LineItemQuery discountedTotalSet(MoneyBagQueryDefinition queryDef) {
        return discountedTotalSet(args -> {}, queryDef);
    }

    /**
    * The total discounted price of the line item in shop and presentment currencies, including refunded
    * and removed quantities. This value doesn't include order-level discounts. Code-based discounts
    * aren't included by default.
    */
    public LineItemQuery discountedTotalSet(DiscountedTotalSetArgumentsDefinition argsDef, MoneyBagQueryDefinition queryDef) {
        startField("discountedTotalSet");

        DiscountedTotalSetArguments args = new DiscountedTotalSetArguments(_queryBuilder);
        argsDef.define(args);
        DiscountedTotalSetArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The approximate unit price of the line item in shop and presentment currencies. This value includes
    * discounts applied to refunded and removed quantities.
    */
    public LineItemQuery discountedUnitPriceAfterAllDiscountsSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedUnitPriceAfterAllDiscountsSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The approximate unit price of the line item in shop and presentment currencies. This value includes
    * line-level discounts and discounts applied to refunded and removed quantities. It doesn't include
    * order-level or code-based discounts.
    */
    public LineItemQuery discountedUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The duties associated with the line item.
    */
    public LineItemQuery duties(DutyQueryDefinition queryDef) {
        startField("duties");

        _queryBuilder.append('{');
        queryDef.define(new DutyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The image associated to the line item's variant.
    */
    public LineItemQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the line item represents the purchase of a gift card.
    */
    public LineItemQuery isGiftCard() {
        startField("isGiftCard");

        return this;
    }

    /**
    * The line item group associated to the line item.
    */
    public LineItemQuery lineItemGroup(LineItemGroupQueryDefinition queryDef) {
        startField("lineItemGroup");

        _queryBuilder.append('{');
        queryDef.define(new LineItemGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the line item can be edited or not.
    */
    public LineItemQuery merchantEditable() {
        startField("merchantEditable");

        return this;
    }

    /**
    * The title of the product, optionally appended with the title of the variant (if applicable).
    */
    public LineItemQuery name() {
        startField("name");

        return this;
    }

    /**
    * The total number of units that can't be fulfilled. For example, if items have been refunded, or the
    * item is not something that can be fulfilled, like a tip. Please see the
    * [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object for
    * more fulfillment details.
    */
    public LineItemQuery nonFulfillableQuantity() {
        startField("nonFulfillableQuantity");

        return this;
    }

    /**
    * In shop and presentment currencies, the total price of the line item when the order was created.
    * This value doesn't include discounts.
    */
    public LineItemQuery originalTotalSet(MoneyBagQueryDefinition queryDef) {
        startField("originalTotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * In shop and presentment currencies, the unit price of the line item when the order was created. This
    * value doesn't include discounts.
    */
    public LineItemQuery originalUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Product object associated with this line item's variant.
    */
    public LineItemQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of units ordered, including refunded and removed units.
    */
    public LineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The number of units ordered, excluding refunded units.
    */
    public LineItemQuery refundableQuantity() {
        startField("refundableQuantity");

        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */
    public LineItemQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * Whether the line item can be restocked.
    */
    public LineItemQuery restockable() {
        startField("restockable");

        return this;
    }

    /**
    * The selling plan details associated with the line item.
    */
    public LineItemQuery sellingPlan(LineItemSellingPlanQueryDefinition queryDef) {
        startField("sellingPlan");

        _queryBuilder.append('{');
        queryDef.define(new LineItemSellingPlanQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The variant SKU number.
    */
    public LineItemQuery sku() {
        startField("sku");

        return this;
    }

    /**
    * Staff attributed to the line item.
    */
    public LineItemQuery staffMember(StaffMemberQueryDefinition queryDef) {
        startField("staffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TaxLinesArguments extends Arguments {
        TaxLinesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Truncate the array result to this size.
        */
        public TaxLinesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TaxLinesArgumentsDefinition {
        void define(TaxLinesArguments args);
    }

    /**
    * The taxes charged for the line item, including taxes charged for refunded and removed quantities.
    */
    public LineItemQuery taxLines(TaxLineQueryDefinition queryDef) {
        return taxLines(args -> {}, queryDef);
    }

    /**
    * The taxes charged for the line item, including taxes charged for refunded and removed quantities.
    */
    public LineItemQuery taxLines(TaxLinesArgumentsDefinition argsDef, TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        TaxLinesArguments args = new TaxLinesArguments(_queryBuilder);
        argsDef.define(args);
        TaxLinesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the variant is taxable.
    */
    public LineItemQuery taxable() {
        startField("taxable");

        return this;
    }

    /**
    * The title of the product at time of order creation.
    */
    public LineItemQuery title() {
        startField("title");

        return this;
    }

    /**
    * The total discount allocated to the line item in shop and presentment currencies, including the
    * total allocated to refunded and removed quantities. This value doesn't include order-level
    * discounts.
    */
    public LineItemQuery totalDiscountSet(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * In shop and presentment currencies, the total discounted price of the unfulfilled quantity for the
    * line item.
    */
    public LineItemQuery unfulfilledDiscountedTotalSet(MoneyBagQueryDefinition queryDef) {
        startField("unfulfilledDiscountedTotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * In shop and presentment currencies, the total price of the unfulfilled quantity for the line item.
    * This value doesn't include discounts.
    */
    public LineItemQuery unfulfilledOriginalTotalSet(MoneyBagQueryDefinition queryDef) {
        startField("unfulfilledOriginalTotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of units not yet fulfilled.
    */
    public LineItemQuery unfulfilledQuantity() {
        startField("unfulfilledQuantity");

        return this;
    }

    /**
    * The Variant object associated with this line item.
    */
    public LineItemQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The title of the variant at time of order creation.
    */
    public LineItemQuery variantTitle() {
        startField("variantTitle");

        return this;
    }

    /**
    * The name of the vendor who made the variant.
    */
    public LineItemQuery vendor() {
        startField("vendor");

        return this;
    }
}

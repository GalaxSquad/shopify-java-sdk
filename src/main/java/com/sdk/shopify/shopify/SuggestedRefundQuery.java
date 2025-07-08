// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a refund suggested by Shopify based on the items being reimbursed. You can then use the
* suggested refund object to generate an actual refund.
*/
public class SuggestedRefundQuery extends Query<SuggestedRefundQuery> {
    SuggestedRefundQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The total monetary value to be refunded in shop and presentment currencies.
    */
    public SuggestedRefundQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all the discounted prices of the line items being refunded.
    */
    public SuggestedRefundQuery discountedSubtotalSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedSubtotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total monetary value available to refund in shop and presentment currencies.
    */
    public SuggestedRefundQuery maximumRefundableSet(MoneyBagQueryDefinition queryDef) {
        startField("maximumRefundableSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of duties to be refunded from the order.
    */
    public SuggestedRefundQuery refundDuties(RefundDutyQueryDefinition queryDef) {
        startField("refundDuties");

        _queryBuilder.append('{');
        queryDef.define(new RefundDutyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of line items to be refunded, along with restock instructions.
    */
    public SuggestedRefundQuery refundLineItems(RefundLineItemQueryDefinition queryDef) {
        startField("refundLineItems");

        _queryBuilder.append('{');
        queryDef.define(new RefundLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shipping costs to be refunded from the order.
    */
    public SuggestedRefundQuery shipping(ShippingRefundQueryDefinition queryDef) {
        startField("shipping");

        _queryBuilder.append('{');
        queryDef.define(new ShippingRefundQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all the prices of the line items being refunded in shop and presentment currencies.
    */
    public SuggestedRefundQuery subtotalSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of suggested refund methods.
    */
    public SuggestedRefundQuery suggestedRefundMethods(SuggestedRefundMethodQueryDefinition queryDef) {
        startField("suggestedRefundMethods");

        _queryBuilder.append('{');
        queryDef.define(new SuggestedRefundMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of suggested order transactions.
    */
    public SuggestedRefundQuery suggestedTransactions(SuggestedOrderTransactionQueryDefinition queryDef) {
        startField("suggestedTransactions");

        _queryBuilder.append('{');
        queryDef.define(new SuggestedOrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total cart discount amount that was applied to all line items in this refund.
    */
    public SuggestedRefundQuery totalCartDiscountAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("totalCartDiscountAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all the duties being refunded from the order in shop and presentment currencies. The
    * value must be positive.
    */
    public SuggestedRefundQuery totalDutiesSet(MoneyBagQueryDefinition queryDef) {
        startField("totalDutiesSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of the taxes being refunded from the order in shop and presentment currencies. The value
    * must be positive.
    */
    public SuggestedRefundQuery totalTaxSet(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

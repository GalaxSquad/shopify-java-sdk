// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a return refund suggested by Shopify based on the items being reimbursed. You can then
* use the suggested refund object to generate an actual refund for the return.
*/
public class SuggestedReturnRefundQuery extends Query<SuggestedReturnRefundQuery> {
    SuggestedReturnRefundQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The total monetary value to be refunded in shop and presentment currencies.
    */
    public SuggestedReturnRefundQuery amount(MoneyBagQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all the discounted prices of the line items being refunded.
    */
    public SuggestedReturnRefundQuery discountedSubtotal(MoneyBagQueryDefinition queryDef) {
        startField("discountedSubtotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total monetary value available to refund in shop and presentment currencies.
    */
    public SuggestedReturnRefundQuery maximumRefundable(MoneyBagQueryDefinition queryDef) {
        startField("maximumRefundable");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of duties to be refunded from the order.
    */
    public SuggestedReturnRefundQuery refundDuties(RefundDutyQueryDefinition queryDef) {
        startField("refundDuties");

        _queryBuilder.append('{');
        queryDef.define(new RefundDutyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shipping costs to be refunded from the order.
    */
    public SuggestedReturnRefundQuery shipping(ShippingRefundQueryDefinition queryDef) {
        startField("shipping");

        _queryBuilder.append('{');
        queryDef.define(new ShippingRefundQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all the prices of the line items being refunded in shop and presentment currencies.
    */
    public SuggestedReturnRefundQuery subtotal(MoneyBagQueryDefinition queryDef) {
        startField("subtotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of suggested order transactions.
    */
    public SuggestedReturnRefundQuery suggestedTransactions(SuggestedOrderTransactionQueryDefinition queryDef) {
        startField("suggestedTransactions");

        _queryBuilder.append('{');
        queryDef.define(new SuggestedOrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total cart discount amount that was applied to all line items in this refund.
    */
    public SuggestedReturnRefundQuery totalCartDiscountAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalCartDiscountAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all the duties being refunded from the order in shop and presentment currencies. The
    * value must be positive.
    */
    public SuggestedReturnRefundQuery totalDuties(MoneyBagQueryDefinition queryDef) {
        startField("totalDuties");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of the taxes being refunded in shop and presentment currencies. The value must be positive.
    */
    public SuggestedReturnRefundQuery totalTax(MoneyBagQueryDefinition queryDef) {
        startField("totalTax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

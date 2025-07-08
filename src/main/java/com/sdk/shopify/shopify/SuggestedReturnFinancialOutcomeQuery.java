// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a return financial outcome suggested by Shopify based on the items being reimbursed. You
* can then use the suggested outcome object to generate an actual refund or invoice for the return.
*/
public class SuggestedReturnFinancialOutcomeQuery extends Query<SuggestedReturnFinancialOutcomeQuery> {
    SuggestedReturnFinancialOutcomeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The sum of all the discounted prices of the line items being refunded.
    */
    public SuggestedReturnFinancialOutcomeQuery discountedSubtotal(MoneyBagQueryDefinition queryDef) {
        startField("discountedSubtotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The financial transfer details for the return outcome.
    */
    public SuggestedReturnFinancialOutcomeQuery financialTransfer(ReturnOutcomeFinancialTransferQueryDefinition queryDef) {
        startField("financialTransfer");

        _queryBuilder.append('{');
        queryDef.define(new ReturnOutcomeFinancialTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total monetary value available to refund in shop and presentment currencies.
    */
    public SuggestedReturnFinancialOutcomeQuery maximumRefundable(MoneyBagQueryDefinition queryDef) {
        startField("maximumRefundable");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of duties to be refunded from the order.
    */
    public SuggestedReturnFinancialOutcomeQuery refundDuties(RefundDutyQueryDefinition queryDef) {
        startField("refundDuties");

        _queryBuilder.append('{');
        queryDef.define(new RefundDutyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shipping costs to be refunded from the order.
    */
    public SuggestedReturnFinancialOutcomeQuery shipping(ShippingRefundQueryDefinition queryDef) {
        startField("shipping");

        _queryBuilder.append('{');
        queryDef.define(new ShippingRefundQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all the additional fees being refunded in shop and presentment currencies. The value must
    * be positive.
    */
    public SuggestedReturnFinancialOutcomeQuery totalAdditionalFees(MoneyBagQueryDefinition queryDef) {
        startField("totalAdditionalFees");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total cart discount amount that was applied to all line items in this refund.
    */
    public SuggestedReturnFinancialOutcomeQuery totalCartDiscountAmount(MoneyBagQueryDefinition queryDef) {
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
    public SuggestedReturnFinancialOutcomeQuery totalDuties(MoneyBagQueryDefinition queryDef) {
        startField("totalDuties");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of the taxes being refunded in shop and presentment currencies. The value must be positive.
    */
    public SuggestedReturnFinancialOutcomeQuery totalTax(MoneyBagQueryDefinition queryDef) {
        startField("totalTax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

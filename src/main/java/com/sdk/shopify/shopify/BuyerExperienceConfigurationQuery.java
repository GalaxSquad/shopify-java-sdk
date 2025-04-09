// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Settings describing the behavior of checkout for a B2B buyer.
*/
public class BuyerExperienceConfigurationQuery extends Query<BuyerExperienceConfigurationQuery> {
    BuyerExperienceConfigurationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether to checkout to draft order for merchant review.
    */
    public BuyerExperienceConfigurationQuery checkoutToDraft() {
        startField("checkoutToDraft");

        return this;
    }

    /**
    * The portion required to be paid at checkout.
    */
    public BuyerExperienceConfigurationQuery deposit(DepositConfigurationQueryDefinition queryDef) {
        startField("deposit");

        _queryBuilder.append('{');
        queryDef.define(new DepositConfigurationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether to allow customers to use editable shipping addresses.
    */
    public BuyerExperienceConfigurationQuery editableShippingAddress() {
        startField("editableShippingAddress");

        return this;
    }

    /**
    * Represents the merchant configured payment terms.
    */
    public BuyerExperienceConfigurationQuery paymentTermsTemplate(PaymentTermsTemplateQueryDefinition queryDef) {
        startField("paymentTermsTemplate");

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsTemplateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

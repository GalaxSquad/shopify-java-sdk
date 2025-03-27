// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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

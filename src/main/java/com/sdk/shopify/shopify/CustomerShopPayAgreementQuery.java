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
* Represents a Shop Pay card instrument for customer payment method.
*/
public class CustomerShopPayAgreementQuery extends Query<CustomerShopPayAgreementQuery> {
    CustomerShopPayAgreementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The billing address of the card.
    */
    public CustomerShopPayAgreementQuery billingAddress(CustomerCreditCardBillingAddressQueryDefinition queryDef) {
        startField("billingAddress");

        _queryBuilder.append('{');
        queryDef.define(new CustomerCreditCardBillingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the card is about to expire.
    */
    public CustomerShopPayAgreementQuery expiresSoon() {
        startField("expiresSoon");

        return this;
    }

    /**
    * The expiry month of the card.
    */
    public CustomerShopPayAgreementQuery expiryMonth() {
        startField("expiryMonth");

        return this;
    }

    /**
    * The expiry year of the card.
    */
    public CustomerShopPayAgreementQuery expiryYear() {
        startField("expiryYear");

        return this;
    }

    /**
    * Whether the Shop Pay billing agreement is inactive.
    */
    public CustomerShopPayAgreementQuery inactive() {
        startField("inactive");

        return this;
    }

    /**
    * The payment method can be revoked if there are no active subscription contracts.
    */
    public CustomerShopPayAgreementQuery isRevocable() {
        startField("isRevocable");

        return this;
    }

    /**
    * The last 4 digits of the card.
    */
    public CustomerShopPayAgreementQuery lastDigits() {
        startField("lastDigits");

        return this;
    }

    /**
    * The masked card number with only the last 4 digits displayed.
    */
    public CustomerShopPayAgreementQuery maskedNumber() {
        startField("maskedNumber");

        return this;
    }

    /**
    * The name of the card holder.
    */
    public CustomerShopPayAgreementQuery name() {
        startField("name");

        return this;
    }
}

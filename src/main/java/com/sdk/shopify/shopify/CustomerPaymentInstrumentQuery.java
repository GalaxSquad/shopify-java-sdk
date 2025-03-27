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
* All possible instruments for CustomerPaymentMethods.
*/
public class CustomerPaymentInstrumentQuery extends Query<CustomerPaymentInstrumentQuery> {
    CustomerPaymentInstrumentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public CustomerPaymentInstrumentQuery onCustomerCreditCard(CustomerCreditCardQueryDefinition queryDef) {
        startInlineFragment("CustomerCreditCard");
        queryDef.define(new CustomerCreditCardQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CustomerPaymentInstrumentQuery onCustomerPaypalBillingAgreement(CustomerPaypalBillingAgreementQueryDefinition queryDef) {
        startInlineFragment("CustomerPaypalBillingAgreement");
        queryDef.define(new CustomerPaypalBillingAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CustomerPaymentInstrumentQuery onCustomerShopPayAgreement(CustomerShopPayAgreementQueryDefinition queryDef) {
        startInlineFragment("CustomerShopPayAgreement");
        queryDef.define(new CustomerShopPayAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

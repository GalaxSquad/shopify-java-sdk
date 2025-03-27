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
* Return type for `customerPaymentMethodCreditCardCreate` mutation.
*/
public class CustomerPaymentMethodCreditCardCreatePayloadQuery extends Query<CustomerPaymentMethodCreditCardCreatePayloadQuery> {
    CustomerPaymentMethodCreditCardCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customer payment method.
    */
    public CustomerPaymentMethodCreditCardCreatePayloadQuery customerPaymentMethod(CustomerPaymentMethodQueryDefinition queryDef) {
        startField("customerPaymentMethod");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * If the card verification result is processing. When this is true, customer_payment_method will be
    * null.
    */
    public CustomerPaymentMethodCreditCardCreatePayloadQuery processing() {
        startField("processing");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerPaymentMethodCreditCardCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

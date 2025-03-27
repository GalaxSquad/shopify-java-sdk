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
* Generic payment details that are related to a transaction.
*/
public class BasePaymentDetailsQuery extends Query<BasePaymentDetailsQuery> {
    BasePaymentDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The name of payment method used by the buyer.
    */
    public BasePaymentDetailsQuery paymentMethodName() {
        startField("paymentMethodName");

        return this;
    }

    public BasePaymentDetailsQuery onCardPaymentDetails(CardPaymentDetailsQueryDefinition queryDef) {
        startInlineFragment("CardPaymentDetails");
        queryDef.define(new CardPaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public BasePaymentDetailsQuery onLocalPaymentMethodsPaymentDetails(LocalPaymentMethodsPaymentDetailsQueryDefinition queryDef) {
        startInlineFragment("LocalPaymentMethodsPaymentDetails");
        queryDef.define(new LocalPaymentMethodsPaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public BasePaymentDetailsQuery onShopPayInstallmentsPaymentDetails(ShopPayInstallmentsPaymentDetailsQueryDefinition queryDef) {
        startInlineFragment("ShopPayInstallmentsPaymentDetails");
        queryDef.define(new ShopPayInstallmentsPaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

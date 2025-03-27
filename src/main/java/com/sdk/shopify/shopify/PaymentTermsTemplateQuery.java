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
* Represents the payment terms template object.
*/
public class PaymentTermsTemplateQuery extends Query<PaymentTermsTemplateQuery> {
    PaymentTermsTemplateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The description of the payment terms template.
    */
    public PaymentTermsTemplateQuery description() {
        startField("description");

        return this;
    }

    /**
    * The number of days between the issued date and due date if this is the net type of payment terms.
    */
    public PaymentTermsTemplateQuery dueInDays() {
        startField("dueInDays");

        return this;
    }

    /**
    * The name of the payment terms template.
    */
    public PaymentTermsTemplateQuery name() {
        startField("name");

        return this;
    }

    /**
    * The type of the payment terms template.
    */
    public PaymentTermsTemplateQuery paymentTermsType() {
        startField("paymentTermsType");

        return this;
    }

    /**
    * The translated payment terms template name.
    */
    public PaymentTermsTemplateQuery translatedName() {
        startField("translatedName");

        return this;
    }
}

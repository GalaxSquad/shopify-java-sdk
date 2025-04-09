// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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

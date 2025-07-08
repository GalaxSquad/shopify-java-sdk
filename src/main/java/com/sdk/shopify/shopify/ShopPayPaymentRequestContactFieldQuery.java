// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a contact field for a Shop Pay payment request.
*/
public class ShopPayPaymentRequestContactFieldQuery extends Query<ShopPayPaymentRequestContactFieldQuery> {
    ShopPayPaymentRequestContactFieldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The first address line of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The second address line of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery address2() {
        startField("address2");

        return this;
    }

    /**
    * The city of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery city() {
        startField("city");

        return this;
    }

    /**
    * The company name of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery companyName() {
        startField("companyName");

        return this;
    }

    /**
    * The country of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The email of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery email() {
        startField("email");

        return this;
    }

    /**
    * The first name of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery firstName() {
        startField("firstName");

        return this;
    }

    /**
    * The last name of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The phone number of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The postal code of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery postalCode() {
        startField("postalCode");

        return this;
    }

    /**
    * The province of the contact field.
    */
    public ShopPayPaymentRequestContactFieldQuery provinceCode() {
        startField("provinceCode");

        return this;
    }
}

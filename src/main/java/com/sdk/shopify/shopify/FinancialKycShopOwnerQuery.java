// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the shop owner information for financial KYC purposes.
*/
public class FinancialKycShopOwnerQuery extends Query<FinancialKycShopOwnerQuery> {
    FinancialKycShopOwnerQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The email of the shop owner.
    */
    public FinancialKycShopOwnerQuery email() {
        startField("email");

        return this;
    }

    /**
    * The first name of the shop owner.
    */
    public FinancialKycShopOwnerQuery firstName() {
        startField("firstName");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public FinancialKycShopOwnerQuery id() {
        startField("id");

        return this;
    }

    /**
    * The last name of the shop owner.
    */
    public FinancialKycShopOwnerQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The phone number of the shop owner.
    */
    public FinancialKycShopOwnerQuery phone() {
        startField("phone");

        return this;
    }
}

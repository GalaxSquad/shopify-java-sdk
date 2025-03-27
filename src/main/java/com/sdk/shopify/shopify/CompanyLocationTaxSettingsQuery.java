// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the tax settings for a company location.
*/
public class CompanyLocationTaxSettingsQuery extends Query<CompanyLocationTaxSettingsQuery> {
    CompanyLocationTaxSettingsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the location is exempt from taxes.
    */
    public CompanyLocationTaxSettingsQuery taxExempt() {
        startField("taxExempt");

        return this;
    }

    /**
    * The list of tax exemptions applied to the location.
    */
    public CompanyLocationTaxSettingsQuery taxExemptions() {
        startField("taxExemptions");

        return this;
    }

    /**
    * The tax registration ID for the company location.
    */
    public CompanyLocationTaxSettingsQuery taxRegistrationId() {
        startField("taxRegistrationId");

        return this;
    }
}

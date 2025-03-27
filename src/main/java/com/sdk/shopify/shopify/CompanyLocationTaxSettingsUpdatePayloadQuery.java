// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyLocationTaxSettingsUpdate` mutation.
*/
public class CompanyLocationTaxSettingsUpdatePayloadQuery extends Query<CompanyLocationTaxSettingsUpdatePayloadQuery> {
    CompanyLocationTaxSettingsUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The company location with the updated tax settings.
    */
    public CompanyLocationTaxSettingsUpdatePayloadQuery companyLocation(CompanyLocationQueryDefinition queryDef) {
        startField("companyLocation");

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyLocationTaxSettingsUpdatePayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

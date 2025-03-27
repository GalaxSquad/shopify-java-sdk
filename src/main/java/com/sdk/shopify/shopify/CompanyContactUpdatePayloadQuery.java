// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyContactUpdate` mutation.
*/
public class CompanyContactUpdatePayloadQuery extends Query<CompanyContactUpdatePayloadQuery> {
    CompanyContactUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated company contact.
    */
    public CompanyContactUpdatePayloadQuery companyContact(CompanyContactQueryDefinition queryDef) {
        startField("companyContact");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyContactUpdatePayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

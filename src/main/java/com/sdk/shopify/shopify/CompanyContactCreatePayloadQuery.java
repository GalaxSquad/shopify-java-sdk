// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyContactCreate` mutation.
*/
public class CompanyContactCreatePayloadQuery extends Query<CompanyContactCreatePayloadQuery> {
    CompanyContactCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created company contact.
    */
    public CompanyContactCreatePayloadQuery companyContact(CompanyContactQueryDefinition queryDef) {
        startField("companyContact");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyContactCreatePayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

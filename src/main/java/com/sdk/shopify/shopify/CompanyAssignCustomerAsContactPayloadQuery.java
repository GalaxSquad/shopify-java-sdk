// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `companyAssignCustomerAsContact` mutation.
*/
public class CompanyAssignCustomerAsContactPayloadQuery extends Query<CompanyAssignCustomerAsContactPayloadQuery> {
    CompanyAssignCustomerAsContactPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created company contact.
    */
    public CompanyAssignCustomerAsContactPayloadQuery companyContact(CompanyContactQueryDefinition queryDef) {
        startField("companyContact");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CompanyAssignCustomerAsContactPayloadQuery userErrors(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

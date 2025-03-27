// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerEmailMarketingConsentUpdate` mutation.
*/
public class CustomerEmailMarketingConsentUpdatePayloadQuery extends Query<CustomerEmailMarketingConsentUpdatePayloadQuery> {
    CustomerEmailMarketingConsentUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated customer.
    */
    public CustomerEmailMarketingConsentUpdatePayloadQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerEmailMarketingConsentUpdatePayloadQuery userErrors(CustomerEmailMarketingConsentUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerEmailMarketingConsentUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

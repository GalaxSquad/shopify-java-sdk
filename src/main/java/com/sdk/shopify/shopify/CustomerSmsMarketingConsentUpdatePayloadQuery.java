// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerSmsMarketingConsentUpdate` mutation.
*/
public class CustomerSmsMarketingConsentUpdatePayloadQuery extends Query<CustomerSmsMarketingConsentUpdatePayloadQuery> {
    CustomerSmsMarketingConsentUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated customer.
    */
    public CustomerSmsMarketingConsentUpdatePayloadQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerSmsMarketingConsentUpdatePayloadQuery userErrors(CustomerSmsMarketingConsentErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerSmsMarketingConsentErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

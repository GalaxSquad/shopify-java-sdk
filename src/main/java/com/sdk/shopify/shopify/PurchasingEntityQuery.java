// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents information about the purchasing entity for the order or draft order.
*/
public class PurchasingEntityQuery extends Query<PurchasingEntityQuery> {
    PurchasingEntityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PurchasingEntityQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PurchasingEntityQuery onPurchasingCompany(PurchasingCompanyQueryDefinition queryDef) {
        startInlineFragment("PurchasingCompany");
        queryDef.define(new PurchasingCompanyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

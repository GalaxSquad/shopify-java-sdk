// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents information about the purchasing company for the order or draft order.
*/
public class PurchasingCompanyQuery extends Query<PurchasingCompanyQuery> {
    PurchasingCompanyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The company associated to the order or draft order.
    */
    public PurchasingCompanyQuery company(CompanyQueryDefinition queryDef) {
        startField("company");

        _queryBuilder.append('{');
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The company contact associated to the order or draft order.
    */
    public PurchasingCompanyQuery contact(CompanyContactQueryDefinition queryDef) {
        startField("contact");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The company location associated to the order or draft order.
    */
    public PurchasingCompanyQuery location(CompanyLocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

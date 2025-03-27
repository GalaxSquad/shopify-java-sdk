// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The duty details for a line item.
*/
public class DutyQuery extends Query<DutyQuery> {
    DutyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The ISO 3166-1 alpha-2 country code of the country of origin used in calculating the duty.
    */
    public DutyQuery countryCodeOfOrigin() {
        startField("countryCodeOfOrigin");

        return this;
    }

    /**
    * The harmonized system code of the item used in calculating the duty.
    */
    public DutyQuery harmonizedSystemCode() {
        startField("harmonizedSystemCode");

        return this;
    }

    /**
    * The amount of the duty.
    */
    public DutyQuery price(MoneyBagQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of taxes charged on the duty.
    */
    public DutyQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

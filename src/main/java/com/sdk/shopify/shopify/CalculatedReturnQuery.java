// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A calculated return.
*/
public class CalculatedReturnQuery extends Query<CalculatedReturnQuery> {
    CalculatedReturnQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of calculated exchange line items.
    */
    public CalculatedReturnQuery exchangeLineItems(CalculatedExchangeLineItemQueryDefinition queryDef) {
        startField("exchangeLineItems");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedExchangeLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedReturnQuery id() {
        startField("id");

        return this;
    }

    /**
    * A list of calculated return line items.
    */
    public CalculatedReturnQuery returnLineItems(CalculatedReturnLineItemQueryDefinition queryDef) {
        startField("returnLineItems");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedReturnLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The calulated return shipping fee.
    */
    public CalculatedReturnQuery returnShippingFee(CalculatedReturnShippingFeeQueryDefinition queryDef) {
        startField("returnShippingFee");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedReturnShippingFeeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

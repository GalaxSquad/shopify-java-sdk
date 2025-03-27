// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a refunded duty.
*/
public class RefundDutyQuery extends Query<RefundDutyQuery> {
    RefundDutyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The amount of a refunded duty in shop and presentment currencies.
    */
    public RefundDutyQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The duty associated with this refunded duty.
    */
    public RefundDutyQuery originalDuty(DutyQueryDefinition queryDef) {
        startField("originalDuty");

        _queryBuilder.append('{');
        queryDef.define(new DutyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

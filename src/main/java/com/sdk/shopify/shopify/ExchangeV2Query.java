// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An exchange where existing items on an order are returned and new items are added to the order.
*/
public class ExchangeV2Query extends Query<ExchangeV2Query> {
    ExchangeV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The details of the new items in the exchange.
    */
    public ExchangeV2Query additions(ExchangeV2AdditionsQueryDefinition queryDef) {
        startField("additions");

        _queryBuilder.append('{');
        queryDef.define(new ExchangeV2AdditionsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the exchange was completed.
    */
    public ExchangeV2Query completedAt() {
        startField("completedAt");

        return this;
    }

    /**
    * The date and time when the exchange was created.
    */
    public ExchangeV2Query createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The location where the exchange happened.
    */
    public ExchangeV2Query location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The text of an optional note that a shop owner can attach to the exchange.
    */
    public ExchangeV2Query note() {
        startField("note");

        return this;
    }

    /**
    * The refunds processed during the exchange.
    */
    public ExchangeV2Query refunds(RefundQueryDefinition queryDef) {
        startField("refunds");

        _queryBuilder.append('{');
        queryDef.define(new RefundQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The details of the returned items in the exchange.
    */
    public ExchangeV2Query returns(ExchangeV2ReturnsQueryDefinition queryDef) {
        startField("returns");

        _queryBuilder.append('{');
        queryDef.define(new ExchangeV2ReturnsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The staff member associated with the exchange.
    */
    public ExchangeV2Query staffMember(StaffMemberQueryDefinition queryDef) {
        startField("staffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount of money that was paid or refunded as part of the exchange.
    */
    public ExchangeV2Query totalAmountProcessedSet(MoneyBagQueryDefinition queryDef) {
        startField("totalAmountProcessedSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The difference in values of the items that were exchanged.
    */
    public ExchangeV2Query totalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The order transactions related to the exchange.
    */
    public ExchangeV2Query transactions(OrderTransactionQueryDefinition queryDef) {
        startField("transactions");

        _queryBuilder.append('{');
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

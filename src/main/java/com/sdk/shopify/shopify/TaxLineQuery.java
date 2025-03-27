// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a single tax applied to the associated line item.
*/
public class TaxLineQuery extends Query<TaxLineQuery> {
    TaxLineQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the channel that submitted the tax line is liable for remitting. A value of null indicates
    * unknown liability for this tax line.
    */
    public TaxLineQuery channelLiable() {
        startField("channelLiable");

        return this;
    }

    /**
    * The amount of tax, in shop and presentment currencies, after discounts and before returns.
    */
    public TaxLineQuery priceSet(MoneyBagQueryDefinition queryDef) {
        startField("priceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The proportion of the line item price that the tax represents as a decimal.
    */
    public TaxLineQuery rate() {
        startField("rate");

        return this;
    }

    /**
    * The proportion of the line item price that the tax represents as a percentage.
    */
    public TaxLineQuery ratePercentage() {
        startField("ratePercentage");

        return this;
    }

    /**
    * The source of the tax.
    */
    public TaxLineQuery source() {
        startField("source");

        return this;
    }

    /**
    * The name of the tax.
    */
    public TaxLineQuery title() {
        startField("title");

        return this;
    }
}

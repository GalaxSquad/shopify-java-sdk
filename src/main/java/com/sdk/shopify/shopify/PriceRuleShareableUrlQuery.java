// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Shareable URL for the discount code associated with the price rule.
*/
public class PriceRuleShareableUrlQuery extends Query<PriceRuleShareableUrlQuery> {
    PriceRuleShareableUrlQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The image URL of the item (product or collection) to which the discount applies.
    */
    public PriceRuleShareableUrlQuery targetItemImage(ImageQueryDefinition queryDef) {
        startField("targetItemImage");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The type of page that's associated with the URL.
    */
    public PriceRuleShareableUrlQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The title of the page that's associated with the URL.
    */
    public PriceRuleShareableUrlQuery title() {
        startField("title");

        return this;
    }

    /**
    * The URL for the discount code.
    */
    public PriceRuleShareableUrlQuery url() {
        startField("url");

        return this;
    }
}

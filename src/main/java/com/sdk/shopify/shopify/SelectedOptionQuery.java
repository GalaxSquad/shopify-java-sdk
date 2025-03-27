// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Properties used by customers to select a product variant.
* Products can have multiple options, like different sizes or colors.
*/
public class SelectedOptionQuery extends Query<SelectedOptionQuery> {
    SelectedOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product option’s name.
    */
    public SelectedOptionQuery name() {
        startField("name");

        return this;
    }

    /**
    * The product option’s value object.
    */
    public SelectedOptionQuery optionValue(ProductOptionValueQueryDefinition queryDef) {
        startField("optionValue");

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product option’s value.
    */
    public SelectedOptionQuery value() {
        startField("value");

        return this;
    }
}

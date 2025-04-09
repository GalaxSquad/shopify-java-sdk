// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A Shopify product taxonomy measurement attribute.
*/
public class TaxonomyMeasurementAttributeQuery extends Query<TaxonomyMeasurementAttributeQuery> {
    TaxonomyMeasurementAttributeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The name of the product taxonomy attribute. For example, Color.
    */
    public TaxonomyMeasurementAttributeQuery name() {
        startField("name");

        return this;
    }

    /**
    * The product taxonomy attribute options.
    */
    public TaxonomyMeasurementAttributeQuery options(AttributeQueryDefinition queryDef) {
        startField("options");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

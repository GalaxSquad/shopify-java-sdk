// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A product taxonomy attribute interface.
*/
public class TaxonomyCategoryAttributeQuery extends Query<TaxonomyCategoryAttributeQuery> {
    TaxonomyCategoryAttributeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public TaxonomyCategoryAttributeQuery onTaxonomyAttribute(TaxonomyAttributeQueryDefinition queryDef) {
        startInlineFragment("TaxonomyAttribute");
        queryDef.define(new TaxonomyAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public TaxonomyCategoryAttributeQuery onTaxonomyChoiceListAttribute(TaxonomyChoiceListAttributeQueryDefinition queryDef) {
        startInlineFragment("TaxonomyChoiceListAttribute");
        queryDef.define(new TaxonomyChoiceListAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public TaxonomyCategoryAttributeQuery onTaxonomyMeasurementAttribute(TaxonomyMeasurementAttributeQueryDefinition queryDef) {
        startInlineFragment("TaxonomyMeasurementAttribute");
        queryDef.define(new TaxonomyMeasurementAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

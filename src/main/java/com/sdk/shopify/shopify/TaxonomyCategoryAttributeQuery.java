// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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

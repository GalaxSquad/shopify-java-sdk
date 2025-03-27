// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The filters used in segment queries associated with a shop.
*/
public class SegmentFilterQuery extends Query<SegmentFilterQuery> {
    SegmentFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The localized name of the filter.
    */
    public SegmentFilterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */
    public SegmentFilterQuery multiValue() {
        startField("multiValue");

        return this;
    }

    /**
    * The query name of the filter.
    */
    public SegmentFilterQuery queryName() {
        startField("queryName");

        return this;
    }

    public SegmentFilterQuery onSegmentAssociationFilter(SegmentAssociationFilterQueryDefinition queryDef) {
        startInlineFragment("SegmentAssociationFilter");
        queryDef.define(new SegmentAssociationFilterQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SegmentFilterQuery onSegmentBooleanFilter(SegmentBooleanFilterQueryDefinition queryDef) {
        startInlineFragment("SegmentBooleanFilter");
        queryDef.define(new SegmentBooleanFilterQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SegmentFilterQuery onSegmentDateFilter(SegmentDateFilterQueryDefinition queryDef) {
        startInlineFragment("SegmentDateFilter");
        queryDef.define(new SegmentDateFilterQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SegmentFilterQuery onSegmentEnumFilter(SegmentEnumFilterQueryDefinition queryDef) {
        startInlineFragment("SegmentEnumFilter");
        queryDef.define(new SegmentEnumFilterQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SegmentFilterQuery onSegmentEventFilter(SegmentEventFilterQueryDefinition queryDef) {
        startInlineFragment("SegmentEventFilter");
        queryDef.define(new SegmentEventFilterQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SegmentFilterQuery onSegmentFloatFilter(SegmentFloatFilterQueryDefinition queryDef) {
        startInlineFragment("SegmentFloatFilter");
        queryDef.define(new SegmentFloatFilterQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SegmentFilterQuery onSegmentIntegerFilter(SegmentIntegerFilterQueryDefinition queryDef) {
        startInlineFragment("SegmentIntegerFilter");
        queryDef.define(new SegmentIntegerFilterQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SegmentFilterQuery onSegmentStringFilter(SegmentStringFilterQueryDefinition queryDef) {
        startInlineFragment("SegmentStringFilter");
        queryDef.define(new SegmentStringFilterQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

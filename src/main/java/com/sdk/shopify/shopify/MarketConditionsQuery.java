// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The conditions that determine whether a visitor is in a market.
*/
public class MarketConditionsQuery extends Query<MarketConditionsQuery> {
    MarketConditionsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The company location conditions that determine whether a visitor is in the market.
    */
    public MarketConditionsQuery companyLocationsCondition(CompanyLocationsConditionQueryDefinition queryDef) {
        startField("companyLocationsCondition");

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationsConditionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The set of condition types that are defined for the market.
    */
    public MarketConditionsQuery conditionTypes() {
        startField("conditionTypes");

        return this;
    }

    /**
    * The retail location conditions that determine whether a visitor is in the market.
    */
    public MarketConditionsQuery locationsCondition(LocationsConditionQueryDefinition queryDef) {
        startField("locationsCondition");

        _queryBuilder.append('{');
        queryDef.define(new LocationsConditionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The region conditions that determine whether a visitor is in the market.
    */
    public MarketConditionsQuery regionsCondition(RegionsConditionQueryDefinition queryDef) {
        startField("regionsCondition");

        _queryBuilder.append('{');
        queryDef.define(new RegionsConditionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A risk fact belongs to a single risk assessment and serves to provide additional context for an
* assessment. Risk facts are not necessarily tied to the result of the recommendation.
*/
public class RiskFactQuery extends Query<RiskFactQuery> {
    RiskFactQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A description of the fact.
    */
    public RiskFactQuery description() {
        startField("description");

        return this;
    }

    /**
    * Indicates whether the fact is a negative, neutral or positive contributor with regards to risk.
    */
    public RiskFactQuery sentiment() {
        startField("sentiment");

        return this;
    }
}

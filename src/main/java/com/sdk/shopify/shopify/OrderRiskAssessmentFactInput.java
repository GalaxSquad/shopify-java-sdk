// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderRiskAssessmentFactInput implements Serializable {
    private RiskFactSentiment sentiment;

    private String description;

    public OrderRiskAssessmentFactInput(RiskFactSentiment sentiment, String description) {
        this.sentiment = sentiment;

        this.description = description;
    }

    public RiskFactSentiment getSentiment() {
        return sentiment;
    }

    public OrderRiskAssessmentFactInput setSentiment(RiskFactSentiment sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OrderRiskAssessmentFactInput setDescription(String description) {
        this.description = description;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("sentiment:");
        _queryBuilder.append(sentiment.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("description:");
        Query.appendQuotedString(_queryBuilder, description.toString());

        _queryBuilder.append('}');
    }
}

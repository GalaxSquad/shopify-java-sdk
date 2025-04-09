// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class AppUsagePricingInput implements Serializable {
    private MoneyInput cappedAmount;

    private String terms;

    public AppUsagePricingInput(MoneyInput cappedAmount, String terms) {
        this.cappedAmount = cappedAmount;

        this.terms = terms;
    }

    public MoneyInput getCappedAmount() {
        return cappedAmount;
    }

    public AppUsagePricingInput setCappedAmount(MoneyInput cappedAmount) {
        this.cappedAmount = cappedAmount;
        return this;
    }

    public String getTerms() {
        return terms;
    }

    public AppUsagePricingInput setTerms(String terms) {
        this.terms = terms;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cappedAmount:");
        cappedAmount.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("terms:");
        Query.appendQuotedString(_queryBuilder, terms.toString());

        _queryBuilder.append('}');
    }
}

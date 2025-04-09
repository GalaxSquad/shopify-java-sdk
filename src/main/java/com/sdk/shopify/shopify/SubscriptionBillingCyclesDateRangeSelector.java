// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SubscriptionBillingCyclesDateRangeSelector implements Serializable {
    private String startDate;

    private String endDate;

    public SubscriptionBillingCyclesDateRangeSelector(String startDate, String endDate) {
        this.startDate = startDate;

        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public SubscriptionBillingCyclesDateRangeSelector setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public SubscriptionBillingCyclesDateRangeSelector setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("startDate:");
        Query.appendQuotedString(_queryBuilder, startDate.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("endDate:");
        Query.appendQuotedString(_queryBuilder, endDate.toString());

        _queryBuilder.append('}');
    }
}

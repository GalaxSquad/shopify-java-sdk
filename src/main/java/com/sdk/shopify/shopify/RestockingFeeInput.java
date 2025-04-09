// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import java.io.Serializable;

public class RestockingFeeInput implements Serializable {
    private double percentage;

    public RestockingFeeInput(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public RestockingFeeInput setPercentage(double percentage) {
        this.percentage = percentage;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("percentage:");
        _queryBuilder.append(percentage);

        _queryBuilder.append('}');
    }
}

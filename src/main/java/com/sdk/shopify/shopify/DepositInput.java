// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;




import java.io.Serializable;

public class DepositInput implements Serializable {
    private double percentage;

    public DepositInput(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public DepositInput setPercentage(double percentage) {
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

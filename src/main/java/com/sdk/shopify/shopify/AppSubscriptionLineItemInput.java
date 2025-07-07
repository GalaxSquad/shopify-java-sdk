// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;




import java.io.Serializable;

public class AppSubscriptionLineItemInput implements Serializable {
    private AppPlanInput plan;

    public AppSubscriptionLineItemInput(AppPlanInput plan) {
        this.plan = plan;
    }

    public AppPlanInput getPlan() {
        return plan;
    }

    public AppSubscriptionLineItemInput setPlan(AppPlanInput plan) {
        this.plan = plan;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("plan:");
        plan.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}

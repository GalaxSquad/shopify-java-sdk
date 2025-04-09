// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class AppPlanInput implements Serializable {
    private Input<AppUsagePricingInput> appUsagePricingDetails = Input.undefined();

    private Input<AppRecurringPricingInput> appRecurringPricingDetails = Input.undefined();

    public AppUsagePricingInput getAppUsagePricingDetails() {
        return appUsagePricingDetails.getValue();
    }

    public Input<AppUsagePricingInput> getAppUsagePricingDetailsInput() {
        return appUsagePricingDetails;
    }

    public AppPlanInput setAppUsagePricingDetails(AppUsagePricingInput appUsagePricingDetails) {
        this.appUsagePricingDetails = Input.optional(appUsagePricingDetails);
        return this;
    }

    public AppPlanInput setAppUsagePricingDetailsInput(Input<AppUsagePricingInput> appUsagePricingDetails) {
        if (appUsagePricingDetails == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appUsagePricingDetails = appUsagePricingDetails;
        return this;
    }

    public AppRecurringPricingInput getAppRecurringPricingDetails() {
        return appRecurringPricingDetails.getValue();
    }

    public Input<AppRecurringPricingInput> getAppRecurringPricingDetailsInput() {
        return appRecurringPricingDetails;
    }

    public AppPlanInput setAppRecurringPricingDetails(AppRecurringPricingInput appRecurringPricingDetails) {
        this.appRecurringPricingDetails = Input.optional(appRecurringPricingDetails);
        return this;
    }

    public AppPlanInput setAppRecurringPricingDetailsInput(Input<AppRecurringPricingInput> appRecurringPricingDetails) {
        if (appRecurringPricingDetails == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appRecurringPricingDetails = appRecurringPricingDetails;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.appUsagePricingDetails.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appUsagePricingDetails:");
            if (appUsagePricingDetails.getValue() != null) {
                appUsagePricingDetails.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.appRecurringPricingDetails.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appRecurringPricingDetails:");
            if (appRecurringPricingDetails.getValue() != null) {
                appRecurringPricingDetails.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

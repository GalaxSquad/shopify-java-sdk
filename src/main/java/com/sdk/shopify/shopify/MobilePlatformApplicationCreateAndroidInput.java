// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MobilePlatformApplicationCreateAndroidInput implements Serializable {
    private List<String> sha256certFingerprints;

    private boolean appLinksEnabled;

    private Input<String> applicationId = Input.undefined();

    public MobilePlatformApplicationCreateAndroidInput(List<String> sha256certFingerprints, boolean appLinksEnabled) {
        this.sha256certFingerprints = sha256certFingerprints;

        this.appLinksEnabled = appLinksEnabled;
    }

    public List<String> getSha256certFingerprints() {
        return sha256certFingerprints;
    }

    public MobilePlatformApplicationCreateAndroidInput setSha256certFingerprints(List<String> sha256certFingerprints) {
        this.sha256certFingerprints = sha256certFingerprints;
        return this;
    }

    public boolean getAppLinksEnabled() {
        return appLinksEnabled;
    }

    public MobilePlatformApplicationCreateAndroidInput setAppLinksEnabled(boolean appLinksEnabled) {
        this.appLinksEnabled = appLinksEnabled;
        return this;
    }

    public String getApplicationId() {
        return applicationId.getValue();
    }

    public Input<String> getApplicationIdInput() {
        return applicationId;
    }

    public MobilePlatformApplicationCreateAndroidInput setApplicationId(String applicationId) {
        this.applicationId = Input.optional(applicationId);
        return this;
    }

    public MobilePlatformApplicationCreateAndroidInput setApplicationIdInput(Input<String> applicationId) {
        if (applicationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.applicationId = applicationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("sha256CertFingerprints:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : sha256certFingerprints) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("appLinksEnabled:");
        _queryBuilder.append(appLinksEnabled);

        if (this.applicationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("applicationId:");
            if (applicationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, applicationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

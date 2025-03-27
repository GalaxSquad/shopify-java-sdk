// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;
import java.util.List;

public class MobilePlatformApplicationUpdateAndroidInput implements Serializable {
    private Input<String> applicationId = Input.undefined();

    private Input<List<String>> sha256certFingerprints = Input.undefined();

    private Input<Boolean> appLinksEnabled = Input.undefined();

    public String getApplicationId() {
        return applicationId.getValue();
    }

    public Input<String> getApplicationIdInput() {
        return applicationId;
    }

    public MobilePlatformApplicationUpdateAndroidInput setApplicationId(String applicationId) {
        this.applicationId = Input.optional(applicationId);
        return this;
    }

    public MobilePlatformApplicationUpdateAndroidInput setApplicationIdInput(Input<String> applicationId) {
        if (applicationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.applicationId = applicationId;
        return this;
    }

    public List<String> getSha256certFingerprints() {
        return sha256certFingerprints.getValue();
    }

    public Input<List<String>> getSha256certFingerprintsInput() {
        return sha256certFingerprints;
    }

    public MobilePlatformApplicationUpdateAndroidInput setSha256certFingerprints(List<String> sha256certFingerprints) {
        this.sha256certFingerprints = Input.optional(sha256certFingerprints);
        return this;
    }

    public MobilePlatformApplicationUpdateAndroidInput setSha256certFingerprintsInput(Input<List<String>> sha256certFingerprints) {
        if (sha256certFingerprints == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sha256certFingerprints = sha256certFingerprints;
        return this;
    }

    public Boolean getAppLinksEnabled() {
        return appLinksEnabled.getValue();
    }

    public Input<Boolean> getAppLinksEnabledInput() {
        return appLinksEnabled;
    }

    public MobilePlatformApplicationUpdateAndroidInput setAppLinksEnabled(Boolean appLinksEnabled) {
        this.appLinksEnabled = Input.optional(appLinksEnabled);
        return this;
    }

    public MobilePlatformApplicationUpdateAndroidInput setAppLinksEnabledInput(Input<Boolean> appLinksEnabled) {
        if (appLinksEnabled == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appLinksEnabled = appLinksEnabled;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.sha256certFingerprints.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sha256CertFingerprints:");
            if (sha256certFingerprints.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : sha256certFingerprints.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.appLinksEnabled.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appLinksEnabled:");
            if (appLinksEnabled.getValue() != null) {
                _queryBuilder.append(appLinksEnabled.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

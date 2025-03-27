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

public class MobilePlatformApplicationCreateAppleInput implements Serializable {
    private boolean universalLinksEnabled;

    private boolean sharedWebCredentialsEnabled;

    private Input<String> appId = Input.undefined();

    private Input<Boolean> appClipsEnabled = Input.undefined();

    private Input<String> appClipApplicationId = Input.undefined();

    public MobilePlatformApplicationCreateAppleInput(boolean universalLinksEnabled, boolean sharedWebCredentialsEnabled) {
        this.universalLinksEnabled = universalLinksEnabled;

        this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
    }

    public boolean getUniversalLinksEnabled() {
        return universalLinksEnabled;
    }

    public MobilePlatformApplicationCreateAppleInput setUniversalLinksEnabled(boolean universalLinksEnabled) {
        this.universalLinksEnabled = universalLinksEnabled;
        return this;
    }

    public boolean getSharedWebCredentialsEnabled() {
        return sharedWebCredentialsEnabled;
    }

    public MobilePlatformApplicationCreateAppleInput setSharedWebCredentialsEnabled(boolean sharedWebCredentialsEnabled) {
        this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
        return this;
    }

    public String getAppId() {
        return appId.getValue();
    }

    public Input<String> getAppIdInput() {
        return appId;
    }

    public MobilePlatformApplicationCreateAppleInput setAppId(String appId) {
        this.appId = Input.optional(appId);
        return this;
    }

    public MobilePlatformApplicationCreateAppleInput setAppIdInput(Input<String> appId) {
        if (appId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appId = appId;
        return this;
    }

    public Boolean getAppClipsEnabled() {
        return appClipsEnabled.getValue();
    }

    public Input<Boolean> getAppClipsEnabledInput() {
        return appClipsEnabled;
    }

    public MobilePlatformApplicationCreateAppleInput setAppClipsEnabled(Boolean appClipsEnabled) {
        this.appClipsEnabled = Input.optional(appClipsEnabled);
        return this;
    }

    public MobilePlatformApplicationCreateAppleInput setAppClipsEnabledInput(Input<Boolean> appClipsEnabled) {
        if (appClipsEnabled == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appClipsEnabled = appClipsEnabled;
        return this;
    }

    public String getAppClipApplicationId() {
        return appClipApplicationId.getValue();
    }

    public Input<String> getAppClipApplicationIdInput() {
        return appClipApplicationId;
    }

    public MobilePlatformApplicationCreateAppleInput setAppClipApplicationId(String appClipApplicationId) {
        this.appClipApplicationId = Input.optional(appClipApplicationId);
        return this;
    }

    public MobilePlatformApplicationCreateAppleInput setAppClipApplicationIdInput(Input<String> appClipApplicationId) {
        if (appClipApplicationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appClipApplicationId = appClipApplicationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("universalLinksEnabled:");
        _queryBuilder.append(universalLinksEnabled);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("sharedWebCredentialsEnabled:");
        _queryBuilder.append(sharedWebCredentialsEnabled);

        if (this.appId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appId:");
            if (appId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, appId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.appClipsEnabled.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appClipsEnabled:");
            if (appClipsEnabled.getValue() != null) {
                _queryBuilder.append(appClipsEnabled.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.appClipApplicationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appClipApplicationId:");
            if (appClipApplicationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, appClipApplicationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

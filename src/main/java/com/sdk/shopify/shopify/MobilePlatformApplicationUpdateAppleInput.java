// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MobilePlatformApplicationUpdateAppleInput implements Serializable {
    private Input<String> appId = Input.undefined();

    private Input<Boolean> universalLinksEnabled = Input.undefined();

    private Input<Boolean> sharedWebCredentialsEnabled = Input.undefined();

    private Input<Boolean> appClipsEnabled = Input.undefined();

    private Input<String> appClipApplicationId = Input.undefined();

    public String getAppId() {
        return appId.getValue();
    }

    public Input<String> getAppIdInput() {
        return appId;
    }

    public MobilePlatformApplicationUpdateAppleInput setAppId(String appId) {
        this.appId = Input.optional(appId);
        return this;
    }

    public MobilePlatformApplicationUpdateAppleInput setAppIdInput(Input<String> appId) {
        if (appId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appId = appId;
        return this;
    }

    public Boolean getUniversalLinksEnabled() {
        return universalLinksEnabled.getValue();
    }

    public Input<Boolean> getUniversalLinksEnabledInput() {
        return universalLinksEnabled;
    }

    public MobilePlatformApplicationUpdateAppleInput setUniversalLinksEnabled(Boolean universalLinksEnabled) {
        this.universalLinksEnabled = Input.optional(universalLinksEnabled);
        return this;
    }

    public MobilePlatformApplicationUpdateAppleInput setUniversalLinksEnabledInput(Input<Boolean> universalLinksEnabled) {
        if (universalLinksEnabled == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.universalLinksEnabled = universalLinksEnabled;
        return this;
    }

    public Boolean getSharedWebCredentialsEnabled() {
        return sharedWebCredentialsEnabled.getValue();
    }

    public Input<Boolean> getSharedWebCredentialsEnabledInput() {
        return sharedWebCredentialsEnabled;
    }

    public MobilePlatformApplicationUpdateAppleInput setSharedWebCredentialsEnabled(Boolean sharedWebCredentialsEnabled) {
        this.sharedWebCredentialsEnabled = Input.optional(sharedWebCredentialsEnabled);
        return this;
    }

    public MobilePlatformApplicationUpdateAppleInput setSharedWebCredentialsEnabledInput(Input<Boolean> sharedWebCredentialsEnabled) {
        if (sharedWebCredentialsEnabled == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
        return this;
    }

    public Boolean getAppClipsEnabled() {
        return appClipsEnabled.getValue();
    }

    public Input<Boolean> getAppClipsEnabledInput() {
        return appClipsEnabled;
    }

    public MobilePlatformApplicationUpdateAppleInput setAppClipsEnabled(Boolean appClipsEnabled) {
        this.appClipsEnabled = Input.optional(appClipsEnabled);
        return this;
    }

    public MobilePlatformApplicationUpdateAppleInput setAppClipsEnabledInput(Input<Boolean> appClipsEnabled) {
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

    public MobilePlatformApplicationUpdateAppleInput setAppClipApplicationId(String appClipApplicationId) {
        this.appClipApplicationId = Input.optional(appClipApplicationId);
        return this;
    }

    public MobilePlatformApplicationUpdateAppleInput setAppClipApplicationIdInput(Input<String> appClipApplicationId) {
        if (appClipApplicationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appClipApplicationId = appClipApplicationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.universalLinksEnabled.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("universalLinksEnabled:");
            if (universalLinksEnabled.getValue() != null) {
                _queryBuilder.append(universalLinksEnabled.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sharedWebCredentialsEnabled.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sharedWebCredentialsEnabled:");
            if (sharedWebCredentialsEnabled.getValue() != null) {
                _queryBuilder.append(sharedWebCredentialsEnabled.getValue());
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

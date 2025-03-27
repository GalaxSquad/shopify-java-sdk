// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MobilePlatformApplicationCreateInput implements Serializable {
    private Input<MobilePlatformApplicationCreateAndroidInput> android = Input.undefined();

    private Input<MobilePlatformApplicationCreateAppleInput> apple = Input.undefined();

    public MobilePlatformApplicationCreateAndroidInput getAndroid() {
        return android.getValue();
    }

    public Input<MobilePlatformApplicationCreateAndroidInput> getAndroidInput() {
        return android;
    }

    public MobilePlatformApplicationCreateInput setAndroid(MobilePlatformApplicationCreateAndroidInput android) {
        this.android = Input.optional(android);
        return this;
    }

    public MobilePlatformApplicationCreateInput setAndroidInput(Input<MobilePlatformApplicationCreateAndroidInput> android) {
        if (android == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.android = android;
        return this;
    }

    public MobilePlatformApplicationCreateAppleInput getApple() {
        return apple.getValue();
    }

    public Input<MobilePlatformApplicationCreateAppleInput> getAppleInput() {
        return apple;
    }

    public MobilePlatformApplicationCreateInput setApple(MobilePlatformApplicationCreateAppleInput apple) {
        this.apple = Input.optional(apple);
        return this;
    }

    public MobilePlatformApplicationCreateInput setAppleInput(Input<MobilePlatformApplicationCreateAppleInput> apple) {
        if (apple == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.apple = apple;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.android.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("android:");
            if (android.getValue() != null) {
                android.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.apple.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("apple:");
            if (apple.getValue() != null) {
                apple.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

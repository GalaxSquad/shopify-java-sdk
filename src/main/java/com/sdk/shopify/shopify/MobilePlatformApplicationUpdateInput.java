// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MobilePlatformApplicationUpdateInput implements Serializable {
    private Input<MobilePlatformApplicationUpdateAndroidInput> android = Input.undefined();

    private Input<MobilePlatformApplicationUpdateAppleInput> apple = Input.undefined();

    public MobilePlatformApplicationUpdateAndroidInput getAndroid() {
        return android.getValue();
    }

    public Input<MobilePlatformApplicationUpdateAndroidInput> getAndroidInput() {
        return android;
    }

    public MobilePlatformApplicationUpdateInput setAndroid(MobilePlatformApplicationUpdateAndroidInput android) {
        this.android = Input.optional(android);
        return this;
    }

    public MobilePlatformApplicationUpdateInput setAndroidInput(Input<MobilePlatformApplicationUpdateAndroidInput> android) {
        if (android == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.android = android;
        return this;
    }

    public MobilePlatformApplicationUpdateAppleInput getApple() {
        return apple.getValue();
    }

    public Input<MobilePlatformApplicationUpdateAppleInput> getAppleInput() {
        return apple;
    }

    public MobilePlatformApplicationUpdateInput setApple(MobilePlatformApplicationUpdateAppleInput apple) {
        this.apple = Input.optional(apple);
        return this;
    }

    public MobilePlatformApplicationUpdateInput setAppleInput(Input<MobilePlatformApplicationUpdateAppleInput> apple) {
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

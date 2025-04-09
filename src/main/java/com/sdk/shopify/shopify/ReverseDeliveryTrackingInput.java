// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ReverseDeliveryTrackingInput implements Serializable {
    private Input<String> number = Input.undefined();

    private Input<String> url = Input.undefined();

    public String getNumber() {
        return number.getValue();
    }

    public Input<String> getNumberInput() {
        return number;
    }

    public ReverseDeliveryTrackingInput setNumber(String number) {
        this.number = Input.optional(number);
        return this;
    }

    public ReverseDeliveryTrackingInput setNumberInput(Input<String> number) {
        if (number == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.number = number;
        return this;
    }

    public String getUrl() {
        return url.getValue();
    }

    public Input<String> getUrlInput() {
        return url;
    }

    public ReverseDeliveryTrackingInput setUrl(String url) {
        this.url = Input.optional(url);
        return this;
    }

    public ReverseDeliveryTrackingInput setUrlInput(Input<String> url) {
        if (url == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.url = url;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.number.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("number:");
            if (number.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, number.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.url.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("url:");
            if (url.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, url.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

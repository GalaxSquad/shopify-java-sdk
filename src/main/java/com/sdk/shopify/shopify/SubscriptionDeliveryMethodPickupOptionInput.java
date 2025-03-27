// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SubscriptionDeliveryMethodPickupOptionInput implements Serializable {
    private ID locationId;

    private Input<String> title = Input.undefined();

    private Input<String> presentmentTitle = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> code = Input.undefined();

    public SubscriptionDeliveryMethodPickupOptionInput(ID locationId) {
        this.locationId = locationId;
    }

    public ID getLocationId() {
        return locationId;
    }

    public SubscriptionDeliveryMethodPickupOptionInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public SubscriptionDeliveryMethodPickupOptionInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public SubscriptionDeliveryMethodPickupOptionInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public String getPresentmentTitle() {
        return presentmentTitle.getValue();
    }

    public Input<String> getPresentmentTitleInput() {
        return presentmentTitle;
    }

    public SubscriptionDeliveryMethodPickupOptionInput setPresentmentTitle(String presentmentTitle) {
        this.presentmentTitle = Input.optional(presentmentTitle);
        return this;
    }

    public SubscriptionDeliveryMethodPickupOptionInput setPresentmentTitleInput(Input<String> presentmentTitle) {
        if (presentmentTitle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.presentmentTitle = presentmentTitle;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public SubscriptionDeliveryMethodPickupOptionInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public SubscriptionDeliveryMethodPickupOptionInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public String getCode() {
        return code.getValue();
    }

    public Input<String> getCodeInput() {
        return code;
    }

    public SubscriptionDeliveryMethodPickupOptionInput setCode(String code) {
        this.code = Input.optional(code);
        return this;
    }

    public SubscriptionDeliveryMethodPickupOptionInput setCodeInput(Input<String> code) {
        if (code == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.code = code;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.presentmentTitle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("presentmentTitle:");
            if (presentmentTitle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, presentmentTitle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.code.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("code:");
            if (code.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, code.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SubscriptionDeliveryMethodShippingOptionInput implements Serializable {
    private Input<String> title = Input.undefined();

    private Input<String> presentmentTitle = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> code = Input.undefined();

    private Input<ID> carrierServiceId = Input.undefined();

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public SubscriptionDeliveryMethodShippingOptionInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public SubscriptionDeliveryMethodShippingOptionInput setTitleInput(Input<String> title) {
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

    public SubscriptionDeliveryMethodShippingOptionInput setPresentmentTitle(String presentmentTitle) {
        this.presentmentTitle = Input.optional(presentmentTitle);
        return this;
    }

    public SubscriptionDeliveryMethodShippingOptionInput setPresentmentTitleInput(Input<String> presentmentTitle) {
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

    public SubscriptionDeliveryMethodShippingOptionInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public SubscriptionDeliveryMethodShippingOptionInput setDescriptionInput(Input<String> description) {
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

    public SubscriptionDeliveryMethodShippingOptionInput setCode(String code) {
        this.code = Input.optional(code);
        return this;
    }

    public SubscriptionDeliveryMethodShippingOptionInput setCodeInput(Input<String> code) {
        if (code == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.code = code;
        return this;
    }

    public ID getCarrierServiceId() {
        return carrierServiceId.getValue();
    }

    public Input<ID> getCarrierServiceIdInput() {
        return carrierServiceId;
    }

    public SubscriptionDeliveryMethodShippingOptionInput setCarrierServiceId(ID carrierServiceId) {
        this.carrierServiceId = Input.optional(carrierServiceId);
        return this;
    }

    public SubscriptionDeliveryMethodShippingOptionInput setCarrierServiceIdInput(Input<ID> carrierServiceId) {
        if (carrierServiceId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.carrierServiceId = carrierServiceId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.carrierServiceId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("carrierServiceId:");
            if (carrierServiceId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, carrierServiceId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

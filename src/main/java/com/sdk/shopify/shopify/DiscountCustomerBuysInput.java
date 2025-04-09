// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class DiscountCustomerBuysInput implements Serializable {
    private Input<DiscountCustomerBuysValueInput> value = Input.undefined();

    private Input<DiscountItemsInput> items = Input.undefined();

    private Input<Boolean> isOneTimePurchase = Input.undefined();

    private Input<Boolean> isSubscription = Input.undefined();

    public DiscountCustomerBuysValueInput getValue() {
        return value.getValue();
    }

    public Input<DiscountCustomerBuysValueInput> getValueInput() {
        return value;
    }

    public DiscountCustomerBuysInput setValue(DiscountCustomerBuysValueInput value) {
        this.value = Input.optional(value);
        return this;
    }

    public DiscountCustomerBuysInput setValueInput(Input<DiscountCustomerBuysValueInput> value) {
        if (value == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.value = value;
        return this;
    }

    public DiscountItemsInput getItems() {
        return items.getValue();
    }

    public Input<DiscountItemsInput> getItemsInput() {
        return items;
    }

    public DiscountCustomerBuysInput setItems(DiscountItemsInput items) {
        this.items = Input.optional(items);
        return this;
    }

    public DiscountCustomerBuysInput setItemsInput(Input<DiscountItemsInput> items) {
        if (items == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.items = items;
        return this;
    }

    public Boolean getIsOneTimePurchase() {
        return isOneTimePurchase.getValue();
    }

    public Input<Boolean> getIsOneTimePurchaseInput() {
        return isOneTimePurchase;
    }

    public DiscountCustomerBuysInput setIsOneTimePurchase(Boolean isOneTimePurchase) {
        this.isOneTimePurchase = Input.optional(isOneTimePurchase);
        return this;
    }

    public DiscountCustomerBuysInput setIsOneTimePurchaseInput(Input<Boolean> isOneTimePurchase) {
        if (isOneTimePurchase == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isOneTimePurchase = isOneTimePurchase;
        return this;
    }

    public Boolean getIsSubscription() {
        return isSubscription.getValue();
    }

    public Input<Boolean> getIsSubscriptionInput() {
        return isSubscription;
    }

    public DiscountCustomerBuysInput setIsSubscription(Boolean isSubscription) {
        this.isSubscription = Input.optional(isSubscription);
        return this;
    }

    public DiscountCustomerBuysInput setIsSubscriptionInput(Input<Boolean> isSubscription) {
        if (isSubscription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isSubscription = isSubscription;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.value.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("value:");
            if (value.getValue() != null) {
                value.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.items.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("items:");
            if (items.getValue() != null) {
                items.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.isOneTimePurchase.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isOneTimePurchase:");
            if (isOneTimePurchase.getValue() != null) {
                _queryBuilder.append(isOneTimePurchase.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.isSubscription.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isSubscription:");
            if (isSubscription.getValue() != null) {
                _queryBuilder.append(isSubscription.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

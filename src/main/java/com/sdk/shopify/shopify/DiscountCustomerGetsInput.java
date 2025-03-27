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

public class DiscountCustomerGetsInput implements Serializable {
    private Input<DiscountCustomerGetsValueInput> value = Input.undefined();

    private Input<DiscountItemsInput> items = Input.undefined();

    private Input<Boolean> appliesOnOneTimePurchase = Input.undefined();

    private Input<Boolean> appliesOnSubscription = Input.undefined();

    public DiscountCustomerGetsValueInput getValue() {
        return value.getValue();
    }

    public Input<DiscountCustomerGetsValueInput> getValueInput() {
        return value;
    }

    public DiscountCustomerGetsInput setValue(DiscountCustomerGetsValueInput value) {
        this.value = Input.optional(value);
        return this;
    }

    public DiscountCustomerGetsInput setValueInput(Input<DiscountCustomerGetsValueInput> value) {
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

    public DiscountCustomerGetsInput setItems(DiscountItemsInput items) {
        this.items = Input.optional(items);
        return this;
    }

    public DiscountCustomerGetsInput setItemsInput(Input<DiscountItemsInput> items) {
        if (items == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.items = items;
        return this;
    }

    public Boolean getAppliesOnOneTimePurchase() {
        return appliesOnOneTimePurchase.getValue();
    }

    public Input<Boolean> getAppliesOnOneTimePurchaseInput() {
        return appliesOnOneTimePurchase;
    }

    public DiscountCustomerGetsInput setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
        this.appliesOnOneTimePurchase = Input.optional(appliesOnOneTimePurchase);
        return this;
    }

    public DiscountCustomerGetsInput setAppliesOnOneTimePurchaseInput(Input<Boolean> appliesOnOneTimePurchase) {
        if (appliesOnOneTimePurchase == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
        return this;
    }

    public Boolean getAppliesOnSubscription() {
        return appliesOnSubscription.getValue();
    }

    public Input<Boolean> getAppliesOnSubscriptionInput() {
        return appliesOnSubscription;
    }

    public DiscountCustomerGetsInput setAppliesOnSubscription(Boolean appliesOnSubscription) {
        this.appliesOnSubscription = Input.optional(appliesOnSubscription);
        return this;
    }

    public DiscountCustomerGetsInput setAppliesOnSubscriptionInput(Input<Boolean> appliesOnSubscription) {
        if (appliesOnSubscription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliesOnSubscription = appliesOnSubscription;
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

        if (this.appliesOnOneTimePurchase.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appliesOnOneTimePurchase:");
            if (appliesOnOneTimePurchase.getValue() != null) {
                _queryBuilder.append(appliesOnOneTimePurchase.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.appliesOnSubscription.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appliesOnSubscription:");
            if (appliesOnSubscription.getValue() != null) {
                _queryBuilder.append(appliesOnSubscription.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

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

public class DiscountAutomaticBasicInput implements Serializable {
    private Input<DiscountCombinesWithInput> combinesWith = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<String> startsAt = Input.undefined();

    private Input<String> endsAt = Input.undefined();

    private Input<DiscountMinimumRequirementInput> minimumRequirement = Input.undefined();

    private Input<DiscountCustomerGetsInput> customerGets = Input.undefined();

    private Input<Integer> recurringCycleLimit = Input.undefined();

    public DiscountCombinesWithInput getCombinesWith() {
        return combinesWith.getValue();
    }

    public Input<DiscountCombinesWithInput> getCombinesWithInput() {
        return combinesWith;
    }

    public DiscountAutomaticBasicInput setCombinesWith(DiscountCombinesWithInput combinesWith) {
        this.combinesWith = Input.optional(combinesWith);
        return this;
    }

    public DiscountAutomaticBasicInput setCombinesWithInput(Input<DiscountCombinesWithInput> combinesWith) {
        if (combinesWith == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.combinesWith = combinesWith;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public DiscountAutomaticBasicInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public DiscountAutomaticBasicInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public String getStartsAt() {
        return startsAt.getValue();
    }

    public Input<String> getStartsAtInput() {
        return startsAt;
    }

    public DiscountAutomaticBasicInput setStartsAt(String startsAt) {
        this.startsAt = Input.optional(startsAt);
        return this;
    }

    public DiscountAutomaticBasicInput setStartsAtInput(Input<String> startsAt) {
        if (startsAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.startsAt = startsAt;
        return this;
    }

    public String getEndsAt() {
        return endsAt.getValue();
    }

    public Input<String> getEndsAtInput() {
        return endsAt;
    }

    public DiscountAutomaticBasicInput setEndsAt(String endsAt) {
        this.endsAt = Input.optional(endsAt);
        return this;
    }

    public DiscountAutomaticBasicInput setEndsAtInput(Input<String> endsAt) {
        if (endsAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.endsAt = endsAt;
        return this;
    }

    public DiscountMinimumRequirementInput getMinimumRequirement() {
        return minimumRequirement.getValue();
    }

    public Input<DiscountMinimumRequirementInput> getMinimumRequirementInput() {
        return minimumRequirement;
    }

    public DiscountAutomaticBasicInput setMinimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
        this.minimumRequirement = Input.optional(minimumRequirement);
        return this;
    }

    public DiscountAutomaticBasicInput setMinimumRequirementInput(Input<DiscountMinimumRequirementInput> minimumRequirement) {
        if (minimumRequirement == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.minimumRequirement = minimumRequirement;
        return this;
    }

    public DiscountCustomerGetsInput getCustomerGets() {
        return customerGets.getValue();
    }

    public Input<DiscountCustomerGetsInput> getCustomerGetsInput() {
        return customerGets;
    }

    public DiscountAutomaticBasicInput setCustomerGets(DiscountCustomerGetsInput customerGets) {
        this.customerGets = Input.optional(customerGets);
        return this;
    }

    public DiscountAutomaticBasicInput setCustomerGetsInput(Input<DiscountCustomerGetsInput> customerGets) {
        if (customerGets == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerGets = customerGets;
        return this;
    }

    public Integer getRecurringCycleLimit() {
        return recurringCycleLimit.getValue();
    }

    public Input<Integer> getRecurringCycleLimitInput() {
        return recurringCycleLimit;
    }

    public DiscountAutomaticBasicInput setRecurringCycleLimit(Integer recurringCycleLimit) {
        this.recurringCycleLimit = Input.optional(recurringCycleLimit);
        return this;
    }

    public DiscountAutomaticBasicInput setRecurringCycleLimitInput(Input<Integer> recurringCycleLimit) {
        if (recurringCycleLimit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recurringCycleLimit = recurringCycleLimit;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.combinesWith.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("combinesWith:");
            if (combinesWith.getValue() != null) {
                combinesWith.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.startsAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("startsAt:");
            if (startsAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, startsAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.endsAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("endsAt:");
            if (endsAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, endsAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.minimumRequirement.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("minimumRequirement:");
            if (minimumRequirement.getValue() != null) {
                minimumRequirement.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerGets.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerGets:");
            if (customerGets.getValue() != null) {
                customerGets.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.recurringCycleLimit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("recurringCycleLimit:");
            if (recurringCycleLimit.getValue() != null) {
                _queryBuilder.append(recurringCycleLimit.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

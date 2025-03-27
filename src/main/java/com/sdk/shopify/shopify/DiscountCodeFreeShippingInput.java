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

import java.math.BigDecimal;

import java.io.Serializable;

public class DiscountCodeFreeShippingInput implements Serializable {
    private Input<DiscountCombinesWithInput> combinesWith = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<String> startsAt = Input.undefined();

    private Input<String> endsAt = Input.undefined();

    private Input<Boolean> appliesOncePerCustomer = Input.undefined();

    private Input<String> code = Input.undefined();

    private Input<DiscountCustomerSelectionInput> customerSelection = Input.undefined();

    private Input<Integer> usageLimit = Input.undefined();

    private Input<DiscountMinimumRequirementInput> minimumRequirement = Input.undefined();

    private Input<DiscountShippingDestinationSelectionInput> destination = Input.undefined();

    private Input<BigDecimal> maximumShippingPrice = Input.undefined();

    private Input<Integer> recurringCycleLimit = Input.undefined();

    private Input<Boolean> appliesOnOneTimePurchase = Input.undefined();

    private Input<Boolean> appliesOnSubscription = Input.undefined();

    public DiscountCombinesWithInput getCombinesWith() {
        return combinesWith.getValue();
    }

    public Input<DiscountCombinesWithInput> getCombinesWithInput() {
        return combinesWith;
    }

    public DiscountCodeFreeShippingInput setCombinesWith(DiscountCombinesWithInput combinesWith) {
        this.combinesWith = Input.optional(combinesWith);
        return this;
    }

    public DiscountCodeFreeShippingInput setCombinesWithInput(Input<DiscountCombinesWithInput> combinesWith) {
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

    public DiscountCodeFreeShippingInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public DiscountCodeFreeShippingInput setTitleInput(Input<String> title) {
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

    public DiscountCodeFreeShippingInput setStartsAt(String startsAt) {
        this.startsAt = Input.optional(startsAt);
        return this;
    }

    public DiscountCodeFreeShippingInput setStartsAtInput(Input<String> startsAt) {
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

    public DiscountCodeFreeShippingInput setEndsAt(String endsAt) {
        this.endsAt = Input.optional(endsAt);
        return this;
    }

    public DiscountCodeFreeShippingInput setEndsAtInput(Input<String> endsAt) {
        if (endsAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.endsAt = endsAt;
        return this;
    }

    public Boolean getAppliesOncePerCustomer() {
        return appliesOncePerCustomer.getValue();
    }

    public Input<Boolean> getAppliesOncePerCustomerInput() {
        return appliesOncePerCustomer;
    }

    public DiscountCodeFreeShippingInput setAppliesOncePerCustomer(Boolean appliesOncePerCustomer) {
        this.appliesOncePerCustomer = Input.optional(appliesOncePerCustomer);
        return this;
    }

    public DiscountCodeFreeShippingInput setAppliesOncePerCustomerInput(Input<Boolean> appliesOncePerCustomer) {
        if (appliesOncePerCustomer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliesOncePerCustomer = appliesOncePerCustomer;
        return this;
    }

    public String getCode() {
        return code.getValue();
    }

    public Input<String> getCodeInput() {
        return code;
    }

    public DiscountCodeFreeShippingInput setCode(String code) {
        this.code = Input.optional(code);
        return this;
    }

    public DiscountCodeFreeShippingInput setCodeInput(Input<String> code) {
        if (code == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.code = code;
        return this;
    }

    public DiscountCustomerSelectionInput getCustomerSelection() {
        return customerSelection.getValue();
    }

    public Input<DiscountCustomerSelectionInput> getCustomerSelectionInput() {
        return customerSelection;
    }

    public DiscountCodeFreeShippingInput setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
        this.customerSelection = Input.optional(customerSelection);
        return this;
    }

    public DiscountCodeFreeShippingInput setCustomerSelectionInput(Input<DiscountCustomerSelectionInput> customerSelection) {
        if (customerSelection == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerSelection = customerSelection;
        return this;
    }

    public Integer getUsageLimit() {
        return usageLimit.getValue();
    }

    public Input<Integer> getUsageLimitInput() {
        return usageLimit;
    }

    public DiscountCodeFreeShippingInput setUsageLimit(Integer usageLimit) {
        this.usageLimit = Input.optional(usageLimit);
        return this;
    }

    public DiscountCodeFreeShippingInput setUsageLimitInput(Input<Integer> usageLimit) {
        if (usageLimit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.usageLimit = usageLimit;
        return this;
    }

    public DiscountMinimumRequirementInput getMinimumRequirement() {
        return minimumRequirement.getValue();
    }

    public Input<DiscountMinimumRequirementInput> getMinimumRequirementInput() {
        return minimumRequirement;
    }

    public DiscountCodeFreeShippingInput setMinimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
        this.minimumRequirement = Input.optional(minimumRequirement);
        return this;
    }

    public DiscountCodeFreeShippingInput setMinimumRequirementInput(Input<DiscountMinimumRequirementInput> minimumRequirement) {
        if (minimumRequirement == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.minimumRequirement = minimumRequirement;
        return this;
    }

    public DiscountShippingDestinationSelectionInput getDestination() {
        return destination.getValue();
    }

    public Input<DiscountShippingDestinationSelectionInput> getDestinationInput() {
        return destination;
    }

    public DiscountCodeFreeShippingInput setDestination(DiscountShippingDestinationSelectionInput destination) {
        this.destination = Input.optional(destination);
        return this;
    }

    public DiscountCodeFreeShippingInput setDestinationInput(Input<DiscountShippingDestinationSelectionInput> destination) {
        if (destination == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.destination = destination;
        return this;
    }

    public BigDecimal getMaximumShippingPrice() {
        return maximumShippingPrice.getValue();
    }

    public Input<BigDecimal> getMaximumShippingPriceInput() {
        return maximumShippingPrice;
    }

    public DiscountCodeFreeShippingInput setMaximumShippingPrice(BigDecimal maximumShippingPrice) {
        this.maximumShippingPrice = Input.optional(maximumShippingPrice);
        return this;
    }

    public DiscountCodeFreeShippingInput setMaximumShippingPriceInput(Input<BigDecimal> maximumShippingPrice) {
        if (maximumShippingPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.maximumShippingPrice = maximumShippingPrice;
        return this;
    }

    public Integer getRecurringCycleLimit() {
        return recurringCycleLimit.getValue();
    }

    public Input<Integer> getRecurringCycleLimitInput() {
        return recurringCycleLimit;
    }

    public DiscountCodeFreeShippingInput setRecurringCycleLimit(Integer recurringCycleLimit) {
        this.recurringCycleLimit = Input.optional(recurringCycleLimit);
        return this;
    }

    public DiscountCodeFreeShippingInput setRecurringCycleLimitInput(Input<Integer> recurringCycleLimit) {
        if (recurringCycleLimit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recurringCycleLimit = recurringCycleLimit;
        return this;
    }

    public Boolean getAppliesOnOneTimePurchase() {
        return appliesOnOneTimePurchase.getValue();
    }

    public Input<Boolean> getAppliesOnOneTimePurchaseInput() {
        return appliesOnOneTimePurchase;
    }

    public DiscountCodeFreeShippingInput setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
        this.appliesOnOneTimePurchase = Input.optional(appliesOnOneTimePurchase);
        return this;
    }

    public DiscountCodeFreeShippingInput setAppliesOnOneTimePurchaseInput(Input<Boolean> appliesOnOneTimePurchase) {
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

    public DiscountCodeFreeShippingInput setAppliesOnSubscription(Boolean appliesOnSubscription) {
        this.appliesOnSubscription = Input.optional(appliesOnSubscription);
        return this;
    }

    public DiscountCodeFreeShippingInput setAppliesOnSubscriptionInput(Input<Boolean> appliesOnSubscription) {
        if (appliesOnSubscription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliesOnSubscription = appliesOnSubscription;
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

        if (this.appliesOncePerCustomer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appliesOncePerCustomer:");
            if (appliesOncePerCustomer.getValue() != null) {
                _queryBuilder.append(appliesOncePerCustomer.getValue());
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

        if (this.customerSelection.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerSelection:");
            if (customerSelection.getValue() != null) {
                customerSelection.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.usageLimit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("usageLimit:");
            if (usageLimit.getValue() != null) {
                _queryBuilder.append(usageLimit.getValue());
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

        if (this.destination.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("destination:");
            if (destination.getValue() != null) {
                destination.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.maximumShippingPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("maximumShippingPrice:");
            if (maximumShippingPrice.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, maximumShippingPrice.getValue().toString());
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

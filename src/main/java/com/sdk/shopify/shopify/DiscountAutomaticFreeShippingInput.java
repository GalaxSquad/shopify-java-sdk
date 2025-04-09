// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;

public class DiscountAutomaticFreeShippingInput implements Serializable {
    private Input<String> title = Input.undefined();

    private Input<String> startsAt = Input.undefined();

    private Input<String> endsAt = Input.undefined();

    private Input<DiscountCombinesWithInput> combinesWith = Input.undefined();

    private Input<DiscountMinimumRequirementInput> minimumRequirement = Input.undefined();

    private Input<DiscountShippingDestinationSelectionInput> destination = Input.undefined();

    private Input<BigDecimal> maximumShippingPrice = Input.undefined();

    private Input<Boolean> appliesOnOneTimePurchase = Input.undefined();

    private Input<Boolean> appliesOnSubscription = Input.undefined();

    private Input<Integer> recurringCycleLimit = Input.undefined();

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public DiscountAutomaticFreeShippingInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public DiscountAutomaticFreeShippingInput setTitleInput(Input<String> title) {
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

    public DiscountAutomaticFreeShippingInput setStartsAt(String startsAt) {
        this.startsAt = Input.optional(startsAt);
        return this;
    }

    public DiscountAutomaticFreeShippingInput setStartsAtInput(Input<String> startsAt) {
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

    public DiscountAutomaticFreeShippingInput setEndsAt(String endsAt) {
        this.endsAt = Input.optional(endsAt);
        return this;
    }

    public DiscountAutomaticFreeShippingInput setEndsAtInput(Input<String> endsAt) {
        if (endsAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.endsAt = endsAt;
        return this;
    }

    public DiscountCombinesWithInput getCombinesWith() {
        return combinesWith.getValue();
    }

    public Input<DiscountCombinesWithInput> getCombinesWithInput() {
        return combinesWith;
    }

    public DiscountAutomaticFreeShippingInput setCombinesWith(DiscountCombinesWithInput combinesWith) {
        this.combinesWith = Input.optional(combinesWith);
        return this;
    }

    public DiscountAutomaticFreeShippingInput setCombinesWithInput(Input<DiscountCombinesWithInput> combinesWith) {
        if (combinesWith == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.combinesWith = combinesWith;
        return this;
    }

    public DiscountMinimumRequirementInput getMinimumRequirement() {
        return minimumRequirement.getValue();
    }

    public Input<DiscountMinimumRequirementInput> getMinimumRequirementInput() {
        return minimumRequirement;
    }

    public DiscountAutomaticFreeShippingInput setMinimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
        this.minimumRequirement = Input.optional(minimumRequirement);
        return this;
    }

    public DiscountAutomaticFreeShippingInput setMinimumRequirementInput(Input<DiscountMinimumRequirementInput> minimumRequirement) {
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

    public DiscountAutomaticFreeShippingInput setDestination(DiscountShippingDestinationSelectionInput destination) {
        this.destination = Input.optional(destination);
        return this;
    }

    public DiscountAutomaticFreeShippingInput setDestinationInput(Input<DiscountShippingDestinationSelectionInput> destination) {
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

    public DiscountAutomaticFreeShippingInput setMaximumShippingPrice(BigDecimal maximumShippingPrice) {
        this.maximumShippingPrice = Input.optional(maximumShippingPrice);
        return this;
    }

    public DiscountAutomaticFreeShippingInput setMaximumShippingPriceInput(Input<BigDecimal> maximumShippingPrice) {
        if (maximumShippingPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.maximumShippingPrice = maximumShippingPrice;
        return this;
    }

    public Boolean getAppliesOnOneTimePurchase() {
        return appliesOnOneTimePurchase.getValue();
    }

    public Input<Boolean> getAppliesOnOneTimePurchaseInput() {
        return appliesOnOneTimePurchase;
    }

    public DiscountAutomaticFreeShippingInput setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
        this.appliesOnOneTimePurchase = Input.optional(appliesOnOneTimePurchase);
        return this;
    }

    public DiscountAutomaticFreeShippingInput setAppliesOnOneTimePurchaseInput(Input<Boolean> appliesOnOneTimePurchase) {
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

    public DiscountAutomaticFreeShippingInput setAppliesOnSubscription(Boolean appliesOnSubscription) {
        this.appliesOnSubscription = Input.optional(appliesOnSubscription);
        return this;
    }

    public DiscountAutomaticFreeShippingInput setAppliesOnSubscriptionInput(Input<Boolean> appliesOnSubscription) {
        if (appliesOnSubscription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliesOnSubscription = appliesOnSubscription;
        return this;
    }

    public Integer getRecurringCycleLimit() {
        return recurringCycleLimit.getValue();
    }

    public Input<Integer> getRecurringCycleLimitInput() {
        return recurringCycleLimit;
    }

    public DiscountAutomaticFreeShippingInput setRecurringCycleLimit(Integer recurringCycleLimit) {
        this.recurringCycleLimit = Input.optional(recurringCycleLimit);
        return this;
    }

    public DiscountAutomaticFreeShippingInput setRecurringCycleLimitInput(Input<Integer> recurringCycleLimit) {
        if (recurringCycleLimit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recurringCycleLimit = recurringCycleLimit;
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

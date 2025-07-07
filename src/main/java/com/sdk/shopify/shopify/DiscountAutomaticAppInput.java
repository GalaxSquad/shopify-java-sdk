// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class DiscountAutomaticAppInput implements Serializable {
    private Input<DiscountCombinesWithInput> combinesWith = Input.undefined();

    private Input<List<DiscountClass>> discountClasses = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<String> startsAt = Input.undefined();

    private Input<String> endsAt = Input.undefined();

    private Input<String> functionId = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<Boolean> appliesOnSubscription = Input.undefined();

    private Input<Boolean> appliesOnOneTimePurchase = Input.undefined();

    private Input<Integer> recurringCycleLimit = Input.undefined();

    public DiscountCombinesWithInput getCombinesWith() {
        return combinesWith.getValue();
    }

    public Input<DiscountCombinesWithInput> getCombinesWithInput() {
        return combinesWith;
    }

    public DiscountAutomaticAppInput setCombinesWith(DiscountCombinesWithInput combinesWith) {
        this.combinesWith = Input.optional(combinesWith);
        return this;
    }

    public DiscountAutomaticAppInput setCombinesWithInput(Input<DiscountCombinesWithInput> combinesWith) {
        if (combinesWith == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.combinesWith = combinesWith;
        return this;
    }

    public List<DiscountClass> getDiscountClasses() {
        return discountClasses.getValue();
    }

    public Input<List<DiscountClass>> getDiscountClassesInput() {
        return discountClasses;
    }

    public DiscountAutomaticAppInput setDiscountClasses(List<DiscountClass> discountClasses) {
        this.discountClasses = Input.optional(discountClasses);
        return this;
    }

    public DiscountAutomaticAppInput setDiscountClassesInput(Input<List<DiscountClass>> discountClasses) {
        if (discountClasses == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.discountClasses = discountClasses;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public DiscountAutomaticAppInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public DiscountAutomaticAppInput setTitleInput(Input<String> title) {
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

    public DiscountAutomaticAppInput setStartsAt(String startsAt) {
        this.startsAt = Input.optional(startsAt);
        return this;
    }

    public DiscountAutomaticAppInput setStartsAtInput(Input<String> startsAt) {
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

    public DiscountAutomaticAppInput setEndsAt(String endsAt) {
        this.endsAt = Input.optional(endsAt);
        return this;
    }

    public DiscountAutomaticAppInput setEndsAtInput(Input<String> endsAt) {
        if (endsAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.endsAt = endsAt;
        return this;
    }

    public String getFunctionId() {
        return functionId.getValue();
    }

    public Input<String> getFunctionIdInput() {
        return functionId;
    }

    public DiscountAutomaticAppInput setFunctionId(String functionId) {
        this.functionId = Input.optional(functionId);
        return this;
    }

    public DiscountAutomaticAppInput setFunctionIdInput(Input<String> functionId) {
        if (functionId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.functionId = functionId;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public DiscountAutomaticAppInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public DiscountAutomaticAppInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public Boolean getAppliesOnSubscription() {
        return appliesOnSubscription.getValue();
    }

    public Input<Boolean> getAppliesOnSubscriptionInput() {
        return appliesOnSubscription;
    }

    public DiscountAutomaticAppInput setAppliesOnSubscription(Boolean appliesOnSubscription) {
        this.appliesOnSubscription = Input.optional(appliesOnSubscription);
        return this;
    }

    public DiscountAutomaticAppInput setAppliesOnSubscriptionInput(Input<Boolean> appliesOnSubscription) {
        if (appliesOnSubscription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliesOnSubscription = appliesOnSubscription;
        return this;
    }

    public Boolean getAppliesOnOneTimePurchase() {
        return appliesOnOneTimePurchase.getValue();
    }

    public Input<Boolean> getAppliesOnOneTimePurchaseInput() {
        return appliesOnOneTimePurchase;
    }

    public DiscountAutomaticAppInput setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
        this.appliesOnOneTimePurchase = Input.optional(appliesOnOneTimePurchase);
        return this;
    }

    public DiscountAutomaticAppInput setAppliesOnOneTimePurchaseInput(Input<Boolean> appliesOnOneTimePurchase) {
        if (appliesOnOneTimePurchase == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
        return this;
    }

    public Integer getRecurringCycleLimit() {
        return recurringCycleLimit.getValue();
    }

    public Input<Integer> getRecurringCycleLimitInput() {
        return recurringCycleLimit;
    }

    public DiscountAutomaticAppInput setRecurringCycleLimit(Integer recurringCycleLimit) {
        this.recurringCycleLimit = Input.optional(recurringCycleLimit);
        return this;
    }

    public DiscountAutomaticAppInput setRecurringCycleLimitInput(Input<Integer> recurringCycleLimit) {
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

        if (this.discountClasses.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("discountClasses:");
            if (discountClasses.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DiscountClass item1 : discountClasses.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
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

        if (this.functionId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("functionId:");
            if (functionId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, functionId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : metafields.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
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

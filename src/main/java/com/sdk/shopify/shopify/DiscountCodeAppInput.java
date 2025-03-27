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
import java.util.List;

public class DiscountCodeAppInput implements Serializable {
    private Input<DiscountCombinesWithInput> combinesWith = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<String> startsAt = Input.undefined();

    private Input<String> endsAt = Input.undefined();

    private Input<Boolean> appliesOncePerCustomer = Input.undefined();

    private Input<String> code = Input.undefined();

    private Input<DiscountCustomerSelectionInput> customerSelection = Input.undefined();

    private Input<Integer> usageLimit = Input.undefined();

    private Input<String> functionId = Input.undefined();

    private Input<Boolean> appliesOnSubscription = Input.undefined();

    private Input<Boolean> appliesOnOneTimePurchase = Input.undefined();

    private Input<Integer> recurringCycleLimit = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    public DiscountCombinesWithInput getCombinesWith() {
        return combinesWith.getValue();
    }

    public Input<DiscountCombinesWithInput> getCombinesWithInput() {
        return combinesWith;
    }

    public DiscountCodeAppInput setCombinesWith(DiscountCombinesWithInput combinesWith) {
        this.combinesWith = Input.optional(combinesWith);
        return this;
    }

    public DiscountCodeAppInput setCombinesWithInput(Input<DiscountCombinesWithInput> combinesWith) {
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

    public DiscountCodeAppInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public DiscountCodeAppInput setTitleInput(Input<String> title) {
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

    public DiscountCodeAppInput setStartsAt(String startsAt) {
        this.startsAt = Input.optional(startsAt);
        return this;
    }

    public DiscountCodeAppInput setStartsAtInput(Input<String> startsAt) {
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

    public DiscountCodeAppInput setEndsAt(String endsAt) {
        this.endsAt = Input.optional(endsAt);
        return this;
    }

    public DiscountCodeAppInput setEndsAtInput(Input<String> endsAt) {
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

    public DiscountCodeAppInput setAppliesOncePerCustomer(Boolean appliesOncePerCustomer) {
        this.appliesOncePerCustomer = Input.optional(appliesOncePerCustomer);
        return this;
    }

    public DiscountCodeAppInput setAppliesOncePerCustomerInput(Input<Boolean> appliesOncePerCustomer) {
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

    public DiscountCodeAppInput setCode(String code) {
        this.code = Input.optional(code);
        return this;
    }

    public DiscountCodeAppInput setCodeInput(Input<String> code) {
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

    public DiscountCodeAppInput setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
        this.customerSelection = Input.optional(customerSelection);
        return this;
    }

    public DiscountCodeAppInput setCustomerSelectionInput(Input<DiscountCustomerSelectionInput> customerSelection) {
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

    public DiscountCodeAppInput setUsageLimit(Integer usageLimit) {
        this.usageLimit = Input.optional(usageLimit);
        return this;
    }

    public DiscountCodeAppInput setUsageLimitInput(Input<Integer> usageLimit) {
        if (usageLimit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.usageLimit = usageLimit;
        return this;
    }

    public String getFunctionId() {
        return functionId.getValue();
    }

    public Input<String> getFunctionIdInput() {
        return functionId;
    }

    public DiscountCodeAppInput setFunctionId(String functionId) {
        this.functionId = Input.optional(functionId);
        return this;
    }

    public DiscountCodeAppInput setFunctionIdInput(Input<String> functionId) {
        if (functionId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.functionId = functionId;
        return this;
    }

    public Boolean getAppliesOnSubscription() {
        return appliesOnSubscription.getValue();
    }

    public Input<Boolean> getAppliesOnSubscriptionInput() {
        return appliesOnSubscription;
    }

    public DiscountCodeAppInput setAppliesOnSubscription(Boolean appliesOnSubscription) {
        this.appliesOnSubscription = Input.optional(appliesOnSubscription);
        return this;
    }

    public DiscountCodeAppInput setAppliesOnSubscriptionInput(Input<Boolean> appliesOnSubscription) {
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

    public DiscountCodeAppInput setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
        this.appliesOnOneTimePurchase = Input.optional(appliesOnOneTimePurchase);
        return this;
    }

    public DiscountCodeAppInput setAppliesOnOneTimePurchaseInput(Input<Boolean> appliesOnOneTimePurchase) {
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

    public DiscountCodeAppInput setRecurringCycleLimit(Integer recurringCycleLimit) {
        this.recurringCycleLimit = Input.optional(recurringCycleLimit);
        return this;
    }

    public DiscountCodeAppInput setRecurringCycleLimitInput(Input<Integer> recurringCycleLimit) {
        if (recurringCycleLimit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recurringCycleLimit = recurringCycleLimit;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public DiscountCodeAppInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public DiscountCodeAppInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
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

        _queryBuilder.append('}');
    }
}

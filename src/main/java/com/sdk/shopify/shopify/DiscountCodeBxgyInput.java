// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DiscountCodeBxgyInput implements Serializable {
    private Input<DiscountCombinesWithInput> combinesWith = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<String> startsAt = Input.undefined();

    private Input<String> endsAt = Input.undefined();

    private Input<Boolean> appliesOncePerCustomer = Input.undefined();

    private Input<String> code = Input.undefined();

    private Input<DiscountCustomerSelectionInput> customerSelection = Input.undefined();

    private Input<Integer> usageLimit = Input.undefined();

    private Input<DiscountCustomerBuysInput> customerBuys = Input.undefined();

    private Input<DiscountCustomerGetsInput> customerGets = Input.undefined();

    private Input<Integer> usesPerOrderLimit = Input.undefined();

    public DiscountCombinesWithInput getCombinesWith() {
        return combinesWith.getValue();
    }

    public Input<DiscountCombinesWithInput> getCombinesWithInput() {
        return combinesWith;
    }

    public DiscountCodeBxgyInput setCombinesWith(DiscountCombinesWithInput combinesWith) {
        this.combinesWith = Input.optional(combinesWith);
        return this;
    }

    public DiscountCodeBxgyInput setCombinesWithInput(Input<DiscountCombinesWithInput> combinesWith) {
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

    public DiscountCodeBxgyInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public DiscountCodeBxgyInput setTitleInput(Input<String> title) {
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

    public DiscountCodeBxgyInput setStartsAt(String startsAt) {
        this.startsAt = Input.optional(startsAt);
        return this;
    }

    public DiscountCodeBxgyInput setStartsAtInput(Input<String> startsAt) {
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

    public DiscountCodeBxgyInput setEndsAt(String endsAt) {
        this.endsAt = Input.optional(endsAt);
        return this;
    }

    public DiscountCodeBxgyInput setEndsAtInput(Input<String> endsAt) {
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

    public DiscountCodeBxgyInput setAppliesOncePerCustomer(Boolean appliesOncePerCustomer) {
        this.appliesOncePerCustomer = Input.optional(appliesOncePerCustomer);
        return this;
    }

    public DiscountCodeBxgyInput setAppliesOncePerCustomerInput(Input<Boolean> appliesOncePerCustomer) {
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

    public DiscountCodeBxgyInput setCode(String code) {
        this.code = Input.optional(code);
        return this;
    }

    public DiscountCodeBxgyInput setCodeInput(Input<String> code) {
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

    public DiscountCodeBxgyInput setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
        this.customerSelection = Input.optional(customerSelection);
        return this;
    }

    public DiscountCodeBxgyInput setCustomerSelectionInput(Input<DiscountCustomerSelectionInput> customerSelection) {
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

    public DiscountCodeBxgyInput setUsageLimit(Integer usageLimit) {
        this.usageLimit = Input.optional(usageLimit);
        return this;
    }

    public DiscountCodeBxgyInput setUsageLimitInput(Input<Integer> usageLimit) {
        if (usageLimit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.usageLimit = usageLimit;
        return this;
    }

    public DiscountCustomerBuysInput getCustomerBuys() {
        return customerBuys.getValue();
    }

    public Input<DiscountCustomerBuysInput> getCustomerBuysInput() {
        return customerBuys;
    }

    public DiscountCodeBxgyInput setCustomerBuys(DiscountCustomerBuysInput customerBuys) {
        this.customerBuys = Input.optional(customerBuys);
        return this;
    }

    public DiscountCodeBxgyInput setCustomerBuysInput(Input<DiscountCustomerBuysInput> customerBuys) {
        if (customerBuys == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerBuys = customerBuys;
        return this;
    }

    public DiscountCustomerGetsInput getCustomerGets() {
        return customerGets.getValue();
    }

    public Input<DiscountCustomerGetsInput> getCustomerGetsInput() {
        return customerGets;
    }

    public DiscountCodeBxgyInput setCustomerGets(DiscountCustomerGetsInput customerGets) {
        this.customerGets = Input.optional(customerGets);
        return this;
    }

    public DiscountCodeBxgyInput setCustomerGetsInput(Input<DiscountCustomerGetsInput> customerGets) {
        if (customerGets == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerGets = customerGets;
        return this;
    }

    public Integer getUsesPerOrderLimit() {
        return usesPerOrderLimit.getValue();
    }

    public Input<Integer> getUsesPerOrderLimitInput() {
        return usesPerOrderLimit;
    }

    public DiscountCodeBxgyInput setUsesPerOrderLimit(Integer usesPerOrderLimit) {
        this.usesPerOrderLimit = Input.optional(usesPerOrderLimit);
        return this;
    }

    public DiscountCodeBxgyInput setUsesPerOrderLimitInput(Input<Integer> usesPerOrderLimit) {
        if (usesPerOrderLimit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.usesPerOrderLimit = usesPerOrderLimit;
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

        if (this.customerBuys.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerBuys:");
            if (customerBuys.getValue() != null) {
                customerBuys.getValue().appendTo(_queryBuilder);
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

        if (this.usesPerOrderLimit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("usesPerOrderLimit:");
            if (usesPerOrderLimit.getValue() != null) {
                _queryBuilder.append(usesPerOrderLimit.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

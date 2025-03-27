// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DiscountAutomaticBxgyInput implements Serializable {
    private Input<DiscountCombinesWithInput> combinesWith = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<String> startsAt = Input.undefined();

    private Input<String> endsAt = Input.undefined();

    private Input<String> usesPerOrderLimit = Input.undefined();

    private Input<DiscountCustomerBuysInput> customerBuys = Input.undefined();

    private Input<DiscountCustomerGetsInput> customerGets = Input.undefined();

    public DiscountCombinesWithInput getCombinesWith() {
        return combinesWith.getValue();
    }

    public Input<DiscountCombinesWithInput> getCombinesWithInput() {
        return combinesWith;
    }

    public DiscountAutomaticBxgyInput setCombinesWith(DiscountCombinesWithInput combinesWith) {
        this.combinesWith = Input.optional(combinesWith);
        return this;
    }

    public DiscountAutomaticBxgyInput setCombinesWithInput(Input<DiscountCombinesWithInput> combinesWith) {
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

    public DiscountAutomaticBxgyInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public DiscountAutomaticBxgyInput setTitleInput(Input<String> title) {
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

    public DiscountAutomaticBxgyInput setStartsAt(String startsAt) {
        this.startsAt = Input.optional(startsAt);
        return this;
    }

    public DiscountAutomaticBxgyInput setStartsAtInput(Input<String> startsAt) {
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

    public DiscountAutomaticBxgyInput setEndsAt(String endsAt) {
        this.endsAt = Input.optional(endsAt);
        return this;
    }

    public DiscountAutomaticBxgyInput setEndsAtInput(Input<String> endsAt) {
        if (endsAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.endsAt = endsAt;
        return this;
    }

    public String getUsesPerOrderLimit() {
        return usesPerOrderLimit.getValue();
    }

    public Input<String> getUsesPerOrderLimitInput() {
        return usesPerOrderLimit;
    }

    public DiscountAutomaticBxgyInput setUsesPerOrderLimit(String usesPerOrderLimit) {
        this.usesPerOrderLimit = Input.optional(usesPerOrderLimit);
        return this;
    }

    public DiscountAutomaticBxgyInput setUsesPerOrderLimitInput(Input<String> usesPerOrderLimit) {
        if (usesPerOrderLimit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.usesPerOrderLimit = usesPerOrderLimit;
        return this;
    }

    public DiscountCustomerBuysInput getCustomerBuys() {
        return customerBuys.getValue();
    }

    public Input<DiscountCustomerBuysInput> getCustomerBuysInput() {
        return customerBuys;
    }

    public DiscountAutomaticBxgyInput setCustomerBuys(DiscountCustomerBuysInput customerBuys) {
        this.customerBuys = Input.optional(customerBuys);
        return this;
    }

    public DiscountAutomaticBxgyInput setCustomerBuysInput(Input<DiscountCustomerBuysInput> customerBuys) {
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

    public DiscountAutomaticBxgyInput setCustomerGets(DiscountCustomerGetsInput customerGets) {
        this.customerGets = Input.optional(customerGets);
        return this;
    }

    public DiscountAutomaticBxgyInput setCustomerGetsInput(Input<DiscountCustomerGetsInput> customerGets) {
        if (customerGets == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerGets = customerGets;
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

        if (this.usesPerOrderLimit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("usesPerOrderLimit:");
            if (usesPerOrderLimit.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, usesPerOrderLimit.getValue().toString());
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

        _queryBuilder.append('}');
    }
}

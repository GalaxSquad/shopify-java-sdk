// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class DiscountCustomerSelectionInput implements Serializable {
    private Input<Boolean> all = Input.undefined();

    private Input<DiscountCustomersInput> customers = Input.undefined();

    private Input<DiscountCustomerSegmentsInput> customerSegments = Input.undefined();

    public Boolean getAll() {
        return all.getValue();
    }

    public Input<Boolean> getAllInput() {
        return all;
    }

    public DiscountCustomerSelectionInput setAll(Boolean all) {
        this.all = Input.optional(all);
        return this;
    }

    public DiscountCustomerSelectionInput setAllInput(Input<Boolean> all) {
        if (all == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.all = all;
        return this;
    }

    public DiscountCustomersInput getCustomers() {
        return customers.getValue();
    }

    public Input<DiscountCustomersInput> getCustomersInput() {
        return customers;
    }

    public DiscountCustomerSelectionInput setCustomers(DiscountCustomersInput customers) {
        this.customers = Input.optional(customers);
        return this;
    }

    public DiscountCustomerSelectionInput setCustomersInput(Input<DiscountCustomersInput> customers) {
        if (customers == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customers = customers;
        return this;
    }

    public DiscountCustomerSegmentsInput getCustomerSegments() {
        return customerSegments.getValue();
    }

    public Input<DiscountCustomerSegmentsInput> getCustomerSegmentsInput() {
        return customerSegments;
    }

    public DiscountCustomerSelectionInput setCustomerSegments(DiscountCustomerSegmentsInput customerSegments) {
        this.customerSegments = Input.optional(customerSegments);
        return this;
    }

    public DiscountCustomerSelectionInput setCustomerSegmentsInput(Input<DiscountCustomerSegmentsInput> customerSegments) {
        if (customerSegments == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerSegments = customerSegments;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.all.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("all:");
            if (all.getValue() != null) {
                _queryBuilder.append(all.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customers.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customers:");
            if (customers.getValue() != null) {
                customers.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerSegments.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerSegments:");
            if (customerSegments.getValue() != null) {
                customerSegments.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

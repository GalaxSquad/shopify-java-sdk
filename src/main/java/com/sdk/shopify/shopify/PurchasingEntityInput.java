// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class PurchasingEntityInput implements Serializable {
    private Input<ID> customerId = Input.undefined();

    private Input<PurchasingCompanyInput> purchasingCompany = Input.undefined();

    public ID getCustomerId() {
        return customerId.getValue();
    }

    public Input<ID> getCustomerIdInput() {
        return customerId;
    }

    public PurchasingEntityInput setCustomerId(ID customerId) {
        this.customerId = Input.optional(customerId);
        return this;
    }

    public PurchasingEntityInput setCustomerIdInput(Input<ID> customerId) {
        if (customerId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerId = customerId;
        return this;
    }

    public PurchasingCompanyInput getPurchasingCompany() {
        return purchasingCompany.getValue();
    }

    public Input<PurchasingCompanyInput> getPurchasingCompanyInput() {
        return purchasingCompany;
    }

    public PurchasingEntityInput setPurchasingCompany(PurchasingCompanyInput purchasingCompany) {
        this.purchasingCompany = Input.optional(purchasingCompany);
        return this;
    }

    public PurchasingEntityInput setPurchasingCompanyInput(Input<PurchasingCompanyInput> purchasingCompany) {
        if (purchasingCompany == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.purchasingCompany = purchasingCompany;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.customerId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerId:");
            if (customerId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.purchasingCompany.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("purchasingCompany:");
            if (purchasingCompany.getValue() != null) {
                purchasingCompany.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

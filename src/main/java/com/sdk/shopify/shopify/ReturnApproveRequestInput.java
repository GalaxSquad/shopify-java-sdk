// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ReturnApproveRequestInput implements Serializable {
    private ID id;

    private Input<Boolean> notifyCustomer = Input.undefined();

    public ReturnApproveRequestInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public ReturnApproveRequestInput setId(ID id) {
        this.id = id;
        return this;
    }

    public Boolean getNotifyCustomer() {
        return notifyCustomer.getValue();
    }

    public Input<Boolean> getNotifyCustomerInput() {
        return notifyCustomer;
    }

    public ReturnApproveRequestInput setNotifyCustomer(Boolean notifyCustomer) {
        this.notifyCustomer = Input.optional(notifyCustomer);
        return this;
    }

    public ReturnApproveRequestInput setNotifyCustomerInput(Input<Boolean> notifyCustomer) {
        if (notifyCustomer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.notifyCustomer = notifyCustomer;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.notifyCustomer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("notifyCustomer:");
            if (notifyCustomer.getValue() != null) {
                _queryBuilder.append(notifyCustomer.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

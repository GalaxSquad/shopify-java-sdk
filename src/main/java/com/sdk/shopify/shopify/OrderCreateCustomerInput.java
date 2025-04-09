// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class OrderCreateCustomerInput implements Serializable {
    private Input<OrderCreateAssociateCustomerAttributesInput> toAssociate = Input.undefined();

    private Input<OrderCreateUpsertCustomerAttributesInput> toUpsert = Input.undefined();

    public OrderCreateAssociateCustomerAttributesInput getToAssociate() {
        return toAssociate.getValue();
    }

    public Input<OrderCreateAssociateCustomerAttributesInput> getToAssociateInput() {
        return toAssociate;
    }

    public OrderCreateCustomerInput setToAssociate(OrderCreateAssociateCustomerAttributesInput toAssociate) {
        this.toAssociate = Input.optional(toAssociate);
        return this;
    }

    public OrderCreateCustomerInput setToAssociateInput(Input<OrderCreateAssociateCustomerAttributesInput> toAssociate) {
        if (toAssociate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.toAssociate = toAssociate;
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput getToUpsert() {
        return toUpsert.getValue();
    }

    public Input<OrderCreateUpsertCustomerAttributesInput> getToUpsertInput() {
        return toUpsert;
    }

    public OrderCreateCustomerInput setToUpsert(OrderCreateUpsertCustomerAttributesInput toUpsert) {
        this.toUpsert = Input.optional(toUpsert);
        return this;
    }

    public OrderCreateCustomerInput setToUpsertInput(Input<OrderCreateUpsertCustomerAttributesInput> toUpsert) {
        if (toUpsert == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.toUpsert = toUpsert;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.toAssociate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("toAssociate:");
            if (toAssociate.getValue() != null) {
                toAssociate.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.toUpsert.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("toUpsert:");
            if (toUpsert.getValue() != null) {
                toUpsert.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

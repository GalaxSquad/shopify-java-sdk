// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DraftOrderLineItemComponentInput implements Serializable {
    private int quantity;

    private Input<ID> variantId = Input.undefined();

    private Input<String> uuid = Input.undefined();

    public DraftOrderLineItemComponentInput(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public DraftOrderLineItemComponentInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ID getVariantId() {
        return variantId.getValue();
    }

    public Input<ID> getVariantIdInput() {
        return variantId;
    }

    public DraftOrderLineItemComponentInput setVariantId(ID variantId) {
        this.variantId = Input.optional(variantId);
        return this;
    }

    public DraftOrderLineItemComponentInput setVariantIdInput(Input<ID> variantId) {
        if (variantId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.variantId = variantId;
        return this;
    }

    public String getUuid() {
        return uuid.getValue();
    }

    public Input<String> getUuidInput() {
        return uuid;
    }

    public DraftOrderLineItemComponentInput setUuid(String uuid) {
        this.uuid = Input.optional(uuid);
        return this;
    }

    public DraftOrderLineItemComponentInput setUuidInput(Input<String> uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.uuid = uuid;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        if (this.variantId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("variantId:");
            if (variantId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, variantId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.uuid.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("uuid:");
            if (uuid.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, uuid.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

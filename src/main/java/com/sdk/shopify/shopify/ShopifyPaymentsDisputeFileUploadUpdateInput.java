// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ShopifyPaymentsDisputeFileUploadUpdateInput implements Serializable {
    private ID id;

    private Input<Boolean> destroy = Input.undefined();

    public ShopifyPaymentsDisputeFileUploadUpdateInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public ShopifyPaymentsDisputeFileUploadUpdateInput setId(ID id) {
        this.id = id;
        return this;
    }

    public Boolean getDestroy() {
        return destroy.getValue();
    }

    public Input<Boolean> getDestroyInput() {
        return destroy;
    }

    public ShopifyPaymentsDisputeFileUploadUpdateInput setDestroy(Boolean destroy) {
        this.destroy = Input.optional(destroy);
        return this;
    }

    public ShopifyPaymentsDisputeFileUploadUpdateInput setDestroyInput(Input<Boolean> destroy) {
        if (destroy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.destroy = destroy;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.destroy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("destroy:");
            if (destroy.getValue() != null) {
                _queryBuilder.append(destroy.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

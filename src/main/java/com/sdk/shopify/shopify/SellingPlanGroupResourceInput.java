// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class SellingPlanGroupResourceInput implements Serializable {
    private Input<List<ID>> productVariantIds = Input.undefined();

    private Input<List<ID>> productIds = Input.undefined();

    public List<ID> getProductVariantIds() {
        return productVariantIds.getValue();
    }

    public Input<List<ID>> getProductVariantIdsInput() {
        return productVariantIds;
    }

    public SellingPlanGroupResourceInput setProductVariantIds(List<ID> productVariantIds) {
        this.productVariantIds = Input.optional(productVariantIds);
        return this;
    }

    public SellingPlanGroupResourceInput setProductVariantIdsInput(Input<List<ID>> productVariantIds) {
        if (productVariantIds == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productVariantIds = productVariantIds;
        return this;
    }

    public List<ID> getProductIds() {
        return productIds.getValue();
    }

    public Input<List<ID>> getProductIdsInput() {
        return productIds;
    }

    public SellingPlanGroupResourceInput setProductIds(List<ID> productIds) {
        this.productIds = Input.optional(productIds);
        return this;
    }

    public SellingPlanGroupResourceInput setProductIdsInput(Input<List<ID>> productIds) {
        if (productIds == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productIds = productIds;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.productVariantIds.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productVariantIds:");
            if (productVariantIds.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : productVariantIds.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.productIds.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productIds:");
            if (productIds.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : productIds.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
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

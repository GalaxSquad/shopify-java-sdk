// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ProductVariantDetachMediaInput implements Serializable {
    private ID variantId;

    private List<ID> mediaIds;

    public ProductVariantDetachMediaInput(ID variantId, List<ID> mediaIds) {
        this.variantId = variantId;

        this.mediaIds = mediaIds;
    }

    public ID getVariantId() {
        return variantId;
    }

    public ProductVariantDetachMediaInput setVariantId(ID variantId) {
        this.variantId = variantId;
        return this;
    }

    public List<ID> getMediaIds() {
        return mediaIds;
    }

    public ProductVariantDetachMediaInput setMediaIds(List<ID> mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("variantId:");
        Query.appendQuotedString(_queryBuilder, variantId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("mediaIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : mediaIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

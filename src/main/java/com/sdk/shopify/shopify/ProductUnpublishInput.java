// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ProductUnpublishInput implements Serializable {
    private ID id;

    private List<ProductPublicationInput> productPublications;

    public ProductUnpublishInput(ID id, List<ProductPublicationInput> productPublications) {
        this.id = id;

        this.productPublications = productPublications;
    }

    public ID getId() {
        return id;
    }

    public ProductUnpublishInput setId(ID id) {
        this.id = id;
        return this;
    }

    public List<ProductPublicationInput> getProductPublications() {
        return productPublications;
    }

    public ProductUnpublishInput setProductPublications(List<ProductPublicationInput> productPublications) {
        this.productPublications = productPublications;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("productPublications:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductPublicationInput item1 : productPublications) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

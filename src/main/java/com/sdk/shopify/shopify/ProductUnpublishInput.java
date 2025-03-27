// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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

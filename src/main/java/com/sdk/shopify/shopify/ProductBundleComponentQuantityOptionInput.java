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

public class ProductBundleComponentQuantityOptionInput implements Serializable {
    private String name;

    private List<ProductBundleComponentQuantityOptionValueInput> values;

    public ProductBundleComponentQuantityOptionInput(String name, List<ProductBundleComponentQuantityOptionValueInput> values) {
        this.name = name;

        this.values = values;
    }

    public String getName() {
        return name;
    }

    public ProductBundleComponentQuantityOptionInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<ProductBundleComponentQuantityOptionValueInput> getValues() {
        return values;
    }

    public ProductBundleComponentQuantityOptionInput setValues(List<ProductBundleComponentQuantityOptionValueInput> values) {
        this.values = values;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("values:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductBundleComponentQuantityOptionValueInput item1 : values) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

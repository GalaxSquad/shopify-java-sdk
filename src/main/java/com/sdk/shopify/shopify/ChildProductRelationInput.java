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

public class ChildProductRelationInput implements Serializable {
    private ID childProductId;

    private List<SelectedVariantOptionInput> selectedParentOptionValues;

    public ChildProductRelationInput(ID childProductId, List<SelectedVariantOptionInput> selectedParentOptionValues) {
        this.childProductId = childProductId;

        this.selectedParentOptionValues = selectedParentOptionValues;
    }

    public ID getChildProductId() {
        return childProductId;
    }

    public ChildProductRelationInput setChildProductId(ID childProductId) {
        this.childProductId = childProductId;
        return this;
    }

    public List<SelectedVariantOptionInput> getSelectedParentOptionValues() {
        return selectedParentOptionValues;
    }

    public ChildProductRelationInput setSelectedParentOptionValues(List<SelectedVariantOptionInput> selectedParentOptionValues) {
        this.selectedParentOptionValues = selectedParentOptionValues;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("childProductId:");
        Query.appendQuotedString(_queryBuilder, childProductId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("selectedParentOptionValues:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (SelectedVariantOptionInput item1 : selectedParentOptionValues) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

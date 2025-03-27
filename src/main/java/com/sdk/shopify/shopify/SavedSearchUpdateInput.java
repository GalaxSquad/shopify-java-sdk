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

public class SavedSearchUpdateInput implements Serializable {
    private ID id;

    private Input<String> name = Input.undefined();

    private Input<String> query = Input.undefined();

    public SavedSearchUpdateInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public SavedSearchUpdateInput setId(ID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public SavedSearchUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public SavedSearchUpdateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getQuery() {
        return query.getValue();
    }

    public Input<String> getQueryInput() {
        return query;
    }

    public SavedSearchUpdateInput setQuery(String query) {
        this.query = Input.optional(query);
        return this;
    }

    public SavedSearchUpdateInput setQueryInput(Input<String> query) {
        if (query == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.query = query;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.query.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("query:");
            if (query.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, query.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

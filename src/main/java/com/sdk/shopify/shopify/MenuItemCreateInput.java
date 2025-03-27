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

public class MenuItemCreateInput implements Serializable {
    private String title;

    private MenuItemType type;

    private Input<ID> resourceId = Input.undefined();

    private Input<String> url = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<List<MenuItemCreateInput>> items = Input.undefined();

    public MenuItemCreateInput(String title, MenuItemType type) {
        this.title = title;

        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public MenuItemCreateInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public MenuItemType getType() {
        return type;
    }

    public MenuItemCreateInput setType(MenuItemType type) {
        this.type = type;
        return this;
    }

    public ID getResourceId() {
        return resourceId.getValue();
    }

    public Input<ID> getResourceIdInput() {
        return resourceId;
    }

    public MenuItemCreateInput setResourceId(ID resourceId) {
        this.resourceId = Input.optional(resourceId);
        return this;
    }

    public MenuItemCreateInput setResourceIdInput(Input<ID> resourceId) {
        if (resourceId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.resourceId = resourceId;
        return this;
    }

    public String getUrl() {
        return url.getValue();
    }

    public Input<String> getUrlInput() {
        return url;
    }

    public MenuItemCreateInput setUrl(String url) {
        this.url = Input.optional(url);
        return this;
    }

    public MenuItemCreateInput setUrlInput(Input<String> url) {
        if (url == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.url = url;
        return this;
    }

    public List<String> getTags() {
        return tags.getValue();
    }

    public Input<List<String>> getTagsInput() {
        return tags;
    }

    public MenuItemCreateInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public MenuItemCreateInput setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public List<MenuItemCreateInput> getItems() {
        return items.getValue();
    }

    public Input<List<MenuItemCreateInput>> getItemsInput() {
        return items;
    }

    public MenuItemCreateInput setItems(List<MenuItemCreateInput> items) {
        this.items = Input.optional(items);
        return this;
    }

    public MenuItemCreateInput setItemsInput(Input<List<MenuItemCreateInput>> items) {
        if (items == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.items = items;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("type:");
        _queryBuilder.append(type.toString());

        if (this.resourceId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("resourceId:");
            if (resourceId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, resourceId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.url.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("url:");
            if (url.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, url.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.tags.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tags:");
            if (tags.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : tags.getValue()) {
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

        if (this.items.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("items:");
            if (items.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MenuItemCreateInput item1 : items.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
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

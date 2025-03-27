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

public class PageCreateInput implements Serializable {
    private String title;

    private Input<String> handle = Input.undefined();

    private Input<String> body = Input.undefined();

    private Input<Boolean> isPublished = Input.undefined();

    private Input<String> publishDate = Input.undefined();

    private Input<String> templateSuffix = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    public PageCreateInput(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public PageCreateInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public PageCreateInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public PageCreateInput setHandleInput(Input<String> handle) {
        if (handle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.handle = handle;
        return this;
    }

    public String getBody() {
        return body.getValue();
    }

    public Input<String> getBodyInput() {
        return body;
    }

    public PageCreateInput setBody(String body) {
        this.body = Input.optional(body);
        return this;
    }

    public PageCreateInput setBodyInput(Input<String> body) {
        if (body == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.body = body;
        return this;
    }

    public Boolean getIsPublished() {
        return isPublished.getValue();
    }

    public Input<Boolean> getIsPublishedInput() {
        return isPublished;
    }

    public PageCreateInput setIsPublished(Boolean isPublished) {
        this.isPublished = Input.optional(isPublished);
        return this;
    }

    public PageCreateInput setIsPublishedInput(Input<Boolean> isPublished) {
        if (isPublished == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isPublished = isPublished;
        return this;
    }

    public String getPublishDate() {
        return publishDate.getValue();
    }

    public Input<String> getPublishDateInput() {
        return publishDate;
    }

    public PageCreateInput setPublishDate(String publishDate) {
        this.publishDate = Input.optional(publishDate);
        return this;
    }

    public PageCreateInput setPublishDateInput(Input<String> publishDate) {
        if (publishDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publishDate = publishDate;
        return this;
    }

    public String getTemplateSuffix() {
        return templateSuffix.getValue();
    }

    public Input<String> getTemplateSuffixInput() {
        return templateSuffix;
    }

    public PageCreateInput setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = Input.optional(templateSuffix);
        return this;
    }

    public PageCreateInput setTemplateSuffixInput(Input<String> templateSuffix) {
        if (templateSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.templateSuffix = templateSuffix;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public PageCreateInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public PageCreateInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        if (this.handle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("handle:");
            if (handle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, handle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.body.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("body:");
            if (body.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, body.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.isPublished.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isPublished:");
            if (isPublished.getValue() != null) {
                _queryBuilder.append(isPublished.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.publishDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("publishDate:");
            if (publishDate.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, publishDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.templateSuffix.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("templateSuffix:");
            if (templateSuffix.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, templateSuffix.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : metafields.getValue()) {
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

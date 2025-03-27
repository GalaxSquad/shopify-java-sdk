// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class PageUpdateInput implements Serializable {
    private Input<String> handle = Input.undefined();

    private Input<String> body = Input.undefined();

    private Input<Boolean> isPublished = Input.undefined();

    private Input<String> publishDate = Input.undefined();

    private Input<String> templateSuffix = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<Boolean> redirectNewHandle = Input.undefined();

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public PageUpdateInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public PageUpdateInput setHandleInput(Input<String> handle) {
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

    public PageUpdateInput setBody(String body) {
        this.body = Input.optional(body);
        return this;
    }

    public PageUpdateInput setBodyInput(Input<String> body) {
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

    public PageUpdateInput setIsPublished(Boolean isPublished) {
        this.isPublished = Input.optional(isPublished);
        return this;
    }

    public PageUpdateInput setIsPublishedInput(Input<Boolean> isPublished) {
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

    public PageUpdateInput setPublishDate(String publishDate) {
        this.publishDate = Input.optional(publishDate);
        return this;
    }

    public PageUpdateInput setPublishDateInput(Input<String> publishDate) {
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

    public PageUpdateInput setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = Input.optional(templateSuffix);
        return this;
    }

    public PageUpdateInput setTemplateSuffixInput(Input<String> templateSuffix) {
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

    public PageUpdateInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public PageUpdateInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public PageUpdateInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public PageUpdateInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public Boolean getRedirectNewHandle() {
        return redirectNewHandle.getValue();
    }

    public Input<Boolean> getRedirectNewHandleInput() {
        return redirectNewHandle;
    }

    public PageUpdateInput setRedirectNewHandle(Boolean redirectNewHandle) {
        this.redirectNewHandle = Input.optional(redirectNewHandle);
        return this;
    }

    public PageUpdateInput setRedirectNewHandleInput(Input<Boolean> redirectNewHandle) {
        if (redirectNewHandle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.redirectNewHandle = redirectNewHandle;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.redirectNewHandle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("redirectNewHandle:");
            if (redirectNewHandle.getValue() != null) {
                _queryBuilder.append(redirectNewHandle.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

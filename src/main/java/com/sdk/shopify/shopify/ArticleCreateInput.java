// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ArticleCreateInput implements Serializable {
    private String title;

    private AuthorInput author;

    private Input<ID> blogId = Input.undefined();

    private Input<String> handle = Input.undefined();

    private Input<String> body = Input.undefined();

    private Input<String> summary = Input.undefined();

    private Input<Boolean> isPublished = Input.undefined();

    private Input<String> publishDate = Input.undefined();

    private Input<String> templateSuffix = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<ArticleImageInput> image = Input.undefined();

    public ArticleCreateInput(String title, AuthorInput author) {
        this.title = title;

        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public ArticleCreateInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public AuthorInput getAuthor() {
        return author;
    }

    public ArticleCreateInput setAuthor(AuthorInput author) {
        this.author = author;
        return this;
    }

    public ID getBlogId() {
        return blogId.getValue();
    }

    public Input<ID> getBlogIdInput() {
        return blogId;
    }

    public ArticleCreateInput setBlogId(ID blogId) {
        this.blogId = Input.optional(blogId);
        return this;
    }

    public ArticleCreateInput setBlogIdInput(Input<ID> blogId) {
        if (blogId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.blogId = blogId;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public ArticleCreateInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public ArticleCreateInput setHandleInput(Input<String> handle) {
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

    public ArticleCreateInput setBody(String body) {
        this.body = Input.optional(body);
        return this;
    }

    public ArticleCreateInput setBodyInput(Input<String> body) {
        if (body == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.body = body;
        return this;
    }

    public String getSummary() {
        return summary.getValue();
    }

    public Input<String> getSummaryInput() {
        return summary;
    }

    public ArticleCreateInput setSummary(String summary) {
        this.summary = Input.optional(summary);
        return this;
    }

    public ArticleCreateInput setSummaryInput(Input<String> summary) {
        if (summary == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.summary = summary;
        return this;
    }

    public Boolean getIsPublished() {
        return isPublished.getValue();
    }

    public Input<Boolean> getIsPublishedInput() {
        return isPublished;
    }

    public ArticleCreateInput setIsPublished(Boolean isPublished) {
        this.isPublished = Input.optional(isPublished);
        return this;
    }

    public ArticleCreateInput setIsPublishedInput(Input<Boolean> isPublished) {
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

    public ArticleCreateInput setPublishDate(String publishDate) {
        this.publishDate = Input.optional(publishDate);
        return this;
    }

    public ArticleCreateInput setPublishDateInput(Input<String> publishDate) {
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

    public ArticleCreateInput setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = Input.optional(templateSuffix);
        return this;
    }

    public ArticleCreateInput setTemplateSuffixInput(Input<String> templateSuffix) {
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

    public ArticleCreateInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public ArticleCreateInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public List<String> getTags() {
        return tags.getValue();
    }

    public Input<List<String>> getTagsInput() {
        return tags;
    }

    public ArticleCreateInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public ArticleCreateInput setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public ArticleImageInput getImage() {
        return image.getValue();
    }

    public Input<ArticleImageInput> getImageInput() {
        return image;
    }

    public ArticleCreateInput setImage(ArticleImageInput image) {
        this.image = Input.optional(image);
        return this;
    }

    public ArticleCreateInput setImageInput(Input<ArticleImageInput> image) {
        if (image == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.image = image;
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
        _queryBuilder.append("author:");
        author.appendTo(_queryBuilder);

        if (this.blogId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("blogId:");
            if (blogId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, blogId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.summary.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("summary:");
            if (summary.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, summary.getValue().toString());
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

        if (this.image.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("image:");
            if (image.getValue() != null) {
                image.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

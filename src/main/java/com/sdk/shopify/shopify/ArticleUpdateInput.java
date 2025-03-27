// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ArticleUpdateInput implements Serializable {
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

    private Input<String> title = Input.undefined();

    private Input<AuthorInput> author = Input.undefined();

    private Input<Boolean> redirectNewHandle = Input.undefined();

    public ID getBlogId() {
        return blogId.getValue();
    }

    public Input<ID> getBlogIdInput() {
        return blogId;
    }

    public ArticleUpdateInput setBlogId(ID blogId) {
        this.blogId = Input.optional(blogId);
        return this;
    }

    public ArticleUpdateInput setBlogIdInput(Input<ID> blogId) {
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

    public ArticleUpdateInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public ArticleUpdateInput setHandleInput(Input<String> handle) {
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

    public ArticleUpdateInput setBody(String body) {
        this.body = Input.optional(body);
        return this;
    }

    public ArticleUpdateInput setBodyInput(Input<String> body) {
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

    public ArticleUpdateInput setSummary(String summary) {
        this.summary = Input.optional(summary);
        return this;
    }

    public ArticleUpdateInput setSummaryInput(Input<String> summary) {
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

    public ArticleUpdateInput setIsPublished(Boolean isPublished) {
        this.isPublished = Input.optional(isPublished);
        return this;
    }

    public ArticleUpdateInput setIsPublishedInput(Input<Boolean> isPublished) {
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

    public ArticleUpdateInput setPublishDate(String publishDate) {
        this.publishDate = Input.optional(publishDate);
        return this;
    }

    public ArticleUpdateInput setPublishDateInput(Input<String> publishDate) {
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

    public ArticleUpdateInput setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = Input.optional(templateSuffix);
        return this;
    }

    public ArticleUpdateInput setTemplateSuffixInput(Input<String> templateSuffix) {
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

    public ArticleUpdateInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public ArticleUpdateInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
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

    public ArticleUpdateInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public ArticleUpdateInput setTagsInput(Input<List<String>> tags) {
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

    public ArticleUpdateInput setImage(ArticleImageInput image) {
        this.image = Input.optional(image);
        return this;
    }

    public ArticleUpdateInput setImageInput(Input<ArticleImageInput> image) {
        if (image == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.image = image;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public ArticleUpdateInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public ArticleUpdateInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public AuthorInput getAuthor() {
        return author.getValue();
    }

    public Input<AuthorInput> getAuthorInput() {
        return author;
    }

    public ArticleUpdateInput setAuthor(AuthorInput author) {
        this.author = Input.optional(author);
        return this;
    }

    public ArticleUpdateInput setAuthorInput(Input<AuthorInput> author) {
        if (author == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.author = author;
        return this;
    }

    public Boolean getRedirectNewHandle() {
        return redirectNewHandle.getValue();
    }

    public Input<Boolean> getRedirectNewHandleInput() {
        return redirectNewHandle;
    }

    public ArticleUpdateInput setRedirectNewHandle(Boolean redirectNewHandle) {
        this.redirectNewHandle = Input.optional(redirectNewHandle);
        return this;
    }

    public ArticleUpdateInput setRedirectNewHandleInput(Input<Boolean> redirectNewHandle) {
        if (redirectNewHandle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.redirectNewHandle = redirectNewHandle;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.author.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("author:");
            if (author.getValue() != null) {
                author.getValue().appendTo(_queryBuilder);
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

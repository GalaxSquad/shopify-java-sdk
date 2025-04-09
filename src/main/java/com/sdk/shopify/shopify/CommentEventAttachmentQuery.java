// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A file attachment associated to a comment event.
*/
public class CommentEventAttachmentQuery extends Query<CommentEventAttachmentQuery> {
    CommentEventAttachmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The file extension of the comment event attachment, indicating the file format.
    */
    public CommentEventAttachmentQuery fileExtension() {
        startField("fileExtension");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CommentEventAttachmentQuery id() {
        startField("id");

        return this;
    }

    /**
    * The image attached to the comment event.
    */
    public CommentEventAttachmentQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The filename of the comment event attachment.
    */
    public CommentEventAttachmentQuery name() {
        startField("name");

        return this;
    }

    /**
    * The size of the attachment.
    */
    public CommentEventAttachmentQuery size() {
        startField("size");

        return this;
    }

    /**
    * The URL of the attachment.
    */
    public CommentEventAttachmentQuery url() {
        startField("url");

        return this;
    }
}

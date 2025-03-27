// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents any file other than HTML.
*/
public class GenericFileQuery extends Query<GenericFileQuery> {
    GenericFileQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A word or phrase to describe the contents or the function of a file.
    */
    public GenericFileQuery alt() {
        startField("alt");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was
    * created.
    */
    public GenericFileQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */
    public GenericFileQuery fileErrors(FileErrorQueryDefinition queryDef) {
        startField("fileErrors");

        _queryBuilder.append('{');
        queryDef.define(new FileErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the file.
    */
    public GenericFileQuery fileStatus() {
        startField("fileStatus");

        return this;
    }

    /**
    * The generic file's MIME type.
    */
    public GenericFileQuery mimeType() {
        startField("mimeType");

        return this;
    }

    /**
    * The generic file's size in bytes.
    */
    public GenericFileQuery originalFileSize() {
        startField("originalFileSize");

        return this;
    }

    /**
    * The preview image for the media.
    */
    public GenericFileQuery preview(MediaPreviewImageQueryDefinition queryDef) {
        startField("preview");

        _queryBuilder.append('{');
        queryDef.define(new MediaPreviewImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last
    * updated.
    */
    public GenericFileQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * The generic file's URL.
    */
    public GenericFileQuery url() {
        startField("url");

        return this;
    }
}

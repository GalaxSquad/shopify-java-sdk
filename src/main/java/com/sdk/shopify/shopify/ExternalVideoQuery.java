// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a video hosted outside of Shopify.
*/
public class ExternalVideoQuery extends Query<ExternalVideoQuery> {
    ExternalVideoQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A word or phrase to describe the contents or the function of a file.
    */
    public ExternalVideoQuery alt() {
        startField("alt");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was
    * created.
    */
    public ExternalVideoQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The embed URL of the video for the respective host.
    */
    public ExternalVideoQuery embedUrl() {
        startField("embedUrl");

        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */
    public ExternalVideoQuery fileErrors(FileErrorQueryDefinition queryDef) {
        startField("fileErrors");

        _queryBuilder.append('{');
        queryDef.define(new FileErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the file.
    */
    public ExternalVideoQuery fileStatus() {
        startField("fileStatus");

        return this;
    }

    /**
    * The host of the external video.
    */
    public ExternalVideoQuery host() {
        startField("host");

        return this;
    }

    /**
    * The media content type.
    */
    public ExternalVideoQuery mediaContentType() {
        startField("mediaContentType");

        return this;
    }

    /**
    * Any errors which have occurred on the media.
    */
    public ExternalVideoQuery mediaErrors(MediaErrorQueryDefinition queryDef) {
        startField("mediaErrors");

        _queryBuilder.append('{');
        queryDef.define(new MediaErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The warnings attached to the media.
    */
    public ExternalVideoQuery mediaWarnings(MediaWarningQueryDefinition queryDef) {
        startField("mediaWarnings");

        _queryBuilder.append('{');
        queryDef.define(new MediaWarningQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The origin URL of the video on the respective host.
    */
    public ExternalVideoQuery originUrl() {
        startField("originUrl");

        return this;
    }

    /**
    * The preview image for the media.
    */
    public ExternalVideoQuery preview(MediaPreviewImageQueryDefinition queryDef) {
        startField("preview");

        _queryBuilder.append('{');
        queryDef.define(new MediaPreviewImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Current status of the media.
    */
    public ExternalVideoQuery status() {
        startField("status");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last
    * updated.
    */
    public ExternalVideoQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}

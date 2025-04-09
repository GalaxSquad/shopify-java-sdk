// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a media interface.
*/
public class MediaQuery extends Query<MediaQuery> {
    MediaQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * A word or phrase to share the nature or contents of a media.
    */
    public MediaQuery alt() {
        startField("alt");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public MediaQuery id() {
        startField("id");

        return this;
    }

    /**
    * The media content type.
    */
    public MediaQuery mediaContentType() {
        startField("mediaContentType");

        return this;
    }

    /**
    * Any errors which have occurred on the media.
    */
    public MediaQuery mediaErrors(MediaErrorQueryDefinition queryDef) {
        startField("mediaErrors");

        _queryBuilder.append('{');
        queryDef.define(new MediaErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The warnings attached to the media.
    */
    public MediaQuery mediaWarnings(MediaWarningQueryDefinition queryDef) {
        startField("mediaWarnings");

        _queryBuilder.append('{');
        queryDef.define(new MediaWarningQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The preview image for the media.
    */
    public MediaQuery preview(MediaPreviewImageQueryDefinition queryDef) {
        startField("preview");

        _queryBuilder.append('{');
        queryDef.define(new MediaPreviewImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Current status of the media.
    */
    public MediaQuery status() {
        startField("status");

        return this;
    }

    public MediaQuery onExternalVideo(ExternalVideoQueryDefinition queryDef) {
        startInlineFragment("ExternalVideo");
        queryDef.define(new ExternalVideoQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MediaQuery onMediaImage(MediaImageQueryDefinition queryDef) {
        startInlineFragment("MediaImage");
        queryDef.define(new MediaImageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MediaQuery onModel3d(Model3dQueryDefinition queryDef) {
        startInlineFragment("Model3d");
        queryDef.define(new Model3dQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MediaQuery onVideo(VideoQueryDefinition queryDef) {
        startInlineFragment("Video");
        queryDef.define(new VideoQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

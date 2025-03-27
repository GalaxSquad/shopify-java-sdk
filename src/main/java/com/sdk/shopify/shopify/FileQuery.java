// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A file interface.
*/
public class FileQuery extends Query<FileQuery> {
    FileQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * A word or phrase to describe the contents or the function of a file.
    */
    public FileQuery alt() {
        startField("alt");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was
    * created.
    */
    public FileQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */
    public FileQuery fileErrors(FileErrorQueryDefinition queryDef) {
        startField("fileErrors");

        _queryBuilder.append('{');
        queryDef.define(new FileErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the file.
    */
    public FileQuery fileStatus() {
        startField("fileStatus");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public FileQuery id() {
        startField("id");

        return this;
    }

    /**
    * The preview image for the media.
    */
    public FileQuery preview(MediaPreviewImageQueryDefinition queryDef) {
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
    public FileQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    public FileQuery onExternalVideo(ExternalVideoQueryDefinition queryDef) {
        startInlineFragment("ExternalVideo");
        queryDef.define(new ExternalVideoQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public FileQuery onGenericFile(GenericFileQueryDefinition queryDef) {
        startInlineFragment("GenericFile");
        queryDef.define(new GenericFileQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public FileQuery onMediaImage(MediaImageQueryDefinition queryDef) {
        startInlineFragment("MediaImage");
        queryDef.define(new MediaImageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public FileQuery onModel3d(Model3dQueryDefinition queryDef) {
        startInlineFragment("Model3d");
        queryDef.define(new Model3dQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public FileQuery onVideo(VideoQueryDefinition queryDef) {
        startInlineFragment("Video");
        queryDef.define(new VideoQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

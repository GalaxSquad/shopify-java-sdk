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

/**
* Represents a Shopify hosted 3D model.
*/
public class Model3dQuery extends Query<Model3dQuery> {
    Model3dQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A word or phrase to describe the contents or the function of a file.
    */
    public Model3dQuery alt() {
        startField("alt");

        return this;
    }

    /**
    * The 3d model's bounding box information.
    */
    public Model3dQuery boundingBox(Model3dBoundingBoxQueryDefinition queryDef) {
        startField("boundingBox");

        _queryBuilder.append('{');
        queryDef.define(new Model3dBoundingBoxQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was
    * created.
    */
    public Model3dQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */
    public Model3dQuery fileErrors(FileErrorQueryDefinition queryDef) {
        startField("fileErrors");

        _queryBuilder.append('{');
        queryDef.define(new FileErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the file.
    */
    public Model3dQuery fileStatus() {
        startField("fileStatus");

        return this;
    }

    /**
    * The 3d model's filename.
    */
    public Model3dQuery filename() {
        startField("filename");

        return this;
    }

    /**
    * The media content type.
    */
    public Model3dQuery mediaContentType() {
        startField("mediaContentType");

        return this;
    }

    /**
    * Any errors which have occurred on the media.
    */
    public Model3dQuery mediaErrors(MediaErrorQueryDefinition queryDef) {
        startField("mediaErrors");

        _queryBuilder.append('{');
        queryDef.define(new MediaErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The warnings attached to the media.
    */
    public Model3dQuery mediaWarnings(MediaWarningQueryDefinition queryDef) {
        startField("mediaWarnings");

        _queryBuilder.append('{');
        queryDef.define(new MediaWarningQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The 3d model's original source.
    */
    public Model3dQuery originalSource(Model3dSourceQueryDefinition queryDef) {
        startField("originalSource");

        _queryBuilder.append('{');
        queryDef.define(new Model3dSourceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The preview image for the media.
    */
    public Model3dQuery preview(MediaPreviewImageQueryDefinition queryDef) {
        startField("preview");

        _queryBuilder.append('{');
        queryDef.define(new MediaPreviewImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The 3d model's sources.
    */
    public Model3dQuery sources(Model3dSourceQueryDefinition queryDef) {
        startField("sources");

        _queryBuilder.append('{');
        queryDef.define(new Model3dSourceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Current status of the media.
    */
    public Model3dQuery status() {
        startField("status");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last
    * updated.
    */
    public Model3dQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}

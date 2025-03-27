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
* Information about the staged target.
* Deprecated in favor of
* [StagedMediaUploadTarget](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarg
* et),
* which is returned by the
* [stagedUploadsCreate
* mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stagedUploadsCreate).
*/
public class StagedUploadTargetQuery extends Query<StagedUploadTargetQuery> {
    StagedUploadTargetQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The parameters of an image to be uploaded.
    */
    public StagedUploadTargetQuery parameters(ImageUploadParameterQueryDefinition queryDef) {
        startField("parameters");

        _queryBuilder.append('{');
        queryDef.define(new ImageUploadParameterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The image URL.
    */
    public StagedUploadTargetQuery url() {
        startField("url");

        return this;
    }
}

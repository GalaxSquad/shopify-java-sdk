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
* A parameter to upload an image.
* Deprecated in favor of
* [StagedUploadParameter](https://shopify.dev/api/admin-graphql/latest/objects/StagedUploadParameter),
* which is used in
* [StagedMediaUploadTarget](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarg
* et)
* and returned by the
* [stagedUploadsCreate
* mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stagedUploadsCreate).
*/
public class ImageUploadParameterQuery extends Query<ImageUploadParameterQuery> {
    ImageUploadParameterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The parameter name.
    */
    public ImageUploadParameterQuery name() {
        startField("name");

        return this;
    }

    /**
    * The parameter value.
    */
    public ImageUploadParameterQuery value() {
        startField("value");

        return this;
    }
}

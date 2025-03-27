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
* The parameters required to authenticate a file upload request using a
* [StagedMediaUploadTarget's url
* field](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarget#field-stagedmedi
* auploadtarget-url).
* For more information on the upload process, refer to
* [Upload media to
* Shopify](https://shopify.dev/apps/online-store/media/products#step-1-upload-media-to-shopify).
*/
public class StagedUploadParameterQuery extends Query<StagedUploadParameterQuery> {
    StagedUploadParameterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The parameter's name.
    */
    public StagedUploadParameterQuery name() {
        startField("name");

        return this;
    }

    /**
    * The parameter's value.
    */
    public StagedUploadParameterQuery value() {
        startField("value");

        return this;
    }
}

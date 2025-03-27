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
* Information about a staged upload target, which should be used to send a request to upload
* the file.
* For more information on the upload process, refer to
* [Upload media to
* Shopify](https://shopify.dev/apps/online-store/media/products#step-1-upload-media-to-shopify).
*/
public class StagedMediaUploadTargetQuery extends Query<StagedMediaUploadTargetQuery> {
    StagedMediaUploadTargetQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Parameters needed to authenticate a request to upload the file.
    */
    public StagedMediaUploadTargetQuery parameters(StagedUploadParameterQueryDefinition queryDef) {
        startField("parameters");

        _queryBuilder.append('{');
        queryDef.define(new StagedUploadParameterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The URL to be passed as `originalSource` in
    * [CreateMediaInput](https://shopify.dev/api/admin-graphql/latest/input-objects/CreateMediaInput)
    * and [FileCreateInput](https://shopify.dev/api/admin-graphql/2022-04/input-objects/FileCreateInput)
    * for the
    * [productCreateMedia](https://shopify.dev/api/admin-graphql/2022-04/mutations/productCreateMedia)
    * and [fileCreate](https://shopify.dev/api/admin-graphql/2022-04/mutations/fileCreate)
    * mutations.
    */
    public StagedMediaUploadTargetQuery resourceUrl() {
        startField("resourceUrl");

        return this;
    }

    /**
    * The URL to use when sending an request to upload the file. Should be used in conjunction with
    * the parameters field.
    */
    public StagedMediaUploadTargetQuery url() {
        startField("url");

        return this;
    }
}

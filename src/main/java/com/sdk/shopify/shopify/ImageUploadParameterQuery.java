// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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

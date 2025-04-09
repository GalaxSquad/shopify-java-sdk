// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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

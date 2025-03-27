// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A signed upload parameter for uploading an asset to Shopify.
* Deprecated in favor of
* [StagedUploadParameter](https://shopify.dev/api/admin-graphql/latest/objects/StagedUploadParameter),
* which is used in
* [StagedMediaUploadTarget](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarg
* et)
* and returned by the
* [stagedUploadsCreate
* mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stagedUploadsCreate).
*/
public class MutationsStagedUploadTargetGenerateUploadParameterQuery extends Query<MutationsStagedUploadTargetGenerateUploadParameterQuery> {
    MutationsStagedUploadTargetGenerateUploadParameterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The upload parameter name.
    */
    public MutationsStagedUploadTargetGenerateUploadParameterQuery name() {
        startField("name");

        return this;
    }

    /**
    * The upload parameter value.
    */
    public MutationsStagedUploadTargetGenerateUploadParameterQuery value() {
        startField("value");

        return this;
    }
}

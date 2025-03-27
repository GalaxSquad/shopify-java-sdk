// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `stagedUploadTargetGenerate` mutation.
*/
public class StagedUploadTargetGeneratePayloadQuery extends Query<StagedUploadTargetGeneratePayloadQuery> {
    StagedUploadTargetGeneratePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The signed parameters that can be used to upload the asset.
    */
    public StagedUploadTargetGeneratePayloadQuery parameters(MutationsStagedUploadTargetGenerateUploadParameterQueryDefinition queryDef) {
        startField("parameters");

        _queryBuilder.append('{');
        queryDef.define(new MutationsStagedUploadTargetGenerateUploadParameterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The signed URL where the asset can be uploaded.
    */
    public StagedUploadTargetGeneratePayloadQuery url() {
        startField("url");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public StagedUploadTargetGeneratePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

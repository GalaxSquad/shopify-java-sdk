// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `stagedUploadTargetsGenerate` mutation.
*/
public class StagedUploadTargetsGeneratePayloadQuery extends Query<StagedUploadTargetsGeneratePayloadQuery> {
    StagedUploadTargetsGeneratePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The staged upload targets that were generated.
    */
    public StagedUploadTargetsGeneratePayloadQuery urls(StagedUploadTargetQueryDefinition queryDef) {
        startField("urls");

        _queryBuilder.append('{');
        queryDef.define(new StagedUploadTargetQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public StagedUploadTargetsGeneratePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

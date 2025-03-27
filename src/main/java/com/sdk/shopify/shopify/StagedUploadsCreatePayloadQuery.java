// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `stagedUploadsCreate` mutation.
*/
public class StagedUploadsCreatePayloadQuery extends Query<StagedUploadsCreatePayloadQuery> {
    StagedUploadsCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The staged upload targets that were generated.
    */
    public StagedUploadsCreatePayloadQuery stagedTargets(StagedMediaUploadTargetQueryDefinition queryDef) {
        startField("stagedTargets");

        _queryBuilder.append('{');
        queryDef.define(new StagedMediaUploadTargetQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public StagedUploadsCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

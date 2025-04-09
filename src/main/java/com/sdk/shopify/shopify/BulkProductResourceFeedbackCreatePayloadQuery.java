// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `bulkProductResourceFeedbackCreate` mutation.
*/
public class BulkProductResourceFeedbackCreatePayloadQuery extends Query<BulkProductResourceFeedbackCreatePayloadQuery> {
    BulkProductResourceFeedbackCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The feedback that's created.
    */
    public BulkProductResourceFeedbackCreatePayloadQuery feedback(ProductResourceFeedbackQueryDefinition queryDef) {
        startField("feedback");

        _queryBuilder.append('{');
        queryDef.define(new ProductResourceFeedbackQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public BulkProductResourceFeedbackCreatePayloadQuery userErrors(BulkProductResourceFeedbackCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BulkProductResourceFeedbackCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

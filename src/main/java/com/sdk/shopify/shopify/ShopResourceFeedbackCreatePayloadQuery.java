// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `shopResourceFeedbackCreate` mutation.
*/
public class ShopResourceFeedbackCreatePayloadQuery extends Query<ShopResourceFeedbackCreatePayloadQuery> {
    ShopResourceFeedbackCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The shop feedback that's created.
    */
    public ShopResourceFeedbackCreatePayloadQuery feedback(AppFeedbackQueryDefinition queryDef) {
        startField("feedback");

        _queryBuilder.append('{');
        queryDef.define(new AppFeedbackQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ShopResourceFeedbackCreatePayloadQuery userErrors(ShopResourceFeedbackCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ShopResourceFeedbackCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

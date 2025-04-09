// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents feedback from apps about a resource, and the steps required to set up the apps on the
* shop.
*/
public class ResourceFeedbackQuery extends Query<ResourceFeedbackQuery> {
    ResourceFeedbackQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * List of AppFeedback detailing issues regarding a resource.
    */
    public ResourceFeedbackQuery details(AppFeedbackQueryDefinition queryDef) {
        startField("details");

        _queryBuilder.append('{');
        queryDef.define(new AppFeedbackQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Summary of resource feedback pertaining to the resource.
    */
    public ResourceFeedbackQuery summary() {
        startField("summary");

        return this;
    }
}

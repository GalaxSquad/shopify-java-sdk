// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Reports the status of shops and their resources and displays this information
* within Shopify admin. AppFeedback is used to notify merchants about steps they need to take
* to set up an app on their store.
*/
public class AppFeedbackQuery extends Query<AppFeedbackQuery> {
    AppFeedbackQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The application associated to the feedback.
    */
    public AppFeedbackQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the app feedback was generated.
    */
    public AppFeedbackQuery feedbackGeneratedAt() {
        startField("feedbackGeneratedAt");

        return this;
    }

    /**
    * A link to where merchants can resolve errors.
    */
    public AppFeedbackQuery link(LinkQueryDefinition queryDef) {
        startField("link");

        _queryBuilder.append('{');
        queryDef.define(new LinkQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The feedback message presented to the merchant.
    */
    public AppFeedbackQuery messages(UserErrorQueryDefinition queryDef) {
        startField("messages");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Conveys the state of the feedback and whether it requires merchant action or not.
    */
    public AppFeedbackQuery state() {
        startField("state");

        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Events chronicle resource activities such as the creation of an article, the fulfillment of an
* order, or the
* addition of a product.
*/
public class EventQuery extends Query<EventQuery> {
    EventQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The action that occured.
    */
    public EventQuery action() {
        startField("action");

        return this;
    }

    /**
    * The name of the app that created the event.
    */
    public EventQuery appTitle() {
        startField("appTitle");

        return this;
    }

    /**
    * Whether the event was created by an app.
    */
    public EventQuery attributeToApp() {
        startField("attributeToApp");

        return this;
    }

    /**
    * Whether the event was caused by an admin user.
    */
    public EventQuery attributeToUser() {
        startField("attributeToUser");

        return this;
    }

    /**
    * The date and time when the event was created.
    */
    public EventQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Whether the event is critical.
    */
    public EventQuery criticalAlert() {
        startField("criticalAlert");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public EventQuery id() {
        startField("id");

        return this;
    }

    /**
    * Human readable text that describes the event.
    */
    public EventQuery message() {
        startField("message");

        return this;
    }

    public EventQuery onBasicEvent(BasicEventQueryDefinition queryDef) {
        startInlineFragment("BasicEvent");
        queryDef.define(new BasicEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public EventQuery onCommentEvent(CommentEventQueryDefinition queryDef) {
        startInlineFragment("CommentEvent");
        queryDef.define(new CommentEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

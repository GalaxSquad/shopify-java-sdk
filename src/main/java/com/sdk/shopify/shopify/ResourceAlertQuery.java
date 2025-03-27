// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* An alert message that appears in the Shopify admin about a problem with a store resource, with 1 or
* more actions to take. For example, you could use an alert to indicate that you're not charging taxes
* on some product variants.
* They can optionally have a specific icon and be dismissed by merchants.
*/
public class ResourceAlertQuery extends Query<ResourceAlertQuery> {
    ResourceAlertQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Buttons in the alert that link to related information.
    * For example, _Edit variants_.
    */
    public ResourceAlertQuery actions(ResourceAlertActionQueryDefinition queryDef) {
        startField("actions");

        _queryBuilder.append('{');
        queryDef.define(new ResourceAlertActionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The secondary text in the alert that includes further information or instructions about how to solve
    * a problem.
    */
    public ResourceAlertQuery content() {
        startField("content");

        return this;
    }

    /**
    * Unique identifier that appears when an alert is manually closed by the merchant.
    * Most alerts can't be manually closed.
    */
    public ResourceAlertQuery dismissibleHandle() {
        startField("dismissibleHandle");

        return this;
    }

    /**
    * An icon that's optionally displayed with the alert.
    */
    public ResourceAlertQuery icon() {
        startField("icon");

        return this;
    }

    /**
    * Indication of how important the alert is.
    */
    public ResourceAlertQuery severity() {
        startField("severity");

        return this;
    }

    /**
    * The primary text in the alert that includes information or describes the problem.
    */
    public ResourceAlertQuery title() {
        startField("title");

        return this;
    }
}

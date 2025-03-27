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
* A checkout profile defines the branding settings and the UI extensions for a store's checkout. A
* checkout profile could be published or draft. A store might have at most one published checkout
* profile, which is used to render their live checkout. The store could also have multiple draft
* profiles that were created, previewed, and published using the admin checkout editor.
*/
public class CheckoutProfileQuery extends Query<CheckoutProfileQuery> {
    CheckoutProfileQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The date and time when the checkout profile was created.
    */
    public CheckoutProfileQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The date and time when the checkout profile was last edited.
    */
    public CheckoutProfileQuery editedAt() {
        startField("editedAt");

        return this;
    }

    /**
    * Whether the checkout profile is published or not.
    */
    public CheckoutProfileQuery isPublished() {
        startField("isPublished");

        return this;
    }

    /**
    * The profile name.
    */
    public CheckoutProfileQuery name() {
        startField("name");

        return this;
    }

    /**
    * Whether the checkout profile Thank You Page and Order Status Page are actively using extensibility
    * or not.
    */
    public CheckoutProfileQuery typOspPagesActive() {
        startField("typOspPagesActive");

        return this;
    }

    /**
    * The date and time when the checkout profile was last updated.
    */
    public CheckoutProfileQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An app extension page for the customer account navigation menu.
*/
public class CustomerAccountAppExtensionPageQuery extends Query<CustomerAccountAppExtensionPageQuery> {
    CustomerAccountAppExtensionPageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The UUID of the app extension.
    */
    public CustomerAccountAppExtensionPageQuery appExtensionUuid() {
        startField("appExtensionUuid");

        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */
    public CustomerAccountAppExtensionPageQuery defaultCursor() {
        startField("defaultCursor");

        return this;
    }

    /**
    * A unique, human-friendly string for the customer account page.
    */
    public CustomerAccountAppExtensionPageQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * The title of the customer account page.
    */
    public CustomerAccountAppExtensionPageQuery title() {
        startField("title");

        return this;
    }
}

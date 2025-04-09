// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A native page for the customer account navigation menu.
*/
public class CustomerAccountNativePageQuery extends Query<CustomerAccountNativePageQuery> {
    CustomerAccountNativePageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */
    public CustomerAccountNativePageQuery defaultCursor() {
        startField("defaultCursor");

        return this;
    }

    /**
    * A unique, human-friendly string for the customer account page.
    */
    public CustomerAccountNativePageQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * The type of customer account native page.
    */
    public CustomerAccountNativePageQuery pageType() {
        startField("pageType");

        return this;
    }

    /**
    * The title of the customer account page.
    */
    public CustomerAccountNativePageQuery title() {
        startField("title");

        return this;
    }
}

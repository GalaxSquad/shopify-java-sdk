// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A customer account page.
*/
public class CustomerAccountPageQuery extends Query<CustomerAccountPageQuery> {
    CustomerAccountPageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */
    public CustomerAccountPageQuery defaultCursor() {
        startField("defaultCursor");

        return this;
    }

    /**
    * A unique, human-friendly string for the customer account page.
    */
    public CustomerAccountPageQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * The unique ID for the customer account page.
    */
    public CustomerAccountPageQuery id() {
        startField("id");

        return this;
    }

    /**
    * The title of the customer account page.
    */
    public CustomerAccountPageQuery title() {
        startField("title");

        return this;
    }

    public CustomerAccountPageQuery onCustomerAccountAppExtensionPage(CustomerAccountAppExtensionPageQueryDefinition queryDef) {
        startInlineFragment("CustomerAccountAppExtensionPage");
        queryDef.define(new CustomerAccountAppExtensionPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CustomerAccountPageQuery onCustomerAccountNativePage(CustomerAccountNativePageQueryDefinition queryDef) {
        startInlineFragment("CustomerAccountNativePage");
        queryDef.define(new CustomerAccountNativePageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

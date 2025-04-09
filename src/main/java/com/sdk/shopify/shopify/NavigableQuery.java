// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A default cursor that you can use in queries to paginate your results. Each edge in a connection can
* return a cursor, which is a reference to the edge's position in the connection. You can use an
* edge's cursor as
* the starting point to retrieve the nodes before or after it in a connection.
* To learn more about using cursor-based pagination, refer to
* [Paginating results with GraphQL](https://shopify.dev/api/usage/pagination-graphql).
*/
public class NavigableQuery extends Query<NavigableQuery> {
    NavigableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */
    public NavigableQuery defaultCursor() {
        startField("defaultCursor");

        return this;
    }

    public NavigableQuery onAbandonedCheckout(AbandonedCheckoutQueryDefinition queryDef) {
        startInlineFragment("AbandonedCheckout");
        queryDef.define(new AbandonedCheckoutQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NavigableQuery onArticle(ArticleQueryDefinition queryDef) {
        startInlineFragment("Article");
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NavigableQuery onCompany(CompanyQueryDefinition queryDef) {
        startInlineFragment("Company");
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NavigableQuery onCompanyLocation(CompanyLocationQueryDefinition queryDef) {
        startInlineFragment("CompanyLocation");
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NavigableQuery onCustomerAccountAppExtensionPage(CustomerAccountAppExtensionPageQueryDefinition queryDef) {
        startInlineFragment("CustomerAccountAppExtensionPage");
        queryDef.define(new CustomerAccountAppExtensionPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NavigableQuery onCustomerAccountNativePage(CustomerAccountNativePageQueryDefinition queryDef) {
        startInlineFragment("CustomerAccountNativePage");
        queryDef.define(new CustomerAccountNativePageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NavigableQuery onDraftOrder(DraftOrderQueryDefinition queryDef) {
        startInlineFragment("DraftOrder");
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NavigableQuery onPage(PageQueryDefinition queryDef) {
        startInlineFragment("Page");
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NavigableQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NavigableQuery onProductVariant(ProductVariantQueryDefinition queryDef) {
        startInlineFragment("ProductVariant");
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

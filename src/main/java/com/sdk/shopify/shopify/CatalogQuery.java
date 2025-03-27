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
* A list of products with publishing and pricing information.
* A catalog can be associated with a specific context, such as a
* [`Market`](https://shopify.dev/api/admin-graphql/current/objects/market),
* [`CompanyLocation`](https://shopify.dev/api/admin-graphql/current/objects/companylocation), or
* [`App`](https://shopify.dev/api/admin-graphql/current/objects/app).
*/
public class CatalogQuery extends Query<CatalogQuery> {
    CatalogQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * A globally-unique ID.
    */
    public CatalogQuery id() {
        startField("id");

        return this;
    }

    /**
    * Most recent catalog operations.
    */
    public CatalogQuery operations(ResourceOperationQueryDefinition queryDef) {
        startField("operations");

        _queryBuilder.append('{');
        queryDef.define(new ResourceOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price list associated with the catalog.
    */
    public CatalogQuery priceList(PriceListQueryDefinition queryDef) {
        startField("priceList");

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A group of products and collections that's published to a catalog.
    */
    public CatalogQuery publication(PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the catalog.
    */
    public CatalogQuery status() {
        startField("status");

        return this;
    }

    /**
    * The name of the catalog.
    */
    public CatalogQuery title() {
        startField("title");

        return this;
    }

    public CatalogQuery onAppCatalog(AppCatalogQueryDefinition queryDef) {
        startInlineFragment("AppCatalog");
        queryDef.define(new AppCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CatalogQuery onCompanyLocationCatalog(CompanyLocationCatalogQueryDefinition queryDef) {
        startInlineFragment("CompanyLocationCatalog");
        queryDef.define(new CompanyLocationCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CatalogQuery onMarketCatalog(MarketCatalogQueryDefinition queryDef) {
        startInlineFragment("MarketCatalog");
        queryDef.define(new MarketCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

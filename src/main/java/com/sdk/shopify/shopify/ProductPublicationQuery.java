// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the channels where a product is published.
*/
public class ProductPublicationQuery extends Query<ProductPublicationQuery> {
    ProductPublicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The channel where the product was or is published.
    */
    public ProductPublicationQuery channel(ChannelQueryDefinition queryDef) {
        startField("channel");

        _queryBuilder.append('{');
        queryDef.define(new ChannelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the publication is published or not.
    */
    public ProductPublicationQuery isPublished() {
        startField("isPublished");

        return this;
    }

    /**
    * The product that was or is going to be published on the channel.
    */
    public ProductPublicationQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date that the product was or is going to be published on the channel.
    */
    public ProductPublicationQuery publishDate() {
        startField("publishDate");

        return this;
    }
}

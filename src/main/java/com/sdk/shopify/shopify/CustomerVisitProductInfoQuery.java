// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* This type returns the information about the product and product variant from a customer visit.
*/
public class CustomerVisitProductInfoQuery extends Query<CustomerVisitProductInfoQuery> {
    CustomerVisitProductInfoQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product information. If `null`, then the product was deleted from the store.
    */
    public CustomerVisitProductInfoQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of the product that the customer requested.
    */
    public CustomerVisitProductInfoQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The product variant information, if the product variant exists.
    */
    public CustomerVisitProductInfoQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

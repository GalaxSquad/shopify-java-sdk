// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed `ProductOptionsReorder` mutation.
*/
public class ProductOptionsReorderUserErrorQuery extends Query<ProductOptionsReorderUserErrorQuery> {
    ProductOptionsReorderUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductOptionsReorderUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductOptionsReorderUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductOptionsReorderUserErrorQuery message() {
        startField("message");

        return this;
    }
}

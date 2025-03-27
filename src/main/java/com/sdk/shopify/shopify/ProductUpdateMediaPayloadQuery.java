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
* Return type for `productUpdateMedia` mutation.
*/
public class ProductUpdateMediaPayloadQuery extends Query<ProductUpdateMediaPayloadQuery> {
    ProductUpdateMediaPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated media object.
    */
    public ProductUpdateMediaPayloadQuery media(MediaQueryDefinition queryDef) {
        startField("media");

        _queryBuilder.append('{');
        queryDef.define(new MediaQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductUpdateMediaPayloadQuery mediaUserErrors(MediaUserErrorQueryDefinition queryDef) {
        startField("mediaUserErrors");

        _queryBuilder.append('{');
        queryDef.define(new MediaUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product on which media was updated.
    */
    public ProductUpdateMediaPayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

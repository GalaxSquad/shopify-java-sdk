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
* An entity that represents details of an asynchronous operation on a product.
*/
public class ProductOperationQuery extends Query<ProductOperationQuery> {
    ProductOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The product on which the operation is being performed.
    */
    public ProductOperationQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of this operation.
    */
    public ProductOperationQuery status() {
        startField("status");

        return this;
    }

    public ProductOperationQuery onProductBundleOperation(ProductBundleOperationQueryDefinition queryDef) {
        startInlineFragment("ProductBundleOperation");
        queryDef.define(new ProductBundleOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductOperationQuery onProductDeleteOperation(ProductDeleteOperationQueryDefinition queryDef) {
        startInlineFragment("ProductDeleteOperation");
        queryDef.define(new ProductDeleteOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductOperationQuery onProductDuplicateOperation(ProductDuplicateOperationQueryDefinition queryDef) {
        startInlineFragment("ProductDuplicateOperation");
        queryDef.define(new ProductDuplicateOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductOperationQuery onProductSetOperation(ProductSetOperationQueryDefinition queryDef) {
        startInlineFragment("ProductSetOperation");
        queryDef.define(new ProductSetOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

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

public class ArbitraryHostQuery extends Query<ArbitraryHostQuery> {
    ArbitraryHostQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public ArbitraryHostQuery anotherHost(ArbitraryHostQueryDefinition queryDef) {
        startField("anotherHost");

        _queryBuilder.append('{');
        queryDef.define(new ArbitraryHostQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductsArguments extends Arguments {
        ProductsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        public ProductsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ProductsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductsArgumentsDefinition {
        void define(ProductsArguments args);
    }

    public ArbitraryHostQuery products(int first, ProductConnectionQueryDefinition queryDef) {
        return products(first, args -> {}, queryDef);
    }

    public ArbitraryHostQuery products(int first, ProductsArgumentsDefinition argsDef, ProductConnectionQueryDefinition queryDef) {
        startField("products");

        _queryBuilder.append("(first:");
        _queryBuilder.append(first);

        argsDef.define(new ProductsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

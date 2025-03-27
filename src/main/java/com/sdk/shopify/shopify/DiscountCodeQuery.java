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
* The type of discount associated with the discount code. For example, the discount code might offer a
* basic discount of a fixed percentage, or a fixed amount, on specific products or the order.
* Alternatively, the discount might offer the customer free shipping on their order. A third option is
* a Buy X, Get Y (BXGY) discount, which offers a customer discounts on select products if they add a
* specific product to their order.
*/
public class DiscountCodeQuery extends Query<DiscountCodeQuery> {
    DiscountCodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountCodeQuery onDiscountCodeApp(DiscountCodeAppQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeApp");
        queryDef.define(new DiscountCodeAppQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCodeQuery onDiscountCodeBasic(DiscountCodeBasicQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeBasic");
        queryDef.define(new DiscountCodeBasicQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCodeQuery onDiscountCodeBxgy(DiscountCodeBxgyQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeBxgy");
        queryDef.define(new DiscountCodeBxgyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCodeQuery onDiscountCodeFreeShipping(DiscountCodeFreeShippingQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeFreeShipping");
        queryDef.define(new DiscountCodeFreeShippingQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

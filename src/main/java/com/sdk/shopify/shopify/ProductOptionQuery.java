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
* The product property names. For example, "Size", "Color", and "Material".
* Variants are selected based on permutations of these options.
* The limit for each product property name is 255 characters.
*/
public class ProductOptionQuery extends Query<ProductOptionQuery> {
    ProductOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The metafield identifier linked to this option.
    */
    public ProductOptionQuery linkedMetafield(LinkedMetafieldQueryDefinition queryDef) {
        startField("linkedMetafield");

        _queryBuilder.append('{');
        queryDef.define(new LinkedMetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product option’s name.
    */
    public ProductOptionQuery name() {
        startField("name");

        return this;
    }

    /**
    * Similar to values, option_values returns all the corresponding option value objects to the product
    * option, including values not assigned to any variants.
    */
    public ProductOptionQuery optionValues(ProductOptionValueQueryDefinition queryDef) {
        startField("optionValues");

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product option's position.
    */
    public ProductOptionQuery position() {
        startField("position");

        return this;
    }

    public class TranslationsArguments extends Arguments {
        TranslationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Filters translations by market ID. Use this argument to retrieve content specific to a market.
        */
        public TranslationsArguments marketId(ID value) {
            if (value != null) {
                startArgument("marketId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface TranslationsArgumentsDefinition {
        void define(TranslationsArguments args);
    }

    /**
    * The published translations associated with the resource.
    */
    public ProductOptionQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public ProductOptionQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
        startField("translations");

        _queryBuilder.append("(locale:");
        Query.appendQuotedString(_queryBuilder, locale.toString());

        argsDef.define(new TranslationsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TranslationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The corresponding value to the product option name.
    */
    public ProductOptionQuery values() {
        startField("values");

        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* The product option value names. For example, "Red", "Blue", and "Green" for a "Color" option.
*/
public class ProductOptionValueQuery extends Query<ProductOptionValueQuery> {
    ProductOptionValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Whether the product option value has any linked variants.
    */
    public ProductOptionValueQuery hasVariants() {
        startField("hasVariants");

        return this;
    }

    /**
    * The value of the linked metafield.
    */
    public ProductOptionValueQuery linkedMetafieldValue() {
        startField("linkedMetafieldValue");

        return this;
    }

    /**
    * The name of the product option value.
    */
    public ProductOptionValueQuery name() {
        startField("name");

        return this;
    }

    /**
    * The swatch associated with the product option value.
    */
    public ProductOptionValueQuery swatch(ProductOptionValueSwatchQueryDefinition queryDef) {
        startField("swatch");

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionValueSwatchQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public ProductOptionValueQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public ProductOptionValueQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
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
}

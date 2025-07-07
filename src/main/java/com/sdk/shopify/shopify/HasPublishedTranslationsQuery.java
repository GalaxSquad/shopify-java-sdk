// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* Published translations associated with the resource.
*/
public class HasPublishedTranslationsQuery extends Query<HasPublishedTranslationsQuery> {
    HasPublishedTranslationsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
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
    public HasPublishedTranslationsQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public HasPublishedTranslationsQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
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

    public HasPublishedTranslationsQuery onArticle(ArticleQueryDefinition queryDef) {
        startInlineFragment("Article");
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onBlog(BlogQueryDefinition queryDef) {
        startInlineFragment("Blog");
        queryDef.define(new BlogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onCollection(CollectionQueryDefinition queryDef) {
        startInlineFragment("Collection");
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onCookieBanner(CookieBannerQueryDefinition queryDef) {
        startInlineFragment("CookieBanner");
        queryDef.define(new CookieBannerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onLink(LinkQueryDefinition queryDef) {
        startInlineFragment("Link");
        queryDef.define(new LinkQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onMenu(MenuQueryDefinition queryDef) {
        startInlineFragment("Menu");
        queryDef.define(new MenuQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onOnlineStoreTheme(OnlineStoreThemeQueryDefinition queryDef) {
        startInlineFragment("OnlineStoreTheme");
        queryDef.define(new OnlineStoreThemeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onPage(PageQueryDefinition queryDef) {
        startInlineFragment("Page");
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onProductOption(ProductOptionQueryDefinition queryDef) {
        startInlineFragment("ProductOption");
        queryDef.define(new ProductOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onProductOptionValue(ProductOptionValueQueryDefinition queryDef) {
        startInlineFragment("ProductOptionValue");
        queryDef.define(new ProductOptionValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onProductVariant(ProductVariantQueryDefinition queryDef) {
        startInlineFragment("ProductVariant");
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onSellingPlan(SellingPlanQueryDefinition queryDef) {
        startInlineFragment("SellingPlan");
        queryDef.define(new SellingPlanQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onSellingPlanGroup(SellingPlanGroupQueryDefinition queryDef) {
        startInlineFragment("SellingPlanGroup");
        queryDef.define(new SellingPlanGroupQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onShop(ShopQueryDefinition queryDef) {
        startInlineFragment("Shop");
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasPublishedTranslationsQuery onShopPolicy(ShopPolicyQueryDefinition queryDef) {
        startInlineFragment("ShopPolicy");
        queryDef.define(new ShopPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* This can be a domain (e.g. `example.ca`), subdomain (e.g. `ca.example.com`), or subfolders of the
* primary
* domain (e.g. `example.com/en-ca`). Each web presence comprises one or more language
* variants.
* Note: while the domain/subfolders defined by a web presence are not applicable to
* custom storefronts, which must manage their own domains and routing, the languages chosen
* here do govern [the languages available on the Storefront
* API](https://shopify.dev/custom-storefronts/internationalization/multiple-languages) for the
* countries
* using this web presence.
*/
public class WebPresenceQuery extends Query<WebPresenceQuery> {
    WebPresenceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The ShopLocale object for the alternate locales. When a domain is used, these locales will be
    * available as language-specific subfolders. For example, if English is an
    * alternate locale, and `example.ca` is the domain, then
    * `example.ca/en` will load in English.
    */
    public WebPresenceQuery alternateLocales(ShopLocaleQueryDefinition queryDef) {
        startField("alternateLocales");

        _queryBuilder.append('{');
        queryDef.define(new ShopLocaleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ShopLocale object for the default locale. When a domain is used, this is the locale that will
    * be used when the domain root is accessed. For example, if French is the default locale,
    * and `example.ca` is the domain, then `example.ca` will load in French.
    */
    public WebPresenceQuery defaultLocale(ShopLocaleQueryDefinition queryDef) {
        startField("defaultLocale");

        _queryBuilder.append('{');
        queryDef.define(new ShopLocaleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The web presence’s domain. This field will be null if `subfolderSuffix` is present.
    */
    public WebPresenceQuery domain(DomainQueryDefinition queryDef) {
        startField("domain");

        _queryBuilder.append('{');
        queryDef.define(new DomainQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketsArguments extends Arguments {
        MarketsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come before the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MarketsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MarketsArgumentsDefinition {
        void define(MarketsArguments args);
    }

    /**
    * The associated markets for this web presence.
    */
    public WebPresenceQuery markets(MarketConnectionQueryDefinition queryDef) {
        return markets(args -> {}, queryDef);
    }

    /**
    * The associated markets for this web presence.
    */
    public WebPresenceQuery markets(MarketsArgumentsDefinition argsDef, MarketConnectionQueryDefinition queryDef) {
        startField("markets");

        MarketsArguments args = new MarketsArguments(_queryBuilder);
        argsDef.define(args);
        MarketsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of root URLs for each of the web presence’s locales.
    */
    public WebPresenceQuery rootUrls(WebPresenceRootUrlQueryDefinition queryDef) {
        startField("rootUrls");

        _queryBuilder.append('{');
        queryDef.define(new WebPresenceRootUrlQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The suffix of the subfolders defined by the web presence.
    * Example: in `/en-us` the subfolder suffix is `us`.
    * This field will be null if `domain` isn't null.
    */
    public WebPresenceQuery subfolderSuffix() {
        startField("subfolderSuffix");

        return this;
    }
}

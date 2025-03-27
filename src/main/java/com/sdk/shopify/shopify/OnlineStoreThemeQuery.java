// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* A theme for display on the storefront.
*/
public class OnlineStoreThemeQuery extends Query<OnlineStoreThemeQuery> {
    OnlineStoreThemeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The date and time when the theme was created.
    */
    public OnlineStoreThemeQuery createdAt() {
        startField("createdAt");

        return this;
    }

    public class FilesArguments extends Arguments {
        FilesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The filenames of the theme files. At most 50 filenames can be specified. Use '*' to match zero or
        * more characters.
        */
        public FilesArguments filenames(List<String> value) {
            if (value != null) {
                startArgument("filenames");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * Returns at most the first n files for this theme. Fewer than n files may be returned to stay within
        * the payload size limit, or when the end of the list is reached. At most 250 can be fetched at once.
        */
        public FilesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A cursor for use in pagination.
        */
        public FilesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FilesArgumentsDefinition {
        void define(FilesArguments args);
    }

    /**
    * The files in the theme.
    */
    public OnlineStoreThemeQuery files(OnlineStoreThemeFileConnectionQueryDefinition queryDef) {
        return files(args -> {}, queryDef);
    }

    /**
    * The files in the theme.
    */
    public OnlineStoreThemeQuery files(FilesArgumentsDefinition argsDef, OnlineStoreThemeFileConnectionQueryDefinition queryDef) {
        startField("files");

        FilesArguments args = new FilesArguments(_queryBuilder);
        argsDef.define(args);
        FilesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFileConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the theme, set by the merchant.
    */
    public OnlineStoreThemeQuery name() {
        startField("name");

        return this;
    }

    /**
    * The prefix of the theme.
    */
    public OnlineStoreThemeQuery prefix() {
        startField("prefix");

        return this;
    }

    /**
    * Whether the theme is processing.
    */
    public OnlineStoreThemeQuery processing() {
        startField("processing");

        return this;
    }

    /**
    * Whether the theme processing failed.
    */
    public OnlineStoreThemeQuery processingFailed() {
        startField("processingFailed");

        return this;
    }

    /**
    * The role of the theme.
    */
    public OnlineStoreThemeQuery role() {
        startField("role");

        return this;
    }

    /**
    * The theme store ID.
    */
    public OnlineStoreThemeQuery themeStoreId() {
        startField("themeStoreId");

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
    public OnlineStoreThemeQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public OnlineStoreThemeQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
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
    * The date and time when the theme was last updated.
    */
    public OnlineStoreThemeQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}

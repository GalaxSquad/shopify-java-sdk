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
* A resource that has translatable fields.
*/
public class TranslatableResourceQuery extends Query<TranslatableResourceQuery> {
    TranslatableResourceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class NestedTranslatableResourcesArguments extends Arguments {
        NestedTranslatableResourcesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Return only resources of a type.
        */
        public NestedTranslatableResourcesArguments resourceType(TranslatableResourceType value) {
            if (value != null) {
                startArgument("resourceType");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public NestedTranslatableResourcesArguments first(Integer value) {
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
        public NestedTranslatableResourcesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public NestedTranslatableResourcesArguments last(Integer value) {
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
        public NestedTranslatableResourcesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public NestedTranslatableResourcesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NestedTranslatableResourcesArgumentsDefinition {
        void define(NestedTranslatableResourcesArguments args);
    }

    /**
    * Nested translatable resources under the current resource.
    */
    public TranslatableResourceQuery nestedTranslatableResources(TranslatableResourceConnectionQueryDefinition queryDef) {
        return nestedTranslatableResources(args -> {}, queryDef);
    }

    /**
    * Nested translatable resources under the current resource.
    */
    public TranslatableResourceQuery nestedTranslatableResources(NestedTranslatableResourcesArgumentsDefinition argsDef, TranslatableResourceConnectionQueryDefinition queryDef) {
        startField("nestedTranslatableResources");

        NestedTranslatableResourcesArguments args = new NestedTranslatableResourcesArguments(_queryBuilder);
        argsDef.define(args);
        NestedTranslatableResourcesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TranslatableResourceConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * GID of the resource.
    */
    public TranslatableResourceQuery resourceId() {
        startField("resourceId");

        return this;
    }

    public class TranslatableContentArguments extends Arguments {
        TranslatableContentArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filters translatable content by market ID. Use this argument to retrieve translatable content
        * specific to a market.
        */
        public TranslatableContentArguments marketId(ID value) {
            if (value != null) {
                startArgument("marketId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface TranslatableContentArgumentsDefinition {
        void define(TranslatableContentArguments args);
    }

    /**
    * Translatable content.
    */
    public TranslatableResourceQuery translatableContent(TranslatableContentQueryDefinition queryDef) {
        return translatableContent(args -> {}, queryDef);
    }

    /**
    * Translatable content.
    */
    public TranslatableResourceQuery translatableContent(TranslatableContentArgumentsDefinition argsDef, TranslatableContentQueryDefinition queryDef) {
        startField("translatableContent");

        TranslatableContentArguments args = new TranslatableContentArguments(_queryBuilder);
        argsDef.define(args);
        TranslatableContentArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TranslatableContentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TranslationsArguments extends Arguments {
        TranslationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Filters by outdated translations.
        */
        public TranslationsArguments outdated(Boolean value) {
            if (value != null) {
                startArgument("outdated");
                _queryBuilder.append(value);
            }
            return this;
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
    * Translatable content translations (includes unpublished locales).
    */
    public TranslatableResourceQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * Translatable content translations (includes unpublished locales).
    */
    public TranslatableResourceQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
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

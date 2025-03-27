// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* Policy that a merchant has configured for their store, such as their refund or privacy policy.
*/
public class ShopPolicyQuery extends Query<ShopPolicyQuery> {
    ShopPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The text of the policy. The maximum size is 512kb.
    */
    public ShopPolicyQuery body() {
        startField("body");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was
    * created.
    */
    public ShopPolicyQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The translated title of the policy. For example, Refund Policy or Politique de remboursement.
    */
    public ShopPolicyQuery title() {
        startField("title");

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
    public ShopPolicyQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public ShopPolicyQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
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
    * The shop policy type.
    */
    public ShopPolicyQuery type() {
        startField("type");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was
    * last modified.
    */
    public ShopPolicyQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * The public URL of the policy.
    */
    public ShopPolicyQuery url() {
        startField("url");

        return this;
    }
}

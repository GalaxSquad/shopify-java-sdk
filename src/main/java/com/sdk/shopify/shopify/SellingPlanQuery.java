// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* Represents how a product can be sold and purchased. Selling plans and associated records (selling
* plan groups
* and policies) are deleted 48 hours after a merchant uninstalls their subscriptions app. We recommend
* backing
* up these records if you need to restore them later.
* For more information on selling plans, refer to
* [*Creating and managing selling
* plans*](https://shopify.dev/docs/apps/selling-strategies/subscriptions/selling-plans).
*/
public class SellingPlanQuery extends Query<SellingPlanQuery> {
    SellingPlanQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A selling plan policy which describes the recurring billing details.
    */
    public SellingPlanQuery billingPolicy(SellingPlanBillingPolicyQueryDefinition queryDef) {
        startField("billingPolicy");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanBillingPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The category used to classify the selling plan for reporting purposes.
    */
    public SellingPlanQuery category() {
        startField("category");

        return this;
    }

    /**
    * The date and time when the selling plan was created.
    */
    public SellingPlanQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * A selling plan policy which describes the delivery details.
    */
    public SellingPlanQuery deliveryPolicy(SellingPlanDeliveryPolicyQueryDefinition queryDef) {
        startField("deliveryPolicy");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanDeliveryPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Buyer facing string which describes the selling plan commitment.
    */
    public SellingPlanQuery description() {
        startField("description");

        return this;
    }

    /**
    * When to reserve inventory for a selling plan.
    */
    public SellingPlanQuery inventoryPolicy(SellingPlanInventoryPolicyQueryDefinition queryDef) {
        startField("inventoryPolicy");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanInventoryPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldArguments extends Arguments {
        MetafieldArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MetafieldArgumentsDefinition {
        void define(MetafieldArguments args);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public SellingPlanQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public SellingPlanQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
        startField("metafield");

        _queryBuilder.append("(key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        argsDef.define(new MetafieldArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldsArguments extends Arguments {
        MetafieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The metafield namespace to filter by. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldsArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * List of keys of metafields in the format `namespace.key`, will be returned in the same format.
        */
        public MetafieldsArguments keys(List<String> value) {
            if (value != null) {
                startArgument("keys");
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
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments first(Integer value) {
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
        public MetafieldsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments last(Integer value) {
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
        public MetafieldsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetafieldsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MetafieldsArgumentsDefinition {
        void define(MetafieldsArguments args);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public SellingPlanQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public SellingPlanQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
        startField("metafields");

        MetafieldsArguments args = new MetafieldsArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A customer-facing description of the selling plan.
    * If your store supports multiple currencies, then don't include country-specific pricing content,
    * such as "Buy monthly, get 10$ CAD off". This field won't be converted to reflect different
    * currencies.
    */
    public SellingPlanQuery name() {
        startField("name");

        return this;
    }

    /**
    * The values of all options available on the selling plan. Selling plans are grouped together in
    * Liquid when they're created by the same app, and have the same `selling_plan_group.name` and
    * `selling_plan_group.options` values.
    */
    public SellingPlanQuery options() {
        startField("options");

        return this;
    }

    /**
    * Relative position of the selling plan for display. A lower position will be displayed before a
    * higher position.
    */
    public SellingPlanQuery position() {
        startField("position");

        return this;
    }

    /**
    * Selling plan pricing details.
    */
    public SellingPlanQuery pricingPolicies(SellingPlanPricingPolicyQueryDefinition queryDef) {
        startField("pricingPolicies");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanPricingPolicyQuery(_queryBuilder));
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
    public SellingPlanQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public SellingPlanQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
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

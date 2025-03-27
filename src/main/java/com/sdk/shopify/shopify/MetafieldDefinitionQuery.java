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
* Metafield definitions enable you to define additional validation constraints for metafields, and
* enable the
* merchant to edit metafield values in context.
*/
public class MetafieldDefinitionQuery extends Query<MetafieldDefinitionQuery> {
    MetafieldDefinitionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The access settings associated with the metafield definition.
    */
    public MetafieldDefinitionQuery access(MetafieldAccessQueryDefinition queryDef) {
        startField("access");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldAccessQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The capabilities of the metafield definition.
    */
    public MetafieldDefinitionQuery capabilities(MetafieldCapabilitiesQueryDefinition queryDef) {
        startField("capabilities");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldCapabilitiesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The
    * [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definition
    * s)
    * that determine what subtypes of resources a metafield definition applies to.
    */
    public MetafieldDefinitionQuery constraints(MetafieldDefinitionConstraintsQueryDefinition queryDef) {
        startField("constraints");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionConstraintsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The description of the metafield definition.
    */
    public MetafieldDefinitionQuery description() {
        startField("description");

        return this;
    }

    /**
    * The unique identifier for the metafield definition within its namespace.
    */
    public MetafieldDefinitionQuery key() {
        startField("key");

        return this;
    }

    public class MetafieldsArguments extends Arguments {
        MetafieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns the metafields filtered by the validation status.
        */
        public MetafieldsArguments validationStatus(MetafieldValidationStatus value) {
            if (value != null) {
                startArgument("validationStatus");
                _queryBuilder.append(value.toString());
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
    * The metafields that belong to the metafield definition.
    */
    public MetafieldDefinitionQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * The metafields that belong to the metafield definition.
    */
    public MetafieldDefinitionQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
        startField("metafields");

        MetafieldsArguments args = new MetafieldsArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldsCountArguments extends Arguments {
        MetafieldsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The current validation status.
        */
        public MetafieldsCountArguments validationStatus(MetafieldValidationStatus value) {
            if (value != null) {
                startArgument("validationStatus");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface MetafieldsCountArgumentsDefinition {
        void define(MetafieldsCountArguments args);
    }

    /**
    * The count of the metafields that belong to the metafield definition.
    */
    public MetafieldDefinitionQuery metafieldsCount() {
        return metafieldsCount(args -> {});
    }

    /**
    * The count of the metafields that belong to the metafield definition.
    */
    public MetafieldDefinitionQuery metafieldsCount(MetafieldsCountArgumentsDefinition argsDef) {
        startField("metafieldsCount");

        MetafieldsCountArguments args = new MetafieldsCountArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldsCountArguments.end(args);

        return this;
    }

    /**
    * The human-readable name of the metafield definition.
    */
    public MetafieldDefinitionQuery name() {
        startField("name");

        return this;
    }

    /**
    * The container for a group of metafields that the metafield definition is associated with.
    */
    public MetafieldDefinitionQuery namespace() {
        startField("namespace");

        return this;
    }

    /**
    * The resource type that the metafield definition is attached to.
    */
    public MetafieldDefinitionQuery ownerType() {
        startField("ownerType");

        return this;
    }

    /**
    * The position of the metafield definition in the pinned list.
    */
    public MetafieldDefinitionQuery pinnedPosition() {
        startField("pinnedPosition");

        return this;
    }

    /**
    * The standard metafield definition template associated with the metafield definition.
    */
    public MetafieldDefinitionQuery standardTemplate(StandardMetafieldDefinitionTemplateQueryDefinition queryDef) {
        startField("standardTemplate");

        _queryBuilder.append('{');
        queryDef.define(new StandardMetafieldDefinitionTemplateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The type of data that each of the metafields that belong to the metafield definition will store.
    * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
    */
    public MetafieldDefinitionQuery type(MetafieldDefinitionTypeQueryDefinition queryDef) {
        startField("type");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the metafield definition can be used as a collection condition.
    */
    public MetafieldDefinitionQuery useAsCollectionCondition() {
        startField("useAsCollectionCondition");

        return this;
    }

    /**
    * The validation status for the metafields that belong to the metafield definition.
    */
    public MetafieldDefinitionQuery validationStatus() {
        startField("validationStatus");

        return this;
    }

    /**
    * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
    * the metafields that belong to the metafield definition. For example, for a metafield definition with
    * the
    * type `date`, you can set a minimum date validation so that each of the metafields that belong to it
    * can only
    * store dates after the specified minimum.
    */
    public MetafieldDefinitionQuery validations(MetafieldDefinitionValidationQueryDefinition queryDef) {
        startField("validations");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionValidationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

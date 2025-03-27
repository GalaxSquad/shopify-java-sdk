// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Standard metafield definition templates provide preset configurations to create metafield
* definitions.
* Each template has a specific namespace and key that we've reserved to have specific meanings for
* common use cases.
* Refer to the [list of standard metafield
* definitions](https://shopify.dev/apps/metafields/definitions/standard-definitions).
*/
public class StandardMetafieldDefinitionTemplateQuery extends Query<StandardMetafieldDefinitionTemplateQuery> {
    StandardMetafieldDefinitionTemplateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The description of the standard metafield definition.
    */
    public StandardMetafieldDefinitionTemplateQuery description() {
        startField("description");

        return this;
    }

    /**
    * The key owned by the definition after the definition has been activated.
    */
    public StandardMetafieldDefinitionTemplateQuery key() {
        startField("key");

        return this;
    }

    /**
    * The human-readable name for the standard metafield definition.
    */
    public StandardMetafieldDefinitionTemplateQuery name() {
        startField("name");

        return this;
    }

    /**
    * The namespace owned by the definition after the definition has been activated.
    */
    public StandardMetafieldDefinitionTemplateQuery namespace() {
        startField("namespace");

        return this;
    }

    /**
    * The list of resource types that the standard metafield definition can be applied to.
    */
    public StandardMetafieldDefinitionTemplateQuery ownerTypes() {
        startField("ownerTypes");

        return this;
    }

    /**
    * The associated [metafield definition type](https://shopify.dev/apps/metafields/definitions/types)
    * that the metafield stores.
    */
    public StandardMetafieldDefinitionTemplateQuery type(MetafieldDefinitionTypeQueryDefinition queryDef) {
        startField("type");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The configured validations for the standard metafield definition.
    */
    public StandardMetafieldDefinitionTemplateQuery validations(MetafieldDefinitionValidationQueryDefinition queryDef) {
        startField("validations");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionValidationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether metafields for the definition are by default visible using the Storefront API.
    */
    public StandardMetafieldDefinitionTemplateQuery visibleToStorefrontApi() {
        startField("visibleToStorefrontApi");

        return this;
    }
}

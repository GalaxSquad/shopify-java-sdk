// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A preset field definition on a standard metaobject definition template.
*/
public class StandardMetaobjectDefinitionFieldTemplateQuery extends Query<StandardMetaobjectDefinitionFieldTemplateQuery> {
    StandardMetaobjectDefinitionFieldTemplateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The administrative description.
    */
    public StandardMetaobjectDefinitionFieldTemplateQuery description() {
        startField("description");

        return this;
    }

    /**
    * The key owned by the definition after the definition has been enabled.
    */
    public StandardMetaobjectDefinitionFieldTemplateQuery key() {
        startField("key");

        return this;
    }

    /**
    * The human-readable name.
    */
    public StandardMetaobjectDefinitionFieldTemplateQuery name() {
        startField("name");

        return this;
    }

    /**
    * The required status of the field within the object composition.
    */
    public StandardMetaobjectDefinitionFieldTemplateQuery required() {
        startField("required");

        return this;
    }

    /**
    * The associated [metafield definition type](https://shopify.dev/apps/metafields/definitions/types)
    * that the metafield stores.
    */
    public StandardMetaobjectDefinitionFieldTemplateQuery type(MetafieldDefinitionTypeQueryDefinition queryDef) {
        startField("type");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The configured validations for the standard metafield definition.
    */
    public StandardMetaobjectDefinitionFieldTemplateQuery validations(MetafieldDefinitionValidationQueryDefinition queryDef) {
        startField("validations");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionValidationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether metafields for the definition are by default visible using the Storefront API.
    */
    public StandardMetaobjectDefinitionFieldTemplateQuery visibleToStorefrontApi() {
        startField("visibleToStorefrontApi");

        return this;
    }
}

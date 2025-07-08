// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Standard metaobject definition templates provide preset configurations to create metaobject
* definitions.
*/
public class StandardMetaobjectDefinitionTemplateQuery extends Query<StandardMetaobjectDefinitionTemplateQuery> {
    StandardMetaobjectDefinitionTemplateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The administrative description.
    */
    public StandardMetaobjectDefinitionTemplateQuery description() {
        startField("description");

        return this;
    }

    /**
    * The key of a field to reference as the display name for each object.
    */
    public StandardMetaobjectDefinitionTemplateQuery displayNameKey() {
        startField("displayNameKey");

        return this;
    }

    /**
    * The capabilities of the metaobject definition.
    */
    public StandardMetaobjectDefinitionTemplateQuery enabledCapabilities(StandardMetaobjectCapabilityTemplateQueryDefinition queryDef) {
        startField("enabledCapabilities");

        _queryBuilder.append('{');
        queryDef.define(new StandardMetaobjectCapabilityTemplateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Templates for the associated field definitions.
    */
    public StandardMetaobjectDefinitionTemplateQuery fieldDefinitions(StandardMetaobjectDefinitionFieldTemplateQueryDefinition queryDef) {
        startField("fieldDefinitions");

        _queryBuilder.append('{');
        queryDef.define(new StandardMetaobjectDefinitionFieldTemplateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The human-readable name.
    */
    public StandardMetaobjectDefinitionTemplateQuery name() {
        startField("name");

        return this;
    }

    /**
    * The namespace owned by the definition after the definition has been enabled.
    */
    public StandardMetaobjectDefinitionTemplateQuery type() {
        startField("type");

        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines a field for a MetaobjectDefinition with properties
* such as the field's data type and validations.
*/
public class MetaobjectFieldDefinitionQuery extends Query<MetaobjectFieldDefinitionQuery> {
    MetaobjectFieldDefinitionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The administrative description.
    */
    public MetaobjectFieldDefinitionQuery description() {
        startField("description");

        return this;
    }

    /**
    * A key name used to identify the field within the metaobject composition.
    */
    public MetaobjectFieldDefinitionQuery key() {
        startField("key");

        return this;
    }

    /**
    * The human-readable name.
    */
    public MetaobjectFieldDefinitionQuery name() {
        startField("name");

        return this;
    }

    /**
    * Required status of the field within the metaobject composition.
    */
    public MetaobjectFieldDefinitionQuery required() {
        startField("required");

        return this;
    }

    /**
    * The type of data that the field stores.
    */
    public MetaobjectFieldDefinitionQuery type(MetafieldDefinitionTypeQueryDefinition queryDef) {
        startField("type");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
    * the field. For example, a field with the type `date` can set a minimum date requirement.
    */
    public MetaobjectFieldDefinitionQuery validations(MetafieldDefinitionValidationQueryDefinition queryDef) {
        startField("validations");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionValidationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

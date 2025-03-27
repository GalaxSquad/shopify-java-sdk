// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A metafield definition type provides basic foundation and validation for a metafield.
*/
public class MetafieldDefinitionTypeQuery extends Query<MetafieldDefinitionTypeQuery> {
    MetafieldDefinitionTypeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The category associated with the metafield definition type.
    */
    public MetafieldDefinitionTypeQuery category() {
        startField("category");

        return this;
    }

    /**
    * The name of the type for the metafield definition.
    * See the list of [supported types](https://shopify.dev/apps/metafields/types).
    */
    public MetafieldDefinitionTypeQuery name() {
        startField("name");

        return this;
    }

    /**
    * The supported validations for a metafield definition type.
    */
    public MetafieldDefinitionTypeQuery supportedValidations(MetafieldDefinitionSupportedValidationQueryDefinition queryDef) {
        startField("supportedValidations");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionSupportedValidationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether metafields without a definition can be migrated to a definition of this type.
    */
    public MetafieldDefinitionTypeQuery supportsDefinitionMigrations() {
        startField("supportsDefinitionMigrations");

        return this;
    }
}

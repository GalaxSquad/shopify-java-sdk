// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The type and name for the optional validation configuration of a metafield.
* For example, a supported validation might consist of a `max` name and a `number_integer` type.
* This validation can then be used to enforce a maximum character length for a
* `single_line_text_field` metafield.
*/
public class MetafieldDefinitionSupportedValidationQuery extends Query<MetafieldDefinitionSupportedValidationQuery> {
    MetafieldDefinitionSupportedValidationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The name of the metafield definition validation.
    */
    public MetafieldDefinitionSupportedValidationQuery name() {
        startField("name");

        return this;
    }

    /**
    * The type of input for the validation.
    */
    public MetafieldDefinitionSupportedValidationQuery type() {
        startField("type");

        return this;
    }
}

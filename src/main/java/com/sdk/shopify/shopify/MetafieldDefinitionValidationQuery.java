// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A configured metafield definition validation.
* For example, for a metafield definition of `number_integer` type, you can set a validation with the
* name `max`
* and a value of `15`. This validation will ensure that the value of the metafield is a number less
* than or equal to 15.
* Refer to the [list of supported
* validations](https://shopify.dev/api/admin/graphql/reference/common-objects/metafieldDefinitionTypes
* #examples-Fetch_all_metafield_definition_types).
*/
public class MetafieldDefinitionValidationQuery extends Query<MetafieldDefinitionValidationQuery> {
    MetafieldDefinitionValidationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The validation name.
    */
    public MetafieldDefinitionValidationQuery name() {
        startField("name");

        return this;
    }

    /**
    * The name for the metafield type of this validation.
    */
    public MetafieldDefinitionValidationQuery type() {
        startField("type");

        return this;
    }

    /**
    * The validation value.
    */
    public MetafieldDefinitionValidationQuery value() {
        startField("value");

        return this;
    }
}

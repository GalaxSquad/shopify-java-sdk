// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `validationUpdate` mutation.
*/
public class ValidationUpdatePayloadQuery extends Query<ValidationUpdatePayloadQuery> {
    ValidationUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ValidationUpdatePayloadQuery userErrors(ValidationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ValidationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The updated validation.
    */
    public ValidationUpdatePayloadQuery validation(ValidationQueryDefinition queryDef) {
        startField("validation");

        _queryBuilder.append('{');
        queryDef.define(new ValidationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

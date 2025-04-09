// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `validationDelete` mutation.
*/
public class ValidationDeletePayloadQuery extends Query<ValidationDeletePayloadQuery> {
    ValidationDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the deleted validation ID.
    */
    public ValidationDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ValidationDeletePayloadQuery userErrors(ValidationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ValidationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

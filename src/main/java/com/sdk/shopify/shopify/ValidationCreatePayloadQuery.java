// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `validationCreate` mutation.
*/
public class ValidationCreatePayloadQuery extends Query<ValidationCreatePayloadQuery> {
    ValidationCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ValidationCreatePayloadQuery userErrors(ValidationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ValidationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The created validation.
    */
    public ValidationCreatePayloadQuery validation(ValidationQueryDefinition queryDef) {
        startField("validation");

        _queryBuilder.append('{');
        queryDef.define(new ValidationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

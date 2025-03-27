// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerGenerateAccountActivationUrl` mutation.
*/
public class CustomerGenerateAccountActivationUrlPayloadQuery extends Query<CustomerGenerateAccountActivationUrlPayloadQuery> {
    CustomerGenerateAccountActivationUrlPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The generated account activation URL.
    */
    public CustomerGenerateAccountActivationUrlPayloadQuery accountActivationUrl() {
        startField("accountActivationUrl");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerGenerateAccountActivationUrlPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

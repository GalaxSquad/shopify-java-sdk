// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `consentPolicyUpdate` mutation.
*/
public class ConsentPolicyUpdatePayloadQuery extends Query<ConsentPolicyUpdatePayloadQuery> {
    ConsentPolicyUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * All updated and created consent policies. The consent policies that haven't been modified as part of
    * the mutation aren't returned.
    */
    public ConsentPolicyUpdatePayloadQuery updatedPolicies(ConsentPolicyQueryDefinition queryDef) {
        startField("updatedPolicies");

        _queryBuilder.append('{');
        queryDef.define(new ConsentPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ConsentPolicyUpdatePayloadQuery userErrors(ConsentPolicyErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ConsentPolicyErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

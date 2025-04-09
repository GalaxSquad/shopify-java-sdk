// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentConstraintRuleDelete` mutation.
*/
public class FulfillmentConstraintRuleDeletePayloadQuery extends Query<FulfillmentConstraintRuleDeletePayloadQuery> {
    FulfillmentConstraintRuleDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether or not the fulfillment constraint rule was successfully deleted.
    */
    public FulfillmentConstraintRuleDeletePayloadQuery success() {
        startField("success");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentConstraintRuleDeletePayloadQuery userErrors(FulfillmentConstraintRuleDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentConstraintRuleDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

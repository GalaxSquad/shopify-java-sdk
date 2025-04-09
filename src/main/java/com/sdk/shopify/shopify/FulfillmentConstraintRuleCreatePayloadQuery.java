// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentConstraintRuleCreate` mutation.
*/
public class FulfillmentConstraintRuleCreatePayloadQuery extends Query<FulfillmentConstraintRuleCreatePayloadQuery> {
    FulfillmentConstraintRuleCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created fulfillment constraint rule.
    */
    public FulfillmentConstraintRuleCreatePayloadQuery fulfillmentConstraintRule(FulfillmentConstraintRuleQueryDefinition queryDef) {
        startField("fulfillmentConstraintRule");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentConstraintRuleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentConstraintRuleCreatePayloadQuery userErrors(FulfillmentConstraintRuleCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentConstraintRuleCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

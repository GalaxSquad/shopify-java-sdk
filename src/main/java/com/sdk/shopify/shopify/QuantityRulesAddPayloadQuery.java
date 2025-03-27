// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `quantityRulesAdd` mutation.
*/
public class QuantityRulesAddPayloadQuery extends Query<QuantityRulesAddPayloadQuery> {
    QuantityRulesAddPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of quantity rules that were added to or updated in the price list.
    */
    public QuantityRulesAddPayloadQuery quantityRules(QuantityRuleQueryDefinition queryDef) {
        startField("quantityRules");

        _queryBuilder.append('{');
        queryDef.define(new QuantityRuleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public QuantityRulesAddPayloadQuery userErrors(QuantityRuleUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new QuantityRuleUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `quantityRulesDelete` mutation.
*/
public class QuantityRulesDeletePayloadQuery extends Query<QuantityRulesDeletePayloadQuery> {
    QuantityRulesDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of product variant IDs whose quantity rules were removed from the price list.
    */
    public QuantityRulesDeletePayloadQuery deletedQuantityRulesVariantIds() {
        startField("deletedQuantityRulesVariantIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public QuantityRulesDeletePayloadQuery userErrors(QuantityRuleUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new QuantityRuleUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

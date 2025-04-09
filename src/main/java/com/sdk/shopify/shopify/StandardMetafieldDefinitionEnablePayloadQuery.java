// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `standardMetafieldDefinitionEnable` mutation.
*/
public class StandardMetafieldDefinitionEnablePayloadQuery extends Query<StandardMetafieldDefinitionEnablePayloadQuery> {
    StandardMetafieldDefinitionEnablePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The metafield definition that was created.
    */
    public StandardMetafieldDefinitionEnablePayloadQuery createdDefinition(MetafieldDefinitionQueryDefinition queryDef) {
        startField("createdDefinition");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public StandardMetafieldDefinitionEnablePayloadQuery userErrors(StandardMetafieldDefinitionEnableUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new StandardMetafieldDefinitionEnableUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

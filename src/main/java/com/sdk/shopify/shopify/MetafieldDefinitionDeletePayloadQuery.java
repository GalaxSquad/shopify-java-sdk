// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metafieldDefinitionDelete` mutation.
*/
public class MetafieldDefinitionDeletePayloadQuery extends Query<MetafieldDefinitionDeletePayloadQuery> {
    MetafieldDefinitionDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted metafield definition.
    */
    public MetafieldDefinitionDeletePayloadQuery deletedDefinitionId() {
        startField("deletedDefinitionId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetafieldDefinitionDeletePayloadQuery userErrors(MetafieldDefinitionDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

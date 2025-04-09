// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metafieldDefinitionPin` mutation.
*/
public class MetafieldDefinitionPinPayloadQuery extends Query<MetafieldDefinitionPinPayloadQuery> {
    MetafieldDefinitionPinPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The metafield definition that was pinned.
    */
    public MetafieldDefinitionPinPayloadQuery pinnedDefinition(MetafieldDefinitionQueryDefinition queryDef) {
        startField("pinnedDefinition");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetafieldDefinitionPinPayloadQuery userErrors(MetafieldDefinitionPinUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionPinUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

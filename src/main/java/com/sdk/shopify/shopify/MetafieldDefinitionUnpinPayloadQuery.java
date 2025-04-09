// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metafieldDefinitionUnpin` mutation.
*/
public class MetafieldDefinitionUnpinPayloadQuery extends Query<MetafieldDefinitionUnpinPayloadQuery> {
    MetafieldDefinitionUnpinPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The metafield definition that was unpinned.
    */
    public MetafieldDefinitionUnpinPayloadQuery unpinnedDefinition(MetafieldDefinitionQueryDefinition queryDef) {
        startField("unpinnedDefinition");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetafieldDefinitionUnpinPayloadQuery userErrors(MetafieldDefinitionUnpinUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionUnpinUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

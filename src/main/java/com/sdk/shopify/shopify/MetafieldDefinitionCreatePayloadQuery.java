// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metafieldDefinitionCreate` mutation.
*/
public class MetafieldDefinitionCreatePayloadQuery extends Query<MetafieldDefinitionCreatePayloadQuery> {
    MetafieldDefinitionCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The metafield definition that was created.
    */
    public MetafieldDefinitionCreatePayloadQuery createdDefinition(MetafieldDefinitionQueryDefinition queryDef) {
        startField("createdDefinition");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetafieldDefinitionCreatePayloadQuery userErrors(MetafieldDefinitionCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

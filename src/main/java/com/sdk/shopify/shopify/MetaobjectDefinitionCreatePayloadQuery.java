// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metaobjectDefinitionCreate` mutation.
*/
public class MetaobjectDefinitionCreatePayloadQuery extends Query<MetaobjectDefinitionCreatePayloadQuery> {
    MetaobjectDefinitionCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created metaobject definition.
    */
    public MetaobjectDefinitionCreatePayloadQuery metaobjectDefinition(MetaobjectDefinitionQueryDefinition queryDef) {
        startField("metaobjectDefinition");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetaobjectDefinitionCreatePayloadQuery userErrors(MetaobjectUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

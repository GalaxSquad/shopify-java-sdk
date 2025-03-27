// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `metaobjectDefinitionUpdate` mutation.
*/
public class MetaobjectDefinitionUpdatePayloadQuery extends Query<MetaobjectDefinitionUpdatePayloadQuery> {
    MetaobjectDefinitionUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated metaobject definition.
    */
    public MetaobjectDefinitionUpdatePayloadQuery metaobjectDefinition(MetaobjectDefinitionQueryDefinition queryDef) {
        startField("metaobjectDefinition");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetaobjectDefinitionUpdatePayloadQuery userErrors(MetaobjectUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

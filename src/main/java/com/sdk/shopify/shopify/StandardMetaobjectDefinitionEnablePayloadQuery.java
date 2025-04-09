// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `standardMetaobjectDefinitionEnable` mutation.
*/
public class StandardMetaobjectDefinitionEnablePayloadQuery extends Query<StandardMetaobjectDefinitionEnablePayloadQuery> {
    StandardMetaobjectDefinitionEnablePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The metaobject definition that was enabled using the standard template.
    */
    public StandardMetaobjectDefinitionEnablePayloadQuery metaobjectDefinition(MetaobjectDefinitionQueryDefinition queryDef) {
        startField("metaobjectDefinition");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public StandardMetaobjectDefinitionEnablePayloadQuery userErrors(MetaobjectUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

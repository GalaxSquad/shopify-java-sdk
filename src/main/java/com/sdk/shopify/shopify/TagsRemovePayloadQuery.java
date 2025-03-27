// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `tagsRemove` mutation.
*/
public class TagsRemovePayloadQuery extends Query<TagsRemovePayloadQuery> {
    TagsRemovePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The object that was updated.
    */
    public TagsRemovePayloadQuery node(NodeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new NodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public TagsRemovePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

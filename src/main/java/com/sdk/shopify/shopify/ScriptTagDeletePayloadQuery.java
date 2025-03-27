// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `scriptTagDelete` mutation.
*/
public class ScriptTagDeletePayloadQuery extends Query<ScriptTagDeletePayloadQuery> {
    ScriptTagDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted script tag.
    */
    public ScriptTagDeletePayloadQuery deletedScriptTagId() {
        startField("deletedScriptTagId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ScriptTagDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `scriptTagUpdate` mutation.
*/
public class ScriptTagUpdatePayloadQuery extends Query<ScriptTagUpdatePayloadQuery> {
    ScriptTagUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The script tag that was updated.
    */
    public ScriptTagUpdatePayloadQuery scriptTag(ScriptTagQueryDefinition queryDef) {
        startField("scriptTag");

        _queryBuilder.append('{');
        queryDef.define(new ScriptTagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ScriptTagUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `returnClose` mutation.
*/
public class ReturnClosePayloadQuery extends Query<ReturnClosePayloadQuery> {
    ReturnClosePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The closed return.
    */
    public ReturnClosePayloadQuery returnValue(ReturnQueryDefinition queryDef) {
        startField("return");

        _queryBuilder.append('{');
        queryDef.define(new ReturnQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ReturnClosePayloadQuery userErrors(ReturnUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ReturnUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

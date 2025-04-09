// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `savedSearchUpdate` mutation.
*/
public class SavedSearchUpdatePayloadQuery extends Query<SavedSearchUpdatePayloadQuery> {
    SavedSearchUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The saved search that was updated.
    */
    public SavedSearchUpdatePayloadQuery savedSearch(SavedSearchQueryDefinition queryDef) {
        startField("savedSearch");

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SavedSearchUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

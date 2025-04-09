// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `savedSearchCreate` mutation.
*/
public class SavedSearchCreatePayloadQuery extends Query<SavedSearchCreatePayloadQuery> {
    SavedSearchCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The saved search that was created.
    */
    public SavedSearchCreatePayloadQuery savedSearch(SavedSearchQueryDefinition queryDef) {
        startField("savedSearch");

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SavedSearchCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

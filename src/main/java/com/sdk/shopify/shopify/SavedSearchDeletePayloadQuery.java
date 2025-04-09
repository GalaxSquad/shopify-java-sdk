// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `savedSearchDelete` mutation.
*/
public class SavedSearchDeletePayloadQuery extends Query<SavedSearchDeletePayloadQuery> {
    SavedSearchDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the saved search that was deleted.
    */
    public SavedSearchDeletePayloadQuery deletedSavedSearchId() {
        startField("deletedSavedSearchId");

        return this;
    }

    /**
    * The shop of the saved search that was deleted.
    */
    public SavedSearchDeletePayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SavedSearchDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

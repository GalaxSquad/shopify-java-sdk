// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* The Online Store capability data for the metaobject definition.
*/
public class MetaobjectCapabilityDefinitionDataOnlineStoreQuery extends Query<MetaobjectCapabilityDefinitionDataOnlineStoreQuery> {
    MetaobjectCapabilityDefinitionDataOnlineStoreQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Flag indicating if a sufficient number of redirects are available to redirect all published entries.
    */
    public MetaobjectCapabilityDefinitionDataOnlineStoreQuery canCreateRedirects() {
        startField("canCreateRedirects");

        return this;
    }

    /**
    * The URL handle for accessing pages of this metaobject type in the Online Store.
    */
    public MetaobjectCapabilityDefinitionDataOnlineStoreQuery urlHandle() {
        startField("urlHandle");

        return this;
    }
}

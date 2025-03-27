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
* Provides the capabilities of a metaobject.
*/
public class MetaobjectCapabilityDataQuery extends Query<MetaobjectCapabilityDataQuery> {
    MetaobjectCapabilityDataQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The Online Store capability for this metaobject.
    */
    public MetaobjectCapabilityDataQuery onlineStore(MetaobjectCapabilityDataOnlineStoreQueryDefinition queryDef) {
        startField("onlineStore");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilityDataOnlineStoreQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The publishable capability for this metaobject.
    */
    public MetaobjectCapabilityDataQuery publishable(MetaobjectCapabilityDataPublishableQueryDefinition queryDef) {
        startField("publishable");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilityDataPublishableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

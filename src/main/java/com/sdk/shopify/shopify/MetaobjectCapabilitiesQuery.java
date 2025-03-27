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
* Provides the capabilities of a metaobject definition.
*/
public class MetaobjectCapabilitiesQuery extends Query<MetaobjectCapabilitiesQuery> {
    MetaobjectCapabilitiesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Indicates whether a metaobject definition can be displayed as a page on the Online Store.
    */
    public MetaobjectCapabilitiesQuery onlineStore(MetaobjectCapabilitiesOnlineStoreQueryDefinition queryDef) {
        startField("onlineStore");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilitiesOnlineStoreQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Indicate whether a metaobject definition is publishable.
    */
    public MetaobjectCapabilitiesQuery publishable(MetaobjectCapabilitiesPublishableQueryDefinition queryDef) {
        startField("publishable");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilitiesPublishableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Indicate whether a metaobject definition is renderable and exposes SEO data.
    */
    public MetaobjectCapabilitiesQuery renderable(MetaobjectCapabilitiesRenderableQueryDefinition queryDef) {
        startField("renderable");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilitiesRenderableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Indicate whether a metaobject definition is translatable.
    */
    public MetaobjectCapabilitiesQuery translatable(MetaobjectCapabilitiesTranslatableQueryDefinition queryDef) {
        startField("translatable");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilitiesTranslatableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

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
* Represents the body of a theme file.
*/
public class OnlineStoreThemeFileBodyQuery extends Query<OnlineStoreThemeFileBodyQuery> {
    OnlineStoreThemeFileBodyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public OnlineStoreThemeFileBodyQuery onOnlineStoreThemeFileBodyBase64(OnlineStoreThemeFileBodyBase64QueryDefinition queryDef) {
        startInlineFragment("OnlineStoreThemeFileBodyBase64");
        queryDef.define(new OnlineStoreThemeFileBodyBase64Query(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OnlineStoreThemeFileBodyQuery onOnlineStoreThemeFileBodyText(OnlineStoreThemeFileBodyTextQueryDefinition queryDef) {
        startInlineFragment("OnlineStoreThemeFileBodyText");
        queryDef.define(new OnlineStoreThemeFileBodyTextQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OnlineStoreThemeFileBodyQuery onOnlineStoreThemeFileBodyUrl(OnlineStoreThemeFileBodyUrlQueryDefinition queryDef) {
        startInlineFragment("OnlineStoreThemeFileBodyUrl");
        queryDef.define(new OnlineStoreThemeFileBodyUrlQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

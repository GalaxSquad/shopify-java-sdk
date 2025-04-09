// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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

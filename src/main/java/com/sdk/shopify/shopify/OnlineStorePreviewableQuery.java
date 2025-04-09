// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Online Store preview URL of the object.
*/
public class OnlineStorePreviewableQuery extends Query<OnlineStorePreviewableQuery> {
    OnlineStorePreviewableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The [preview URL](https://help.shopify.com/manual/online-store/setting-up#preview-your-store) for
    * the online store.
    */
    public OnlineStorePreviewableQuery onlineStorePreviewUrl() {
        startField("onlineStorePreviewUrl");

        return this;
    }

    public OnlineStorePreviewableQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The `WebPixel` object enables you to manage JavaScript code snippets
* that run on an online store and collect
* [behavioral data](https://shopify.dev/docs/api/web-pixels-api/standard-events)
* for marketing campaign optimization and analytics.
* Learn how to create a
* [web pixel extension](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
* to subscribe your app to events that are emitted by Shopify.
*/
public class WebPixelQuery extends Query<WebPixelQuery> {
    WebPixelQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The
    * [settings
    * object](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-
    * web-pixel-settings)
    * for the web pixel. This object specifies configuration options that control the web pixel's
    * functionality and behavior. You can find the settings for a web pixel in
    * `extensions/<your_extension_name>/shopify.extension.toml`.
    */
    public WebPixelQuery settings() {
        startField("settings");

        return this;
    }
}

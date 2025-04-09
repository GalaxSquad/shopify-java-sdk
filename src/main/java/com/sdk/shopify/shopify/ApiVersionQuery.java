// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A version of the API, as defined by [Shopify API
* versioning](https://shopify.dev/api/usage/versioning).
* Versions are commonly referred to by their handle (for example, `2021-10`).
*/
public class ApiVersionQuery extends Query<ApiVersionQuery> {
    ApiVersionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The human-readable name of the version.
    */
    public ApiVersionQuery displayName() {
        startField("displayName");

        return this;
    }

    /**
    * The unique identifier of an ApiVersion. All supported API versions have a date-based (YYYY-MM) or
    * `unstable` handle.
    */
    public ApiVersionQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * Whether the version is actively supported by Shopify. Supported API versions are guaranteed to be
    * stable. Unsupported API versions include unstable, release candidate, and end-of-life versions that
    * are marked as unsupported. For more information, refer to
    * [Versioning](https://shopify.dev/api/usage/versioning).
    */
    public ApiVersionQuery supported() {
        startField("supported");

        return this;
    }
}

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
* A request to import a
* [`URLRedirect`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) object
* into the Online Store channel. Apps can use this to query the state of an `UrlRedirectImport`
* request.
* For more information, see
* [`url-redirect`](https://help.shopify.com/en/manual/online-store/menus-and-links/url-redirect)s.
*/
public class UrlRedirectImportQuery extends Query<UrlRedirectImportQuery> {
    UrlRedirectImportQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The number of rows in the file.
    */
    public UrlRedirectImportQuery count() {
        startField("count");

        return this;
    }

    /**
    * The number of redirects created from the import.
    */
    public UrlRedirectImportQuery createdCount() {
        startField("createdCount");

        return this;
    }

    /**
    * The number of redirects that failed to be imported.
    */
    public UrlRedirectImportQuery failedCount() {
        startField("failedCount");

        return this;
    }

    /**
    * Whether the import is finished.
    */
    public UrlRedirectImportQuery finished() {
        startField("finished");

        return this;
    }

    /**
    * The date and time when the import finished.
    */
    public UrlRedirectImportQuery finishedAt() {
        startField("finishedAt");

        return this;
    }

    /**
    * A list of up to three previews of the URL redirects to be imported.
    */
    public UrlRedirectImportQuery previewRedirects(UrlRedirectImportPreviewQueryDefinition queryDef) {
        startField("previewRedirects");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectImportPreviewQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of redirects updated during the import.
    */
    public UrlRedirectImportQuery updatedCount() {
        startField("updatedCount");

        return this;
    }
}

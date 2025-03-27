// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The Android mobile platform application.
*/
public class AndroidApplicationQuery extends Query<AndroidApplicationQuery> {
    AndroidApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether Android App Links are supported by this app.
    */
    public AndroidApplicationQuery appLinksEnabled() {
        startField("appLinksEnabled");

        return this;
    }

    /**
    * The Android application ID.
    */
    public AndroidApplicationQuery applicationId() {
        startField("applicationId");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public AndroidApplicationQuery id() {
        startField("id");

        return this;
    }

    /**
    * The SHA256 fingerprints of the app's signing certificate.
    */
    public AndroidApplicationQuery sha256certFingerprints() {
        startField("sha256CertFingerprints");

        return this;
    }
}

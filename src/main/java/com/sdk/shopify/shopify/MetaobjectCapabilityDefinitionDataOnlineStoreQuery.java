// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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

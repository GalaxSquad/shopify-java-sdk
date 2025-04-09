// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The content container customizations.
*/
public class CheckoutBrandingContentQuery extends Query<CheckoutBrandingContentQuery> {
    CheckoutBrandingContentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The content container's divider style and visibility.
    */
    public CheckoutBrandingContentQuery divider(CheckoutBrandingContainerDividerQueryDefinition queryDef) {
        startField("divider");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingContainerDividerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

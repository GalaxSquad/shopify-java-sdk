// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The main container customizations.
*/
public class CheckoutBrandingMainQuery extends Query<CheckoutBrandingMainQuery> {
    CheckoutBrandingMainQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The background image of the main container.
    */
    public CheckoutBrandingMainQuery backgroundImage(CheckoutBrandingImageQueryDefinition queryDef) {
        startField("backgroundImage");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The selected color scheme of the main container.
    */
    public CheckoutBrandingMainQuery colorScheme() {
        startField("colorScheme");

        return this;
    }

    /**
    * The main container's divider style and visibility.
    */
    public CheckoutBrandingMainQuery divider(CheckoutBrandingContainerDividerQueryDefinition queryDef) {
        startField("divider");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingContainerDividerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The settings for the main sections.
    */
    public CheckoutBrandingMainQuery section(CheckoutBrandingMainSectionQueryDefinition queryDef) {
        startField("section");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingMainSectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

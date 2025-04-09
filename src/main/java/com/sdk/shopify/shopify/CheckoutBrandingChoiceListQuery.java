// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The choice list customizations.
*/
public class CheckoutBrandingChoiceListQuery extends Query<CheckoutBrandingChoiceListQuery> {
    CheckoutBrandingChoiceListQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The settings that apply to the 'group' variant of ChoiceList.
    */
    public CheckoutBrandingChoiceListQuery group(CheckoutBrandingChoiceListGroupQueryDefinition queryDef) {
        startField("group");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingChoiceListGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

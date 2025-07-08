// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shop's privacy settings.
*/
public class PrivacySettingsQuery extends Query<PrivacySettingsQuery> {
    PrivacySettingsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Banner customizations for the 'cookie banner'.
    */
    public PrivacySettingsQuery banner(CookieBannerQueryDefinition queryDef) {
        startField("banner");

        _queryBuilder.append('{');
        queryDef.define(new CookieBannerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A shop's data sale opt out page (e.g. CCPA).
    */
    public PrivacySettingsQuery dataSaleOptOutPage(DataSaleOptOutPageQueryDefinition queryDef) {
        startField("dataSaleOptOutPage");

        _queryBuilder.append('{');
        queryDef.define(new DataSaleOptOutPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A shop's privacy policy settings.
    */
    public PrivacySettingsQuery privacyPolicy(PrivacyPolicyQueryDefinition queryDef) {
        startField("privacyPolicy");

        _queryBuilder.append('{');
        queryDef.define(new PrivacyPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

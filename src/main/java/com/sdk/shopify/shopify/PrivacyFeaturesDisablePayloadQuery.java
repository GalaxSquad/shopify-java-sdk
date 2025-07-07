// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `privacyFeaturesDisable` mutation.
*/
public class PrivacyFeaturesDisablePayloadQuery extends Query<PrivacyFeaturesDisablePayloadQuery> {
    PrivacyFeaturesDisablePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The privacy features that were disabled.
    */
    public PrivacyFeaturesDisablePayloadQuery featuresDisabled() {
        startField("featuresDisabled");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PrivacyFeaturesDisablePayloadQuery userErrors(PrivacyFeaturesDisableUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PrivacyFeaturesDisableUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

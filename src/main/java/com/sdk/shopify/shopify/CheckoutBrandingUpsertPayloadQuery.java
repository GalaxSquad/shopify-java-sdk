// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `checkoutBrandingUpsert` mutation.
*/
public class CheckoutBrandingUpsertPayloadQuery extends Query<CheckoutBrandingUpsertPayloadQuery> {
    CheckoutBrandingUpsertPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the new checkout branding settings.
    */
    public CheckoutBrandingUpsertPayloadQuery checkoutBranding(CheckoutBrandingQueryDefinition queryDef) {
        startField("checkoutBranding");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CheckoutBrandingUpsertPayloadQuery userErrors(CheckoutBrandingUpsertUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingUpsertUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

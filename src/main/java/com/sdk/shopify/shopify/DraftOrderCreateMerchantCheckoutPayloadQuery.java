// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `draftOrderCreateMerchantCheckout` mutation.
*/
public class DraftOrderCreateMerchantCheckoutPayloadQuery extends Query<DraftOrderCreateMerchantCheckoutPayloadQuery> {
    DraftOrderCreateMerchantCheckoutPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DraftOrderCreateMerchantCheckoutPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

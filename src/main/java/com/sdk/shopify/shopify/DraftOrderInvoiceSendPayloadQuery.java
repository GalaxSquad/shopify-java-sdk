// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `draftOrderInvoiceSend` mutation.
*/
public class DraftOrderInvoiceSendPayloadQuery extends Query<DraftOrderInvoiceSendPayloadQuery> {
    DraftOrderInvoiceSendPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The draft order an invoice email is sent for.
    */
    public DraftOrderInvoiceSendPayloadQuery draftOrder(DraftOrderQueryDefinition queryDef) {
        startField("draftOrder");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DraftOrderInvoiceSendPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

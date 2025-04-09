// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `draftOrderInvoicePreview` mutation.
*/
public class DraftOrderInvoicePreviewPayloadQuery extends Query<DraftOrderInvoicePreviewPayloadQuery> {
    DraftOrderInvoicePreviewPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The draft order invoice email rendered as HTML to allow previewing.
    */
    public DraftOrderInvoicePreviewPayloadQuery previewHtml() {
        startField("previewHtml");

        return this;
    }

    /**
    * The subject preview for the draft order invoice email.
    */
    public DraftOrderInvoicePreviewPayloadQuery previewSubject() {
        startField("previewSubject");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DraftOrderInvoicePreviewPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

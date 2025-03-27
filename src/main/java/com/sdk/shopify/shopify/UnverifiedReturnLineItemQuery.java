// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An unverified return line item.
*/
public class UnverifiedReturnLineItemQuery extends Query<UnverifiedReturnLineItemQuery> {
    UnverifiedReturnLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
    */
    public UnverifiedReturnLineItemQuery customerNote() {
        startField("customerNote");

        return this;
    }

    /**
    * The quantity being returned.
    */
    public UnverifiedReturnLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The quantity that can be refunded.
    */
    public UnverifiedReturnLineItemQuery refundableQuantity() {
        startField("refundableQuantity");

        return this;
    }

    /**
    * The quantity that was refunded.
    */
    public UnverifiedReturnLineItemQuery refundedQuantity() {
        startField("refundedQuantity");

        return this;
    }

    /**
    * The reason for returning the item.
    */
    public UnverifiedReturnLineItemQuery returnReason() {
        startField("returnReason");

        return this;
    }

    /**
    * Additional information about the reason for the return. Maximum length: 255 characters.
    */
    public UnverifiedReturnLineItemQuery returnReasonNote() {
        startField("returnReasonNote");

        return this;
    }

    /**
    * The unit price of the unverified return line item.
    */
    public UnverifiedReturnLineItemQuery unitPrice(MoneyV2QueryDefinition queryDef) {
        startField("unitPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

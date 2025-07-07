// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A return line item of any type.
*/
public class ReturnLineItemTypeQuery extends Query<ReturnLineItemTypeQuery> {
    ReturnLineItemTypeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
    */
    public ReturnLineItemTypeQuery customerNote() {
        startField("customerNote");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public ReturnLineItemTypeQuery id() {
        startField("id");

        return this;
    }

    /**
    * The quantity that can be processed.
    */
    public ReturnLineItemTypeQuery processableQuantity() {
        startField("processableQuantity");

        return this;
    }

    /**
    * The quantity that has been processed.
    */
    public ReturnLineItemTypeQuery processedQuantity() {
        startField("processedQuantity");

        return this;
    }

    /**
    * The quantity being returned.
    */
    public ReturnLineItemTypeQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The quantity that can be refunded.
    */
    public ReturnLineItemTypeQuery refundableQuantity() {
        startField("refundableQuantity");

        return this;
    }

    /**
    * The quantity that was refunded.
    */
    public ReturnLineItemTypeQuery refundedQuantity() {
        startField("refundedQuantity");

        return this;
    }

    /**
    * The reason for returning the item.
    */
    public ReturnLineItemTypeQuery returnReason() {
        startField("returnReason");

        return this;
    }

    /**
    * Additional information about the reason for the return. Maximum length: 255 characters.
    */
    public ReturnLineItemTypeQuery returnReasonNote() {
        startField("returnReasonNote");

        return this;
    }

    /**
    * The quantity that has't been processed.
    */
    public ReturnLineItemTypeQuery unprocessedQuantity() {
        startField("unprocessedQuantity");

        return this;
    }

    public ReturnLineItemTypeQuery onReturnLineItem(ReturnLineItemQueryDefinition queryDef) {
        startInlineFragment("ReturnLineItem");
        queryDef.define(new ReturnLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ReturnLineItemTypeQuery onUnverifiedReturnLineItem(UnverifiedReturnLineItemQueryDefinition queryDef) {
        startInlineFragment("UnverifiedReturnLineItem");
        queryDef.define(new UnverifiedReturnLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

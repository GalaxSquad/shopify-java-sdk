// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class FulfillmentOrderHoldInput implements Serializable {
    private FulfillmentHoldReason reason;

    private Input<String> reasonNotes = Input.undefined();

    private Input<Boolean> notifyMerchant = Input.undefined();

    private Input<String> externalId = Input.undefined();

    private Input<String> handle = Input.undefined();

    private Input<List<FulfillmentOrderLineItemInput>> fulfillmentOrderLineItems = Input.undefined();

    public FulfillmentOrderHoldInput(FulfillmentHoldReason reason) {
        this.reason = reason;
    }

    public FulfillmentHoldReason getReason() {
        return reason;
    }

    public FulfillmentOrderHoldInput setReason(FulfillmentHoldReason reason) {
        this.reason = reason;
        return this;
    }

    public String getReasonNotes() {
        return reasonNotes.getValue();
    }

    public Input<String> getReasonNotesInput() {
        return reasonNotes;
    }

    public FulfillmentOrderHoldInput setReasonNotes(String reasonNotes) {
        this.reasonNotes = Input.optional(reasonNotes);
        return this;
    }

    public FulfillmentOrderHoldInput setReasonNotesInput(Input<String> reasonNotes) {
        if (reasonNotes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reasonNotes = reasonNotes;
        return this;
    }

    public Boolean getNotifyMerchant() {
        return notifyMerchant.getValue();
    }

    public Input<Boolean> getNotifyMerchantInput() {
        return notifyMerchant;
    }

    public FulfillmentOrderHoldInput setNotifyMerchant(Boolean notifyMerchant) {
        this.notifyMerchant = Input.optional(notifyMerchant);
        return this;
    }

    public FulfillmentOrderHoldInput setNotifyMerchantInput(Input<Boolean> notifyMerchant) {
        if (notifyMerchant == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.notifyMerchant = notifyMerchant;
        return this;
    }

    public String getExternalId() {
        return externalId.getValue();
    }

    public Input<String> getExternalIdInput() {
        return externalId;
    }

    public FulfillmentOrderHoldInput setExternalId(String externalId) {
        this.externalId = Input.optional(externalId);
        return this;
    }

    public FulfillmentOrderHoldInput setExternalIdInput(Input<String> externalId) {
        if (externalId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.externalId = externalId;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public FulfillmentOrderHoldInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public FulfillmentOrderHoldInput setHandleInput(Input<String> handle) {
        if (handle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.handle = handle;
        return this;
    }

    public List<FulfillmentOrderLineItemInput> getFulfillmentOrderLineItems() {
        return fulfillmentOrderLineItems.getValue();
    }

    public Input<List<FulfillmentOrderLineItemInput>> getFulfillmentOrderLineItemsInput() {
        return fulfillmentOrderLineItems;
    }

    public FulfillmentOrderHoldInput setFulfillmentOrderLineItems(List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
        this.fulfillmentOrderLineItems = Input.optional(fulfillmentOrderLineItems);
        return this;
    }

    public FulfillmentOrderHoldInput setFulfillmentOrderLineItemsInput(Input<List<FulfillmentOrderLineItemInput>> fulfillmentOrderLineItems) {
        if (fulfillmentOrderLineItems == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("reason:");
        _queryBuilder.append(reason.toString());

        if (this.reasonNotes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("reasonNotes:");
            if (reasonNotes.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, reasonNotes.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.notifyMerchant.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("notifyMerchant:");
            if (notifyMerchant.getValue() != null) {
                _queryBuilder.append(notifyMerchant.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.externalId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("externalId:");
            if (externalId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, externalId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.handle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("handle:");
            if (handle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, handle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fulfillmentOrderLineItems.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fulfillmentOrderLineItems:");
            if (fulfillmentOrderLineItems.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FulfillmentOrderLineItemInput item1 : fulfillmentOrderLineItems.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

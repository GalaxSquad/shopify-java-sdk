// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class InventoryTransferCreateInput implements Serializable {
    private List<InventoryTransferLineItemInput> lineItems;

    private Input<ID> originLocationId = Input.undefined();

    private Input<ID> destinationLocationId = Input.undefined();

    private Input<String> dateCreated = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<String> referenceName = Input.undefined();

    public InventoryTransferCreateInput(List<InventoryTransferLineItemInput> lineItems) {
        this.lineItems = lineItems;
    }

    public List<InventoryTransferLineItemInput> getLineItems() {
        return lineItems;
    }

    public InventoryTransferCreateInput setLineItems(List<InventoryTransferLineItemInput> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public ID getOriginLocationId() {
        return originLocationId.getValue();
    }

    public Input<ID> getOriginLocationIdInput() {
        return originLocationId;
    }

    public InventoryTransferCreateInput setOriginLocationId(ID originLocationId) {
        this.originLocationId = Input.optional(originLocationId);
        return this;
    }

    public InventoryTransferCreateInput setOriginLocationIdInput(Input<ID> originLocationId) {
        if (originLocationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.originLocationId = originLocationId;
        return this;
    }

    public ID getDestinationLocationId() {
        return destinationLocationId.getValue();
    }

    public Input<ID> getDestinationLocationIdInput() {
        return destinationLocationId;
    }

    public InventoryTransferCreateInput setDestinationLocationId(ID destinationLocationId) {
        this.destinationLocationId = Input.optional(destinationLocationId);
        return this;
    }

    public InventoryTransferCreateInput setDestinationLocationIdInput(Input<ID> destinationLocationId) {
        if (destinationLocationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.destinationLocationId = destinationLocationId;
        return this;
    }

    public String getDateCreated() {
        return dateCreated.getValue();
    }

    public Input<String> getDateCreatedInput() {
        return dateCreated;
    }

    public InventoryTransferCreateInput setDateCreated(String dateCreated) {
        this.dateCreated = Input.optional(dateCreated);
        return this;
    }

    public InventoryTransferCreateInput setDateCreatedInput(Input<String> dateCreated) {
        if (dateCreated == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateCreated = dateCreated;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public InventoryTransferCreateInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public InventoryTransferCreateInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public List<String> getTags() {
        return tags.getValue();
    }

    public Input<List<String>> getTagsInput() {
        return tags;
    }

    public InventoryTransferCreateInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public InventoryTransferCreateInput setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public String getReferenceName() {
        return referenceName.getValue();
    }

    public Input<String> getReferenceNameInput() {
        return referenceName;
    }

    public InventoryTransferCreateInput setReferenceName(String referenceName) {
        this.referenceName = Input.optional(referenceName);
        return this;
    }

    public InventoryTransferCreateInput setReferenceNameInput(Input<String> referenceName) {
        if (referenceName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referenceName = referenceName;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("lineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventoryTransferLineItemInput item1 : lineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        if (this.originLocationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("originLocationId:");
            if (originLocationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, originLocationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.destinationLocationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("destinationLocationId:");
            if (destinationLocationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, destinationLocationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateCreated.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateCreated:");
            if (dateCreated.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dateCreated.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.note.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("note:");
            if (note.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, note.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.tags.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tags:");
            if (tags.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : tags.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.referenceName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("referenceName:");
            if (referenceName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, referenceName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

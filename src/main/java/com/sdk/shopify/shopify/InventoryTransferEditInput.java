// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class InventoryTransferEditInput implements Serializable {
    private Input<ID> originId = Input.undefined();

    private Input<ID> destinationId = Input.undefined();

    private Input<String> dateCreated = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<String> referenceName = Input.undefined();

    public ID getOriginId() {
        return originId.getValue();
    }

    public Input<ID> getOriginIdInput() {
        return originId;
    }

    public InventoryTransferEditInput setOriginId(ID originId) {
        this.originId = Input.optional(originId);
        return this;
    }

    public InventoryTransferEditInput setOriginIdInput(Input<ID> originId) {
        if (originId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.originId = originId;
        return this;
    }

    public ID getDestinationId() {
        return destinationId.getValue();
    }

    public Input<ID> getDestinationIdInput() {
        return destinationId;
    }

    public InventoryTransferEditInput setDestinationId(ID destinationId) {
        this.destinationId = Input.optional(destinationId);
        return this;
    }

    public InventoryTransferEditInput setDestinationIdInput(Input<ID> destinationId) {
        if (destinationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.destinationId = destinationId;
        return this;
    }

    public String getDateCreated() {
        return dateCreated.getValue();
    }

    public Input<String> getDateCreatedInput() {
        return dateCreated;
    }

    public InventoryTransferEditInput setDateCreated(String dateCreated) {
        this.dateCreated = Input.optional(dateCreated);
        return this;
    }

    public InventoryTransferEditInput setDateCreatedInput(Input<String> dateCreated) {
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

    public InventoryTransferEditInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public InventoryTransferEditInput setNoteInput(Input<String> note) {
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

    public InventoryTransferEditInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public InventoryTransferEditInput setTagsInput(Input<List<String>> tags) {
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

    public InventoryTransferEditInput setReferenceName(String referenceName) {
        this.referenceName = Input.optional(referenceName);
        return this;
    }

    public InventoryTransferEditInput setReferenceNameInput(Input<String> referenceName) {
        if (referenceName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referenceName = referenceName;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.originId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("originId:");
            if (originId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, originId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.destinationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("destinationId:");
            if (destinationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, destinationId.getValue().toString());
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

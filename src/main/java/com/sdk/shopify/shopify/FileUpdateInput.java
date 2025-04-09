// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class FileUpdateInput implements Serializable {
    private ID id;

    private Input<String> alt = Input.undefined();

    private Input<String> originalSource = Input.undefined();

    private Input<String> previewImageSource = Input.undefined();

    private Input<String> filename = Input.undefined();

    private Input<List<ID>> referencesToAdd = Input.undefined();

    private Input<List<ID>> referencesToRemove = Input.undefined();

    public FileUpdateInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public FileUpdateInput setId(ID id) {
        this.id = id;
        return this;
    }

    public String getAlt() {
        return alt.getValue();
    }

    public Input<String> getAltInput() {
        return alt;
    }

    public FileUpdateInput setAlt(String alt) {
        this.alt = Input.optional(alt);
        return this;
    }

    public FileUpdateInput setAltInput(Input<String> alt) {
        if (alt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alt = alt;
        return this;
    }

    public String getOriginalSource() {
        return originalSource.getValue();
    }

    public Input<String> getOriginalSourceInput() {
        return originalSource;
    }

    public FileUpdateInput setOriginalSource(String originalSource) {
        this.originalSource = Input.optional(originalSource);
        return this;
    }

    public FileUpdateInput setOriginalSourceInput(Input<String> originalSource) {
        if (originalSource == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.originalSource = originalSource;
        return this;
    }

    public String getPreviewImageSource() {
        return previewImageSource.getValue();
    }

    public Input<String> getPreviewImageSourceInput() {
        return previewImageSource;
    }

    public FileUpdateInput setPreviewImageSource(String previewImageSource) {
        this.previewImageSource = Input.optional(previewImageSource);
        return this;
    }

    public FileUpdateInput setPreviewImageSourceInput(Input<String> previewImageSource) {
        if (previewImageSource == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.previewImageSource = previewImageSource;
        return this;
    }

    public String getFilename() {
        return filename.getValue();
    }

    public Input<String> getFilenameInput() {
        return filename;
    }

    public FileUpdateInput setFilename(String filename) {
        this.filename = Input.optional(filename);
        return this;
    }

    public FileUpdateInput setFilenameInput(Input<String> filename) {
        if (filename == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.filename = filename;
        return this;
    }

    public List<ID> getReferencesToAdd() {
        return referencesToAdd.getValue();
    }

    public Input<List<ID>> getReferencesToAddInput() {
        return referencesToAdd;
    }

    public FileUpdateInput setReferencesToAdd(List<ID> referencesToAdd) {
        this.referencesToAdd = Input.optional(referencesToAdd);
        return this;
    }

    public FileUpdateInput setReferencesToAddInput(Input<List<ID>> referencesToAdd) {
        if (referencesToAdd == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referencesToAdd = referencesToAdd;
        return this;
    }

    public List<ID> getReferencesToRemove() {
        return referencesToRemove.getValue();
    }

    public Input<List<ID>> getReferencesToRemoveInput() {
        return referencesToRemove;
    }

    public FileUpdateInput setReferencesToRemove(List<ID> referencesToRemove) {
        this.referencesToRemove = Input.optional(referencesToRemove);
        return this;
    }

    public FileUpdateInput setReferencesToRemoveInput(Input<List<ID>> referencesToRemove) {
        if (referencesToRemove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referencesToRemove = referencesToRemove;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.alt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alt:");
            if (alt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, alt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.originalSource.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("originalSource:");
            if (originalSource.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, originalSource.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.previewImageSource.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("previewImageSource:");
            if (previewImageSource.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, previewImageSource.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.filename.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("filename:");
            if (filename.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, filename.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.referencesToAdd.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("referencesToAdd:");
            if (referencesToAdd.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : referencesToAdd.getValue()) {
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

        if (this.referencesToRemove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("referencesToRemove:");
            if (referencesToRemove.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : referencesToRemove.getValue()) {
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

        _queryBuilder.append('}');
    }
}

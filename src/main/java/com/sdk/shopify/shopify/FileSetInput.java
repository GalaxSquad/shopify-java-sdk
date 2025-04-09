// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class FileSetInput implements Serializable {
    private Input<String> filename = Input.undefined();

    private Input<FileContentType> contentType = Input.undefined();

    private Input<String> alt = Input.undefined();

    private Input<FileCreateInputDuplicateResolutionMode> duplicateResolutionMode = Input.undefined();

    private Input<ID> id = Input.undefined();

    private Input<String> originalSource = Input.undefined();

    public String getFilename() {
        return filename.getValue();
    }

    public Input<String> getFilenameInput() {
        return filename;
    }

    public FileSetInput setFilename(String filename) {
        this.filename = Input.optional(filename);
        return this;
    }

    public FileSetInput setFilenameInput(Input<String> filename) {
        if (filename == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.filename = filename;
        return this;
    }

    public FileContentType getContentType() {
        return contentType.getValue();
    }

    public Input<FileContentType> getContentTypeInput() {
        return contentType;
    }

    public FileSetInput setContentType(FileContentType contentType) {
        this.contentType = Input.optional(contentType);
        return this;
    }

    public FileSetInput setContentTypeInput(Input<FileContentType> contentType) {
        if (contentType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.contentType = contentType;
        return this;
    }

    public String getAlt() {
        return alt.getValue();
    }

    public Input<String> getAltInput() {
        return alt;
    }

    public FileSetInput setAlt(String alt) {
        this.alt = Input.optional(alt);
        return this;
    }

    public FileSetInput setAltInput(Input<String> alt) {
        if (alt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alt = alt;
        return this;
    }

    public FileCreateInputDuplicateResolutionMode getDuplicateResolutionMode() {
        return duplicateResolutionMode.getValue();
    }

    public Input<FileCreateInputDuplicateResolutionMode> getDuplicateResolutionModeInput() {
        return duplicateResolutionMode;
    }

    public FileSetInput setDuplicateResolutionMode(FileCreateInputDuplicateResolutionMode duplicateResolutionMode) {
        this.duplicateResolutionMode = Input.optional(duplicateResolutionMode);
        return this;
    }

    public FileSetInput setDuplicateResolutionModeInput(Input<FileCreateInputDuplicateResolutionMode> duplicateResolutionMode) {
        if (duplicateResolutionMode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.duplicateResolutionMode = duplicateResolutionMode;
        return this;
    }

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public FileSetInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public FileSetInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public String getOriginalSource() {
        return originalSource.getValue();
    }

    public Input<String> getOriginalSourceInput() {
        return originalSource;
    }

    public FileSetInput setOriginalSource(String originalSource) {
        this.originalSource = Input.optional(originalSource);
        return this;
    }

    public FileSetInput setOriginalSourceInput(Input<String> originalSource) {
        if (originalSource == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.originalSource = originalSource;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.contentType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("contentType:");
            if (contentType.getValue() != null) {
                _queryBuilder.append(contentType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.duplicateResolutionMode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("duplicateResolutionMode:");
            if (duplicateResolutionMode.getValue() != null) {
                _queryBuilder.append(duplicateResolutionMode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
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

        _queryBuilder.append('}');
    }
}

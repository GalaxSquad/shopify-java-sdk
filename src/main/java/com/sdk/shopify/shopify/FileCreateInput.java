// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;

public class FileCreateInput implements Serializable {
    private String originalSource;

    private Input<String> filename = Input.undefined();

    private Input<FileContentType> contentType = Input.undefined();

    private Input<String> alt = Input.undefined();

    private Input<FileCreateInputDuplicateResolutionMode> duplicateResolutionMode = Input.undefined();

    public FileCreateInput(String originalSource) {
        this.originalSource = originalSource;
    }

    public String getOriginalSource() {
        return originalSource;
    }

    public FileCreateInput setOriginalSource(String originalSource) {
        this.originalSource = originalSource;
        return this;
    }

    public String getFilename() {
        return filename.getValue();
    }

    public Input<String> getFilenameInput() {
        return filename;
    }

    public FileCreateInput setFilename(String filename) {
        this.filename = Input.optional(filename);
        return this;
    }

    public FileCreateInput setFilenameInput(Input<String> filename) {
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

    public FileCreateInput setContentType(FileContentType contentType) {
        this.contentType = Input.optional(contentType);
        return this;
    }

    public FileCreateInput setContentTypeInput(Input<FileContentType> contentType) {
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

    public FileCreateInput setAlt(String alt) {
        this.alt = Input.optional(alt);
        return this;
    }

    public FileCreateInput setAltInput(Input<String> alt) {
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

    public FileCreateInput setDuplicateResolutionMode(FileCreateInputDuplicateResolutionMode duplicateResolutionMode) {
        this.duplicateResolutionMode = Input.optional(duplicateResolutionMode);
        return this;
    }

    public FileCreateInput setDuplicateResolutionModeInput(Input<FileCreateInputDuplicateResolutionMode> duplicateResolutionMode) {
        if (duplicateResolutionMode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.duplicateResolutionMode = duplicateResolutionMode;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("originalSource:");
        Query.appendQuotedString(_queryBuilder, originalSource.toString());

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

        _queryBuilder.append('}');
    }
}

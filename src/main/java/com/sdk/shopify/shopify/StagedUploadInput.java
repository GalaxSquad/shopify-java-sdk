// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class StagedUploadInput implements Serializable {
    private StagedUploadTargetGenerateUploadResource resource;

    private String filename;

    private String mimeType;

    private Input<StagedUploadHttpMethodType> httpMethod = Input.undefined();

    private Input<String> fileSize = Input.undefined();

    public StagedUploadInput(StagedUploadTargetGenerateUploadResource resource, String filename, String mimeType) {
        this.resource = resource;

        this.filename = filename;

        this.mimeType = mimeType;
    }

    public StagedUploadTargetGenerateUploadResource getResource() {
        return resource;
    }

    public StagedUploadInput setResource(StagedUploadTargetGenerateUploadResource resource) {
        this.resource = resource;
        return this;
    }

    public String getFilename() {
        return filename;
    }

    public StagedUploadInput setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public StagedUploadInput setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public StagedUploadHttpMethodType getHttpMethod() {
        return httpMethod.getValue();
    }

    public Input<StagedUploadHttpMethodType> getHttpMethodInput() {
        return httpMethod;
    }

    public StagedUploadInput setHttpMethod(StagedUploadHttpMethodType httpMethod) {
        this.httpMethod = Input.optional(httpMethod);
        return this;
    }

    public StagedUploadInput setHttpMethodInput(Input<StagedUploadHttpMethodType> httpMethod) {
        if (httpMethod == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.httpMethod = httpMethod;
        return this;
    }

    public String getFileSize() {
        return fileSize.getValue();
    }

    public Input<String> getFileSizeInput() {
        return fileSize;
    }

    public StagedUploadInput setFileSize(String fileSize) {
        this.fileSize = Input.optional(fileSize);
        return this;
    }

    public StagedUploadInput setFileSizeInput(Input<String> fileSize) {
        if (fileSize == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fileSize = fileSize;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("resource:");
        _queryBuilder.append(resource.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("filename:");
        Query.appendQuotedString(_queryBuilder, filename.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("mimeType:");
        Query.appendQuotedString(_queryBuilder, mimeType.toString());

        if (this.httpMethod.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("httpMethod:");
            if (httpMethod.getValue() != null) {
                _queryBuilder.append(httpMethod.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fileSize.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fileSize:");
            if (fileSize.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, fileSize.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

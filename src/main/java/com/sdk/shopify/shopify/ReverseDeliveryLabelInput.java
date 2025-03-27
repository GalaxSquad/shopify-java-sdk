// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ReverseDeliveryLabelInput implements Serializable {
    private String fileUrl;

    public ReverseDeliveryLabelInput(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public ReverseDeliveryLabelInput setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fileUrl:");
        Query.appendQuotedString(_queryBuilder, fileUrl.toString());

        _queryBuilder.append('}');
    }
}

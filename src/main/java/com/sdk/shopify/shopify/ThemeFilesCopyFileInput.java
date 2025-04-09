// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ThemeFilesCopyFileInput implements Serializable {
    private String dstFilename;

    private String srcFilename;

    public ThemeFilesCopyFileInput(String dstFilename, String srcFilename) {
        this.dstFilename = dstFilename;

        this.srcFilename = srcFilename;
    }

    public String getDstFilename() {
        return dstFilename;
    }

    public ThemeFilesCopyFileInput setDstFilename(String dstFilename) {
        this.dstFilename = dstFilename;
        return this;
    }

    public String getSrcFilename() {
        return srcFilename;
    }

    public ThemeFilesCopyFileInput setSrcFilename(String srcFilename) {
        this.srcFilename = srcFilename;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("dstFilename:");
        Query.appendQuotedString(_queryBuilder, dstFilename.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("srcFilename:");
        Query.appendQuotedString(_queryBuilder, srcFilename.toString());

        _queryBuilder.append('}');
    }
}

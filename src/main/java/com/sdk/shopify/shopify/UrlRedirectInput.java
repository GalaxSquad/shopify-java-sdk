// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class UrlRedirectInput implements Serializable {
    private Input<String> path = Input.undefined();

    private Input<String> target = Input.undefined();

    public String getPath() {
        return path.getValue();
    }

    public Input<String> getPathInput() {
        return path;
    }

    public UrlRedirectInput setPath(String path) {
        this.path = Input.optional(path);
        return this;
    }

    public UrlRedirectInput setPathInput(Input<String> path) {
        if (path == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.path = path;
        return this;
    }

    public String getTarget() {
        return target.getValue();
    }

    public Input<String> getTargetInput() {
        return target;
    }

    public UrlRedirectInput setTarget(String target) {
        this.target = Input.optional(target);
        return this;
    }

    public UrlRedirectInput setTargetInput(Input<String> target) {
        if (target == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.target = target;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.path.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("path:");
            if (path.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, path.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.target.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("target:");
            if (target.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, target.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

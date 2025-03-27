// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ScriptTagInput implements Serializable {
    private Input<String> src = Input.undefined();

    private Input<ScriptTagDisplayScope> displayScope = Input.undefined();

    private Input<Boolean> cache = Input.undefined();

    public String getSrc() {
        return src.getValue();
    }

    public Input<String> getSrcInput() {
        return src;
    }

    public ScriptTagInput setSrc(String src) {
        this.src = Input.optional(src);
        return this;
    }

    public ScriptTagInput setSrcInput(Input<String> src) {
        if (src == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.src = src;
        return this;
    }

    public ScriptTagDisplayScope getDisplayScope() {
        return displayScope.getValue();
    }

    public Input<ScriptTagDisplayScope> getDisplayScopeInput() {
        return displayScope;
    }

    public ScriptTagInput setDisplayScope(ScriptTagDisplayScope displayScope) {
        this.displayScope = Input.optional(displayScope);
        return this;
    }

    public ScriptTagInput setDisplayScopeInput(Input<ScriptTagDisplayScope> displayScope) {
        if (displayScope == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.displayScope = displayScope;
        return this;
    }

    public Boolean getCache() {
        return cache.getValue();
    }

    public Input<Boolean> getCacheInput() {
        return cache;
    }

    public ScriptTagInput setCache(Boolean cache) {
        this.cache = Input.optional(cache);
        return this;
    }

    public ScriptTagInput setCacheInput(Input<Boolean> cache) {
        if (cache == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cache = cache;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.src.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("src:");
            if (src.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, src.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.displayScope.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("displayScope:");
            if (displayScope.getValue() != null) {
                _queryBuilder.append(displayScope.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.cache.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cache:");
            if (cache.getValue() != null) {
                _queryBuilder.append(cache.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

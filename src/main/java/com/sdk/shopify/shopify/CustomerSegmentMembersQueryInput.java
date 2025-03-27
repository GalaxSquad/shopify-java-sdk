// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CustomerSegmentMembersQueryInput implements Serializable {
    private Input<ID> segmentId = Input.undefined();

    private Input<String> query = Input.undefined();

    private Input<Boolean> reverse = Input.undefined();

    private Input<String> sortKey = Input.undefined();

    public ID getSegmentId() {
        return segmentId.getValue();
    }

    public Input<ID> getSegmentIdInput() {
        return segmentId;
    }

    public CustomerSegmentMembersQueryInput setSegmentId(ID segmentId) {
        this.segmentId = Input.optional(segmentId);
        return this;
    }

    public CustomerSegmentMembersQueryInput setSegmentIdInput(Input<ID> segmentId) {
        if (segmentId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.segmentId = segmentId;
        return this;
    }

    public String getQuery() {
        return query.getValue();
    }

    public Input<String> getQueryInput() {
        return query;
    }

    public CustomerSegmentMembersQueryInput setQuery(String query) {
        this.query = Input.optional(query);
        return this;
    }

    public CustomerSegmentMembersQueryInput setQueryInput(Input<String> query) {
        if (query == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.query = query;
        return this;
    }

    public Boolean getReverse() {
        return reverse.getValue();
    }

    public Input<Boolean> getReverseInput() {
        return reverse;
    }

    public CustomerSegmentMembersQueryInput setReverse(Boolean reverse) {
        this.reverse = Input.optional(reverse);
        return this;
    }

    public CustomerSegmentMembersQueryInput setReverseInput(Input<Boolean> reverse) {
        if (reverse == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reverse = reverse;
        return this;
    }

    public String getSortKey() {
        return sortKey.getValue();
    }

    public Input<String> getSortKeyInput() {
        return sortKey;
    }

    public CustomerSegmentMembersQueryInput setSortKey(String sortKey) {
        this.sortKey = Input.optional(sortKey);
        return this;
    }

    public CustomerSegmentMembersQueryInput setSortKeyInput(Input<String> sortKey) {
        if (sortKey == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sortKey = sortKey;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.segmentId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("segmentId:");
            if (segmentId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, segmentId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.query.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("query:");
            if (query.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, query.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.reverse.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("reverse:");
            if (reverse.getValue() != null) {
                _queryBuilder.append(reverse.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sortKey.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sortKey:");
            if (sortKey.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sortKey.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

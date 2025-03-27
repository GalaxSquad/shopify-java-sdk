// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MetaobjectBulkDeleteWhereCondition implements Serializable {
    private Input<String> type = Input.undefined();

    private Input<List<ID>> ids = Input.undefined();

    public String getType() {
        return type.getValue();
    }

    public Input<String> getTypeInput() {
        return type;
    }

    public MetaobjectBulkDeleteWhereCondition setType(String type) {
        this.type = Input.optional(type);
        return this;
    }

    public MetaobjectBulkDeleteWhereCondition setTypeInput(Input<String> type) {
        if (type == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.type = type;
        return this;
    }

    public List<ID> getIds() {
        return ids.getValue();
    }

    public Input<List<ID>> getIdsInput() {
        return ids;
    }

    public MetaobjectBulkDeleteWhereCondition setIds(List<ID> ids) {
        this.ids = Input.optional(ids);
        return this;
    }

    public MetaobjectBulkDeleteWhereCondition setIdsInput(Input<List<ID>> ids) {
        if (ids == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ids = ids;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.type.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("type:");
            if (type.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, type.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.ids.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ids:");
            if (ids.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : ids.getValue()) {
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

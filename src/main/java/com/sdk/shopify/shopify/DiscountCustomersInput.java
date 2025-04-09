// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class DiscountCustomersInput implements Serializable {
    private Input<List<ID>> add = Input.undefined();

    private Input<List<ID>> remove = Input.undefined();

    public List<ID> getAdd() {
        return add.getValue();
    }

    public Input<List<ID>> getAddInput() {
        return add;
    }

    public DiscountCustomersInput setAdd(List<ID> add) {
        this.add = Input.optional(add);
        return this;
    }

    public DiscountCustomersInput setAddInput(Input<List<ID>> add) {
        if (add == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.add = add;
        return this;
    }

    public List<ID> getRemove() {
        return remove.getValue();
    }

    public Input<List<ID>> getRemoveInput() {
        return remove;
    }

    public DiscountCustomersInput setRemove(List<ID> remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public DiscountCustomersInput setRemoveInput(Input<List<ID>> remove) {
        if (remove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remove = remove;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.add.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("add:");
            if (add.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : add.getValue()) {
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

        if (this.remove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remove:");
            if (remove.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : remove.getValue()) {
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

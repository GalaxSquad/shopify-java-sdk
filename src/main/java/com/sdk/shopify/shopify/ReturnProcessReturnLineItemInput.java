// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ReturnProcessReturnLineItemInput implements Serializable {
    private ID id;

    private int quantity;

    private Input<List<ReverseFulfillmentOrderDisposeInput>> dispositions = Input.undefined();

    public ReturnProcessReturnLineItemInput(ID id, int quantity) {
        this.id = id;

        this.quantity = quantity;
    }

    public ID getId() {
        return id;
    }

    public ReturnProcessReturnLineItemInput setId(ID id) {
        this.id = id;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ReturnProcessReturnLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public List<ReverseFulfillmentOrderDisposeInput> getDispositions() {
        return dispositions.getValue();
    }

    public Input<List<ReverseFulfillmentOrderDisposeInput>> getDispositionsInput() {
        return dispositions;
    }

    public ReturnProcessReturnLineItemInput setDispositions(List<ReverseFulfillmentOrderDisposeInput> dispositions) {
        this.dispositions = Input.optional(dispositions);
        return this;
    }

    public ReturnProcessReturnLineItemInput setDispositionsInput(Input<List<ReverseFulfillmentOrderDisposeInput>> dispositions) {
        if (dispositions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dispositions = dispositions;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        if (this.dispositions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dispositions:");
            if (dispositions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ReverseFulfillmentOrderDisposeInput item1 : dispositions.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
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

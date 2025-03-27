// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DeliveryRateDefinitionInput implements Serializable {
    private MoneyInput price;

    private Input<ID> id = Input.undefined();

    public DeliveryRateDefinitionInput(MoneyInput price) {
        this.price = price;
    }

    public MoneyInput getPrice() {
        return price;
    }

    public DeliveryRateDefinitionInput setPrice(MoneyInput price) {
        this.price = price;
        return this;
    }

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public DeliveryRateDefinitionInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public DeliveryRateDefinitionInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("price:");
        price.appendTo(_queryBuilder);

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

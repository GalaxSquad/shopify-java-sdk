// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class LocationAddInput implements Serializable {
    private String name;

    private LocationAddAddressInput address;

    private Input<Boolean> fulfillsOnlineOrders = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    public LocationAddInput(String name, LocationAddAddressInput address) {
        this.name = name;

        this.address = address;
    }

    public String getName() {
        return name;
    }

    public LocationAddInput setName(String name) {
        this.name = name;
        return this;
    }

    public LocationAddAddressInput getAddress() {
        return address;
    }

    public LocationAddInput setAddress(LocationAddAddressInput address) {
        this.address = address;
        return this;
    }

    public Boolean getFulfillsOnlineOrders() {
        return fulfillsOnlineOrders.getValue();
    }

    public Input<Boolean> getFulfillsOnlineOrdersInput() {
        return fulfillsOnlineOrders;
    }

    public LocationAddInput setFulfillsOnlineOrders(Boolean fulfillsOnlineOrders) {
        this.fulfillsOnlineOrders = Input.optional(fulfillsOnlineOrders);
        return this;
    }

    public LocationAddInput setFulfillsOnlineOrdersInput(Input<Boolean> fulfillsOnlineOrders) {
        if (fulfillsOnlineOrders == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fulfillsOnlineOrders = fulfillsOnlineOrders;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public LocationAddInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public LocationAddInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("address:");
        address.appendTo(_queryBuilder);

        if (this.fulfillsOnlineOrders.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fulfillsOnlineOrders:");
            if (fulfillsOnlineOrders.getValue() != null) {
                _queryBuilder.append(fulfillsOnlineOrders.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : metafields.getValue()) {
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

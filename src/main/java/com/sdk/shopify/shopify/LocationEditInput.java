// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class LocationEditInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<LocationEditAddressInput> address = Input.undefined();

    private Input<Boolean> fulfillsOnlineOrders = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public LocationEditInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public LocationEditInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public LocationEditAddressInput getAddress() {
        return address.getValue();
    }

    public Input<LocationEditAddressInput> getAddressInput() {
        return address;
    }

    public LocationEditInput setAddress(LocationEditAddressInput address) {
        this.address = Input.optional(address);
        return this;
    }

    public LocationEditInput setAddressInput(Input<LocationEditAddressInput> address) {
        if (address == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address = address;
        return this;
    }

    public Boolean getFulfillsOnlineOrders() {
        return fulfillsOnlineOrders.getValue();
    }

    public Input<Boolean> getFulfillsOnlineOrdersInput() {
        return fulfillsOnlineOrders;
    }

    public LocationEditInput setFulfillsOnlineOrders(Boolean fulfillsOnlineOrders) {
        this.fulfillsOnlineOrders = Input.optional(fulfillsOnlineOrders);
        return this;
    }

    public LocationEditInput setFulfillsOnlineOrdersInput(Input<Boolean> fulfillsOnlineOrders) {
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

    public LocationEditInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public LocationEditInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.address.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("address:");
            if (address.getValue() != null) {
                address.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

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

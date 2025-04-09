// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class DeliveryProfileLocationGroupInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<List<ID>> locations = Input.undefined();

    private Input<List<ID>> locationsToAdd = Input.undefined();

    private Input<List<ID>> locationsToRemove = Input.undefined();

    private Input<List<DeliveryLocationGroupZoneInput>> zonesToCreate = Input.undefined();

    private Input<List<DeliveryLocationGroupZoneInput>> zonesToUpdate = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public DeliveryProfileLocationGroupInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public DeliveryProfileLocationGroupInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public List<ID> getLocations() {
        return locations.getValue();
    }

    public Input<List<ID>> getLocationsInput() {
        return locations;
    }

    public DeliveryProfileLocationGroupInput setLocations(List<ID> locations) {
        this.locations = Input.optional(locations);
        return this;
    }

    public DeliveryProfileLocationGroupInput setLocationsInput(Input<List<ID>> locations) {
        if (locations == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locations = locations;
        return this;
    }

    public List<ID> getLocationsToAdd() {
        return locationsToAdd.getValue();
    }

    public Input<List<ID>> getLocationsToAddInput() {
        return locationsToAdd;
    }

    public DeliveryProfileLocationGroupInput setLocationsToAdd(List<ID> locationsToAdd) {
        this.locationsToAdd = Input.optional(locationsToAdd);
        return this;
    }

    public DeliveryProfileLocationGroupInput setLocationsToAddInput(Input<List<ID>> locationsToAdd) {
        if (locationsToAdd == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locationsToAdd = locationsToAdd;
        return this;
    }

    public List<ID> getLocationsToRemove() {
        return locationsToRemove.getValue();
    }

    public Input<List<ID>> getLocationsToRemoveInput() {
        return locationsToRemove;
    }

    public DeliveryProfileLocationGroupInput setLocationsToRemove(List<ID> locationsToRemove) {
        this.locationsToRemove = Input.optional(locationsToRemove);
        return this;
    }

    public DeliveryProfileLocationGroupInput setLocationsToRemoveInput(Input<List<ID>> locationsToRemove) {
        if (locationsToRemove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locationsToRemove = locationsToRemove;
        return this;
    }

    public List<DeliveryLocationGroupZoneInput> getZonesToCreate() {
        return zonesToCreate.getValue();
    }

    public Input<List<DeliveryLocationGroupZoneInput>> getZonesToCreateInput() {
        return zonesToCreate;
    }

    public DeliveryProfileLocationGroupInput setZonesToCreate(List<DeliveryLocationGroupZoneInput> zonesToCreate) {
        this.zonesToCreate = Input.optional(zonesToCreate);
        return this;
    }

    public DeliveryProfileLocationGroupInput setZonesToCreateInput(Input<List<DeliveryLocationGroupZoneInput>> zonesToCreate) {
        if (zonesToCreate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.zonesToCreate = zonesToCreate;
        return this;
    }

    public List<DeliveryLocationGroupZoneInput> getZonesToUpdate() {
        return zonesToUpdate.getValue();
    }

    public Input<List<DeliveryLocationGroupZoneInput>> getZonesToUpdateInput() {
        return zonesToUpdate;
    }

    public DeliveryProfileLocationGroupInput setZonesToUpdate(List<DeliveryLocationGroupZoneInput> zonesToUpdate) {
        this.zonesToUpdate = Input.optional(zonesToUpdate);
        return this;
    }

    public DeliveryProfileLocationGroupInput setZonesToUpdateInput(Input<List<DeliveryLocationGroupZoneInput>> zonesToUpdate) {
        if (zonesToUpdate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.zonesToUpdate = zonesToUpdate;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.locations.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locations:");
            if (locations.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : locations.getValue()) {
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

        if (this.locationsToAdd.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locationsToAdd:");
            if (locationsToAdd.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : locationsToAdd.getValue()) {
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

        if (this.locationsToRemove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locationsToRemove:");
            if (locationsToRemove.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : locationsToRemove.getValue()) {
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

        if (this.zonesToCreate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("zonesToCreate:");
            if (zonesToCreate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryLocationGroupZoneInput item1 : zonesToCreate.getValue()) {
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

        if (this.zonesToUpdate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("zonesToUpdate:");
            if (zonesToUpdate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryLocationGroupZoneInput item1 : zonesToUpdate.getValue()) {
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

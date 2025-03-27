// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class DeliveryProfileInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<DeliveryProfileLocationGroupInput>> profileLocationGroups = Input.undefined();

    private Input<List<DeliveryProfileLocationGroupInput>> locationGroupsToCreate = Input.undefined();

    private Input<List<DeliveryProfileLocationGroupInput>> locationGroupsToUpdate = Input.undefined();

    private Input<List<ID>> locationGroupsToDelete = Input.undefined();

    private Input<List<ID>> variantsToAssociate = Input.undefined();

    private Input<List<ID>> variantsToDissociate = Input.undefined();

    private Input<List<ID>> zonesToDelete = Input.undefined();

    private Input<List<ID>> methodDefinitionsToDelete = Input.undefined();

    private Input<List<ID>> conditionsToDelete = Input.undefined();

    private Input<List<ID>> sellingPlanGroupsToAssociate = Input.undefined();

    private Input<List<ID>> sellingPlanGroupsToDissociate = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public DeliveryProfileInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public DeliveryProfileInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<DeliveryProfileLocationGroupInput> getProfileLocationGroups() {
        return profileLocationGroups.getValue();
    }

    public Input<List<DeliveryProfileLocationGroupInput>> getProfileLocationGroupsInput() {
        return profileLocationGroups;
    }

    public DeliveryProfileInput setProfileLocationGroups(List<DeliveryProfileLocationGroupInput> profileLocationGroups) {
        this.profileLocationGroups = Input.optional(profileLocationGroups);
        return this;
    }

    public DeliveryProfileInput setProfileLocationGroupsInput(Input<List<DeliveryProfileLocationGroupInput>> profileLocationGroups) {
        if (profileLocationGroups == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.profileLocationGroups = profileLocationGroups;
        return this;
    }

    public List<DeliveryProfileLocationGroupInput> getLocationGroupsToCreate() {
        return locationGroupsToCreate.getValue();
    }

    public Input<List<DeliveryProfileLocationGroupInput>> getLocationGroupsToCreateInput() {
        return locationGroupsToCreate;
    }

    public DeliveryProfileInput setLocationGroupsToCreate(List<DeliveryProfileLocationGroupInput> locationGroupsToCreate) {
        this.locationGroupsToCreate = Input.optional(locationGroupsToCreate);
        return this;
    }

    public DeliveryProfileInput setLocationGroupsToCreateInput(Input<List<DeliveryProfileLocationGroupInput>> locationGroupsToCreate) {
        if (locationGroupsToCreate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locationGroupsToCreate = locationGroupsToCreate;
        return this;
    }

    public List<DeliveryProfileLocationGroupInput> getLocationGroupsToUpdate() {
        return locationGroupsToUpdate.getValue();
    }

    public Input<List<DeliveryProfileLocationGroupInput>> getLocationGroupsToUpdateInput() {
        return locationGroupsToUpdate;
    }

    public DeliveryProfileInput setLocationGroupsToUpdate(List<DeliveryProfileLocationGroupInput> locationGroupsToUpdate) {
        this.locationGroupsToUpdate = Input.optional(locationGroupsToUpdate);
        return this;
    }

    public DeliveryProfileInput setLocationGroupsToUpdateInput(Input<List<DeliveryProfileLocationGroupInput>> locationGroupsToUpdate) {
        if (locationGroupsToUpdate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locationGroupsToUpdate = locationGroupsToUpdate;
        return this;
    }

    public List<ID> getLocationGroupsToDelete() {
        return locationGroupsToDelete.getValue();
    }

    public Input<List<ID>> getLocationGroupsToDeleteInput() {
        return locationGroupsToDelete;
    }

    public DeliveryProfileInput setLocationGroupsToDelete(List<ID> locationGroupsToDelete) {
        this.locationGroupsToDelete = Input.optional(locationGroupsToDelete);
        return this;
    }

    public DeliveryProfileInput setLocationGroupsToDeleteInput(Input<List<ID>> locationGroupsToDelete) {
        if (locationGroupsToDelete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locationGroupsToDelete = locationGroupsToDelete;
        return this;
    }

    public List<ID> getVariantsToAssociate() {
        return variantsToAssociate.getValue();
    }

    public Input<List<ID>> getVariantsToAssociateInput() {
        return variantsToAssociate;
    }

    public DeliveryProfileInput setVariantsToAssociate(List<ID> variantsToAssociate) {
        this.variantsToAssociate = Input.optional(variantsToAssociate);
        return this;
    }

    public DeliveryProfileInput setVariantsToAssociateInput(Input<List<ID>> variantsToAssociate) {
        if (variantsToAssociate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.variantsToAssociate = variantsToAssociate;
        return this;
    }

    public List<ID> getVariantsToDissociate() {
        return variantsToDissociate.getValue();
    }

    public Input<List<ID>> getVariantsToDissociateInput() {
        return variantsToDissociate;
    }

    public DeliveryProfileInput setVariantsToDissociate(List<ID> variantsToDissociate) {
        this.variantsToDissociate = Input.optional(variantsToDissociate);
        return this;
    }

    public DeliveryProfileInput setVariantsToDissociateInput(Input<List<ID>> variantsToDissociate) {
        if (variantsToDissociate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.variantsToDissociate = variantsToDissociate;
        return this;
    }

    public List<ID> getZonesToDelete() {
        return zonesToDelete.getValue();
    }

    public Input<List<ID>> getZonesToDeleteInput() {
        return zonesToDelete;
    }

    public DeliveryProfileInput setZonesToDelete(List<ID> zonesToDelete) {
        this.zonesToDelete = Input.optional(zonesToDelete);
        return this;
    }

    public DeliveryProfileInput setZonesToDeleteInput(Input<List<ID>> zonesToDelete) {
        if (zonesToDelete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.zonesToDelete = zonesToDelete;
        return this;
    }

    public List<ID> getMethodDefinitionsToDelete() {
        return methodDefinitionsToDelete.getValue();
    }

    public Input<List<ID>> getMethodDefinitionsToDeleteInput() {
        return methodDefinitionsToDelete;
    }

    public DeliveryProfileInput setMethodDefinitionsToDelete(List<ID> methodDefinitionsToDelete) {
        this.methodDefinitionsToDelete = Input.optional(methodDefinitionsToDelete);
        return this;
    }

    public DeliveryProfileInput setMethodDefinitionsToDeleteInput(Input<List<ID>> methodDefinitionsToDelete) {
        if (methodDefinitionsToDelete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.methodDefinitionsToDelete = methodDefinitionsToDelete;
        return this;
    }

    public List<ID> getConditionsToDelete() {
        return conditionsToDelete.getValue();
    }

    public Input<List<ID>> getConditionsToDeleteInput() {
        return conditionsToDelete;
    }

    public DeliveryProfileInput setConditionsToDelete(List<ID> conditionsToDelete) {
        this.conditionsToDelete = Input.optional(conditionsToDelete);
        return this;
    }

    public DeliveryProfileInput setConditionsToDeleteInput(Input<List<ID>> conditionsToDelete) {
        if (conditionsToDelete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.conditionsToDelete = conditionsToDelete;
        return this;
    }

    public List<ID> getSellingPlanGroupsToAssociate() {
        return sellingPlanGroupsToAssociate.getValue();
    }

    public Input<List<ID>> getSellingPlanGroupsToAssociateInput() {
        return sellingPlanGroupsToAssociate;
    }

    public DeliveryProfileInput setSellingPlanGroupsToAssociate(List<ID> sellingPlanGroupsToAssociate) {
        this.sellingPlanGroupsToAssociate = Input.optional(sellingPlanGroupsToAssociate);
        return this;
    }

    public DeliveryProfileInput setSellingPlanGroupsToAssociateInput(Input<List<ID>> sellingPlanGroupsToAssociate) {
        if (sellingPlanGroupsToAssociate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sellingPlanGroupsToAssociate = sellingPlanGroupsToAssociate;
        return this;
    }

    public List<ID> getSellingPlanGroupsToDissociate() {
        return sellingPlanGroupsToDissociate.getValue();
    }

    public Input<List<ID>> getSellingPlanGroupsToDissociateInput() {
        return sellingPlanGroupsToDissociate;
    }

    public DeliveryProfileInput setSellingPlanGroupsToDissociate(List<ID> sellingPlanGroupsToDissociate) {
        this.sellingPlanGroupsToDissociate = Input.optional(sellingPlanGroupsToDissociate);
        return this;
    }

    public DeliveryProfileInput setSellingPlanGroupsToDissociateInput(Input<List<ID>> sellingPlanGroupsToDissociate) {
        if (sellingPlanGroupsToDissociate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sellingPlanGroupsToDissociate = sellingPlanGroupsToDissociate;
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

        if (this.profileLocationGroups.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("profileLocationGroups:");
            if (profileLocationGroups.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryProfileLocationGroupInput item1 : profileLocationGroups.getValue()) {
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

        if (this.locationGroupsToCreate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locationGroupsToCreate:");
            if (locationGroupsToCreate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryProfileLocationGroupInput item1 : locationGroupsToCreate.getValue()) {
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

        if (this.locationGroupsToUpdate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locationGroupsToUpdate:");
            if (locationGroupsToUpdate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryProfileLocationGroupInput item1 : locationGroupsToUpdate.getValue()) {
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

        if (this.locationGroupsToDelete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locationGroupsToDelete:");
            if (locationGroupsToDelete.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : locationGroupsToDelete.getValue()) {
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

        if (this.variantsToAssociate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("variantsToAssociate:");
            if (variantsToAssociate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : variantsToAssociate.getValue()) {
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

        if (this.variantsToDissociate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("variantsToDissociate:");
            if (variantsToDissociate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : variantsToDissociate.getValue()) {
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

        if (this.zonesToDelete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("zonesToDelete:");
            if (zonesToDelete.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : zonesToDelete.getValue()) {
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

        if (this.methodDefinitionsToDelete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("methodDefinitionsToDelete:");
            if (methodDefinitionsToDelete.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : methodDefinitionsToDelete.getValue()) {
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

        if (this.conditionsToDelete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("conditionsToDelete:");
            if (conditionsToDelete.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : conditionsToDelete.getValue()) {
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

        if (this.sellingPlanGroupsToAssociate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sellingPlanGroupsToAssociate:");
            if (sellingPlanGroupsToAssociate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : sellingPlanGroupsToAssociate.getValue()) {
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

        if (this.sellingPlanGroupsToDissociate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sellingPlanGroupsToDissociate:");
            if (sellingPlanGroupsToDissociate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : sellingPlanGroupsToDissociate.getValue()) {
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

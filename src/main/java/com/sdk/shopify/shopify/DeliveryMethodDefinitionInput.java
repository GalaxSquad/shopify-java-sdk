// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;
import java.util.List;

public class DeliveryMethodDefinitionInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<Boolean> active = Input.undefined();

    private Input<DeliveryRateDefinitionInput> rateDefinition = Input.undefined();

    private Input<DeliveryParticipantInput> participant = Input.undefined();

    private Input<List<DeliveryWeightConditionInput>> weightConditionsToCreate = Input.undefined();

    private Input<List<DeliveryPriceConditionInput>> priceConditionsToCreate = Input.undefined();

    private Input<List<DeliveryUpdateConditionInput>> conditionsToUpdate = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public DeliveryMethodDefinitionInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public DeliveryMethodDefinitionInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public DeliveryMethodDefinitionInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public DeliveryMethodDefinitionInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public DeliveryMethodDefinitionInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public DeliveryMethodDefinitionInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public Boolean getActive() {
        return active.getValue();
    }

    public Input<Boolean> getActiveInput() {
        return active;
    }

    public DeliveryMethodDefinitionInput setActive(Boolean active) {
        this.active = Input.optional(active);
        return this;
    }

    public DeliveryMethodDefinitionInput setActiveInput(Input<Boolean> active) {
        if (active == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.active = active;
        return this;
    }

    public DeliveryRateDefinitionInput getRateDefinition() {
        return rateDefinition.getValue();
    }

    public Input<DeliveryRateDefinitionInput> getRateDefinitionInput() {
        return rateDefinition;
    }

    public DeliveryMethodDefinitionInput setRateDefinition(DeliveryRateDefinitionInput rateDefinition) {
        this.rateDefinition = Input.optional(rateDefinition);
        return this;
    }

    public DeliveryMethodDefinitionInput setRateDefinitionInput(Input<DeliveryRateDefinitionInput> rateDefinition) {
        if (rateDefinition == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.rateDefinition = rateDefinition;
        return this;
    }

    public DeliveryParticipantInput getParticipant() {
        return participant.getValue();
    }

    public Input<DeliveryParticipantInput> getParticipantInput() {
        return participant;
    }

    public DeliveryMethodDefinitionInput setParticipant(DeliveryParticipantInput participant) {
        this.participant = Input.optional(participant);
        return this;
    }

    public DeliveryMethodDefinitionInput setParticipantInput(Input<DeliveryParticipantInput> participant) {
        if (participant == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.participant = participant;
        return this;
    }

    public List<DeliveryWeightConditionInput> getWeightConditionsToCreate() {
        return weightConditionsToCreate.getValue();
    }

    public Input<List<DeliveryWeightConditionInput>> getWeightConditionsToCreateInput() {
        return weightConditionsToCreate;
    }

    public DeliveryMethodDefinitionInput setWeightConditionsToCreate(List<DeliveryWeightConditionInput> weightConditionsToCreate) {
        this.weightConditionsToCreate = Input.optional(weightConditionsToCreate);
        return this;
    }

    public DeliveryMethodDefinitionInput setWeightConditionsToCreateInput(Input<List<DeliveryWeightConditionInput>> weightConditionsToCreate) {
        if (weightConditionsToCreate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.weightConditionsToCreate = weightConditionsToCreate;
        return this;
    }

    public List<DeliveryPriceConditionInput> getPriceConditionsToCreate() {
        return priceConditionsToCreate.getValue();
    }

    public Input<List<DeliveryPriceConditionInput>> getPriceConditionsToCreateInput() {
        return priceConditionsToCreate;
    }

    public DeliveryMethodDefinitionInput setPriceConditionsToCreate(List<DeliveryPriceConditionInput> priceConditionsToCreate) {
        this.priceConditionsToCreate = Input.optional(priceConditionsToCreate);
        return this;
    }

    public DeliveryMethodDefinitionInput setPriceConditionsToCreateInput(Input<List<DeliveryPriceConditionInput>> priceConditionsToCreate) {
        if (priceConditionsToCreate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.priceConditionsToCreate = priceConditionsToCreate;
        return this;
    }

    public List<DeliveryUpdateConditionInput> getConditionsToUpdate() {
        return conditionsToUpdate.getValue();
    }

    public Input<List<DeliveryUpdateConditionInput>> getConditionsToUpdateInput() {
        return conditionsToUpdate;
    }

    public DeliveryMethodDefinitionInput setConditionsToUpdate(List<DeliveryUpdateConditionInput> conditionsToUpdate) {
        this.conditionsToUpdate = Input.optional(conditionsToUpdate);
        return this;
    }

    public DeliveryMethodDefinitionInput setConditionsToUpdateInput(Input<List<DeliveryUpdateConditionInput>> conditionsToUpdate) {
        if (conditionsToUpdate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.conditionsToUpdate = conditionsToUpdate;
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

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.active.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("active:");
            if (active.getValue() != null) {
                _queryBuilder.append(active.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.rateDefinition.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("rateDefinition:");
            if (rateDefinition.getValue() != null) {
                rateDefinition.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.participant.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("participant:");
            if (participant.getValue() != null) {
                participant.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.weightConditionsToCreate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("weightConditionsToCreate:");
            if (weightConditionsToCreate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryWeightConditionInput item1 : weightConditionsToCreate.getValue()) {
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

        if (this.priceConditionsToCreate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("priceConditionsToCreate:");
            if (priceConditionsToCreate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryPriceConditionInput item1 : priceConditionsToCreate.getValue()) {
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

        if (this.conditionsToUpdate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("conditionsToUpdate:");
            if (conditionsToUpdate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryUpdateConditionInput item1 : conditionsToUpdate.getValue()) {
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

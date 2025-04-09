// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class DeliveryParticipantInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<ID> carrierServiceId = Input.undefined();

    private Input<MoneyInput> fixedFee = Input.undefined();

    private Input<Double> percentageOfRateFee = Input.undefined();

    private Input<List<DeliveryParticipantServiceInput>> participantServices = Input.undefined();

    private Input<Boolean> adaptToNewServices = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public DeliveryParticipantInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public DeliveryParticipantInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public ID getCarrierServiceId() {
        return carrierServiceId.getValue();
    }

    public Input<ID> getCarrierServiceIdInput() {
        return carrierServiceId;
    }

    public DeliveryParticipantInput setCarrierServiceId(ID carrierServiceId) {
        this.carrierServiceId = Input.optional(carrierServiceId);
        return this;
    }

    public DeliveryParticipantInput setCarrierServiceIdInput(Input<ID> carrierServiceId) {
        if (carrierServiceId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.carrierServiceId = carrierServiceId;
        return this;
    }

    public MoneyInput getFixedFee() {
        return fixedFee.getValue();
    }

    public Input<MoneyInput> getFixedFeeInput() {
        return fixedFee;
    }

    public DeliveryParticipantInput setFixedFee(MoneyInput fixedFee) {
        this.fixedFee = Input.optional(fixedFee);
        return this;
    }

    public DeliveryParticipantInput setFixedFeeInput(Input<MoneyInput> fixedFee) {
        if (fixedFee == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fixedFee = fixedFee;
        return this;
    }

    public Double getPercentageOfRateFee() {
        return percentageOfRateFee.getValue();
    }

    public Input<Double> getPercentageOfRateFeeInput() {
        return percentageOfRateFee;
    }

    public DeliveryParticipantInput setPercentageOfRateFee(Double percentageOfRateFee) {
        this.percentageOfRateFee = Input.optional(percentageOfRateFee);
        return this;
    }

    public DeliveryParticipantInput setPercentageOfRateFeeInput(Input<Double> percentageOfRateFee) {
        if (percentageOfRateFee == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.percentageOfRateFee = percentageOfRateFee;
        return this;
    }

    public List<DeliveryParticipantServiceInput> getParticipantServices() {
        return participantServices.getValue();
    }

    public Input<List<DeliveryParticipantServiceInput>> getParticipantServicesInput() {
        return participantServices;
    }

    public DeliveryParticipantInput setParticipantServices(List<DeliveryParticipantServiceInput> participantServices) {
        this.participantServices = Input.optional(participantServices);
        return this;
    }

    public DeliveryParticipantInput setParticipantServicesInput(Input<List<DeliveryParticipantServiceInput>> participantServices) {
        if (participantServices == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.participantServices = participantServices;
        return this;
    }

    public Boolean getAdaptToNewServices() {
        return adaptToNewServices.getValue();
    }

    public Input<Boolean> getAdaptToNewServicesInput() {
        return adaptToNewServices;
    }

    public DeliveryParticipantInput setAdaptToNewServices(Boolean adaptToNewServices) {
        this.adaptToNewServices = Input.optional(adaptToNewServices);
        return this;
    }

    public DeliveryParticipantInput setAdaptToNewServicesInput(Input<Boolean> adaptToNewServices) {
        if (adaptToNewServices == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.adaptToNewServices = adaptToNewServices;
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

        if (this.carrierServiceId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("carrierServiceId:");
            if (carrierServiceId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, carrierServiceId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fixedFee.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fixedFee:");
            if (fixedFee.getValue() != null) {
                fixedFee.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.percentageOfRateFee.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("percentageOfRateFee:");
            if (percentageOfRateFee.getValue() != null) {
                _queryBuilder.append(percentageOfRateFee.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.participantServices.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("participantServices:");
            if (participantServices.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryParticipantServiceInput item1 : participantServices.getValue()) {
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

        if (this.adaptToNewServices.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("adaptToNewServices:");
            if (adaptToNewServices.getValue() != null) {
                _queryBuilder.append(adaptToNewServices.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

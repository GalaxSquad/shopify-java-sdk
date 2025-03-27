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

public class DeliveryCountryInput implements Serializable {
    private Input<CountryCode> code = Input.undefined();

    private Input<Boolean> restOfWorld = Input.undefined();

    private Input<List<DeliveryProvinceInput>> provinces = Input.undefined();

    private Input<Boolean> includeAllProvinces = Input.undefined();

    public CountryCode getCode() {
        return code.getValue();
    }

    public Input<CountryCode> getCodeInput() {
        return code;
    }

    public DeliveryCountryInput setCode(CountryCode code) {
        this.code = Input.optional(code);
        return this;
    }

    public DeliveryCountryInput setCodeInput(Input<CountryCode> code) {
        if (code == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.code = code;
        return this;
    }

    public Boolean getRestOfWorld() {
        return restOfWorld.getValue();
    }

    public Input<Boolean> getRestOfWorldInput() {
        return restOfWorld;
    }

    public DeliveryCountryInput setRestOfWorld(Boolean restOfWorld) {
        this.restOfWorld = Input.optional(restOfWorld);
        return this;
    }

    public DeliveryCountryInput setRestOfWorldInput(Input<Boolean> restOfWorld) {
        if (restOfWorld == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.restOfWorld = restOfWorld;
        return this;
    }

    public List<DeliveryProvinceInput> getProvinces() {
        return provinces.getValue();
    }

    public Input<List<DeliveryProvinceInput>> getProvincesInput() {
        return provinces;
    }

    public DeliveryCountryInput setProvinces(List<DeliveryProvinceInput> provinces) {
        this.provinces = Input.optional(provinces);
        return this;
    }

    public DeliveryCountryInput setProvincesInput(Input<List<DeliveryProvinceInput>> provinces) {
        if (provinces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.provinces = provinces;
        return this;
    }

    public Boolean getIncludeAllProvinces() {
        return includeAllProvinces.getValue();
    }

    public Input<Boolean> getIncludeAllProvincesInput() {
        return includeAllProvinces;
    }

    public DeliveryCountryInput setIncludeAllProvinces(Boolean includeAllProvinces) {
        this.includeAllProvinces = Input.optional(includeAllProvinces);
        return this;
    }

    public DeliveryCountryInput setIncludeAllProvincesInput(Input<Boolean> includeAllProvinces) {
        if (includeAllProvinces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.includeAllProvinces = includeAllProvinces;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.code.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("code:");
            if (code.getValue() != null) {
                _queryBuilder.append(code.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.restOfWorld.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("restOfWorld:");
            if (restOfWorld.getValue() != null) {
                _queryBuilder.append(restOfWorld.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.provinces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("provinces:");
            if (provinces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryProvinceInput item1 : provinces.getValue()) {
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

        if (this.includeAllProvinces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("includeAllProvinces:");
            if (includeAllProvinces.getValue() != null) {
                _queryBuilder.append(includeAllProvinces.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

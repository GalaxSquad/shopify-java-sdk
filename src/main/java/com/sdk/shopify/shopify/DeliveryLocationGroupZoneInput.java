// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class DeliveryLocationGroupZoneInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<List<DeliveryCountryInput>> countries = Input.undefined();

    private Input<List<DeliveryMethodDefinitionInput>> methodDefinitionsToCreate = Input.undefined();

    private Input<List<DeliveryMethodDefinitionInput>> methodDefinitionsToUpdate = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public DeliveryLocationGroupZoneInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public DeliveryLocationGroupZoneInput setIdInput(Input<ID> id) {
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

    public DeliveryLocationGroupZoneInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public DeliveryLocationGroupZoneInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<DeliveryCountryInput> getCountries() {
        return countries.getValue();
    }

    public Input<List<DeliveryCountryInput>> getCountriesInput() {
        return countries;
    }

    public DeliveryLocationGroupZoneInput setCountries(List<DeliveryCountryInput> countries) {
        this.countries = Input.optional(countries);
        return this;
    }

    public DeliveryLocationGroupZoneInput setCountriesInput(Input<List<DeliveryCountryInput>> countries) {
        if (countries == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countries = countries;
        return this;
    }

    public List<DeliveryMethodDefinitionInput> getMethodDefinitionsToCreate() {
        return methodDefinitionsToCreate.getValue();
    }

    public Input<List<DeliveryMethodDefinitionInput>> getMethodDefinitionsToCreateInput() {
        return methodDefinitionsToCreate;
    }

    public DeliveryLocationGroupZoneInput setMethodDefinitionsToCreate(List<DeliveryMethodDefinitionInput> methodDefinitionsToCreate) {
        this.methodDefinitionsToCreate = Input.optional(methodDefinitionsToCreate);
        return this;
    }

    public DeliveryLocationGroupZoneInput setMethodDefinitionsToCreateInput(Input<List<DeliveryMethodDefinitionInput>> methodDefinitionsToCreate) {
        if (methodDefinitionsToCreate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.methodDefinitionsToCreate = methodDefinitionsToCreate;
        return this;
    }

    public List<DeliveryMethodDefinitionInput> getMethodDefinitionsToUpdate() {
        return methodDefinitionsToUpdate.getValue();
    }

    public Input<List<DeliveryMethodDefinitionInput>> getMethodDefinitionsToUpdateInput() {
        return methodDefinitionsToUpdate;
    }

    public DeliveryLocationGroupZoneInput setMethodDefinitionsToUpdate(List<DeliveryMethodDefinitionInput> methodDefinitionsToUpdate) {
        this.methodDefinitionsToUpdate = Input.optional(methodDefinitionsToUpdate);
        return this;
    }

    public DeliveryLocationGroupZoneInput setMethodDefinitionsToUpdateInput(Input<List<DeliveryMethodDefinitionInput>> methodDefinitionsToUpdate) {
        if (methodDefinitionsToUpdate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.methodDefinitionsToUpdate = methodDefinitionsToUpdate;
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

        if (this.countries.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("countries:");
            if (countries.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryCountryInput item1 : countries.getValue()) {
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

        if (this.methodDefinitionsToCreate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("methodDefinitionsToCreate:");
            if (methodDefinitionsToCreate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryMethodDefinitionInput item1 : methodDefinitionsToCreate.getValue()) {
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

        if (this.methodDefinitionsToUpdate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("methodDefinitionsToUpdate:");
            if (methodDefinitionsToUpdate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DeliveryMethodDefinitionInput item1 : methodDefinitionsToUpdate.getValue()) {
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

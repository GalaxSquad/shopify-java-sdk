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

public class SellingPlanGroupInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<String> appId = Input.undefined();

    private Input<String> merchantCode = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<SellingPlanInput>> sellingPlansToCreate = Input.undefined();

    private Input<List<SellingPlanInput>> sellingPlansToUpdate = Input.undefined();

    private Input<List<ID>> sellingPlansToDelete = Input.undefined();

    private Input<List<String>> options = Input.undefined();

    private Input<Integer> position = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public SellingPlanGroupInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public SellingPlanGroupInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getAppId() {
        return appId.getValue();
    }

    public Input<String> getAppIdInput() {
        return appId;
    }

    public SellingPlanGroupInput setAppId(String appId) {
        this.appId = Input.optional(appId);
        return this;
    }

    public SellingPlanGroupInput setAppIdInput(Input<String> appId) {
        if (appId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appId = appId;
        return this;
    }

    public String getMerchantCode() {
        return merchantCode.getValue();
    }

    public Input<String> getMerchantCodeInput() {
        return merchantCode;
    }

    public SellingPlanGroupInput setMerchantCode(String merchantCode) {
        this.merchantCode = Input.optional(merchantCode);
        return this;
    }

    public SellingPlanGroupInput setMerchantCodeInput(Input<String> merchantCode) {
        if (merchantCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.merchantCode = merchantCode;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public SellingPlanGroupInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public SellingPlanGroupInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<SellingPlanInput> getSellingPlansToCreate() {
        return sellingPlansToCreate.getValue();
    }

    public Input<List<SellingPlanInput>> getSellingPlansToCreateInput() {
        return sellingPlansToCreate;
    }

    public SellingPlanGroupInput setSellingPlansToCreate(List<SellingPlanInput> sellingPlansToCreate) {
        this.sellingPlansToCreate = Input.optional(sellingPlansToCreate);
        return this;
    }

    public SellingPlanGroupInput setSellingPlansToCreateInput(Input<List<SellingPlanInput>> sellingPlansToCreate) {
        if (sellingPlansToCreate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sellingPlansToCreate = sellingPlansToCreate;
        return this;
    }

    public List<SellingPlanInput> getSellingPlansToUpdate() {
        return sellingPlansToUpdate.getValue();
    }

    public Input<List<SellingPlanInput>> getSellingPlansToUpdateInput() {
        return sellingPlansToUpdate;
    }

    public SellingPlanGroupInput setSellingPlansToUpdate(List<SellingPlanInput> sellingPlansToUpdate) {
        this.sellingPlansToUpdate = Input.optional(sellingPlansToUpdate);
        return this;
    }

    public SellingPlanGroupInput setSellingPlansToUpdateInput(Input<List<SellingPlanInput>> sellingPlansToUpdate) {
        if (sellingPlansToUpdate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sellingPlansToUpdate = sellingPlansToUpdate;
        return this;
    }

    public List<ID> getSellingPlansToDelete() {
        return sellingPlansToDelete.getValue();
    }

    public Input<List<ID>> getSellingPlansToDeleteInput() {
        return sellingPlansToDelete;
    }

    public SellingPlanGroupInput setSellingPlansToDelete(List<ID> sellingPlansToDelete) {
        this.sellingPlansToDelete = Input.optional(sellingPlansToDelete);
        return this;
    }

    public SellingPlanGroupInput setSellingPlansToDeleteInput(Input<List<ID>> sellingPlansToDelete) {
        if (sellingPlansToDelete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sellingPlansToDelete = sellingPlansToDelete;
        return this;
    }

    public List<String> getOptions() {
        return options.getValue();
    }

    public Input<List<String>> getOptionsInput() {
        return options;
    }

    public SellingPlanGroupInput setOptions(List<String> options) {
        this.options = Input.optional(options);
        return this;
    }

    public SellingPlanGroupInput setOptionsInput(Input<List<String>> options) {
        if (options == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.options = options;
        return this;
    }

    public Integer getPosition() {
        return position.getValue();
    }

    public Input<Integer> getPositionInput() {
        return position;
    }

    public SellingPlanGroupInput setPosition(Integer position) {
        this.position = Input.optional(position);
        return this;
    }

    public SellingPlanGroupInput setPositionInput(Input<Integer> position) {
        if (position == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.position = position;
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

        if (this.appId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appId:");
            if (appId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, appId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.merchantCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("merchantCode:");
            if (merchantCode.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, merchantCode.getValue().toString());
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

        if (this.sellingPlansToCreate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sellingPlansToCreate:");
            if (sellingPlansToCreate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SellingPlanInput item1 : sellingPlansToCreate.getValue()) {
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

        if (this.sellingPlansToUpdate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sellingPlansToUpdate:");
            if (sellingPlansToUpdate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SellingPlanInput item1 : sellingPlansToUpdate.getValue()) {
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

        if (this.sellingPlansToDelete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sellingPlansToDelete:");
            if (sellingPlansToDelete.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : sellingPlansToDelete.getValue()) {
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

        if (this.options.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("options:");
            if (options.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : options.getValue()) {
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

        if (this.position.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("position:");
            if (position.getValue() != null) {
                _queryBuilder.append(position.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

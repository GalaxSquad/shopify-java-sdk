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

public class SellingPlanInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<SellingPlanBillingPolicyInput> billingPolicy = Input.undefined();

    private Input<SellingPlanDeliveryPolicyInput> deliveryPolicy = Input.undefined();

    private Input<SellingPlanInventoryPolicyInput> inventoryPolicy = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<List<SellingPlanPricingPolicyInput>> pricingPolicies = Input.undefined();

    private Input<List<String>> options = Input.undefined();

    private Input<Integer> position = Input.undefined();

    private Input<SellingPlanCategory> category = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public SellingPlanInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public SellingPlanInput setIdInput(Input<ID> id) {
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

    public SellingPlanInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public SellingPlanInput setNameInput(Input<String> name) {
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

    public SellingPlanInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public SellingPlanInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public SellingPlanBillingPolicyInput getBillingPolicy() {
        return billingPolicy.getValue();
    }

    public Input<SellingPlanBillingPolicyInput> getBillingPolicyInput() {
        return billingPolicy;
    }

    public SellingPlanInput setBillingPolicy(SellingPlanBillingPolicyInput billingPolicy) {
        this.billingPolicy = Input.optional(billingPolicy);
        return this;
    }

    public SellingPlanInput setBillingPolicyInput(Input<SellingPlanBillingPolicyInput> billingPolicy) {
        if (billingPolicy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.billingPolicy = billingPolicy;
        return this;
    }

    public SellingPlanDeliveryPolicyInput getDeliveryPolicy() {
        return deliveryPolicy.getValue();
    }

    public Input<SellingPlanDeliveryPolicyInput> getDeliveryPolicyInput() {
        return deliveryPolicy;
    }

    public SellingPlanInput setDeliveryPolicy(SellingPlanDeliveryPolicyInput deliveryPolicy) {
        this.deliveryPolicy = Input.optional(deliveryPolicy);
        return this;
    }

    public SellingPlanInput setDeliveryPolicyInput(Input<SellingPlanDeliveryPolicyInput> deliveryPolicy) {
        if (deliveryPolicy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.deliveryPolicy = deliveryPolicy;
        return this;
    }

    public SellingPlanInventoryPolicyInput getInventoryPolicy() {
        return inventoryPolicy.getValue();
    }

    public Input<SellingPlanInventoryPolicyInput> getInventoryPolicyInput() {
        return inventoryPolicy;
    }

    public SellingPlanInput setInventoryPolicy(SellingPlanInventoryPolicyInput inventoryPolicy) {
        this.inventoryPolicy = Input.optional(inventoryPolicy);
        return this;
    }

    public SellingPlanInput setInventoryPolicyInput(Input<SellingPlanInventoryPolicyInput> inventoryPolicy) {
        if (inventoryPolicy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.inventoryPolicy = inventoryPolicy;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public SellingPlanInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public SellingPlanInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public List<SellingPlanPricingPolicyInput> getPricingPolicies() {
        return pricingPolicies.getValue();
    }

    public Input<List<SellingPlanPricingPolicyInput>> getPricingPoliciesInput() {
        return pricingPolicies;
    }

    public SellingPlanInput setPricingPolicies(List<SellingPlanPricingPolicyInput> pricingPolicies) {
        this.pricingPolicies = Input.optional(pricingPolicies);
        return this;
    }

    public SellingPlanInput setPricingPoliciesInput(Input<List<SellingPlanPricingPolicyInput>> pricingPolicies) {
        if (pricingPolicies == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pricingPolicies = pricingPolicies;
        return this;
    }

    public List<String> getOptions() {
        return options.getValue();
    }

    public Input<List<String>> getOptionsInput() {
        return options;
    }

    public SellingPlanInput setOptions(List<String> options) {
        this.options = Input.optional(options);
        return this;
    }

    public SellingPlanInput setOptionsInput(Input<List<String>> options) {
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

    public SellingPlanInput setPosition(Integer position) {
        this.position = Input.optional(position);
        return this;
    }

    public SellingPlanInput setPositionInput(Input<Integer> position) {
        if (position == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.position = position;
        return this;
    }

    public SellingPlanCategory getCategory() {
        return category.getValue();
    }

    public Input<SellingPlanCategory> getCategoryInput() {
        return category;
    }

    public SellingPlanInput setCategory(SellingPlanCategory category) {
        this.category = Input.optional(category);
        return this;
    }

    public SellingPlanInput setCategoryInput(Input<SellingPlanCategory> category) {
        if (category == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.category = category;
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

        if (this.billingPolicy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("billingPolicy:");
            if (billingPolicy.getValue() != null) {
                billingPolicy.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.deliveryPolicy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("deliveryPolicy:");
            if (deliveryPolicy.getValue() != null) {
                deliveryPolicy.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.inventoryPolicy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("inventoryPolicy:");
            if (inventoryPolicy.getValue() != null) {
                inventoryPolicy.getValue().appendTo(_queryBuilder);
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

        if (this.pricingPolicies.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("pricingPolicies:");
            if (pricingPolicies.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SellingPlanPricingPolicyInput item1 : pricingPolicies.getValue()) {
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

        if (this.category.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("category:");
            if (category.getValue() != null) {
                _queryBuilder.append(category.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

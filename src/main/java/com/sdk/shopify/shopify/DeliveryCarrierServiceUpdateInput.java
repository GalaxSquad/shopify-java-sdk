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

public class DeliveryCarrierServiceUpdateInput implements Serializable {
    private ID id;

    private Input<String> name = Input.undefined();

    private Input<String> callbackUrl = Input.undefined();

    private Input<Boolean> supportsServiceDiscovery = Input.undefined();

    private Input<Boolean> active = Input.undefined();

    public DeliveryCarrierServiceUpdateInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public DeliveryCarrierServiceUpdateInput setId(ID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public DeliveryCarrierServiceUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public DeliveryCarrierServiceUpdateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getCallbackUrl() {
        return callbackUrl.getValue();
    }

    public Input<String> getCallbackUrlInput() {
        return callbackUrl;
    }

    public DeliveryCarrierServiceUpdateInput setCallbackUrl(String callbackUrl) {
        this.callbackUrl = Input.optional(callbackUrl);
        return this;
    }

    public DeliveryCarrierServiceUpdateInput setCallbackUrlInput(Input<String> callbackUrl) {
        if (callbackUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.callbackUrl = callbackUrl;
        return this;
    }

    public Boolean getSupportsServiceDiscovery() {
        return supportsServiceDiscovery.getValue();
    }

    public Input<Boolean> getSupportsServiceDiscoveryInput() {
        return supportsServiceDiscovery;
    }

    public DeliveryCarrierServiceUpdateInput setSupportsServiceDiscovery(Boolean supportsServiceDiscovery) {
        this.supportsServiceDiscovery = Input.optional(supportsServiceDiscovery);
        return this;
    }

    public DeliveryCarrierServiceUpdateInput setSupportsServiceDiscoveryInput(Input<Boolean> supportsServiceDiscovery) {
        if (supportsServiceDiscovery == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.supportsServiceDiscovery = supportsServiceDiscovery;
        return this;
    }

    public Boolean getActive() {
        return active.getValue();
    }

    public Input<Boolean> getActiveInput() {
        return active;
    }

    public DeliveryCarrierServiceUpdateInput setActive(Boolean active) {
        this.active = Input.optional(active);
        return this;
    }

    public DeliveryCarrierServiceUpdateInput setActiveInput(Input<Boolean> active) {
        if (active == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.active = active;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

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

        if (this.callbackUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("callbackUrl:");
            if (callbackUrl.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, callbackUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.supportsServiceDiscovery.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("supportsServiceDiscovery:");
            if (supportsServiceDiscovery.getValue() != null) {
                _queryBuilder.append(supportsServiceDiscovery.getValue());
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

        _queryBuilder.append('}');
    }
}

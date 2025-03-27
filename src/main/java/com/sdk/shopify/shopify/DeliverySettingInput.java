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

public class DeliverySettingInput implements Serializable {
    private Input<Boolean> legacyModeProfiles = Input.undefined();

    public Boolean getLegacyModeProfiles() {
        return legacyModeProfiles.getValue();
    }

    public Input<Boolean> getLegacyModeProfilesInput() {
        return legacyModeProfiles;
    }

    public DeliverySettingInput setLegacyModeProfiles(Boolean legacyModeProfiles) {
        this.legacyModeProfiles = Input.optional(legacyModeProfiles);
        return this;
    }

    public DeliverySettingInput setLegacyModeProfilesInput(Input<Boolean> legacyModeProfiles) {
        if (legacyModeProfiles == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.legacyModeProfiles = legacyModeProfiles;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.legacyModeProfiles.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("legacyModeProfiles:");
            if (legacyModeProfiles.getValue() != null) {
                _queryBuilder.append(legacyModeProfiles.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

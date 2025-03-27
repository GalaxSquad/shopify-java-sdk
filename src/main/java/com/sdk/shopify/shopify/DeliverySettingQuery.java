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

/**
* The `DeliverySetting` object enables you to manage shop-wide shipping settings.
* You can enable legacy compatibility mode for the multi-location delivery profiles feature
* if the legacy mode isn't blocked.
*/
public class DeliverySettingQuery extends Query<DeliverySettingQuery> {
    DeliverySettingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the shop is blocked from converting to full multi-location delivery profiles mode. If the
    * shop is blocked, then the blocking reasons are also returned.
    */
    public DeliverySettingQuery legacyModeBlocked(DeliveryLegacyModeBlockedQueryDefinition queryDef) {
        startField("legacyModeBlocked");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryLegacyModeBlockedQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Enables legacy compatability mode for the multi-location delivery profiles feature.
    */
    public DeliverySettingQuery legacyModeProfiles() {
        startField("legacyModeProfiles");

        return this;
    }
}

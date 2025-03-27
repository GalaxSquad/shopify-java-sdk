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
* A region that is used to define a shipping zone.
*/
public class DeliveryProvinceQuery extends Query<DeliveryProvinceQuery> {
    DeliveryProvinceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The code of the region.
    */
    public DeliveryProvinceQuery code() {
        startField("code");

        return this;
    }

    /**
    * The full name of the region.
    */
    public DeliveryProvinceQuery name() {
        startField("name");

        return this;
    }

    /**
    * The translated name of the region. The translation returned is based on the system's locale.
    */
    public DeliveryProvinceQuery translatedName() {
        startField("translatedName");

        return this;
    }
}

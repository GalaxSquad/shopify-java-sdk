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
* The attribute editable information.
*/
public class EditablePropertyQuery extends Query<EditablePropertyQuery> {
    EditablePropertyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the attribute is locked for editing.
    */
    public EditablePropertyQuery locked() {
        startField("locked");

        return this;
    }

    /**
    * The reason the attribute is locked for editing.
    */
    public EditablePropertyQuery reason() {
        startField("reason");

        return this;
    }
}

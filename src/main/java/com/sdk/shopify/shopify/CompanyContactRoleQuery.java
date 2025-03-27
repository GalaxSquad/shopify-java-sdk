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
* The role for a [company
* contact](https://shopify.dev/api/admin-graphql/latest/objects/companycontact).
*/
public class CompanyContactRoleQuery extends Query<CompanyContactRoleQuery> {
    CompanyContactRoleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The name of a role.
    * For example, `admin` or `buyer`.
    */
    public CompanyContactRoleQuery name() {
        startField("name");

        return this;
    }

    /**
    * A note for the role.
    */
    public CompanyContactRoleQuery note() {
        startField("note");

        return this;
    }
}

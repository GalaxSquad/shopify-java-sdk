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
* Represents the data about a staff member's Shopify account. Merchants can use staff member data to
* get more information about the staff members in their store.
*/
public class StaffMemberQuery extends Query<StaffMemberQuery> {
    StaffMemberQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The type of account the staff member has.
    */
    public StaffMemberQuery accountType() {
        startField("accountType");

        return this;
    }

    /**
    * Whether the staff member is active.
    */
    public StaffMemberQuery active() {
        startField("active");

        return this;
    }

    public class AvatarArguments extends Arguments {
        AvatarArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The default image returned if the staff member has no avatar.
        */
        public AvatarArguments fallback(StaffMemberDefaultImage value) {
            if (value != null) {
                startArgument("fallback");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface AvatarArgumentsDefinition {
        void define(AvatarArguments args);
    }

    /**
    * The image used as the staff member's avatar in the Shopify admin.
    */
    public StaffMemberQuery avatar(ImageQueryDefinition queryDef) {
        return avatar(args -> {}, queryDef);
    }

    /**
    * The image used as the staff member's avatar in the Shopify admin.
    */
    public StaffMemberQuery avatar(AvatarArgumentsDefinition argsDef, ImageQueryDefinition queryDef) {
        startField("avatar");

        AvatarArguments args = new AvatarArguments(_queryBuilder);
        argsDef.define(args);
        AvatarArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The staff member's email address.
    */
    public StaffMemberQuery email() {
        startField("email");

        return this;
    }

    /**
    * Whether the staff member's account exists.
    */
    public StaffMemberQuery exists() {
        startField("exists");

        return this;
    }

    /**
    * The staff member's first name.
    */
    public StaffMemberQuery firstName() {
        startField("firstName");

        return this;
    }

    /**
    * The staff member's initials, if available.
    */
    public StaffMemberQuery initials() {
        startField("initials");

        return this;
    }

    /**
    * Whether the staff member is the shop owner.
    */
    public StaffMemberQuery isShopOwner() {
        startField("isShopOwner");

        return this;
    }

    /**
    * The staff member's last name.
    */
    public StaffMemberQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The staff member's preferred locale. Locale values use the format `language` or `language-COUNTRY`,
    * where `language` is a two-letter language code, and `COUNTRY` is a two-letter country code. For
    * example: `en` or `en-US`
    */
    public StaffMemberQuery locale() {
        startField("locale");

        return this;
    }

    /**
    * The staff member's full name.
    */
    public StaffMemberQuery name() {
        startField("name");

        return this;
    }

    /**
    * The staff member's phone number.
    */
    public StaffMemberQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The data used to customize the Shopify admin experience for the staff member.
    */
    public StaffMemberQuery privateData(StaffMemberPrivateDataQueryDefinition queryDef) {
        startField("privateData");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberPrivateDataQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

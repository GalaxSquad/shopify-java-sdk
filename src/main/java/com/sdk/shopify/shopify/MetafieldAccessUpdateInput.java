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

public class MetafieldAccessUpdateInput implements Serializable {
    private Input<MetafieldAdminAccessInput> admin = Input.undefined();

    private Input<MetafieldStorefrontAccessInput> storefront = Input.undefined();

    private Input<MetafieldCustomerAccountAccessInput> customerAccount = Input.undefined();

    public MetafieldAdminAccessInput getAdmin() {
        return admin.getValue();
    }

    public Input<MetafieldAdminAccessInput> getAdminInput() {
        return admin;
    }

    public MetafieldAccessUpdateInput setAdmin(MetafieldAdminAccessInput admin) {
        this.admin = Input.optional(admin);
        return this;
    }

    public MetafieldAccessUpdateInput setAdminInput(Input<MetafieldAdminAccessInput> admin) {
        if (admin == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.admin = admin;
        return this;
    }

    public MetafieldStorefrontAccessInput getStorefront() {
        return storefront.getValue();
    }

    public Input<MetafieldStorefrontAccessInput> getStorefrontInput() {
        return storefront;
    }

    public MetafieldAccessUpdateInput setStorefront(MetafieldStorefrontAccessInput storefront) {
        this.storefront = Input.optional(storefront);
        return this;
    }

    public MetafieldAccessUpdateInput setStorefrontInput(Input<MetafieldStorefrontAccessInput> storefront) {
        if (storefront == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.storefront = storefront;
        return this;
    }

    public MetafieldCustomerAccountAccessInput getCustomerAccount() {
        return customerAccount.getValue();
    }

    public Input<MetafieldCustomerAccountAccessInput> getCustomerAccountInput() {
        return customerAccount;
    }

    public MetafieldAccessUpdateInput setCustomerAccount(MetafieldCustomerAccountAccessInput customerAccount) {
        this.customerAccount = Input.optional(customerAccount);
        return this;
    }

    public MetafieldAccessUpdateInput setCustomerAccountInput(Input<MetafieldCustomerAccountAccessInput> customerAccount) {
        if (customerAccount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerAccount = customerAccount;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.admin.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("admin:");
            if (admin.getValue() != null) {
                _queryBuilder.append(admin.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.storefront.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("storefront:");
            if (storefront.getValue() != null) {
                _queryBuilder.append(storefront.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerAccount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerAccount:");
            if (customerAccount.getValue() != null) {
                _queryBuilder.append(customerAccount.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

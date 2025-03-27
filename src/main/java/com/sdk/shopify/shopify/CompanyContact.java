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

import java.util.Map;

/**
* A person that acts on behalf of company associated to [a
* customer](https://shopify.dev/api/admin-graphql/latest/objects/customer).
*/
public class CompanyContact extends AbstractResponse<CompanyContact> implements Node {
    public CompanyContact() {
    }

    public CompanyContact(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "company": {
                    responseData.put(key, new Company(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "customer": {
                    responseData.put(key, new Customer(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "draftOrders": {
                    responseData.put(key, new DraftOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "isMainContact": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "lifetimeDuration": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "locale": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orders": {
                    responseData.put(key, new OrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "roleAssignments": {
                    responseData.put(key, new CompanyContactRoleAssignmentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public CompanyContact(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CompanyContact";
    }

    /**
    * The company to which the contact belongs.
    */

    public Company getCompany() {
        return (Company) get("company");
    }

    public CompanyContact setCompany(Company arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * contact was created at Shopify.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public CompanyContact setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The customer associated to this contact.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public CompanyContact setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * The list of draft orders for the company contact.
    */

    public DraftOrderConnection getDraftOrders() {
        return (DraftOrderConnection) get("draftOrders");
    }

    public CompanyContact setDraftOrders(DraftOrderConnection arg) {
        optimisticData.put(getKey("draftOrders"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether the contact is the main contact of the company.
    */

    public Boolean getIsMainContact() {
        return (Boolean) get("isMainContact");
    }

    public CompanyContact setIsMainContact(Boolean arg) {
        optimisticData.put(getKey("isMainContact"), arg);
        return this;
    }

    /**
    * The lifetime duration of the company contact, since its creation date on Shopify. Examples: `1
    * year`, `2 months`, `3 days`.
    */

    public String getLifetimeDuration() {
        return (String) get("lifetimeDuration");
    }

    public CompanyContact setLifetimeDuration(String arg) {
        optimisticData.put(getKey("lifetimeDuration"), arg);
        return this;
    }

    /**
    * The company contact's locale (language).
    */

    public String getLocale() {
        return (String) get("locale");
    }

    public CompanyContact setLocale(String arg) {
        optimisticData.put(getKey("locale"), arg);
        return this;
    }

    /**
    * The list of orders for the company contact.
    */

    public OrderConnection getOrders() {
        return (OrderConnection) get("orders");
    }

    public CompanyContact setOrders(OrderConnection arg) {
        optimisticData.put(getKey("orders"), arg);
        return this;
    }

    /**
    * The list of roles assigned to this company contact.
    */

    public CompanyContactRoleAssignmentConnection getRoleAssignments() {
        return (CompanyContactRoleAssignmentConnection) get("roleAssignments");
    }

    public CompanyContact setRoleAssignments(CompanyContactRoleAssignmentConnection arg) {
        optimisticData.put(getKey("roleAssignments"), arg);
        return this;
    }

    /**
    * The company contact's job title.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public CompanyContact setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * contact was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public CompanyContact setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "company": return true;

            case "createdAt": return false;

            case "customer": return true;

            case "draftOrders": return true;

            case "id": return false;

            case "isMainContact": return false;

            case "lifetimeDuration": return false;

            case "locale": return false;

            case "orders": return true;

            case "roleAssignments": return true;

            case "title": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}


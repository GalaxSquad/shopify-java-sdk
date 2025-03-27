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
* Represents information about a company which is also a customer of the shop.
*/
public class Company extends AbstractResponse<Company> implements CommentEventSubject, HasEvents, HasMetafieldDefinitions, HasMetafields, MetafieldReference, MetafieldReferencer, Navigable, Node {
    public Company() {
    }

    public Company(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "contactRoles": {
                    responseData.put(key, new CompanyContactRoleConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "contacts": {
                    responseData.put(key, new CompanyContactConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "contactsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "customerSince": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "defaultCursor": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "defaultRole": {
                    CompanyContactRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactRole(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrders": {
                    responseData.put(key, new DraftOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "externalId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hasTimelineComment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lifetimeDuration": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "locations": {
                    responseData.put(key, new CompanyLocationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "locationsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "mainContact": {
                    CompanyContact optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContact(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "note": {
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

                case "ordersCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "totalSpent": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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

    public Company(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Company";
    }

    /**
    * The list of roles for the company contacts.
    */

    public CompanyContactRoleConnection getContactRoles() {
        return (CompanyContactRoleConnection) get("contactRoles");
    }

    public Company setContactRoles(CompanyContactRoleConnection arg) {
        optimisticData.put(getKey("contactRoles"), arg);
        return this;
    }

    /**
    * The list of contacts in the company.
    */

    public CompanyContactConnection getContacts() {
        return (CompanyContactConnection) get("contacts");
    }

    public Company setContacts(CompanyContactConnection arg) {
        optimisticData.put(getKey("contacts"), arg);
        return this;
    }

    /**
    * The number of contacts that belong to the company.
    */

    public Count getContactsCount() {
        return (Count) get("contactsCount");
    }

    public Company setContactsCount(Count arg) {
        optimisticData.put(getKey("contactsCount"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * was created in Shopify.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Company setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * became the customer.
    */

    public String getCustomerSince() {
        return (String) get("customerSince");
    }

    public Company setCustomerSince(String arg) {
        optimisticData.put(getKey("customerSince"), arg);
        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */

    public String getDefaultCursor() {
        return (String) get("defaultCursor");
    }

    public Company setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    /**
    * The role proposed by default for a contact at the company.
    */

    public CompanyContactRole getDefaultRole() {
        return (CompanyContactRole) get("defaultRole");
    }

    public Company setDefaultRole(CompanyContactRole arg) {
        optimisticData.put(getKey("defaultRole"), arg);
        return this;
    }

    /**
    * The list of the company's draft orders.
    */

    public DraftOrderConnection getDraftOrders() {
        return (DraftOrderConnection) get("draftOrders");
    }

    public Company setDraftOrders(DraftOrderConnection arg) {
        optimisticData.put(getKey("draftOrders"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public Company setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * A unique externally-supplied ID for the company.
    */

    public String getExternalId() {
        return (String) get("externalId");
    }

    public Company setExternalId(String arg) {
        optimisticData.put(getKey("externalId"), arg);
        return this;
    }

    /**
    * Whether the merchant added a timeline comment to the company.
    */

    public Boolean getHasTimelineComment() {
        return (Boolean) get("hasTimelineComment");
    }

    public Company setHasTimelineComment(Boolean arg) {
        optimisticData.put(getKey("hasTimelineComment"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The lifetime duration of the company, since it became a customer of the shop. Examples: `2 days`, `3
    * months`, `1 year`.
    */

    public String getLifetimeDuration() {
        return (String) get("lifetimeDuration");
    }

    public Company setLifetimeDuration(String arg) {
        optimisticData.put(getKey("lifetimeDuration"), arg);
        return this;
    }

    /**
    * The list of locations in the company.
    */

    public CompanyLocationConnection getLocations() {
        return (CompanyLocationConnection) get("locations");
    }

    public Company setLocations(CompanyLocationConnection arg) {
        optimisticData.put(getKey("locations"), arg);
        return this;
    }

    /**
    * The number of locations that belong to the company.
    */

    public Count getLocationsCount() {
        return (Count) get("locationsCount");
    }

    public Company setLocationsCount(Count arg) {
        optimisticData.put(getKey("locationsCount"), arg);
        return this;
    }

    /**
    * The main contact for the company.
    */

    public CompanyContact getMainContact() {
        return (CompanyContact) get("mainContact");
    }

    public Company setMainContact(CompanyContact arg) {
        optimisticData.put(getKey("mainContact"), arg);
        return this;
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public Company setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public Company setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The name of the company.
    */

    public String getName() {
        return (String) get("name");
    }

    public Company setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * A note about the company.
    */

    public String getNote() {
        return (String) get("note");
    }

    public Company setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The list of the company's orders.
    */

    public OrderConnection getOrders() {
        return (OrderConnection) get("orders");
    }

    public Company setOrders(OrderConnection arg) {
        optimisticData.put(getKey("orders"), arg);
        return this;
    }

    /**
    * The total number of orders placed for this company, across all its locations.
    */

    public Count getOrdersCount() {
        return (Count) get("ordersCount");
    }

    public Company setOrdersCount(Count arg) {
        optimisticData.put(getKey("ordersCount"), arg);
        return this;
    }

    /**
    * The total amount spent by this company, across all its locations.
    */

    public MoneyV2 getTotalSpent() {
        return (MoneyV2) get("totalSpent");
    }

    public Company setTotalSpent(MoneyV2 arg) {
        optimisticData.put(getKey("totalSpent"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * was last modified.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Company setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "contactRoles": return true;

            case "contacts": return true;

            case "contactsCount": return true;

            case "createdAt": return false;

            case "customerSince": return false;

            case "defaultCursor": return false;

            case "defaultRole": return true;

            case "draftOrders": return true;

            case "events": return true;

            case "externalId": return false;

            case "hasTimelineComment": return false;

            case "id": return false;

            case "lifetimeDuration": return false;

            case "locations": return true;

            case "locationsCount": return true;

            case "mainContact": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "name": return false;

            case "note": return false;

            case "orders": return true;

            case "ordersCount": return true;

            case "totalSpent": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}


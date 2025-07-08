// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A location or branch of a [company that's a
* customer](https://shopify.dev/api/admin-graphql/latest/objects/company) of the shop. Configuration
* of B2B relationship, for example prices lists and checkout settings, may be done for a location.
*/
public class CompanyLocation extends AbstractResponse<CompanyLocation> implements CommentEventSubject, HasEvents, HasMetafieldDefinitions, HasMetafields, MetafieldReferencer, Navigable, Node {
    public CompanyLocation() {
    }

    public CompanyLocation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "billingAddress": {
                    CompanyAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "buyerExperienceConfiguration": {
                    BuyerExperienceConfiguration optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BuyerExperienceConfiguration(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "catalogs": {
                    responseData.put(key, new CatalogConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "catalogsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "company": {
                    responseData.put(key, new Company(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "currency": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "defaultCursor": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "inCatalog": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "phone": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "roleAssignments": {
                    responseData.put(key, new CompanyContactRoleAssignmentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "shippingAddress": {
                    CompanyAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "staffMemberAssignments": {
                    responseData.put(key, new CompanyLocationStaffMemberAssignmentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "taxSettings": {
                    responseData.put(key, new CompanyLocationTaxSettings(jsonAsObject(field.getValue(), key)));

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

    public CompanyLocation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CompanyLocation";
    }

    /**
    * The address used as billing address for the location.
    */

    public CompanyAddress getBillingAddress() {
        return (CompanyAddress) get("billingAddress");
    }

    public CompanyLocation setBillingAddress(CompanyAddress arg) {
        optimisticData.put(getKey("billingAddress"), arg);
        return this;
    }

    /**
    * The configuration for the buyer's B2B checkout.
    */

    public BuyerExperienceConfiguration getBuyerExperienceConfiguration() {
        return (BuyerExperienceConfiguration) get("buyerExperienceConfiguration");
    }

    public CompanyLocation setBuyerExperienceConfiguration(BuyerExperienceConfiguration arg) {
        optimisticData.put(getKey("buyerExperienceConfiguration"), arg);
        return this;
    }

    /**
    * The list of catalogs associated with the company location.
    */

    public CatalogConnection getCatalogs() {
        return (CatalogConnection) get("catalogs");
    }

    public CompanyLocation setCatalogs(CatalogConnection arg) {
        optimisticData.put(getKey("catalogs"), arg);
        return this;
    }

    /**
    * The number of catalogs associated with the company location. Limited to a maximum of 10000 by
    * default.
    */

    public Count getCatalogsCount() {
        return (Count) get("catalogsCount");
    }

    public CompanyLocation setCatalogsCount(Count arg) {
        optimisticData.put(getKey("catalogsCount"), arg);
        return this;
    }

    /**
    * The company that the company location belongs to.
    */

    public Company getCompany() {
        return (Company) get("company");
    }

    public CompanyLocation setCompany(Company arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * location was created in Shopify.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public CompanyLocation setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The location's currency based on the shipping address. If the shipping address is empty, then the
    * value is the shop's primary market.
    */

    public CurrencyCode getCurrency() {
        return (CurrencyCode) get("currency");
    }

    public CompanyLocation setCurrency(CurrencyCode arg) {
        optimisticData.put(getKey("currency"), arg);
        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */

    public String getDefaultCursor() {
        return (String) get("defaultCursor");
    }

    public CompanyLocation setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    /**
    * The list of draft orders for the company location.
    */

    public DraftOrderConnection getDraftOrders() {
        return (DraftOrderConnection) get("draftOrders");
    }

    public CompanyLocation setDraftOrders(DraftOrderConnection arg) {
        optimisticData.put(getKey("draftOrders"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public CompanyLocation setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * A unique externally-supplied ID for the company location.
    */

    public String getExternalId() {
        return (String) get("externalId");
    }

    public CompanyLocation setExternalId(String arg) {
        optimisticData.put(getKey("externalId"), arg);
        return this;
    }

    /**
    * Whether the merchant added a timeline comment to the company location.
    */

    public Boolean getHasTimelineComment() {
        return (Boolean) get("hasTimelineComment");
    }

    public CompanyLocation setHasTimelineComment(Boolean arg) {
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
    * Whether the company location is assigned a specific catalog.
    */

    public Boolean getInCatalog() {
        return (Boolean) get("inCatalog");
    }

    public CompanyLocation setInCatalog(Boolean arg) {
        optimisticData.put(getKey("inCatalog"), arg);
        return this;
    }

    /**
    * The preferred locale of the company location.
    */

    public String getLocale() {
        return (String) get("locale");
    }

    public CompanyLocation setLocale(String arg) {
        optimisticData.put(getKey("locale"), arg);
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

    public CompanyLocation setMetafield(Metafield arg) {
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

    public CompanyLocation setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The name of the company location.
    */

    public String getName() {
        return (String) get("name");
    }

    public CompanyLocation setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * A note about the company location.
    */

    public String getNote() {
        return (String) get("note");
    }

    public CompanyLocation setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The list of orders for the company location.
    */

    public OrderConnection getOrders() {
        return (OrderConnection) get("orders");
    }

    public CompanyLocation setOrders(OrderConnection arg) {
        optimisticData.put(getKey("orders"), arg);
        return this;
    }

    /**
    * The total number of orders placed for the location.
    */

    public Count getOrdersCount() {
        return (Count) get("ordersCount");
    }

    public CompanyLocation setOrdersCount(Count arg) {
        optimisticData.put(getKey("ordersCount"), arg);
        return this;
    }

    /**
    * The phone number of the company location.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public CompanyLocation setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The list of roles assigned to the company location.
    */

    public CompanyContactRoleAssignmentConnection getRoleAssignments() {
        return (CompanyContactRoleAssignmentConnection) get("roleAssignments");
    }

    public CompanyLocation setRoleAssignments(CompanyContactRoleAssignmentConnection arg) {
        optimisticData.put(getKey("roleAssignments"), arg);
        return this;
    }

    /**
    * The address used as shipping address for the location.
    */

    public CompanyAddress getShippingAddress() {
        return (CompanyAddress) get("shippingAddress");
    }

    public CompanyLocation setShippingAddress(CompanyAddress arg) {
        optimisticData.put(getKey("shippingAddress"), arg);
        return this;
    }

    /**
    * The list of staff members assigned to the company location.
    */

    public CompanyLocationStaffMemberAssignmentConnection getStaffMemberAssignments() {
        return (CompanyLocationStaffMemberAssignmentConnection) get("staffMemberAssignments");
    }

    public CompanyLocation setStaffMemberAssignments(CompanyLocationStaffMemberAssignmentConnection arg) {
        optimisticData.put(getKey("staffMemberAssignments"), arg);
        return this;
    }

    /**
    * The tax settings for the company location.
    */

    public CompanyLocationTaxSettings getTaxSettings() {
        return (CompanyLocationTaxSettings) get("taxSettings");
    }

    public CompanyLocation setTaxSettings(CompanyLocationTaxSettings arg) {
        optimisticData.put(getKey("taxSettings"), arg);
        return this;
    }

    /**
    * The total amount spent by the location.
    */

    public MoneyV2 getTotalSpent() {
        return (MoneyV2) get("totalSpent");
    }

    public CompanyLocation setTotalSpent(MoneyV2 arg) {
        optimisticData.put(getKey("totalSpent"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * location was last modified.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public CompanyLocation setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "billingAddress": return true;

            case "buyerExperienceConfiguration": return true;

            case "catalogs": return true;

            case "catalogsCount": return true;

            case "company": return true;

            case "createdAt": return false;

            case "currency": return false;

            case "defaultCursor": return false;

            case "draftOrders": return true;

            case "events": return true;

            case "externalId": return false;

            case "hasTimelineComment": return false;

            case "id": return false;

            case "inCatalog": return false;

            case "locale": return false;

            case "metafield": return true;

            case "metafields": return true;

            case "name": return false;

            case "note": return false;

            case "orders": return true;

            case "ordersCount": return true;

            case "phone": return false;

            case "roleAssignments": return true;

            case "shippingAddress": return true;

            case "staffMemberAssignments": return true;

            case "taxSettings": return true;

            case "totalSpent": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}


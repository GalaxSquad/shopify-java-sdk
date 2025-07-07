// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents information about a customer of the shop, such as the customer's contact details, their
* order
* history, and whether they've agreed to receive marketing material by email.
* **Caution:** Only use this data if it's required for your app's functionality. Shopify will restrict
* [access to scopes](https://shopify.dev/api/usage/access-scopes) for apps that don't have a
* legitimate use for the associated data.
*/
public class Customer extends AbstractResponse<Customer> implements CommentEventEmbed, CommentEventSubject, HasEvents, HasMetafieldDefinitions, HasMetafields, HasStoreCreditAccounts, LegacyInteroperability, MetafieldReference, MetafieldReferencer, Node, PurchasingEntity {
    public Customer() {
    }

    public Customer(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "addresses": {
                    List<MailingAddress> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MailingAddress(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "addressesV2": {
                    responseData.put(key, new MailingAddressConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "amountSpent": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "canDelete": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "companyContactProfiles": {
                    List<CompanyContact> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CompanyContact(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "dataSaleOptOut": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "defaultAddress": {
                    MailingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MailingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "defaultEmailAddress": {
                    CustomerEmailAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerEmailAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "defaultPhoneNumber": {
                    CustomerPhoneNumber optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPhoneNumber(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "displayName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "firstName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "image": {
                    responseData.put(key, new Image(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "lastName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lastOrder": {
                    Order optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Order(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "lifetimeDuration": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "locale": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "mergeable": {
                    responseData.put(key, new CustomerMergeable(jsonAsObject(field.getValue(), key)));

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

                case "multipassIdentifier": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "numberOfOrders": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "orders": {
                    responseData.put(key, new OrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "paymentMethods": {
                    responseData.put(key, new CustomerPaymentMethodConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productSubscriberStatus": {
                    responseData.put(key, CustomerProductSubscriberStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "state": {
                    responseData.put(key, CustomerState.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "statistics": {
                    responseData.put(key, new CustomerStatistics(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "storeCreditAccounts": {
                    responseData.put(key, new StoreCreditAccountConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "subscriptionContracts": {
                    responseData.put(key, new SubscriptionContractConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "tags": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "taxExempt": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "taxExemptions": {
                    List<TaxExemption> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(TaxExemption.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "verifiedEmail": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

    public Customer(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Customer";
    }

    /**
    * A list of addresses associated with the customer.
    */

    public List<MailingAddress> getAddresses() {
        return (List<MailingAddress>) get("addresses");
    }

    public Customer setAddresses(List<MailingAddress> arg) {
        optimisticData.put(getKey("addresses"), arg);
        return this;
    }

    /**
    * The addresses associated with the customer.
    */

    public MailingAddressConnection getAddressesV2() {
        return (MailingAddressConnection) get("addressesV2");
    }

    public Customer setAddressesV2(MailingAddressConnection arg) {
        optimisticData.put(getKey("addressesV2"), arg);
        return this;
    }

    /**
    * The total amount that the customer has spent on orders in their lifetime.
    */

    public MoneyV2 getAmountSpent() {
        return (MoneyV2) get("amountSpent");
    }

    public Customer setAmountSpent(MoneyV2 arg) {
        optimisticData.put(getKey("amountSpent"), arg);
        return this;
    }

    /**
    * Whether the merchant can delete the customer from their store.
    * A customer can be deleted from a store only if they haven't yet made an order. After a customer
    * makes an
    * order, they can't be deleted from a store.
    */

    public Boolean getCanDelete() {
        return (Boolean) get("canDelete");
    }

    public Customer setCanDelete(Boolean arg) {
        optimisticData.put(getKey("canDelete"), arg);
        return this;
    }

    /**
    * A list of the customer's company contact profiles.
    */

    public List<CompanyContact> getCompanyContactProfiles() {
        return (List<CompanyContact>) get("companyContactProfiles");
    }

    public Customer setCompanyContactProfiles(List<CompanyContact> arg) {
        optimisticData.put(getKey("companyContactProfiles"), arg);
        return this;
    }

    /**
    * The date and time when the customer was added to the store.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Customer setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Whether the customer has opted out of having their data sold.
    */

    public Boolean getDataSaleOptOut() {
        return (Boolean) get("dataSaleOptOut");
    }

    public Customer setDataSaleOptOut(Boolean arg) {
        optimisticData.put(getKey("dataSaleOptOut"), arg);
        return this;
    }

    /**
    * The default address associated with the customer.
    */

    public MailingAddress getDefaultAddress() {
        return (MailingAddress) get("defaultAddress");
    }

    public Customer setDefaultAddress(MailingAddress arg) {
        optimisticData.put(getKey("defaultAddress"), arg);
        return this;
    }

    /**
    * The customer's default email address.
    */

    public CustomerEmailAddress getDefaultEmailAddress() {
        return (CustomerEmailAddress) get("defaultEmailAddress");
    }

    public Customer setDefaultEmailAddress(CustomerEmailAddress arg) {
        optimisticData.put(getKey("defaultEmailAddress"), arg);
        return this;
    }

    /**
    * The customer's default phone number.
    */

    public CustomerPhoneNumber getDefaultPhoneNumber() {
        return (CustomerPhoneNumber) get("defaultPhoneNumber");
    }

    public Customer setDefaultPhoneNumber(CustomerPhoneNumber arg) {
        optimisticData.put(getKey("defaultPhoneNumber"), arg);
        return this;
    }

    /**
    * The full name of the customer, based on the values for first_name and last_name. If the first_name
    * and
    * last_name are not available, then this falls back to the customer's email address, and if that is
    * not available, the customer's phone number.
    */

    public String getDisplayName() {
        return (String) get("displayName");
    }

    public Customer setDisplayName(String arg) {
        optimisticData.put(getKey("displayName"), arg);
        return this;
    }

    /**
    * A list of events associated with the customer.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public Customer setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * The customer's first name.
    */

    public String getFirstName() {
        return (String) get("firstName");
    }

    public Customer setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The image associated with the customer.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public Customer setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * The customer's last name.
    */

    public String getLastName() {
        return (String) get("lastName");
    }

    public Customer setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    /**
    * The customer's last order.
    */

    public Order getLastOrder() {
        return (Order) get("lastOrder");
    }

    public Customer setLastOrder(Order arg) {
        optimisticData.put(getKey("lastOrder"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public Customer setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The amount of time since the customer was first added to the store.
    * Example: 'about 12 years'.
    */

    public String getLifetimeDuration() {
        return (String) get("lifetimeDuration");
    }

    public Customer setLifetimeDuration(String arg) {
        optimisticData.put(getKey("lifetimeDuration"), arg);
        return this;
    }

    /**
    * The customer's locale.
    */

    public String getLocale() {
        return (String) get("locale");
    }

    public Customer setLocale(String arg) {
        optimisticData.put(getKey("locale"), arg);
        return this;
    }

    /**
    * Whether the customer can be merged with another customer.
    */

    public CustomerMergeable getMergeable() {
        return (CustomerMergeable) get("mergeable");
    }

    public Customer setMergeable(CustomerMergeable arg) {
        optimisticData.put(getKey("mergeable"), arg);
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

    public Customer setMetafield(Metafield arg) {
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

    public Customer setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * A unique identifier for the customer that's used with Multipass login.
    */

    public String getMultipassIdentifier() {
        return (String) get("multipassIdentifier");
    }

    public Customer setMultipassIdentifier(String arg) {
        optimisticData.put(getKey("multipassIdentifier"), arg);
        return this;
    }

    /**
    * A note about the customer.
    */

    public String getNote() {
        return (String) get("note");
    }

    public Customer setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The number of orders that the customer has made at the store in their lifetime.
    */

    public String getNumberOfOrders() {
        return (String) get("numberOfOrders");
    }

    public Customer setNumberOfOrders(String arg) {
        optimisticData.put(getKey("numberOfOrders"), arg);
        return this;
    }

    /**
    * A list of the customer's orders.
    */

    public OrderConnection getOrders() {
        return (OrderConnection) get("orders");
    }

    public Customer setOrders(OrderConnection arg) {
        optimisticData.put(getKey("orders"), arg);
        return this;
    }

    /**
    * A list of the customer's payment methods.
    */

    public CustomerPaymentMethodConnection getPaymentMethods() {
        return (CustomerPaymentMethodConnection) get("paymentMethods");
    }

    public Customer setPaymentMethods(CustomerPaymentMethodConnection arg) {
        optimisticData.put(getKey("paymentMethods"), arg);
        return this;
    }

    /**
    * Possible subscriber states of a customer defined by their subscription contracts.
    */

    public CustomerProductSubscriberStatus getProductSubscriberStatus() {
        return (CustomerProductSubscriberStatus) get("productSubscriberStatus");
    }

    public Customer setProductSubscriberStatus(CustomerProductSubscriberStatus arg) {
        optimisticData.put(getKey("productSubscriberStatus"), arg);
        return this;
    }

    /**
    * The state of the customer's account with the shop.
    * Please note that this only meaningful when Classic Customer Accounts is active.
    */

    public CustomerState getState() {
        return (CustomerState) get("state");
    }

    public Customer setState(CustomerState arg) {
        optimisticData.put(getKey("state"), arg);
        return this;
    }

    /**
    * The statistics for a given customer.
    */

    public CustomerStatistics getStatistics() {
        return (CustomerStatistics) get("statistics");
    }

    public Customer setStatistics(CustomerStatistics arg) {
        optimisticData.put(getKey("statistics"), arg);
        return this;
    }

    /**
    * Returns a list of store credit accounts that belong to the owner resource.
    * A store credit account owner can hold multiple accounts each with a different currency.
    */

    public StoreCreditAccountConnection getStoreCreditAccounts() {
        return (StoreCreditAccountConnection) get("storeCreditAccounts");
    }

    public Customer setStoreCreditAccounts(StoreCreditAccountConnection arg) {
        optimisticData.put(getKey("storeCreditAccounts"), arg);
        return this;
    }

    /**
    * A list of the customer's subscription contracts.
    */

    public SubscriptionContractConnection getSubscriptionContracts() {
        return (SubscriptionContractConnection) get("subscriptionContracts");
    }

    public Customer setSubscriptionContracts(SubscriptionContractConnection arg) {
        optimisticData.put(getKey("subscriptionContracts"), arg);
        return this;
    }

    /**
    * A comma separated list of tags that have been added to the customer.
    */

    public List<String> getTags() {
        return (List<String>) get("tags");
    }

    public Customer setTags(List<String> arg) {
        optimisticData.put(getKey("tags"), arg);
        return this;
    }

    /**
    * Whether the customer is exempt from being charged taxes on their orders.
    */

    public Boolean getTaxExempt() {
        return (Boolean) get("taxExempt");
    }

    public Customer setTaxExempt(Boolean arg) {
        optimisticData.put(getKey("taxExempt"), arg);
        return this;
    }

    /**
    * The list of tax exemptions applied to the customer.
    */

    public List<TaxExemption> getTaxExemptions() {
        return (List<TaxExemption>) get("taxExemptions");
    }

    public Customer setTaxExemptions(List<TaxExemption> arg) {
        optimisticData.put(getKey("taxExemptions"), arg);
        return this;
    }

    /**
    * The date and time when the customer was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Customer setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * Whether the customer has verified their email address. Defaults to `true` if the customer is created
    * through the Shopify admin or API.
    */

    public Boolean getVerifiedEmail() {
        return (Boolean) get("verifiedEmail");
    }

    public Customer setVerifiedEmail(Boolean arg) {
        optimisticData.put(getKey("verifiedEmail"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "addresses": return true;

            case "addressesV2": return true;

            case "amountSpent": return true;

            case "canDelete": return false;

            case "companyContactProfiles": return true;

            case "createdAt": return false;

            case "dataSaleOptOut": return false;

            case "defaultAddress": return true;

            case "defaultEmailAddress": return true;

            case "defaultPhoneNumber": return true;

            case "displayName": return false;

            case "events": return true;

            case "firstName": return false;

            case "id": return false;

            case "image": return true;

            case "lastName": return false;

            case "lastOrder": return true;

            case "legacyResourceId": return false;

            case "lifetimeDuration": return false;

            case "locale": return false;

            case "mergeable": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "multipassIdentifier": return false;

            case "note": return false;

            case "numberOfOrders": return false;

            case "orders": return true;

            case "paymentMethods": return true;

            case "productSubscriberStatus": return false;

            case "state": return false;

            case "statistics": return true;

            case "storeCreditAccounts": return true;

            case "subscriptionContracts": return true;

            case "tags": return false;

            case "taxExempt": return false;

            case "taxExemptions": return false;

            case "updatedAt": return false;

            case "verifiedEmail": return false;

            default: return false;
        }
    }
}


// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The fields that will be kept as part of a customer merge preview.
*/
public class CustomerMergePreviewDefaultFields extends AbstractResponse<CustomerMergePreviewDefaultFields> {
    public CustomerMergePreviewDefaultFields() {
    }

    public CustomerMergePreviewDefaultFields(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "addresses": {
                    responseData.put(key, new MailingAddressConnection(jsonAsObject(field.getValue(), key)));

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

                case "discountNodeCount": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "discountNodes": {
                    responseData.put(key, new DiscountNodeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "displayName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "draftOrderCount": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "draftOrders": {
                    responseData.put(key, new DraftOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "email": {
                    CustomerEmailAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerEmailAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "giftCardCount": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "giftCards": {
                    responseData.put(key, new GiftCardConnection(jsonAsObject(field.getValue(), key)));

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

                case "metafieldCount": {
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

                case "orderCount": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "orders": {
                    responseData.put(key, new OrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "phoneNumber": {
                    CustomerPhoneNumber optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPhoneNumber(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

    public String getGraphQlTypeName() {
        return "CustomerMergePreviewDefaultFields";
    }

    /**
    * The merged addresses resulting from a customer merge.
    */

    public MailingAddressConnection getAddresses() {
        return (MailingAddressConnection) get("addresses");
    }

    public CustomerMergePreviewDefaultFields setAddresses(MailingAddressConnection arg) {
        optimisticData.put(getKey("addresses"), arg);
        return this;
    }

    /**
    * The default address resulting from a customer merge.
    */

    public MailingAddress getDefaultAddress() {
        return (MailingAddress) get("defaultAddress");
    }

    public CustomerMergePreviewDefaultFields setDefaultAddress(MailingAddress arg) {
        optimisticData.put(getKey("defaultAddress"), arg);
        return this;
    }

    /**
    * The total number of customer-specific discounts resulting from a customer merge.
    */

    public String getDiscountNodeCount() {
        return (String) get("discountNodeCount");
    }

    public CustomerMergePreviewDefaultFields setDiscountNodeCount(String arg) {
        optimisticData.put(getKey("discountNodeCount"), arg);
        return this;
    }

    /**
    * The merged customer-specific discounts resulting from a customer merge.
    */

    public DiscountNodeConnection getDiscountNodes() {
        return (DiscountNodeConnection) get("discountNodes");
    }

    public CustomerMergePreviewDefaultFields setDiscountNodes(DiscountNodeConnection arg) {
        optimisticData.put(getKey("discountNodes"), arg);
        return this;
    }

    /**
    * The full name of the customer, based on the values for `first_name` and `last_name`. If `first_name`
    * and `last_name` aren't available, then this field falls back to the customer's email address. If the
    * customer's email isn't available, then this field falls back to the customer's phone number.
    */

    public String getDisplayName() {
        return (String) get("displayName");
    }

    public CustomerMergePreviewDefaultFields setDisplayName(String arg) {
        optimisticData.put(getKey("displayName"), arg);
        return this;
    }

    /**
    * The total number of merged draft orders.
    */

    public String getDraftOrderCount() {
        return (String) get("draftOrderCount");
    }

    public CustomerMergePreviewDefaultFields setDraftOrderCount(String arg) {
        optimisticData.put(getKey("draftOrderCount"), arg);
        return this;
    }

    /**
    * The merged draft orders resulting from a customer merge.
    */

    public DraftOrderConnection getDraftOrders() {
        return (DraftOrderConnection) get("draftOrders");
    }

    public CustomerMergePreviewDefaultFields setDraftOrders(DraftOrderConnection arg) {
        optimisticData.put(getKey("draftOrders"), arg);
        return this;
    }

    /**
    * The email state of a customer.
    */

    public CustomerEmailAddress getEmail() {
        return (CustomerEmailAddress) get("email");
    }

    public CustomerMergePreviewDefaultFields setEmail(CustomerEmailAddress arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * The first name resulting from a customer merge.
    */

    public String getFirstName() {
        return (String) get("firstName");
    }

    public CustomerMergePreviewDefaultFields setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    /**
    * The total number of merged gift cards.
    */

    public String getGiftCardCount() {
        return (String) get("giftCardCount");
    }

    public CustomerMergePreviewDefaultFields setGiftCardCount(String arg) {
        optimisticData.put(getKey("giftCardCount"), arg);
        return this;
    }

    /**
    * The merged gift cards resulting from a customer merge.
    */

    public GiftCardConnection getGiftCards() {
        return (GiftCardConnection) get("giftCards");
    }

    public CustomerMergePreviewDefaultFields setGiftCards(GiftCardConnection arg) {
        optimisticData.put(getKey("giftCards"), arg);
        return this;
    }

    /**
    * The last name resulting from a customer merge.
    */

    public String getLastName() {
        return (String) get("lastName");
    }

    public CustomerMergePreviewDefaultFields setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    /**
    * The total number of merged metafields.
    */

    public String getMetafieldCount() {
        return (String) get("metafieldCount");
    }

    public CustomerMergePreviewDefaultFields setMetafieldCount(String arg) {
        optimisticData.put(getKey("metafieldCount"), arg);
        return this;
    }

    /**
    * The merged note resulting from a customer merge.
    */

    public String getNote() {
        return (String) get("note");
    }

    public CustomerMergePreviewDefaultFields setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The total number of merged orders.
    */

    public String getOrderCount() {
        return (String) get("orderCount");
    }

    public CustomerMergePreviewDefaultFields setOrderCount(String arg) {
        optimisticData.put(getKey("orderCount"), arg);
        return this;
    }

    /**
    * The merged orders resulting from a customer merge.
    */

    public OrderConnection getOrders() {
        return (OrderConnection) get("orders");
    }

    public CustomerMergePreviewDefaultFields setOrders(OrderConnection arg) {
        optimisticData.put(getKey("orders"), arg);
        return this;
    }

    /**
    * The phone number state of a customer.
    */

    public CustomerPhoneNumber getPhoneNumber() {
        return (CustomerPhoneNumber) get("phoneNumber");
    }

    public CustomerMergePreviewDefaultFields setPhoneNumber(CustomerPhoneNumber arg) {
        optimisticData.put(getKey("phoneNumber"), arg);
        return this;
    }

    /**
    * The merged tags resulting from a customer merge.
    */

    public List<String> getTags() {
        return (List<String>) get("tags");
    }

    public CustomerMergePreviewDefaultFields setTags(List<String> arg) {
        optimisticData.put(getKey("tags"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "addresses": return true;

            case "defaultAddress": return true;

            case "discountNodeCount": return false;

            case "discountNodes": return true;

            case "displayName": return false;

            case "draftOrderCount": return false;

            case "draftOrders": return true;

            case "email": return true;

            case "firstName": return false;

            case "giftCardCount": return false;

            case "giftCards": return true;

            case "lastName": return false;

            case "metafieldCount": return false;

            case "note": return false;

            case "orderCount": return false;

            case "orders": return true;

            case "phoneNumber": return true;

            case "tags": return false;

            default: return false;
        }
    }
}


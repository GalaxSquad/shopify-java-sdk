// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The member of a segment.
*/
public class CustomerSegmentMember extends AbstractResponse<CustomerSegmentMember> implements HasMetafields {
    public CustomerSegmentMember() {
    }

    public CustomerSegmentMember(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amountSpent": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "lastName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lastOrderId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "numberOfOrders": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "CustomerSegmentMember";
    }

    /**
    * The total amount of money that the member has spent on orders.
    */

    public MoneyV2 getAmountSpent() {
        return (MoneyV2) get("amountSpent");
    }

    public CustomerSegmentMember setAmountSpent(MoneyV2 arg) {
        optimisticData.put(getKey("amountSpent"), arg);
        return this;
    }

    /**
    * The member's default address.
    */

    public MailingAddress getDefaultAddress() {
        return (MailingAddress) get("defaultAddress");
    }

    public CustomerSegmentMember setDefaultAddress(MailingAddress arg) {
        optimisticData.put(getKey("defaultAddress"), arg);
        return this;
    }

    /**
    * The member's default email address.
    */

    public CustomerEmailAddress getDefaultEmailAddress() {
        return (CustomerEmailAddress) get("defaultEmailAddress");
    }

    public CustomerSegmentMember setDefaultEmailAddress(CustomerEmailAddress arg) {
        optimisticData.put(getKey("defaultEmailAddress"), arg);
        return this;
    }

    /**
    * The member's default phone number.
    */

    public CustomerPhoneNumber getDefaultPhoneNumber() {
        return (CustomerPhoneNumber) get("defaultPhoneNumber");
    }

    public CustomerSegmentMember setDefaultPhoneNumber(CustomerPhoneNumber arg) {
        optimisticData.put(getKey("defaultPhoneNumber"), arg);
        return this;
    }

    /**
    * The full name of the member, which is based on the values of the `first_name` and `last_name`
    * fields. If the member's first name and last name aren't available, then the customer's email address
    * is used. If the customer's email address isn't available, then the customer's phone number is used.
    */

    public String getDisplayName() {
        return (String) get("displayName");
    }

    public CustomerSegmentMember setDisplayName(String arg) {
        optimisticData.put(getKey("displayName"), arg);
        return this;
    }

    /**
    * The member's first name.
    */

    public String getFirstName() {
        return (String) get("firstName");
    }

    public CustomerSegmentMember setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    /**
    * The member’s ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public CustomerSegmentMember setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The member's last name.
    */

    public String getLastName() {
        return (String) get("lastName");
    }

    public CustomerSegmentMember setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    /**
    * The ID of the member's most recent order.
    */

    public ID getLastOrderId() {
        return (ID) get("lastOrderId");
    }

    public CustomerSegmentMember setLastOrderId(ID arg) {
        optimisticData.put(getKey("lastOrderId"), arg);
        return this;
    }

    /**
    * Whether the customer can be merged with another customer.
    */

    public CustomerMergeable getMergeable() {
        return (CustomerMergeable) get("mergeable");
    }

    public CustomerSegmentMember setMergeable(CustomerMergeable arg) {
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

    public CustomerSegmentMember setMetafield(Metafield arg) {
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

    public CustomerSegmentMember setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * A note about the member.
    */

    public String getNote() {
        return (String) get("note");
    }

    public CustomerSegmentMember setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The total number of orders that the member has made.
    */

    public String getNumberOfOrders() {
        return (String) get("numberOfOrders");
    }

    public CustomerSegmentMember setNumberOfOrders(String arg) {
        optimisticData.put(getKey("numberOfOrders"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amountSpent": return true;

            case "defaultAddress": return true;

            case "defaultEmailAddress": return true;

            case "defaultPhoneNumber": return true;

            case "displayName": return false;

            case "firstName": return false;

            case "id": return false;

            case "lastName": return false;

            case "lastOrderId": return false;

            case "mergeable": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "note": return false;

            case "numberOfOrders": return false;

            default: return false;
        }
    }
}


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
* The evidence associated with the dispute.
*/
public class ShopifyPaymentsDisputeEvidence extends AbstractResponse<ShopifyPaymentsDisputeEvidence> implements Node {
    public ShopifyPaymentsDisputeEvidence() {
    }

    public ShopifyPaymentsDisputeEvidence(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accessActivityLog": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "billingAddress": {
                    MailingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MailingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cancellationPolicyDisclosure": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cancellationPolicyFile": {
                    ShopifyPaymentsDisputeFileUpload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsDisputeFileUpload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cancellationRebuttal": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerCommunicationFile": {
                    ShopifyPaymentsDisputeFileUpload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsDisputeFileUpload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerEmailAddress": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerFirstName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerLastName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPurchaseIp": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dispute": {
                    responseData.put(key, new ShopifyPaymentsDispute(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "disputeFileUploads": {
                    List<ShopifyPaymentsDisputeFileUpload> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopifyPaymentsDisputeFileUpload(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "fulfillments": {
                    List<ShopifyPaymentsDisputeFulfillment> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopifyPaymentsDisputeFulfillment(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "productDescription": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "refundPolicyDisclosure": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "refundPolicyFile": {
                    ShopifyPaymentsDisputeFileUpload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsDisputeFileUpload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "refundRefusalExplanation": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "serviceDocumentationFile": {
                    ShopifyPaymentsDisputeFileUpload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsDisputeFileUpload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shippingAddress": {
                    MailingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MailingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shippingDocumentationFile": {
                    ShopifyPaymentsDisputeFileUpload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsDisputeFileUpload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "submitted": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "uncategorizedFile": {
                    ShopifyPaymentsDisputeFileUpload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsDisputeFileUpload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "uncategorizedText": {
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

    public ShopifyPaymentsDisputeEvidence(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopifyPaymentsDisputeEvidence";
    }

    /**
    * The activity logs associated with the dispute evidence.
    */

    public String getAccessActivityLog() {
        return (String) get("accessActivityLog");
    }

    public ShopifyPaymentsDisputeEvidence setAccessActivityLog(String arg) {
        optimisticData.put(getKey("accessActivityLog"), arg);
        return this;
    }

    /**
    * The billing address that's provided by the customer.
    */

    public MailingAddress getBillingAddress() {
        return (MailingAddress) get("billingAddress");
    }

    public ShopifyPaymentsDisputeEvidence setBillingAddress(MailingAddress arg) {
        optimisticData.put(getKey("billingAddress"), arg);
        return this;
    }

    /**
    * The cancellation policy disclosure associated with the dispute evidence.
    */

    public String getCancellationPolicyDisclosure() {
        return (String) get("cancellationPolicyDisclosure");
    }

    public ShopifyPaymentsDisputeEvidence setCancellationPolicyDisclosure(String arg) {
        optimisticData.put(getKey("cancellationPolicyDisclosure"), arg);
        return this;
    }

    /**
    * The cancellation policy file associated with the dispute evidence.
    */

    public ShopifyPaymentsDisputeFileUpload getCancellationPolicyFile() {
        return (ShopifyPaymentsDisputeFileUpload) get("cancellationPolicyFile");
    }

    public ShopifyPaymentsDisputeEvidence setCancellationPolicyFile(ShopifyPaymentsDisputeFileUpload arg) {
        optimisticData.put(getKey("cancellationPolicyFile"), arg);
        return this;
    }

    /**
    * The cancellation rebuttal associated with the dispute evidence.
    */

    public String getCancellationRebuttal() {
        return (String) get("cancellationRebuttal");
    }

    public ShopifyPaymentsDisputeEvidence setCancellationRebuttal(String arg) {
        optimisticData.put(getKey("cancellationRebuttal"), arg);
        return this;
    }

    /**
    * The customer communication file associated with the dispute evidence.
    */

    public ShopifyPaymentsDisputeFileUpload getCustomerCommunicationFile() {
        return (ShopifyPaymentsDisputeFileUpload) get("customerCommunicationFile");
    }

    public ShopifyPaymentsDisputeEvidence setCustomerCommunicationFile(ShopifyPaymentsDisputeFileUpload arg) {
        optimisticData.put(getKey("customerCommunicationFile"), arg);
        return this;
    }

    /**
    * The customer's email address.
    */

    public String getCustomerEmailAddress() {
        return (String) get("customerEmailAddress");
    }

    public ShopifyPaymentsDisputeEvidence setCustomerEmailAddress(String arg) {
        optimisticData.put(getKey("customerEmailAddress"), arg);
        return this;
    }

    /**
    * The customer's first name.
    */

    public String getCustomerFirstName() {
        return (String) get("customerFirstName");
    }

    public ShopifyPaymentsDisputeEvidence setCustomerFirstName(String arg) {
        optimisticData.put(getKey("customerFirstName"), arg);
        return this;
    }

    /**
    * The customer's last name.
    */

    public String getCustomerLastName() {
        return (String) get("customerLastName");
    }

    public ShopifyPaymentsDisputeEvidence setCustomerLastName(String arg) {
        optimisticData.put(getKey("customerLastName"), arg);
        return this;
    }

    /**
    * The customer purchase ip for this dispute evidence.
    */

    public String getCustomerPurchaseIp() {
        return (String) get("customerPurchaseIp");
    }

    public ShopifyPaymentsDisputeEvidence setCustomerPurchaseIp(String arg) {
        optimisticData.put(getKey("customerPurchaseIp"), arg);
        return this;
    }

    /**
    * The dispute associated with the evidence.
    */

    public ShopifyPaymentsDispute getDispute() {
        return (ShopifyPaymentsDispute) get("dispute");
    }

    public ShopifyPaymentsDisputeEvidence setDispute(ShopifyPaymentsDispute arg) {
        optimisticData.put(getKey("dispute"), arg);
        return this;
    }

    /**
    * The file uploads associated with the dispute evidence.
    */

    public List<ShopifyPaymentsDisputeFileUpload> getDisputeFileUploads() {
        return (List<ShopifyPaymentsDisputeFileUpload>) get("disputeFileUploads");
    }

    public ShopifyPaymentsDisputeEvidence setDisputeFileUploads(List<ShopifyPaymentsDisputeFileUpload> arg) {
        optimisticData.put(getKey("disputeFileUploads"), arg);
        return this;
    }

    /**
    * The fulfillments associated with the dispute evidence.
    */

    public List<ShopifyPaymentsDisputeFulfillment> getFulfillments() {
        return (List<ShopifyPaymentsDisputeFulfillment>) get("fulfillments");
    }

    public ShopifyPaymentsDisputeEvidence setFulfillments(List<ShopifyPaymentsDisputeFulfillment> arg) {
        optimisticData.put(getKey("fulfillments"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The product description for this dispute evidence.
    */

    public String getProductDescription() {
        return (String) get("productDescription");
    }

    public ShopifyPaymentsDisputeEvidence setProductDescription(String arg) {
        optimisticData.put(getKey("productDescription"), arg);
        return this;
    }

    /**
    * The refund policy disclosure associated with the dispute evidence.
    */

    public String getRefundPolicyDisclosure() {
        return (String) get("refundPolicyDisclosure");
    }

    public ShopifyPaymentsDisputeEvidence setRefundPolicyDisclosure(String arg) {
        optimisticData.put(getKey("refundPolicyDisclosure"), arg);
        return this;
    }

    /**
    * The refund policy file associated with the dispute evidence.
    */

    public ShopifyPaymentsDisputeFileUpload getRefundPolicyFile() {
        return (ShopifyPaymentsDisputeFileUpload) get("refundPolicyFile");
    }

    public ShopifyPaymentsDisputeEvidence setRefundPolicyFile(ShopifyPaymentsDisputeFileUpload arg) {
        optimisticData.put(getKey("refundPolicyFile"), arg);
        return this;
    }

    /**
    * The refund refusal explanation associated with dispute evidence.
    */

    public String getRefundRefusalExplanation() {
        return (String) get("refundRefusalExplanation");
    }

    public ShopifyPaymentsDisputeEvidence setRefundRefusalExplanation(String arg) {
        optimisticData.put(getKey("refundRefusalExplanation"), arg);
        return this;
    }

    /**
    * The service documentation file associated with the dispute evidence.
    */

    public ShopifyPaymentsDisputeFileUpload getServiceDocumentationFile() {
        return (ShopifyPaymentsDisputeFileUpload) get("serviceDocumentationFile");
    }

    public ShopifyPaymentsDisputeEvidence setServiceDocumentationFile(ShopifyPaymentsDisputeFileUpload arg) {
        optimisticData.put(getKey("serviceDocumentationFile"), arg);
        return this;
    }

    /**
    * The mailing address for shipping that's provided by the customer.
    */

    public MailingAddress getShippingAddress() {
        return (MailingAddress) get("shippingAddress");
    }

    public ShopifyPaymentsDisputeEvidence setShippingAddress(MailingAddress arg) {
        optimisticData.put(getKey("shippingAddress"), arg);
        return this;
    }

    /**
    * The shipping documentation file associated with the dispute evidence.
    */

    public ShopifyPaymentsDisputeFileUpload getShippingDocumentationFile() {
        return (ShopifyPaymentsDisputeFileUpload) get("shippingDocumentationFile");
    }

    public ShopifyPaymentsDisputeEvidence setShippingDocumentationFile(ShopifyPaymentsDisputeFileUpload arg) {
        optimisticData.put(getKey("shippingDocumentationFile"), arg);
        return this;
    }

    /**
    * Whether the dispute evidence is submitted.
    */

    public Boolean getSubmitted() {
        return (Boolean) get("submitted");
    }

    public ShopifyPaymentsDisputeEvidence setSubmitted(Boolean arg) {
        optimisticData.put(getKey("submitted"), arg);
        return this;
    }

    /**
    * The uncategorized file associated with the dispute evidence.
    */

    public ShopifyPaymentsDisputeFileUpload getUncategorizedFile() {
        return (ShopifyPaymentsDisputeFileUpload) get("uncategorizedFile");
    }

    public ShopifyPaymentsDisputeEvidence setUncategorizedFile(ShopifyPaymentsDisputeFileUpload arg) {
        optimisticData.put(getKey("uncategorizedFile"), arg);
        return this;
    }

    /**
    * The uncategorized text for the dispute evidence.
    */

    public String getUncategorizedText() {
        return (String) get("uncategorizedText");
    }

    public ShopifyPaymentsDisputeEvidence setUncategorizedText(String arg) {
        optimisticData.put(getKey("uncategorizedText"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accessActivityLog": return false;

            case "billingAddress": return true;

            case "cancellationPolicyDisclosure": return false;

            case "cancellationPolicyFile": return true;

            case "cancellationRebuttal": return false;

            case "customerCommunicationFile": return true;

            case "customerEmailAddress": return false;

            case "customerFirstName": return false;

            case "customerLastName": return false;

            case "customerPurchaseIp": return false;

            case "dispute": return true;

            case "disputeFileUploads": return true;

            case "fulfillments": return true;

            case "id": return false;

            case "productDescription": return false;

            case "refundPolicyDisclosure": return false;

            case "refundPolicyFile": return true;

            case "refundRefusalExplanation": return false;

            case "serviceDocumentationFile": return true;

            case "shippingAddress": return true;

            case "shippingDocumentationFile": return true;

            case "submitted": return false;

            case "uncategorizedFile": return true;

            case "uncategorizedText": return false;

            default: return false;
        }
    }
}


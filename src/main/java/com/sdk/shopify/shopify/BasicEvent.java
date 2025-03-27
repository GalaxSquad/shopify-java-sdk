// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Basic events chronicle resource activities such as the creation of an article, the fulfillment of an
* order, or
* the addition of a product.
* ### General events
* | Action | Description  |
* |---|---|
* | `create` | The item was created. |
* | `destroy` | The item was destroyed. |
* | `published` | The item was published. |
* | `unpublished` | The item was unpublished. |
* | `update` | The item was updated.  |
* ### Order events
* Order events can be divided into the following categories:
* - *Authorization*: Includes whether the authorization succeeded, failed, or is pending.
* - *Capture*: Includes whether the capture succeeded, failed, or is pending.
* - *Email*: Includes confirmation or cancellation of the order, as well as shipping.
* - *Fulfillment*: Includes whether the fulfillment succeeded, failed, or is pending. Also includes
* cancellation, restocking, and fulfillment updates.
* - *Order*: Includess the placement, confirmation, closing, re-opening, and cancellation of the
* order.
* - *Refund*: Includes whether the refund succeeded, failed, or is pending.
* - *Sale*: Includes whether the sale succeeded, failed, or is pending.
* - *Void*: Includes whether the void succeeded, failed, or is pending.
* | Action  | Message  | Description  |
* |---|---|---|
* | `authorization_failure` | The customer, unsuccessfully, tried to authorize: `{money_amount}`. |
* Authorization failed. The funds cannot be captured. |
* | `authorization_pending` | Authorization for `{money_amount}` is pending. | Authorization pending.
* |
* | `authorization_success` | The customer successfully authorized us to capture: `{money_amount}`. |
* Authorization was successful and the funds are available for capture. |
* | `cancelled` | Order was cancelled by `{shop_staff_name}`. | The order was cancelled. |
* | `capture_failure` | We failed to capture: `{money_amount}`. | The capture failed. The funds cannot
* be transferred to the shop. |
* | `capture_pending` | Capture for `{money_amount}` is pending. | The capture is in process. The
* funds are not yet available to the shop. |
* | `capture_success` | We successfully captured: `{money_amount}` | The capture was successful and
* the funds are now available to the shop. |
* | `closed` | Order was closed. | The order was closed. |
* | `confirmed` | Received a new order: `{order_number}` by `{customer_name}`. | The order was
* confirmed. |
* | `fulfillment_cancelled` | We cancelled `{number_of_line_items}` from being fulfilled by the third
* party fulfillment service. | Fulfillment for one or more of the line_items failed. |
* | `fulfillment_pending` | We submitted `{number_of_line_items}` to the third party service. | One or
* more of the line_items has been assigned to a third party service for fulfillment. |
* | `fulfillment_success` | We successfully fulfilled line_items. | Fulfillment was successful for one
* or more line_items. |
* | `mail_sent` | `{message_type}` email was sent to the customer. | An email was sent to the
* customer. |
* | `placed` | Order was placed. | An order was placed by the customer. |
* | `re_opened` | Order was re-opened. | An order was re-opened. |
* | `refund_failure` | We failed to refund `{money_amount}`. | The refund failed. The funds are still
* with the shop. |
* | `refund_pending` | Refund of `{money_amount}` is still pending. | The refund is in process. The
* funds are still with shop. |
* | `refund_success` | We successfully refunded `{money_amount}`. | The refund was successful. The
* funds have been transferred to the customer. |
* | `restock_line_items` | We restocked `{number_of_line_items}`. |	One or more of the order's line
* items have been restocked. |
* | `sale_failure` | The customer failed to pay `{money_amount}`. | The sale failed. The funds are not
* available to the shop. |
* | `sale_pending` | The `{money_amount}` is pending. | The sale is in process. The funds are not yet
* available to the shop. |
* | `sale_success` | We successfully captured `{money_amount}`. | The sale was successful. The funds
* are now with the shop. |
* | `update` | `{order_number}` was updated. | The order was updated. |
* | `void_failure` | We failed to void the authorization. | Voiding the authorization failed. The
* authorization is still valid. |
* | `void_pending` | Authorization void is pending. | Voiding the authorization is in process. The
* authorization is still valid. |
* | `void_success` | We successfully voided the authorization. | Voiding the authorization was
* successful. The authorization is no longer valid. |
*/
public class BasicEvent extends AbstractResponse<BasicEvent> implements Event, Node {
    public BasicEvent() {
    }

    public BasicEvent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "action": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "additionalContent": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "additionalData": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appTitle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "arguments": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "attributeToApp": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "attributeToUser": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "criticalAlert": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "hasAdditionalContent": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "secondaryMessage": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subject": {
                    HasEvents optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownHasEvents.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subjectId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "subjectType": {
                    responseData.put(key, EventSubjectType.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public BasicEvent(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "BasicEvent";
    }

    /**
    * The action that occured.
    */

    public String getAction() {
        return (String) get("action");
    }

    public BasicEvent setAction(String arg) {
        optimisticData.put(getKey("action"), arg);
        return this;
    }

    /**
    * Provides additional content for collapsible timeline events.
    */

    public String getAdditionalContent() {
        return (String) get("additionalContent");
    }

    public BasicEvent setAdditionalContent(String arg) {
        optimisticData.put(getKey("additionalContent"), arg);
        return this;
    }

    /**
    * Provides additional data for event consumers.
    */

    public String getAdditionalData() {
        return (String) get("additionalData");
    }

    public BasicEvent setAdditionalData(String arg) {
        optimisticData.put(getKey("additionalData"), arg);
        return this;
    }

    /**
    * The name of the app that created the event.
    */

    public String getAppTitle() {
        return (String) get("appTitle");
    }

    public BasicEvent setAppTitle(String arg) {
        optimisticData.put(getKey("appTitle"), arg);
        return this;
    }

    /**
    * Refers to a certain event and its resources.
    */

    public String getArguments() {
        return (String) get("arguments");
    }

    public BasicEvent setArguments(String arg) {
        optimisticData.put(getKey("arguments"), arg);
        return this;
    }

    /**
    * Whether the event was created by an app.
    */

    public Boolean getAttributeToApp() {
        return (Boolean) get("attributeToApp");
    }

    public BasicEvent setAttributeToApp(Boolean arg) {
        optimisticData.put(getKey("attributeToApp"), arg);
        return this;
    }

    /**
    * Whether the event was caused by an admin user.
    */

    public Boolean getAttributeToUser() {
        return (Boolean) get("attributeToUser");
    }

    public BasicEvent setAttributeToUser(Boolean arg) {
        optimisticData.put(getKey("attributeToUser"), arg);
        return this;
    }

    /**
    * The date and time when the event was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public BasicEvent setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Whether the event is critical.
    */

    public Boolean getCriticalAlert() {
        return (Boolean) get("criticalAlert");
    }

    public BasicEvent setCriticalAlert(Boolean arg) {
        optimisticData.put(getKey("criticalAlert"), arg);
        return this;
    }

    /**
    * Whether this event has additional content.
    */

    public Boolean getHasAdditionalContent() {
        return (Boolean) get("hasAdditionalContent");
    }

    public BasicEvent setHasAdditionalContent(Boolean arg) {
        optimisticData.put(getKey("hasAdditionalContent"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Human readable text that describes the event.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public BasicEvent setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
    * Human readable text that supports the event message.
    */

    public String getSecondaryMessage() {
        return (String) get("secondaryMessage");
    }

    public BasicEvent setSecondaryMessage(String arg) {
        optimisticData.put(getKey("secondaryMessage"), arg);
        return this;
    }

    /**
    * The resource that generated the event. To see a list of possible types,
    * refer to
    * [HasEvents](https://shopify.dev/docs/api/admin-graphql/unstable/interfaces/HasEvents#implemented-in)
    * .
    */

    public HasEvents getSubject() {
        return (HasEvents) get("subject");
    }

    public BasicEvent setSubject(HasEvents arg) {
        optimisticData.put(getKey("subject"), arg);
        return this;
    }

    /**
    * The ID of the resource that generated the event.
    */

    public ID getSubjectId() {
        return (ID) get("subjectId");
    }

    public BasicEvent setSubjectId(ID arg) {
        optimisticData.put(getKey("subjectId"), arg);
        return this;
    }

    /**
    * The type of the resource that generated the event.
    */

    public EventSubjectType getSubjectType() {
        return (EventSubjectType) get("subjectType");
    }

    public BasicEvent setSubjectType(EventSubjectType arg) {
        optimisticData.put(getKey("subjectType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "action": return false;

            case "additionalContent": return false;

            case "additionalData": return false;

            case "appTitle": return false;

            case "arguments": return false;

            case "attributeToApp": return false;

            case "attributeToUser": return false;

            case "createdAt": return false;

            case "criticalAlert": return false;

            case "hasAdditionalContent": return false;

            case "id": return false;

            case "message": return false;

            case "secondaryMessage": return false;

            case "subject": return false;

            case "subjectId": return false;

            case "subjectType": return false;

            default: return false;
        }
    }
}


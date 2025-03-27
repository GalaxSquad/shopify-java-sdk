// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
public class BasicEventQuery extends Query<BasicEventQuery> {
    BasicEventQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The action that occured.
    */
    public BasicEventQuery action() {
        startField("action");

        return this;
    }

    /**
    * Provides additional content for collapsible timeline events.
    */
    public BasicEventQuery additionalContent() {
        startField("additionalContent");

        return this;
    }

    /**
    * Provides additional data for event consumers.
    */
    public BasicEventQuery additionalData() {
        startField("additionalData");

        return this;
    }

    /**
    * The name of the app that created the event.
    */
    public BasicEventQuery appTitle() {
        startField("appTitle");

        return this;
    }

    /**
    * Refers to a certain event and its resources.
    */
    public BasicEventQuery arguments() {
        startField("arguments");

        return this;
    }

    /**
    * Whether the event was created by an app.
    */
    public BasicEventQuery attributeToApp() {
        startField("attributeToApp");

        return this;
    }

    /**
    * Whether the event was caused by an admin user.
    */
    public BasicEventQuery attributeToUser() {
        startField("attributeToUser");

        return this;
    }

    /**
    * The date and time when the event was created.
    */
    public BasicEventQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Whether the event is critical.
    */
    public BasicEventQuery criticalAlert() {
        startField("criticalAlert");

        return this;
    }

    /**
    * Whether this event has additional content.
    */
    public BasicEventQuery hasAdditionalContent() {
        startField("hasAdditionalContent");

        return this;
    }

    /**
    * Human readable text that describes the event.
    */
    public BasicEventQuery message() {
        startField("message");

        return this;
    }

    /**
    * Human readable text that supports the event message.
    */
    public BasicEventQuery secondaryMessage() {
        startField("secondaryMessage");

        return this;
    }

    /**
    * The resource that generated the event. To see a list of possible types,
    * refer to
    * [HasEvents](https://shopify.dev/docs/api/admin-graphql/unstable/interfaces/HasEvents#implemented-in)
    * .
    */
    public BasicEventQuery subject(HasEventsQueryDefinition queryDef) {
        startField("subject");

        _queryBuilder.append('{');
        queryDef.define(new HasEventsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the resource that generated the event.
    */
    public BasicEventQuery subjectId() {
        startField("subjectId");

        return this;
    }

    /**
    * The type of the resource that generated the event.
    */
    public BasicEventQuery subjectType() {
        startField("subjectType");

        return this;
    }
}

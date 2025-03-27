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

/**
* The evidence associated with the dispute.
*/
public class ShopifyPaymentsDisputeEvidenceQuery extends Query<ShopifyPaymentsDisputeEvidenceQuery> {
    ShopifyPaymentsDisputeEvidenceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The activity logs associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery accessActivityLog() {
        startField("accessActivityLog");

        return this;
    }

    /**
    * The billing address that's provided by the customer.
    */
    public ShopifyPaymentsDisputeEvidenceQuery billingAddress(MailingAddressQueryDefinition queryDef) {
        startField("billingAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The cancellation policy disclosure associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery cancellationPolicyDisclosure() {
        startField("cancellationPolicyDisclosure");

        return this;
    }

    /**
    * The cancellation policy file associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery cancellationPolicyFile(ShopifyPaymentsDisputeFileUploadQueryDefinition queryDef) {
        startField("cancellationPolicyFile");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeFileUploadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The cancellation rebuttal associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery cancellationRebuttal() {
        startField("cancellationRebuttal");

        return this;
    }

    /**
    * The customer communication file associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery customerCommunicationFile(ShopifyPaymentsDisputeFileUploadQueryDefinition queryDef) {
        startField("customerCommunicationFile");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeFileUploadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer's email address.
    */
    public ShopifyPaymentsDisputeEvidenceQuery customerEmailAddress() {
        startField("customerEmailAddress");

        return this;
    }

    /**
    * The customer's first name.
    */
    public ShopifyPaymentsDisputeEvidenceQuery customerFirstName() {
        startField("customerFirstName");

        return this;
    }

    /**
    * The customer's last name.
    */
    public ShopifyPaymentsDisputeEvidenceQuery customerLastName() {
        startField("customerLastName");

        return this;
    }

    /**
    * The customer purchase ip for this dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery customerPurchaseIp() {
        startField("customerPurchaseIp");

        return this;
    }

    /**
    * The dispute associated with the evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery dispute(ShopifyPaymentsDisputeQueryDefinition queryDef) {
        startField("dispute");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The file uploads associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery disputeFileUploads(ShopifyPaymentsDisputeFileUploadQueryDefinition queryDef) {
        startField("disputeFileUploads");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeFileUploadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The fulfillments associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery fulfillments(ShopifyPaymentsDisputeFulfillmentQueryDefinition queryDef) {
        startField("fulfillments");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeFulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product description for this dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery productDescription() {
        startField("productDescription");

        return this;
    }

    /**
    * The refund policy disclosure associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery refundPolicyDisclosure() {
        startField("refundPolicyDisclosure");

        return this;
    }

    /**
    * The refund policy file associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery refundPolicyFile(ShopifyPaymentsDisputeFileUploadQueryDefinition queryDef) {
        startField("refundPolicyFile");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeFileUploadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The refund refusal explanation associated with dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery refundRefusalExplanation() {
        startField("refundRefusalExplanation");

        return this;
    }

    /**
    * The service documentation file associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery serviceDocumentationFile(ShopifyPaymentsDisputeFileUploadQueryDefinition queryDef) {
        startField("serviceDocumentationFile");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeFileUploadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The mailing address for shipping that's provided by the customer.
    */
    public ShopifyPaymentsDisputeEvidenceQuery shippingAddress(MailingAddressQueryDefinition queryDef) {
        startField("shippingAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shipping documentation file associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery shippingDocumentationFile(ShopifyPaymentsDisputeFileUploadQueryDefinition queryDef) {
        startField("shippingDocumentationFile");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeFileUploadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the dispute evidence is submitted.
    */
    public ShopifyPaymentsDisputeEvidenceQuery submitted() {
        startField("submitted");

        return this;
    }

    /**
    * The uncategorized file associated with the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery uncategorizedFile(ShopifyPaymentsDisputeFileUploadQueryDefinition queryDef) {
        startField("uncategorizedFile");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeFileUploadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The uncategorized text for the dispute evidence.
    */
    public ShopifyPaymentsDisputeEvidenceQuery uncategorizedText() {
        startField("uncategorizedText");

        return this;
    }
}

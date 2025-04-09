// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ShopifyPaymentsDisputeEvidenceUpdateInput implements Serializable {
    private Input<String> customerEmailAddress = Input.undefined();

    private Input<String> customerLastName = Input.undefined();

    private Input<String> customerFirstName = Input.undefined();

    private Input<MailingAddressInput> shippingAddress = Input.undefined();

    private Input<String> uncategorizedText = Input.undefined();

    private Input<String> accessActivityLog = Input.undefined();

    private Input<String> cancellationPolicyDisclosure = Input.undefined();

    private Input<String> cancellationRebuttal = Input.undefined();

    private Input<String> refundPolicyDisclosure = Input.undefined();

    private Input<String> refundRefusalExplanation = Input.undefined();

    private Input<ShopifyPaymentsDisputeFileUploadUpdateInput> cancellationPolicyFile = Input.undefined();

    private Input<ShopifyPaymentsDisputeFileUploadUpdateInput> customerCommunicationFile = Input.undefined();

    private Input<ShopifyPaymentsDisputeFileUploadUpdateInput> refundPolicyFile = Input.undefined();

    private Input<ShopifyPaymentsDisputeFileUploadUpdateInput> shippingDocumentationFile = Input.undefined();

    private Input<ShopifyPaymentsDisputeFileUploadUpdateInput> uncategorizedFile = Input.undefined();

    private Input<ShopifyPaymentsDisputeFileUploadUpdateInput> serviceDocumentationFile = Input.undefined();

    private Input<Boolean> submitEvidence = Input.undefined();

    public String getCustomerEmailAddress() {
        return customerEmailAddress.getValue();
    }

    public Input<String> getCustomerEmailAddressInput() {
        return customerEmailAddress;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = Input.optional(customerEmailAddress);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCustomerEmailAddressInput(Input<String> customerEmailAddress) {
        if (customerEmailAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerEmailAddress = customerEmailAddress;
        return this;
    }

    public String getCustomerLastName() {
        return customerLastName.getValue();
    }

    public Input<String> getCustomerLastNameInput() {
        return customerLastName;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCustomerLastName(String customerLastName) {
        this.customerLastName = Input.optional(customerLastName);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCustomerLastNameInput(Input<String> customerLastName) {
        if (customerLastName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerLastName = customerLastName;
        return this;
    }

    public String getCustomerFirstName() {
        return customerFirstName.getValue();
    }

    public Input<String> getCustomerFirstNameInput() {
        return customerFirstName;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = Input.optional(customerFirstName);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCustomerFirstNameInput(Input<String> customerFirstName) {
        if (customerFirstName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerFirstName = customerFirstName;
        return this;
    }

    public MailingAddressInput getShippingAddress() {
        return shippingAddress.getValue();
    }

    public Input<MailingAddressInput> getShippingAddressInput() {
        return shippingAddress;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setShippingAddress(MailingAddressInput shippingAddress) {
        this.shippingAddress = Input.optional(shippingAddress);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setShippingAddressInput(Input<MailingAddressInput> shippingAddress) {
        if (shippingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingAddress = shippingAddress;
        return this;
    }

    public String getUncategorizedText() {
        return uncategorizedText.getValue();
    }

    public Input<String> getUncategorizedTextInput() {
        return uncategorizedText;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setUncategorizedText(String uncategorizedText) {
        this.uncategorizedText = Input.optional(uncategorizedText);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setUncategorizedTextInput(Input<String> uncategorizedText) {
        if (uncategorizedText == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.uncategorizedText = uncategorizedText;
        return this;
    }

    public String getAccessActivityLog() {
        return accessActivityLog.getValue();
    }

    public Input<String> getAccessActivityLogInput() {
        return accessActivityLog;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setAccessActivityLog(String accessActivityLog) {
        this.accessActivityLog = Input.optional(accessActivityLog);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setAccessActivityLogInput(Input<String> accessActivityLog) {
        if (accessActivityLog == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.accessActivityLog = accessActivityLog;
        return this;
    }

    public String getCancellationPolicyDisclosure() {
        return cancellationPolicyDisclosure.getValue();
    }

    public Input<String> getCancellationPolicyDisclosureInput() {
        return cancellationPolicyDisclosure;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCancellationPolicyDisclosure(String cancellationPolicyDisclosure) {
        this.cancellationPolicyDisclosure = Input.optional(cancellationPolicyDisclosure);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCancellationPolicyDisclosureInput(Input<String> cancellationPolicyDisclosure) {
        if (cancellationPolicyDisclosure == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cancellationPolicyDisclosure = cancellationPolicyDisclosure;
        return this;
    }

    public String getCancellationRebuttal() {
        return cancellationRebuttal.getValue();
    }

    public Input<String> getCancellationRebuttalInput() {
        return cancellationRebuttal;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCancellationRebuttal(String cancellationRebuttal) {
        this.cancellationRebuttal = Input.optional(cancellationRebuttal);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCancellationRebuttalInput(Input<String> cancellationRebuttal) {
        if (cancellationRebuttal == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cancellationRebuttal = cancellationRebuttal;
        return this;
    }

    public String getRefundPolicyDisclosure() {
        return refundPolicyDisclosure.getValue();
    }

    public Input<String> getRefundPolicyDisclosureInput() {
        return refundPolicyDisclosure;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setRefundPolicyDisclosure(String refundPolicyDisclosure) {
        this.refundPolicyDisclosure = Input.optional(refundPolicyDisclosure);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setRefundPolicyDisclosureInput(Input<String> refundPolicyDisclosure) {
        if (refundPolicyDisclosure == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundPolicyDisclosure = refundPolicyDisclosure;
        return this;
    }

    public String getRefundRefusalExplanation() {
        return refundRefusalExplanation.getValue();
    }

    public Input<String> getRefundRefusalExplanationInput() {
        return refundRefusalExplanation;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setRefundRefusalExplanation(String refundRefusalExplanation) {
        this.refundRefusalExplanation = Input.optional(refundRefusalExplanation);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setRefundRefusalExplanationInput(Input<String> refundRefusalExplanation) {
        if (refundRefusalExplanation == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundRefusalExplanation = refundRefusalExplanation;
        return this;
    }

    public ShopifyPaymentsDisputeFileUploadUpdateInput getCancellationPolicyFile() {
        return cancellationPolicyFile.getValue();
    }

    public Input<ShopifyPaymentsDisputeFileUploadUpdateInput> getCancellationPolicyFileInput() {
        return cancellationPolicyFile;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCancellationPolicyFile(ShopifyPaymentsDisputeFileUploadUpdateInput cancellationPolicyFile) {
        this.cancellationPolicyFile = Input.optional(cancellationPolicyFile);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCancellationPolicyFileInput(Input<ShopifyPaymentsDisputeFileUploadUpdateInput> cancellationPolicyFile) {
        if (cancellationPolicyFile == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cancellationPolicyFile = cancellationPolicyFile;
        return this;
    }

    public ShopifyPaymentsDisputeFileUploadUpdateInput getCustomerCommunicationFile() {
        return customerCommunicationFile.getValue();
    }

    public Input<ShopifyPaymentsDisputeFileUploadUpdateInput> getCustomerCommunicationFileInput() {
        return customerCommunicationFile;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCustomerCommunicationFile(ShopifyPaymentsDisputeFileUploadUpdateInput customerCommunicationFile) {
        this.customerCommunicationFile = Input.optional(customerCommunicationFile);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setCustomerCommunicationFileInput(Input<ShopifyPaymentsDisputeFileUploadUpdateInput> customerCommunicationFile) {
        if (customerCommunicationFile == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerCommunicationFile = customerCommunicationFile;
        return this;
    }

    public ShopifyPaymentsDisputeFileUploadUpdateInput getRefundPolicyFile() {
        return refundPolicyFile.getValue();
    }

    public Input<ShopifyPaymentsDisputeFileUploadUpdateInput> getRefundPolicyFileInput() {
        return refundPolicyFile;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setRefundPolicyFile(ShopifyPaymentsDisputeFileUploadUpdateInput refundPolicyFile) {
        this.refundPolicyFile = Input.optional(refundPolicyFile);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setRefundPolicyFileInput(Input<ShopifyPaymentsDisputeFileUploadUpdateInput> refundPolicyFile) {
        if (refundPolicyFile == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundPolicyFile = refundPolicyFile;
        return this;
    }

    public ShopifyPaymentsDisputeFileUploadUpdateInput getShippingDocumentationFile() {
        return shippingDocumentationFile.getValue();
    }

    public Input<ShopifyPaymentsDisputeFileUploadUpdateInput> getShippingDocumentationFileInput() {
        return shippingDocumentationFile;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setShippingDocumentationFile(ShopifyPaymentsDisputeFileUploadUpdateInput shippingDocumentationFile) {
        this.shippingDocumentationFile = Input.optional(shippingDocumentationFile);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setShippingDocumentationFileInput(Input<ShopifyPaymentsDisputeFileUploadUpdateInput> shippingDocumentationFile) {
        if (shippingDocumentationFile == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingDocumentationFile = shippingDocumentationFile;
        return this;
    }

    public ShopifyPaymentsDisputeFileUploadUpdateInput getUncategorizedFile() {
        return uncategorizedFile.getValue();
    }

    public Input<ShopifyPaymentsDisputeFileUploadUpdateInput> getUncategorizedFileInput() {
        return uncategorizedFile;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setUncategorizedFile(ShopifyPaymentsDisputeFileUploadUpdateInput uncategorizedFile) {
        this.uncategorizedFile = Input.optional(uncategorizedFile);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setUncategorizedFileInput(Input<ShopifyPaymentsDisputeFileUploadUpdateInput> uncategorizedFile) {
        if (uncategorizedFile == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.uncategorizedFile = uncategorizedFile;
        return this;
    }

    public ShopifyPaymentsDisputeFileUploadUpdateInput getServiceDocumentationFile() {
        return serviceDocumentationFile.getValue();
    }

    public Input<ShopifyPaymentsDisputeFileUploadUpdateInput> getServiceDocumentationFileInput() {
        return serviceDocumentationFile;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setServiceDocumentationFile(ShopifyPaymentsDisputeFileUploadUpdateInput serviceDocumentationFile) {
        this.serviceDocumentationFile = Input.optional(serviceDocumentationFile);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setServiceDocumentationFileInput(Input<ShopifyPaymentsDisputeFileUploadUpdateInput> serviceDocumentationFile) {
        if (serviceDocumentationFile == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.serviceDocumentationFile = serviceDocumentationFile;
        return this;
    }

    public Boolean getSubmitEvidence() {
        return submitEvidence.getValue();
    }

    public Input<Boolean> getSubmitEvidenceInput() {
        return submitEvidence;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setSubmitEvidence(Boolean submitEvidence) {
        this.submitEvidence = Input.optional(submitEvidence);
        return this;
    }

    public ShopifyPaymentsDisputeEvidenceUpdateInput setSubmitEvidenceInput(Input<Boolean> submitEvidence) {
        if (submitEvidence == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.submitEvidence = submitEvidence;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.customerEmailAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerEmailAddress:");
            if (customerEmailAddress.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerEmailAddress.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerLastName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerLastName:");
            if (customerLastName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerLastName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerFirstName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerFirstName:");
            if (customerFirstName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerFirstName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shippingAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shippingAddress:");
            if (shippingAddress.getValue() != null) {
                shippingAddress.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.uncategorizedText.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("uncategorizedText:");
            if (uncategorizedText.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, uncategorizedText.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.accessActivityLog.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("accessActivityLog:");
            if (accessActivityLog.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, accessActivityLog.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.cancellationPolicyDisclosure.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cancellationPolicyDisclosure:");
            if (cancellationPolicyDisclosure.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, cancellationPolicyDisclosure.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.cancellationRebuttal.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cancellationRebuttal:");
            if (cancellationRebuttal.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, cancellationRebuttal.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.refundPolicyDisclosure.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("refundPolicyDisclosure:");
            if (refundPolicyDisclosure.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, refundPolicyDisclosure.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.refundRefusalExplanation.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("refundRefusalExplanation:");
            if (refundRefusalExplanation.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, refundRefusalExplanation.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.cancellationPolicyFile.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cancellationPolicyFile:");
            if (cancellationPolicyFile.getValue() != null) {
                cancellationPolicyFile.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerCommunicationFile.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerCommunicationFile:");
            if (customerCommunicationFile.getValue() != null) {
                customerCommunicationFile.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.refundPolicyFile.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("refundPolicyFile:");
            if (refundPolicyFile.getValue() != null) {
                refundPolicyFile.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shippingDocumentationFile.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shippingDocumentationFile:");
            if (shippingDocumentationFile.getValue() != null) {
                shippingDocumentationFile.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.uncategorizedFile.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("uncategorizedFile:");
            if (uncategorizedFile.getValue() != null) {
                uncategorizedFile.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.serviceDocumentationFile.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("serviceDocumentationFile:");
            if (serviceDocumentationFile.getValue() != null) {
                serviceDocumentationFile.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.submitEvidence.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("submitEvidence:");
            if (submitEvidence.getValue() != null) {
                _queryBuilder.append(submitEvidence.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

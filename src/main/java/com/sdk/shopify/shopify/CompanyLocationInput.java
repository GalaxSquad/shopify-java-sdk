// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class CompanyLocationInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<String> phone = Input.undefined();

    private Input<String> locale = Input.undefined();

    private Input<String> externalId = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<BuyerExperienceConfigurationInput> buyerExperienceConfiguration = Input.undefined();

    private Input<CompanyAddressInput> billingAddress = Input.undefined();

    private Input<CompanyAddressInput> shippingAddress = Input.undefined();

    private Input<Boolean> billingSameAsShipping = Input.undefined();

    private Input<String> taxRegistrationId = Input.undefined();

    private Input<List<TaxExemption>> taxExemptions = Input.undefined();

    private Input<Boolean> taxExempt = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public CompanyLocationInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public CompanyLocationInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone.getValue();
    }

    public Input<String> getPhoneInput() {
        return phone;
    }

    public CompanyLocationInput setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public CompanyLocationInput setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public String getLocale() {
        return locale.getValue();
    }

    public Input<String> getLocaleInput() {
        return locale;
    }

    public CompanyLocationInput setLocale(String locale) {
        this.locale = Input.optional(locale);
        return this;
    }

    public CompanyLocationInput setLocaleInput(Input<String> locale) {
        if (locale == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locale = locale;
        return this;
    }

    public String getExternalId() {
        return externalId.getValue();
    }

    public Input<String> getExternalIdInput() {
        return externalId;
    }

    public CompanyLocationInput setExternalId(String externalId) {
        this.externalId = Input.optional(externalId);
        return this;
    }

    public CompanyLocationInput setExternalIdInput(Input<String> externalId) {
        if (externalId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.externalId = externalId;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public CompanyLocationInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public CompanyLocationInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public BuyerExperienceConfigurationInput getBuyerExperienceConfiguration() {
        return buyerExperienceConfiguration.getValue();
    }

    public Input<BuyerExperienceConfigurationInput> getBuyerExperienceConfigurationInput() {
        return buyerExperienceConfiguration;
    }

    public CompanyLocationInput setBuyerExperienceConfiguration(BuyerExperienceConfigurationInput buyerExperienceConfiguration) {
        this.buyerExperienceConfiguration = Input.optional(buyerExperienceConfiguration);
        return this;
    }

    public CompanyLocationInput setBuyerExperienceConfigurationInput(Input<BuyerExperienceConfigurationInput> buyerExperienceConfiguration) {
        if (buyerExperienceConfiguration == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.buyerExperienceConfiguration = buyerExperienceConfiguration;
        return this;
    }

    public CompanyAddressInput getBillingAddress() {
        return billingAddress.getValue();
    }

    public Input<CompanyAddressInput> getBillingAddressInput() {
        return billingAddress;
    }

    public CompanyLocationInput setBillingAddress(CompanyAddressInput billingAddress) {
        this.billingAddress = Input.optional(billingAddress);
        return this;
    }

    public CompanyLocationInput setBillingAddressInput(Input<CompanyAddressInput> billingAddress) {
        if (billingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.billingAddress = billingAddress;
        return this;
    }

    public CompanyAddressInput getShippingAddress() {
        return shippingAddress.getValue();
    }

    public Input<CompanyAddressInput> getShippingAddressInput() {
        return shippingAddress;
    }

    public CompanyLocationInput setShippingAddress(CompanyAddressInput shippingAddress) {
        this.shippingAddress = Input.optional(shippingAddress);
        return this;
    }

    public CompanyLocationInput setShippingAddressInput(Input<CompanyAddressInput> shippingAddress) {
        if (shippingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingAddress = shippingAddress;
        return this;
    }

    public Boolean getBillingSameAsShipping() {
        return billingSameAsShipping.getValue();
    }

    public Input<Boolean> getBillingSameAsShippingInput() {
        return billingSameAsShipping;
    }

    public CompanyLocationInput setBillingSameAsShipping(Boolean billingSameAsShipping) {
        this.billingSameAsShipping = Input.optional(billingSameAsShipping);
        return this;
    }

    public CompanyLocationInput setBillingSameAsShippingInput(Input<Boolean> billingSameAsShipping) {
        if (billingSameAsShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.billingSameAsShipping = billingSameAsShipping;
        return this;
    }

    public String getTaxRegistrationId() {
        return taxRegistrationId.getValue();
    }

    public Input<String> getTaxRegistrationIdInput() {
        return taxRegistrationId;
    }

    public CompanyLocationInput setTaxRegistrationId(String taxRegistrationId) {
        this.taxRegistrationId = Input.optional(taxRegistrationId);
        return this;
    }

    public CompanyLocationInput setTaxRegistrationIdInput(Input<String> taxRegistrationId) {
        if (taxRegistrationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxRegistrationId = taxRegistrationId;
        return this;
    }

    public List<TaxExemption> getTaxExemptions() {
        return taxExemptions.getValue();
    }

    public Input<List<TaxExemption>> getTaxExemptionsInput() {
        return taxExemptions;
    }

    public CompanyLocationInput setTaxExemptions(List<TaxExemption> taxExemptions) {
        this.taxExemptions = Input.optional(taxExemptions);
        return this;
    }

    public CompanyLocationInput setTaxExemptionsInput(Input<List<TaxExemption>> taxExemptions) {
        if (taxExemptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxExemptions = taxExemptions;
        return this;
    }

    public Boolean getTaxExempt() {
        return taxExempt.getValue();
    }

    public Input<Boolean> getTaxExemptInput() {
        return taxExempt;
    }

    public CompanyLocationInput setTaxExempt(Boolean taxExempt) {
        this.taxExempt = Input.optional(taxExempt);
        return this;
    }

    public CompanyLocationInput setTaxExemptInput(Input<Boolean> taxExempt) {
        if (taxExempt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxExempt = taxExempt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.phone.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("phone:");
            if (phone.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, phone.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.locale.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locale:");
            if (locale.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, locale.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.externalId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("externalId:");
            if (externalId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, externalId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.note.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("note:");
            if (note.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, note.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.buyerExperienceConfiguration.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("buyerExperienceConfiguration:");
            if (buyerExperienceConfiguration.getValue() != null) {
                buyerExperienceConfiguration.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.billingAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("billingAddress:");
            if (billingAddress.getValue() != null) {
                billingAddress.getValue().appendTo(_queryBuilder);
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

        if (this.billingSameAsShipping.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("billingSameAsShipping:");
            if (billingSameAsShipping.getValue() != null) {
                _queryBuilder.append(billingSameAsShipping.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.taxRegistrationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxRegistrationId:");
            if (taxRegistrationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, taxRegistrationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.taxExemptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxExemptions:");
            if (taxExemptions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (TaxExemption item1 : taxExemptions.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.taxExempt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxExempt:");
            if (taxExempt.getValue() != null) {
                _queryBuilder.append(taxExempt.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

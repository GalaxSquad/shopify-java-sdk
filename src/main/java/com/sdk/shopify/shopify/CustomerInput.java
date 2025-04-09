// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class CustomerInput implements Serializable {
    private Input<List<MailingAddressInput>> addresses = Input.undefined();

    private Input<String> email = Input.undefined();

    private Input<String> firstName = Input.undefined();

    private Input<ID> id = Input.undefined();

    private Input<String> lastName = Input.undefined();

    private Input<String> locale = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<String> phone = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<CustomerEmailMarketingConsentInput> emailMarketingConsent = Input.undefined();

    private Input<CustomerSmsMarketingConsentInput> smsMarketingConsent = Input.undefined();

    private Input<Boolean> taxExempt = Input.undefined();

    private Input<List<TaxExemption>> taxExemptions = Input.undefined();

    public List<MailingAddressInput> getAddresses() {
        return addresses.getValue();
    }

    public Input<List<MailingAddressInput>> getAddressesInput() {
        return addresses;
    }

    public CustomerInput setAddresses(List<MailingAddressInput> addresses) {
        this.addresses = Input.optional(addresses);
        return this;
    }

    public CustomerInput setAddressesInput(Input<List<MailingAddressInput>> addresses) {
        if (addresses == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.addresses = addresses;
        return this;
    }

    public String getEmail() {
        return email.getValue();
    }

    public Input<String> getEmailInput() {
        return email;
    }

    public CustomerInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    public CustomerInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName.getValue();
    }

    public Input<String> getFirstNameInput() {
        return firstName;
    }

    public CustomerInput setFirstName(String firstName) {
        this.firstName = Input.optional(firstName);
        return this;
    }

    public CustomerInput setFirstNameInput(Input<String> firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.firstName = firstName;
        return this;
    }

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public CustomerInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public CustomerInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public String getLastName() {
        return lastName.getValue();
    }

    public Input<String> getLastNameInput() {
        return lastName;
    }

    public CustomerInput setLastName(String lastName) {
        this.lastName = Input.optional(lastName);
        return this;
    }

    public CustomerInput setLastNameInput(Input<String> lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lastName = lastName;
        return this;
    }

    public String getLocale() {
        return locale.getValue();
    }

    public Input<String> getLocaleInput() {
        return locale;
    }

    public CustomerInput setLocale(String locale) {
        this.locale = Input.optional(locale);
        return this;
    }

    public CustomerInput setLocaleInput(Input<String> locale) {
        if (locale == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locale = locale;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public CustomerInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public CustomerInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public CustomerInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public CustomerInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public String getPhone() {
        return phone.getValue();
    }

    public Input<String> getPhoneInput() {
        return phone;
    }

    public CustomerInput setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public CustomerInput setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public List<String> getTags() {
        return tags.getValue();
    }

    public Input<List<String>> getTagsInput() {
        return tags;
    }

    public CustomerInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public CustomerInput setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public CustomerEmailMarketingConsentInput getEmailMarketingConsent() {
        return emailMarketingConsent.getValue();
    }

    public Input<CustomerEmailMarketingConsentInput> getEmailMarketingConsentInput() {
        return emailMarketingConsent;
    }

    public CustomerInput setEmailMarketingConsent(CustomerEmailMarketingConsentInput emailMarketingConsent) {
        this.emailMarketingConsent = Input.optional(emailMarketingConsent);
        return this;
    }

    public CustomerInput setEmailMarketingConsentInput(Input<CustomerEmailMarketingConsentInput> emailMarketingConsent) {
        if (emailMarketingConsent == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.emailMarketingConsent = emailMarketingConsent;
        return this;
    }

    public CustomerSmsMarketingConsentInput getSmsMarketingConsent() {
        return smsMarketingConsent.getValue();
    }

    public Input<CustomerSmsMarketingConsentInput> getSmsMarketingConsentInput() {
        return smsMarketingConsent;
    }

    public CustomerInput setSmsMarketingConsent(CustomerSmsMarketingConsentInput smsMarketingConsent) {
        this.smsMarketingConsent = Input.optional(smsMarketingConsent);
        return this;
    }

    public CustomerInput setSmsMarketingConsentInput(Input<CustomerSmsMarketingConsentInput> smsMarketingConsent) {
        if (smsMarketingConsent == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.smsMarketingConsent = smsMarketingConsent;
        return this;
    }

    public Boolean getTaxExempt() {
        return taxExempt.getValue();
    }

    public Input<Boolean> getTaxExemptInput() {
        return taxExempt;
    }

    public CustomerInput setTaxExempt(Boolean taxExempt) {
        this.taxExempt = Input.optional(taxExempt);
        return this;
    }

    public CustomerInput setTaxExemptInput(Input<Boolean> taxExempt) {
        if (taxExempt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxExempt = taxExempt;
        return this;
    }

    public List<TaxExemption> getTaxExemptions() {
        return taxExemptions.getValue();
    }

    public Input<List<TaxExemption>> getTaxExemptionsInput() {
        return taxExemptions;
    }

    public CustomerInput setTaxExemptions(List<TaxExemption> taxExemptions) {
        this.taxExemptions = Input.optional(taxExemptions);
        return this;
    }

    public CustomerInput setTaxExemptionsInput(Input<List<TaxExemption>> taxExemptions) {
        if (taxExemptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxExemptions = taxExemptions;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.addresses.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("addresses:");
            if (addresses.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MailingAddressInput item1 : addresses.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.email.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("email:");
            if (email.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, email.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.firstName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("firstName:");
            if (firstName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, firstName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lastName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lastName:");
            if (lastName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, lastName.getValue().toString());
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

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : metafields.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
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

        if (this.tags.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tags:");
            if (tags.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : tags.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.emailMarketingConsent.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("emailMarketingConsent:");
            if (emailMarketingConsent.getValue() != null) {
                emailMarketingConsent.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.smsMarketingConsent.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("smsMarketingConsent:");
            if (smsMarketingConsent.getValue() != null) {
                smsMarketingConsent.getValue().appendTo(_queryBuilder);
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

        _queryBuilder.append('}');
    }
}

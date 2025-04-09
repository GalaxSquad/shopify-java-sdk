// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CompanyCreateInput implements Serializable {
    private CompanyInput company;

    private Input<CompanyContactInput> companyContact = Input.undefined();

    private Input<CompanyLocationInput> companyLocation = Input.undefined();

    public CompanyCreateInput(CompanyInput company) {
        this.company = company;
    }

    public CompanyInput getCompany() {
        return company;
    }

    public CompanyCreateInput setCompany(CompanyInput company) {
        this.company = company;
        return this;
    }

    public CompanyContactInput getCompanyContact() {
        return companyContact.getValue();
    }

    public Input<CompanyContactInput> getCompanyContactInput() {
        return companyContact;
    }

    public CompanyCreateInput setCompanyContact(CompanyContactInput companyContact) {
        this.companyContact = Input.optional(companyContact);
        return this;
    }

    public CompanyCreateInput setCompanyContactInput(Input<CompanyContactInput> companyContact) {
        if (companyContact == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.companyContact = companyContact;
        return this;
    }

    public CompanyLocationInput getCompanyLocation() {
        return companyLocation.getValue();
    }

    public Input<CompanyLocationInput> getCompanyLocationInput() {
        return companyLocation;
    }

    public CompanyCreateInput setCompanyLocation(CompanyLocationInput companyLocation) {
        this.companyLocation = Input.optional(companyLocation);
        return this;
    }

    public CompanyCreateInput setCompanyLocationInput(Input<CompanyLocationInput> companyLocation) {
        if (companyLocation == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.companyLocation = companyLocation;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("company:");
        company.appendTo(_queryBuilder);

        if (this.companyContact.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("companyContact:");
            if (companyContact.getValue() != null) {
                companyContact.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.companyLocation.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("companyLocation:");
            if (companyLocation.getValue() != null) {
                companyLocation.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

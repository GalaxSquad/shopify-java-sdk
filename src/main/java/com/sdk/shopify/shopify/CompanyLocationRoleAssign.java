// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CompanyLocationRoleAssign implements Serializable {
    private ID companyContactRoleId;

    private ID companyContactId;

    public CompanyLocationRoleAssign(ID companyContactRoleId, ID companyContactId) {
        this.companyContactRoleId = companyContactRoleId;

        this.companyContactId = companyContactId;
    }

    public ID getCompanyContactRoleId() {
        return companyContactRoleId;
    }

    public CompanyLocationRoleAssign setCompanyContactRoleId(ID companyContactRoleId) {
        this.companyContactRoleId = companyContactRoleId;
        return this;
    }

    public ID getCompanyContactId() {
        return companyContactId;
    }

    public CompanyLocationRoleAssign setCompanyContactId(ID companyContactId) {
        this.companyContactId = companyContactId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("companyContactRoleId:");
        Query.appendQuotedString(_queryBuilder, companyContactRoleId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        _queryBuilder.append('}');
    }
}

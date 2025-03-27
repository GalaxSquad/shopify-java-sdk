// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CompanyContactRoleAssign implements Serializable {
    private ID companyContactRoleId;

    private ID companyLocationId;

    public CompanyContactRoleAssign(ID companyContactRoleId, ID companyLocationId) {
        this.companyContactRoleId = companyContactRoleId;

        this.companyLocationId = companyLocationId;
    }

    public ID getCompanyContactRoleId() {
        return companyContactRoleId;
    }

    public CompanyContactRoleAssign setCompanyContactRoleId(ID companyContactRoleId) {
        this.companyContactRoleId = companyContactRoleId;
        return this;
    }

    public ID getCompanyLocationId() {
        return companyLocationId;
    }

    public CompanyContactRoleAssign setCompanyLocationId(ID companyLocationId) {
        this.companyLocationId = companyLocationId;
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
        _queryBuilder.append("companyLocationId:");
        Query.appendQuotedString(_queryBuilder, companyLocationId.toString());

        _queryBuilder.append('}');
    }
}

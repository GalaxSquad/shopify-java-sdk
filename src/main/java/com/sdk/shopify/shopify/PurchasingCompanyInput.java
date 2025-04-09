// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class PurchasingCompanyInput implements Serializable {
    private ID companyId;

    private ID companyContactId;

    private ID companyLocationId;

    public PurchasingCompanyInput(ID companyId, ID companyContactId, ID companyLocationId) {
        this.companyId = companyId;

        this.companyContactId = companyContactId;

        this.companyLocationId = companyLocationId;
    }

    public ID getCompanyId() {
        return companyId;
    }

    public PurchasingCompanyInput setCompanyId(ID companyId) {
        this.companyId = companyId;
        return this;
    }

    public ID getCompanyContactId() {
        return companyContactId;
    }

    public PurchasingCompanyInput setCompanyContactId(ID companyContactId) {
        this.companyContactId = companyContactId;
        return this;
    }

    public ID getCompanyLocationId() {
        return companyLocationId;
    }

    public PurchasingCompanyInput setCompanyLocationId(ID companyLocationId) {
        this.companyLocationId = companyLocationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("companyId:");
        Query.appendQuotedString(_queryBuilder, companyId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("companyLocationId:");
        Query.appendQuotedString(_queryBuilder, companyLocationId.toString());

        _queryBuilder.append('}');
    }
}

// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ContextualPublicationContext implements Serializable {
    private Input<CountryCode> country = Input.undefined();

    private Input<ID> companyLocationId = Input.undefined();

    private Input<ID> locationId = Input.undefined();

    public CountryCode getCountry() {
        return country.getValue();
    }

    public Input<CountryCode> getCountryInput() {
        return country;
    }

    public ContextualPublicationContext setCountry(CountryCode country) {
        this.country = Input.optional(country);
        return this;
    }

    public ContextualPublicationContext setCountryInput(Input<CountryCode> country) {
        if (country == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.country = country;
        return this;
    }

    public ID getCompanyLocationId() {
        return companyLocationId.getValue();
    }

    public Input<ID> getCompanyLocationIdInput() {
        return companyLocationId;
    }

    public ContextualPublicationContext setCompanyLocationId(ID companyLocationId) {
        this.companyLocationId = Input.optional(companyLocationId);
        return this;
    }

    public ContextualPublicationContext setCompanyLocationIdInput(Input<ID> companyLocationId) {
        if (companyLocationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.companyLocationId = companyLocationId;
        return this;
    }

    public ID getLocationId() {
        return locationId.getValue();
    }

    public Input<ID> getLocationIdInput() {
        return locationId;
    }

    public ContextualPublicationContext setLocationId(ID locationId) {
        this.locationId = Input.optional(locationId);
        return this;
    }

    public ContextualPublicationContext setLocationIdInput(Input<ID> locationId) {
        if (locationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locationId = locationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.country.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country:");
            if (country.getValue() != null) {
                _queryBuilder.append(country.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.companyLocationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("companyLocationId:");
            if (companyLocationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, companyLocationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.locationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locationId:");
            if (locationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, locationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

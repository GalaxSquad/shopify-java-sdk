// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MetaobjectAccessInput implements Serializable {
    private Input<MetaobjectAdminAccessInput> admin = Input.undefined();

    private Input<MetaobjectStorefrontAccess> storefront = Input.undefined();

    public MetaobjectAdminAccessInput getAdmin() {
        return admin.getValue();
    }

    public Input<MetaobjectAdminAccessInput> getAdminInput() {
        return admin;
    }

    public MetaobjectAccessInput setAdmin(MetaobjectAdminAccessInput admin) {
        this.admin = Input.optional(admin);
        return this;
    }

    public MetaobjectAccessInput setAdminInput(Input<MetaobjectAdminAccessInput> admin) {
        if (admin == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.admin = admin;
        return this;
    }

    public MetaobjectStorefrontAccess getStorefront() {
        return storefront.getValue();
    }

    public Input<MetaobjectStorefrontAccess> getStorefrontInput() {
        return storefront;
    }

    public MetaobjectAccessInput setStorefront(MetaobjectStorefrontAccess storefront) {
        this.storefront = Input.optional(storefront);
        return this;
    }

    public MetaobjectAccessInput setStorefrontInput(Input<MetaobjectStorefrontAccess> storefront) {
        if (storefront == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.storefront = storefront;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.admin.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("admin:");
            if (admin.getValue() != null) {
                _queryBuilder.append(admin.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.storefront.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("storefront:");
            if (storefront.getValue() != null) {
                _queryBuilder.append(storefront.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

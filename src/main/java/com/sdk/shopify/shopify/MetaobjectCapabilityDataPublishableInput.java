// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



import java.io.Serializable;

public class MetaobjectCapabilityDataPublishableInput implements Serializable {
    private MetaobjectStatus status;

    public MetaobjectCapabilityDataPublishableInput(MetaobjectStatus status) {
        this.status = status;
    }

    public MetaobjectStatus getStatus() {
        return status;
    }

    public MetaobjectCapabilityDataPublishableInput setStatus(MetaobjectStatus status) {
        this.status = status;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("status:");
        _queryBuilder.append(status.toString());

        _queryBuilder.append('}');
    }
}

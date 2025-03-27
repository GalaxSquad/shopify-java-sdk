// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MetaobjectCapabilityDataInput implements Serializable {
    private Input<MetaobjectCapabilityDataPublishableInput> publishable = Input.undefined();

    private Input<MetaobjectCapabilityDataOnlineStoreInput> onlineStore = Input.undefined();

    public MetaobjectCapabilityDataPublishableInput getPublishable() {
        return publishable.getValue();
    }

    public Input<MetaobjectCapabilityDataPublishableInput> getPublishableInput() {
        return publishable;
    }

    public MetaobjectCapabilityDataInput setPublishable(MetaobjectCapabilityDataPublishableInput publishable) {
        this.publishable = Input.optional(publishable);
        return this;
    }

    public MetaobjectCapabilityDataInput setPublishableInput(Input<MetaobjectCapabilityDataPublishableInput> publishable) {
        if (publishable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publishable = publishable;
        return this;
    }

    public MetaobjectCapabilityDataOnlineStoreInput getOnlineStore() {
        return onlineStore.getValue();
    }

    public Input<MetaobjectCapabilityDataOnlineStoreInput> getOnlineStoreInput() {
        return onlineStore;
    }

    public MetaobjectCapabilityDataInput setOnlineStore(MetaobjectCapabilityDataOnlineStoreInput onlineStore) {
        this.onlineStore = Input.optional(onlineStore);
        return this;
    }

    public MetaobjectCapabilityDataInput setOnlineStoreInput(Input<MetaobjectCapabilityDataOnlineStoreInput> onlineStore) {
        if (onlineStore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.onlineStore = onlineStore;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.publishable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("publishable:");
            if (publishable.getValue() != null) {
                publishable.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.onlineStore.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("onlineStore:");
            if (onlineStore.getValue() != null) {
                onlineStore.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

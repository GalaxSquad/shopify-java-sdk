// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The parameters required to authenticate a file upload request using a
* [StagedMediaUploadTarget's url
* field](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarget#field-stagedmedi
* auploadtarget-url).
* For more information on the upload process, refer to
* [Upload media to
* Shopify](https://shopify.dev/apps/online-store/media/products#step-1-upload-media-to-shopify).
*/
public class StagedUploadParameterQuery extends Query<StagedUploadParameterQuery> {
    StagedUploadParameterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The parameter's name.
    */
    public StagedUploadParameterQuery name() {
        startField("name");

        return this;
    }

    /**
    * The parameter's value.
    */
    public StagedUploadParameterQuery value() {
        startField("value");

        return this;
    }
}

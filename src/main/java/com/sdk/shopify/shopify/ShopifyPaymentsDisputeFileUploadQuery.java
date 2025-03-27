// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The file upload associated with the dispute evidence.
*/
public class ShopifyPaymentsDisputeFileUploadQuery extends Query<ShopifyPaymentsDisputeFileUploadQuery> {
    ShopifyPaymentsDisputeFileUploadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The type of the file for the dispute evidence.
    */
    public ShopifyPaymentsDisputeFileUploadQuery disputeEvidenceType() {
        startField("disputeEvidenceType");

        return this;
    }

    /**
    * The file size.
    */
    public ShopifyPaymentsDisputeFileUploadQuery fileSize() {
        startField("fileSize");

        return this;
    }

    /**
    * The file type.
    */
    public ShopifyPaymentsDisputeFileUploadQuery fileType() {
        startField("fileType");

        return this;
    }

    /**
    * The original file name.
    */
    public ShopifyPaymentsDisputeFileUploadQuery originalFileName() {
        startField("originalFileName");

        return this;
    }

    /**
    * The URL for accessing the file.
    */
    public ShopifyPaymentsDisputeFileUploadQuery url() {
        startField("url");

        return this;
    }
}

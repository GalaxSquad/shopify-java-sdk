// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import java.util.List;

/**
* A file interface.
*/

public interface File {
    String getGraphQlTypeName();

    String getAlt();

    String getCreatedAt();

    List<FileError> getFileErrors();

    FileStatus getFileStatus();

    ID getId();

    MediaPreviewImage getPreview();

    String getUpdatedAt();
}


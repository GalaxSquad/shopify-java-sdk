// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;
import java.util.List;

/**
* Represents a media interface.
*/

public interface Media {
    String getGraphQlTypeName();

    String getAlt();

    ID getId();

    MediaContentType getMediaContentType();

    List<MediaError> getMediaErrors();

    List<MediaWarning> getMediaWarnings();

    MediaPreviewImage getPreview();

    MediaStatus getStatus();
}


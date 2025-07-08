// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The `MediaImage` object represents an image hosted on Shopify's
* [content delivery network
* (CDN)](https://shopify.dev/docs/storefronts/themes/best-practices/performance/platform#shopify-cdn).
* Shopify CDN is a content system that serves as the primary way to store,
* manage, and deliver visual content for products, variants, and other resources across the Shopify
* platform.
* The `MediaImage` object provides information to:
* - Store and display product and variant images across online stores, admin interfaces, and mobile
* apps.
* - Retrieve visual branding elements, including logos, banners, favicons, and background images in
* checkout flows.
* - Retrieve signed URLs for secure, time-limited access to original image files.
* Each `MediaImage` object provides both the processed image data (with automatic optimization and CDN
* delivery)
* and access to the original source file. The image processing is handled asynchronously, so images
* might not be immediately available after upload. The
* [`status`](https://shopify.dev/docs/api/admin-graphql/latest/objects/mediaimage#field-MediaImage.fie
* lds.status)
* field indicates when processing is complete and the image is ready for use.
* The `MediaImage` object implements the
* [`Media`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/Media)
* interface alongside other media types, like videos and 3D models.
* Learn about
* managing media for [products](https://shopify.dev/docs/apps/build/online-store/product-media),
* [product variants](https://shopify.dev/docs/apps/build/online-store/product-variant-media), and
* [asynchronous media
* management](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-comp
* onents#asynchronous-media-management).
*/
public class MediaImage extends AbstractResponse<MediaImage> implements File, HasMetafields, Media, MetafieldReference, Node {
    public MediaImage() {
    }

    public MediaImage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "alt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "fileErrors": {
                    List<FileError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FileError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "fileStatus": {
                    responseData.put(key, FileStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "image": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "mediaContentType": {
                    responseData.put(key, MediaContentType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "mediaErrors": {
                    List<MediaError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MediaError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "mediaWarnings": {
                    List<MediaWarning> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MediaWarning(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "mimeType": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalSource": {
                    MediaImageOriginalSource optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MediaImageOriginalSource(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "preview": {
                    MediaPreviewImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MediaPreviewImage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, MediaStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public MediaImage(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "MediaImage";
    }

    /**
    * A word or phrase to share the nature or contents of a media.
    */

    public String getAlt() {
        return (String) get("alt");
    }

    public MediaImage setAlt(String arg) {
        optimisticData.put(getKey("alt"), arg);
        return this;
    }

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was
    * created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public MediaImage setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */

    public List<FileError> getFileErrors() {
        return (List<FileError>) get("fileErrors");
    }

    public MediaImage setFileErrors(List<FileError> arg) {
        optimisticData.put(getKey("fileErrors"), arg);
        return this;
    }

    /**
    * The status of the file.
    */

    public FileStatus getFileStatus() {
        return (FileStatus) get("fileStatus");
    }

    public MediaImage setFileStatus(FileStatus arg) {
        optimisticData.put(getKey("fileStatus"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The image for the media. Returns `null` until `status` is `READY`.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public MediaImage setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * The media content type.
    */

    public MediaContentType getMediaContentType() {
        return (MediaContentType) get("mediaContentType");
    }

    public MediaImage setMediaContentType(MediaContentType arg) {
        optimisticData.put(getKey("mediaContentType"), arg);
        return this;
    }

    /**
    * Any errors which have occurred on the media.
    */

    public List<MediaError> getMediaErrors() {
        return (List<MediaError>) get("mediaErrors");
    }

    public MediaImage setMediaErrors(List<MediaError> arg) {
        optimisticData.put(getKey("mediaErrors"), arg);
        return this;
    }

    /**
    * The warnings attached to the media.
    */

    public List<MediaWarning> getMediaWarnings() {
        return (List<MediaWarning>) get("mediaWarnings");
    }

    public MediaImage setMediaWarnings(List<MediaWarning> arg) {
        optimisticData.put(getKey("mediaWarnings"), arg);
        return this;
    }

    /**
    * The MIME type of the image.
    */

    public String getMimeType() {
        return (String) get("mimeType");
    }

    public MediaImage setMimeType(String arg) {
        optimisticData.put(getKey("mimeType"), arg);
        return this;
    }

    /**
    * The original source of the image.
    */

    public MediaImageOriginalSource getOriginalSource() {
        return (MediaImageOriginalSource) get("originalSource");
    }

    public MediaImage setOriginalSource(MediaImageOriginalSource arg) {
        optimisticData.put(getKey("originalSource"), arg);
        return this;
    }

    /**
    * The preview image for the media.
    */

    public MediaPreviewImage getPreview() {
        return (MediaPreviewImage) get("preview");
    }

    public MediaImage setPreview(MediaPreviewImage arg) {
        optimisticData.put(getKey("preview"), arg);
        return this;
    }

    /**
    * Current status of the media.
    */

    public MediaStatus getStatus() {
        return (MediaStatus) get("status");
    }

    public MediaImage setStatus(MediaStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last
    * updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public MediaImage setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alt": return false;

            case "createdAt": return false;

            case "fileErrors": return true;

            case "fileStatus": return false;

            case "id": return false;

            case "image": return true;

            case "mediaContentType": return false;

            case "mediaErrors": return true;

            case "mediaWarnings": return true;

            case "mimeType": return false;

            case "originalSource": return true;

            case "preview": return true;

            case "status": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}


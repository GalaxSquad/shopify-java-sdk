// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
public class MediaImageQuery extends Query<MediaImageQuery> {
    MediaImageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A word or phrase to share the nature or contents of a media.
    */
    public MediaImageQuery alt() {
        startField("alt");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was
    * created.
    */
    public MediaImageQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */
    public MediaImageQuery fileErrors(FileErrorQueryDefinition queryDef) {
        startField("fileErrors");

        _queryBuilder.append('{');
        queryDef.define(new FileErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the file.
    */
    public MediaImageQuery fileStatus() {
        startField("fileStatus");

        return this;
    }

    /**
    * The image for the media. Returns `null` until `status` is `READY`.
    */
    public MediaImageQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The media content type.
    */
    public MediaImageQuery mediaContentType() {
        startField("mediaContentType");

        return this;
    }

    /**
    * Any errors which have occurred on the media.
    */
    public MediaImageQuery mediaErrors(MediaErrorQueryDefinition queryDef) {
        startField("mediaErrors");

        _queryBuilder.append('{');
        queryDef.define(new MediaErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The warnings attached to the media.
    */
    public MediaImageQuery mediaWarnings(MediaWarningQueryDefinition queryDef) {
        startField("mediaWarnings");

        _queryBuilder.append('{');
        queryDef.define(new MediaWarningQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The MIME type of the image.
    */
    public MediaImageQuery mimeType() {
        startField("mimeType");

        return this;
    }

    /**
    * The original source of the image.
    */
    public MediaImageQuery originalSource(MediaImageOriginalSourceQueryDefinition queryDef) {
        startField("originalSource");

        _queryBuilder.append('{');
        queryDef.define(new MediaImageOriginalSourceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The preview image for the media.
    */
    public MediaImageQuery preview(MediaPreviewImageQueryDefinition queryDef) {
        startField("preview");

        _queryBuilder.append('{');
        queryDef.define(new MediaPreviewImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Current status of the media.
    */
    public MediaImageQuery status() {
        startField("status");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last
    * updated.
    */
    public MediaImageQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}

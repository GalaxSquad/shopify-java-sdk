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
* Represents a group of products that can be displayed in online stores and other sales channels in
* categories, which makes it easy for customers to find them. For example, an athletics store might
* create different collections for running attire, shoes, and accessories.
* Collections can be defined by conditions, such as whether they match certain product tags. These are
* called smart or automated collections.
* Collections can also be created for a custom group of products. These are called custom or manual
* collections.
*/
public class Collection extends AbstractResponse<Collection> implements HasEvents, HasMetafieldDefinitions, HasMetafields, HasPublishedTranslations, MetafieldReference, MetafieldReferencer, Node, Publishable {
    public Collection() {
    }

    public Collection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "availablePublicationsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "descriptionHtml": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "feedback": {
                    ResourceFeedback optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ResourceFeedback(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "hasProduct": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "products": {
                    responseData.put(key, new ProductConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publishedOnCurrentPublication": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "publishedOnPublication": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "resourcePublications": {
                    responseData.put(key, new ResourcePublicationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "resourcePublicationsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "resourcePublicationsV2": {
                    responseData.put(key, new ResourcePublicationV2Connection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "ruleSet": {
                    CollectionRuleSet optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CollectionRuleSet(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "seo": {
                    responseData.put(key, new SEO(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "sortOrder": {
                    responseData.put(key, CollectionSortOrder.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "templateSuffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "translations": {
                    List<Translation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Translation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "unpublishedPublications": {
                    responseData.put(key, new PublicationConnection(jsonAsObject(field.getValue(), key)));

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

    public Collection(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Collection";
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */

    public Count getAvailablePublicationsCount() {
        return (Count) get("availablePublicationsCount");
    }

    public Collection setAvailablePublicationsCount(Count arg) {
        optimisticData.put(getKey("availablePublicationsCount"), arg);
        return this;
    }

    /**
    * A single-line, text-only description of the collection, stripped of any HTML tags and formatting
    * that were included in the description.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Collection setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The description of the collection, including any HTML tags and formatting. This content is typically
    * displayed to customers, such as on an online store, depending on the theme.
    */

    public String getDescriptionHtml() {
        return (String) get("descriptionHtml");
    }

    public Collection setDescriptionHtml(String arg) {
        optimisticData.put(getKey("descriptionHtml"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public Collection setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * Information about the collection that's provided through resource feedback.
    */

    public ResourceFeedback getFeedback() {
        return (ResourceFeedback) get("feedback");
    }

    public Collection setFeedback(ResourceFeedback arg) {
        optimisticData.put(getKey("feedback"), arg);
        return this;
    }

    /**
    * A unique string that identifies the collection. If a handle isn't specified when a collection is
    * created, it's automatically generated from the collection's original title, and typically includes
    * words from the title separated by hyphens. For example, a collection that was created with the title
    * `Summer Catalog 2022` might have the handle `summer-catalog-2022`.
    * If the title is changed, the handle doesn't automatically change.
    * The handle can be used in themes by the Liquid templating language to refer to the collection, but
    * using the ID is preferred because it never changes.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public Collection setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * Whether the collection includes the specified product.
    */

    public Boolean getHasProduct() {
        return (Boolean) get("hasProduct");
    }

    public Collection setHasProduct(Boolean arg) {
        optimisticData.put(getKey("hasProduct"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The image associated with the collection.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public Collection setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public Collection setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public Collection setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public Collection setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The products that are included in the collection.
    */

    public ProductConnection getProducts() {
        return (ProductConnection) get("products");
    }

    public Collection setProducts(ProductConnection arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
    * The number of products in the collection.
    */

    public Count getProductsCount() {
        return (Count) get("productsCount");
    }

    public Collection setProductsCount(Count arg) {
        optimisticData.put(getKey("productsCount"), arg);
        return this;
    }

    /**
    * Whether the resource is published to the app's
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    * For example, the resource might be published to the app's online store channel.
    */

    public Boolean getPublishedOnCurrentPublication() {
        return (Boolean) get("publishedOnCurrentPublication");
    }

    public Collection setPublishedOnCurrentPublication(Boolean arg) {
        optimisticData.put(getKey("publishedOnCurrentPublication"), arg);
        return this;
    }

    /**
    * Whether the resource is published to a specified
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */

    public Boolean getPublishedOnPublication() {
        return (Boolean) get("publishedOnPublication");
    }

    public Collection setPublishedOnPublication(Boolean arg) {
        optimisticData.put(getKey("publishedOnPublication"), arg);
        return this;
    }

    /**
    * The list of resources that are published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */

    public ResourcePublicationConnection getResourcePublications() {
        return (ResourcePublicationConnection) get("resourcePublications");
    }

    public Collection setResourcePublications(ResourcePublicationConnection arg) {
        optimisticData.put(getKey("resourcePublications"), arg);
        return this;
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */

    public Count getResourcePublicationsCount() {
        return (Count) get("resourcePublicationsCount");
    }

    public Collection setResourcePublicationsCount(Count arg) {
        optimisticData.put(getKey("resourcePublicationsCount"), arg);
        return this;
    }

    /**
    * The list of resources that are either published or staged to be published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */

    public ResourcePublicationV2Connection getResourcePublicationsV2() {
        return (ResourcePublicationV2Connection) get("resourcePublicationsV2");
    }

    public Collection setResourcePublicationsV2(ResourcePublicationV2Connection arg) {
        optimisticData.put(getKey("resourcePublicationsV2"), arg);
        return this;
    }

    /**
    * For a smart (automated) collection, specifies the rules that determine whether a product is
    * included.
    */

    public CollectionRuleSet getRuleSet() {
        return (CollectionRuleSet) get("ruleSet");
    }

    public Collection setRuleSet(CollectionRuleSet arg) {
        optimisticData.put(getKey("ruleSet"), arg);
        return this;
    }

    /**
    * If the default SEO fields for page title and description have been modified, contains the modified
    * information.
    */

    public SEO getSeo() {
        return (SEO) get("seo");
    }

    public Collection setSeo(SEO arg) {
        optimisticData.put(getKey("seo"), arg);
        return this;
    }

    /**
    * The order in which the products in the collection are displayed by default in the Shopify admin and
    * in sales channels, such as an online store.
    */

    public CollectionSortOrder getSortOrder() {
        return (CollectionSortOrder) get("sortOrder");
    }

    public Collection setSortOrder(CollectionSortOrder arg) {
        optimisticData.put(getKey("sortOrder"), arg);
        return this;
    }

    /**
    * The suffix of the Liquid template being used to show the collection in an online store. For example,
    * if the value is `custom`, then the collection is using the `collection.custom.liquid` template. If
    * the value is `null`, then the collection is using the default `collection.liquid` template.
    */

    public String getTemplateSuffix() {
        return (String) get("templateSuffix");
    }

    public Collection setTemplateSuffix(String arg) {
        optimisticData.put(getKey("templateSuffix"), arg);
        return this;
    }

    /**
    * The name of the collection. It's displayed in the Shopify admin and is typically displayed in sales
    * channels, such as an online store.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public Collection setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public Collection setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    /**
    * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that the resource isn't published to.
    */

    public PublicationConnection getUnpublishedPublications() {
        return (PublicationConnection) get("unpublishedPublications");
    }

    public Collection setUnpublishedPublications(PublicationConnection arg) {
        optimisticData.put(getKey("unpublishedPublications"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the collection was
    * last modified.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Collection setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "availablePublicationsCount": return true;

            case "description": return false;

            case "descriptionHtml": return false;

            case "events": return true;

            case "feedback": return true;

            case "handle": return false;

            case "hasProduct": return false;

            case "id": return false;

            case "image": return true;

            case "legacyResourceId": return false;

            case "metafield": return true;

            case "metafields": return true;

            case "products": return true;

            case "productsCount": return true;

            case "publishedOnCurrentPublication": return false;

            case "publishedOnPublication": return false;

            case "resourcePublications": return true;

            case "resourcePublicationsCount": return true;

            case "resourcePublicationsV2": return true;

            case "ruleSet": return true;

            case "seo": return true;

            case "sortOrder": return false;

            case "templateSuffix": return false;

            case "title": return false;

            case "translations": return true;

            case "unpublishedPublications": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}


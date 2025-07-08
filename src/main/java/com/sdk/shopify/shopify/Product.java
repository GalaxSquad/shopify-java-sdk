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
* The `Product` object lets you manage products in a merchant’s store.
* Products are the goods and services that merchants offer to customers. They can include various
* details such as title, description, price, images, and options such as size or color.
* You can use [product
* variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/productvariant) to create or
* update different versions of the same product.
* You can also add or update product
* [media](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/media).
* Products can be organized by grouping them into a
* [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/collection).
* Learn more about working with [Shopify's product
* model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-component
* s),
* including limitations and considerations.
*/
public class Product extends AbstractResponse<Product> implements CommentEventEmbed, HasEvents, HasMetafieldDefinitions, HasMetafields, HasPublishedTranslations, LegacyInteroperability, MetafieldReference, MetafieldReferencer, Navigable, Node, OnlineStorePreviewable, Publishable {
    public Product() {
    }

    public Product(JsonObject fields) throws SchemaViolationError {
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

                case "bundleComponents": {
                    responseData.put(key, new ProductBundleComponentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "category": {
                    TaxonomyCategory optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new TaxonomyCategory(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collections": {
                    responseData.put(key, new CollectionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "combinedListing": {
                    CombinedListing optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CombinedListing(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "combinedListingRole": {
                    CombinedListingsRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CombinedListingsRole.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "compareAtPriceRange": {
                    ProductCompareAtPriceRange optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductCompareAtPriceRange(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "contextualPricing": {
                    responseData.put(key, new ProductContextualPricing(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "defaultCursor": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "featuredMedia": {
                    Media optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownMedia.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "giftCardTemplateSuffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "hasOnlyDefaultVariant": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "hasOutOfStockVariants": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "hasVariantsThatRequiresComponents": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "inCollection": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isGiftCard": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "media": {
                    responseData.put(key, new MediaConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "mediaCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "onlineStorePreviewUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "onlineStoreUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "options": {
                    List<ProductOption> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductOption(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "priceRangeV2": {
                    responseData.put(key, new ProductPriceRangeV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productComponents": {
                    responseData.put(key, new ProductComponentTypeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productComponentsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productParents": {
                    responseData.put(key, new ProductConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productType": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "publishedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publishedInContext": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "requiresSellingPlan": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "resourcePublicationOnCurrentPublication": {
                    ResourcePublicationV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ResourcePublicationV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "restrictedForResource": {
                    RestrictedForResource optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RestrictedForResource(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanGroups": {
                    responseData.put(key, new SellingPlanGroupConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "sellingPlanGroupsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "seo": {
                    responseData.put(key, new SEO(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, ProductStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "tags": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

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

                case "totalInventory": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "tracksInventory": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "variants": {
                    responseData.put(key, new ProductVariantConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "variantsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "vendor": {
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

    public Product(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Product";
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

    public Product setAvailablePublicationsCount(Count arg) {
        optimisticData.put(getKey("availablePublicationsCount"), arg);
        return this;
    }

    /**
    * A list of
    * [components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bun
    * dle)
    * that are associated with a product in a bundle.
    */

    public ProductBundleComponentConnection getBundleComponents() {
        return (ProductBundleComponentConnection) get("bundleComponents");
    }

    public Product setBundleComponents(ProductBundleComponentConnection arg) {
        optimisticData.put(getKey("bundleComponents"), arg);
        return this;
    }

    /**
    * The category of a product
    * from [Shopify's Standard Product
    * Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
    */

    public TaxonomyCategory getCategory() {
        return (TaxonomyCategory) get("category");
    }

    public Product setCategory(TaxonomyCategory arg) {
        optimisticData.put(getKey("category"), arg);
        return this;
    }

    /**
    * A list of [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
    * that include the product.
    */

    public CollectionConnection getCollections() {
        return (CollectionConnection) get("collections");
    }

    public Product setCollections(CollectionConnection arg) {
        optimisticData.put(getKey("collections"), arg);
        return this;
    }

    /**
    * A special product type that combines separate products from a store into a single product listing.
    * [Combined listings](https://shopify.dev/apps/build/product-merchandising/combined-listings) are
    * connected
    * by a shared option, such as color, model, or dimension.
    */

    public CombinedListing getCombinedListing() {
        return (CombinedListing) get("combinedListing");
    }

    public Product setCombinedListing(CombinedListing arg) {
        optimisticData.put(getKey("combinedListing"), arg);
        return this;
    }

    /**
    * The [role of the
    * product](https://shopify.dev/docs/apps/build/product-merchandising/combined-listings/build-for-combi
    * ned-listings)
    * in a combined listing.
    * If `null`, then the product isn't part of any combined listing.
    */

    public CombinedListingsRole getCombinedListingRole() {
        return (CombinedListingsRole) get("combinedListingRole");
    }

    public Product setCombinedListingRole(CombinedListingsRole arg) {
        optimisticData.put(getKey("combinedListingRole"), arg);
        return this;
    }

    /**
    * The [compare-at price
    * range](https://help.shopify.com/manual/products/details/product-pricing/sale-pricing)
    * of the product in the shop's default currency.
    */

    public ProductCompareAtPriceRange getCompareAtPriceRange() {
        return (ProductCompareAtPriceRange) get("compareAtPriceRange");
    }

    public Product setCompareAtPriceRange(ProductCompareAtPriceRange arg) {
        optimisticData.put(getKey("compareAtPriceRange"), arg);
        return this;
    }

    /**
    * The pricing that applies to a customer in a specific context. For example, a price might vary
    * depending on the customer's location. Only active markets are considered in the price resolution.
    */

    public ProductContextualPricing getContextualPricing() {
        return (ProductContextualPricing) get("contextualPricing");
    }

    public Product setContextualPricing(ProductContextualPricing arg) {
        optimisticData.put(getKey("contextualPricing"), arg);
        return this;
    }

    /**
    * The date and time when the product was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Product setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */

    public String getDefaultCursor() {
        return (String) get("defaultCursor");
    }

    public Product setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    /**
    * A single-line description of the product,
    * with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Product setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The description of the product, with
    * HTML tags. For example, the description might include
    * bold `<strong></strong>` and italic `<i></i>` text.
    */

    public String getDescriptionHtml() {
        return (String) get("descriptionHtml");
    }

    public Product setDescriptionHtml(String arg) {
        optimisticData.put(getKey("descriptionHtml"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public Product setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * The featured [media](https://shopify.dev/docs/apps/build/online-store/product-media)
    * associated with the product.
    */

    public Media getFeaturedMedia() {
        return (Media) get("featuredMedia");
    }

    public Product setFeaturedMedia(Media arg) {
        optimisticData.put(getKey("featuredMedia"), arg);
        return this;
    }

    /**
    * The information that lets merchants know what steps they need to take
    * to make sure that the app is set up correctly.
    * For example, if a merchant hasn't set up a product correctly in the app,
    * then the feedback might include a message that says "You need to add a price
    * to this product".
    */

    public ResourceFeedback getFeedback() {
        return (ResourceFeedback) get("feedback");
    }

    public Product setFeedback(ResourceFeedback arg) {
        optimisticData.put(getKey("feedback"), arg);
        return this;
    }

    /**
    * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates) that's used
    * when customers view the gift card in a store.
    */

    public String getGiftCardTemplateSuffix() {
        return (String) get("giftCardTemplateSuffix");
    }

    public Product setGiftCardTemplateSuffix(String arg) {
        optimisticData.put(getKey("giftCardTemplateSuffix"), arg);
        return this;
    }

    /**
    * A unique, human-readable string of the product's title. A handle can contain letters, hyphens (`-`),
    * and numbers, but no spaces.
    * The handle is used in the online store URL for the product.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public Product setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * Whether the product has only a single variant with the default option and value.
    */

    public Boolean getHasOnlyDefaultVariant() {
        return (Boolean) get("hasOnlyDefaultVariant");
    }

    public Product setHasOnlyDefaultVariant(Boolean arg) {
        optimisticData.put(getKey("hasOnlyDefaultVariant"), arg);
        return this;
    }

    /**
    * Whether the product has variants that are out of stock.
    */

    public Boolean getHasOutOfStockVariants() {
        return (Boolean) get("hasOutOfStockVariants");
    }

    public Product setHasOutOfStockVariants(Boolean arg) {
        optimisticData.put(getKey("hasOutOfStockVariants"), arg);
        return this;
    }

    /**
    * Whether at least one of the product variants requires
    * [bundle
    * components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bund
    * le).
    * Learn more about
    * [store eligibility for
    * bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles#store-eligibility).
    */

    public Boolean getHasVariantsThatRequiresComponents() {
        return (Boolean) get("hasVariantsThatRequiresComponents");
    }

    public Product setHasVariantsThatRequiresComponents(Boolean arg) {
        optimisticData.put(getKey("hasVariantsThatRequiresComponents"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether the product
    * is in a specified
    * [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/collection).
    */

    public Boolean getInCollection() {
        return (Boolean) get("inCollection");
    }

    public Product setInCollection(Boolean arg) {
        optimisticData.put(getKey("inCollection"), arg);
        return this;
    }

    /**
    * Whether the product is a gift card.
    */

    public Boolean getIsGiftCard() {
        return (Boolean) get("isGiftCard");
    }

    public Product setIsGiftCard(Boolean arg) {
        optimisticData.put(getKey("isGiftCard"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public Product setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The [media](https://shopify.dev/docs/apps/build/online-store/product-media) associated with the
    * product. Valid media are images, 3D models, videos.
    */

    public MediaConnection getMedia() {
        return (MediaConnection) get("media");
    }

    public Product setMedia(MediaConnection arg) {
        optimisticData.put(getKey("media"), arg);
        return this;
    }

    /**
    * The total count of [media](https://shopify.dev/docs/apps/build/online-store/product-media)
    * that's associated with a product.
    */

    public Count getMediaCount() {
        return (Count) get("mediaCount");
    }

    public Product setMediaCount(Count arg) {
        optimisticData.put(getKey("mediaCount"), arg);
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

    public Product setMetafield(Metafield arg) {
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

    public Product setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The [preview URL](https://help.shopify.com/manual/online-store/setting-up#preview-your-store) for
    * the online store.
    */

    public String getOnlineStorePreviewUrl() {
        return (String) get("onlineStorePreviewUrl");
    }

    public Product setOnlineStorePreviewUrl(String arg) {
        optimisticData.put(getKey("onlineStorePreviewUrl"), arg);
        return this;
    }

    /**
    * The product's URL on the online store.
    * If `null`, then the product isn't published to the online store sales channel.
    */

    public String getOnlineStoreUrl() {
        return (String) get("onlineStoreUrl");
    }

    public Product setOnlineStoreUrl(String arg) {
        optimisticData.put(getKey("onlineStoreUrl"), arg);
        return this;
    }

    /**
    * A list of product options. The limit is defined by the
    * [shop's resource limits for product
    * options](https://shopify.dev/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
    * (`Shop.resourceLimits.maxProductOptions`).
    */

    public List<ProductOption> getOptions() {
        return (List<ProductOption>) get("options");
    }

    public Product setOptions(List<ProductOption> arg) {
        optimisticData.put(getKey("options"), arg);
        return this;
    }

    /**
    * The minimum and maximum prices of a product, expressed in decimal numbers.
    * For example, if the product is priced between $10.00 and $50.00,
    * then the price range is $10.00 - $50.00.
    */

    public ProductPriceRangeV2 getPriceRangeV2() {
        return (ProductPriceRangeV2) get("priceRangeV2");
    }

    public Product setPriceRangeV2(ProductPriceRangeV2 arg) {
        optimisticData.put(getKey("priceRangeV2"), arg);
        return this;
    }

    /**
    * A list of products that contain at least one variant associated with
    * at least one of the current products' variants via group relationship.
    */

    public ProductComponentTypeConnection getProductComponents() {
        return (ProductComponentTypeConnection) get("productComponents");
    }

    public Product setProductComponents(ProductComponentTypeConnection arg) {
        optimisticData.put(getKey("productComponents"), arg);
        return this;
    }

    /**
    * A count of unique products that contain at least one variant associated with
    * at least one of the current products' variants via group relationship.
    */

    public Count getProductComponentsCount() {
        return (Count) get("productComponentsCount");
    }

    public Product setProductComponentsCount(Count arg) {
        optimisticData.put(getKey("productComponentsCount"), arg);
        return this;
    }

    /**
    * A list of products that has a variant that contains any of this product's variants as a component.
    */

    public ProductConnection getProductParents() {
        return (ProductConnection) get("productParents");
    }

    public Product setProductParents(ProductConnection arg) {
        optimisticData.put(getKey("productParents"), arg);
        return this;
    }

    /**
    * The [product type](https://help.shopify.com/manual/products/details/product-type)
    * that merchants define.
    */

    public String getProductType() {
        return (String) get("productType");
    }

    public Product setProductType(String arg) {
        optimisticData.put(getKey("productType"), arg);
        return this;
    }

    /**
    * The date and time when the product was published to the online store.
    */

    public String getPublishedAt() {
        return (String) get("publishedAt");
    }

    public Product setPublishedAt(String arg) {
        optimisticData.put(getKey("publishedAt"), arg);
        return this;
    }

    /**
    * Whether the product is published for a customer only in a specified context. For example, a product
    * might be published for a customer only in a specific location.
    */

    public Boolean getPublishedInContext() {
        return (Boolean) get("publishedInContext");
    }

    public Product setPublishedInContext(Boolean arg) {
        optimisticData.put(getKey("publishedInContext"), arg);
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

    public Product setPublishedOnCurrentPublication(Boolean arg) {
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

    public Product setPublishedOnPublication(Boolean arg) {
        optimisticData.put(getKey("publishedOnPublication"), arg);
        return this;
    }

    /**
    * Whether the product can only be purchased with
    * a [selling plan](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans).
    * Products that are sold on subscription (`requiresSellingPlan: true`) can be updated only for online
    * stores.
    * If you update a product to be subscription-only (`requiresSellingPlan:false`), then the product is
    * unpublished from all channels, except the online store.
    */

    public Boolean getRequiresSellingPlan() {
        return (Boolean) get("requiresSellingPlan");
    }

    public Product setRequiresSellingPlan(Boolean arg) {
        optimisticData.put(getKey("requiresSellingPlan"), arg);
        return this;
    }

    /**
    * The resource that's either published or staged to be published to
    * the [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */

    public ResourcePublicationV2 getResourcePublicationOnCurrentPublication() {
        return (ResourcePublicationV2) get("resourcePublicationOnCurrentPublication");
    }

    public Product setResourcePublicationOnCurrentPublication(ResourcePublicationV2 arg) {
        optimisticData.put(getKey("resourcePublicationOnCurrentPublication"), arg);
        return this;
    }

    /**
    * The list of resources that are published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */

    public ResourcePublicationConnection getResourcePublications() {
        return (ResourcePublicationConnection) get("resourcePublications");
    }

    public Product setResourcePublications(ResourcePublicationConnection arg) {
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

    public Product setResourcePublicationsCount(Count arg) {
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

    public Product setResourcePublicationsV2(ResourcePublicationV2Connection arg) {
        optimisticData.put(getKey("resourcePublicationsV2"), arg);
        return this;
    }

    /**
    * Whether the merchant can make changes to the product when they
    * [edit the
    * order](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders)
    * associated with the product. For example, a merchant might be restricted from changing product
    * details when they
    * edit an order.
    */

    public RestrictedForResource getRestrictedForResource() {
        return (RestrictedForResource) get("restrictedForResource");
    }

    public Product setRestrictedForResource(RestrictedForResource arg) {
        optimisticData.put(getKey("restrictedForResource"), arg);
        return this;
    }

    /**
    * A list of all [selling plan
    * groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-sel
    * ling-plan)
    * that are associated with the product either directly, or through the product's variants.
    */

    public SellingPlanGroupConnection getSellingPlanGroups() {
        return (SellingPlanGroupConnection) get("sellingPlanGroups");
    }

    public Product setSellingPlanGroups(SellingPlanGroupConnection arg) {
        optimisticData.put(getKey("sellingPlanGroups"), arg);
        return this;
    }

    /**
    * A count of [selling plan
    * groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-sel
    * ling-plan)
    * that are associated with the product.
    */

    public Count getSellingPlanGroupsCount() {
        return (Count) get("sellingPlanGroupsCount");
    }

    public Product setSellingPlanGroupsCount(Count arg) {
        optimisticData.put(getKey("sellingPlanGroupsCount"), arg);
        return this;
    }

    /**
    * The [SEO title and
    * description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
    * that are associated with a product.
    */

    public SEO getSeo() {
        return (SEO) get("seo");
    }

    public Product setSeo(SEO arg) {
        optimisticData.put(getKey("seo"), arg);
        return this;
    }

    /**
    * The [product
    * status](https://help.shopify.com/manual/products/details/product-details-page#product-status),
    * which controls visibility across all sales channels.
    */

    public ProductStatus getStatus() {
        return (ProductStatus) get("status");
    }

    public Product setStatus(ProductStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * A comma-separated list of searchable keywords that are
    * associated with the product. For example, a merchant might apply the `sports`
    * and `summer` tags to products that are associated with sportwear for summer.
    * Updating `tags` overwrites
    * any existing tags that were previously added to the product. To add new tags without overwriting
    * existing tags, use the [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
    * mutation.
    */

    public List<String> getTags() {
        return (List<String>) get("tags");
    }

    public Product setTags(List<String> arg) {
        optimisticData.put(getKey("tags"), arg);
        return this;
    }

    /**
    * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates) that's used
    * when customers view the product in a store.
    */

    public String getTemplateSuffix() {
        return (String) get("templateSuffix");
    }

    public Product setTemplateSuffix(String arg) {
        optimisticData.put(getKey("templateSuffix"), arg);
        return this;
    }

    /**
    * The name for the product that displays to customers. The title is used to construct the product's
    * handle.
    * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public Product setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The quantity of inventory that's in stock.
    */

    public Integer getTotalInventory() {
        return (Integer) get("totalInventory");
    }

    public Product setTotalInventory(Integer arg) {
        optimisticData.put(getKey("totalInventory"), arg);
        return this;
    }

    /**
    * Whether [inventory
    * tracking](https://help.shopify.com/manual/products/inventory/getting-started-with-inventory/set-up-i
    * nventory-tracking)
    * has been enabled for the product.
    */

    public Boolean getTracksInventory() {
        return (Boolean) get("tracksInventory");
    }

    public Product setTracksInventory(Boolean arg) {
        optimisticData.put(getKey("tracksInventory"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public Product setTranslations(List<Translation> arg) {
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

    public Product setUnpublishedPublications(PublicationConnection arg) {
        optimisticData.put(getKey("unpublishedPublications"), arg);
        return this;
    }

    /**
    * The date and time when the product was last modified.
    * A product's `updatedAt` value can change for different reasons. For example, if an order
    * is placed for a product that has inventory tracking set up, then the inventory adjustment
    * is counted as an update.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Product setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * A list of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * associated with the product.
    * If querying a single product at the root, you can fetch up to 2000 variants.
    */

    public ProductVariantConnection getVariants() {
        return (ProductVariantConnection) get("variants");
    }

    public Product setVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("variants"), arg);
        return this;
    }

    /**
    * The number of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * that are associated with the product.
    */

    public Count getVariantsCount() {
        return (Count) get("variantsCount");
    }

    public Product setVariantsCount(Count arg) {
        optimisticData.put(getKey("variantsCount"), arg);
        return this;
    }

    /**
    * The name of the product's vendor.
    */

    public String getVendor() {
        return (String) get("vendor");
    }

    public Product setVendor(String arg) {
        optimisticData.put(getKey("vendor"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "availablePublicationsCount": return true;

            case "bundleComponents": return true;

            case "category": return true;

            case "collections": return true;

            case "combinedListing": return true;

            case "combinedListingRole": return false;

            case "compareAtPriceRange": return true;

            case "contextualPricing": return true;

            case "createdAt": return false;

            case "defaultCursor": return false;

            case "description": return false;

            case "descriptionHtml": return false;

            case "events": return true;

            case "featuredMedia": return false;

            case "feedback": return true;

            case "giftCardTemplateSuffix": return false;

            case "handle": return false;

            case "hasOnlyDefaultVariant": return false;

            case "hasOutOfStockVariants": return false;

            case "hasVariantsThatRequiresComponents": return false;

            case "id": return false;

            case "inCollection": return false;

            case "isGiftCard": return false;

            case "legacyResourceId": return false;

            case "media": return true;

            case "mediaCount": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "onlineStorePreviewUrl": return false;

            case "onlineStoreUrl": return false;

            case "options": return true;

            case "priceRangeV2": return true;

            case "productComponents": return true;

            case "productComponentsCount": return true;

            case "productParents": return true;

            case "productType": return false;

            case "publishedAt": return false;

            case "publishedInContext": return false;

            case "publishedOnCurrentPublication": return false;

            case "publishedOnPublication": return false;

            case "requiresSellingPlan": return false;

            case "resourcePublicationOnCurrentPublication": return true;

            case "resourcePublications": return true;

            case "resourcePublicationsCount": return true;

            case "resourcePublicationsV2": return true;

            case "restrictedForResource": return true;

            case "sellingPlanGroups": return true;

            case "sellingPlanGroupsCount": return true;

            case "seo": return true;

            case "status": return false;

            case "tags": return false;

            case "templateSuffix": return false;

            case "title": return false;

            case "totalInventory": return false;

            case "tracksInventory": return false;

            case "translations": return true;

            case "unpublishedPublications": return true;

            case "updatedAt": return false;

            case "variants": return true;

            case "variantsCount": return true;

            case "vendor": return false;

            default: return false;
        }
    }
}


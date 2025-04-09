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
* Represents a product variant.
*/
public class ProductVariant extends AbstractResponse<ProductVariant> implements CommentEventEmbed, DeliveryPromiseParticipantOwner, HasEvents, HasMetafieldDefinitions, HasMetafields, HasPublishedTranslations, LegacyInteroperability, MetafieldReference, MetafieldReferencer, Navigable, Node {
    public ProductVariant() {
    }

    public ProductVariant(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "availableForSale": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "barcode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "compareAtPrice": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "contextualPricing": {
                    responseData.put(key, new ProductVariantContextualPricing(jsonAsObject(field.getValue(), key)));

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

                case "deliveryProfile": {
                    DeliveryProfile optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryProfile(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "displayName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

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

                case "inventoryItem": {
                    responseData.put(key, new InventoryItem(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "inventoryPolicy": {
                    responseData.put(key, ProductVariantInventoryPolicy.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "inventoryQuantity": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "position": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "price": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "product": {
                    responseData.put(key, new Product(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productVariantComponents": {
                    responseData.put(key, new ProductVariantComponentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "requiresComponents": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "selectedOptions": {
                    List<SelectedOption> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SelectedOption(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "sellableOnlineQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

                case "sku": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "unitPriceMeasurement": {
                    UnitPriceMeasurement optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UnitPriceMeasurement(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

    public ProductVariant(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ProductVariant";
    }

    /**
    * Whether the product variant is available for sale.
    */

    public Boolean getAvailableForSale() {
        return (Boolean) get("availableForSale");
    }

    public ProductVariant setAvailableForSale(Boolean arg) {
        optimisticData.put(getKey("availableForSale"), arg);
        return this;
    }

    /**
    * The value of the barcode associated with the product.
    */

    public String getBarcode() {
        return (String) get("barcode");
    }

    public ProductVariant setBarcode(String arg) {
        optimisticData.put(getKey("barcode"), arg);
        return this;
    }

    /**
    * The compare-at price of the variant in the default shop currency.
    */

    public String getCompareAtPrice() {
        return (String) get("compareAtPrice");
    }

    public ProductVariant setCompareAtPrice(String arg) {
        optimisticData.put(getKey("compareAtPrice"), arg);
        return this;
    }

    /**
    * The pricing that applies for a customer in a given context. As of API version 2025-04, only active
    * markets are considered in the price resolution.
    */

    public ProductVariantContextualPricing getContextualPricing() {
        return (ProductVariantContextualPricing) get("contextualPricing");
    }

    public ProductVariant setContextualPricing(ProductVariantContextualPricing arg) {
        optimisticData.put(getKey("contextualPricing"), arg);
        return this;
    }

    /**
    * The date and time when the variant was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ProductVariant setCreatedAt(String arg) {
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

    public ProductVariant setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    /**
    * The [delivery profile](https://shopify.dev/api/admin-graphql/latest/objects/DeliveryProfile) for the
    * variant.
    */

    public DeliveryProfile getDeliveryProfile() {
        return (DeliveryProfile) get("deliveryProfile");
    }

    public ProductVariant setDeliveryProfile(DeliveryProfile arg) {
        optimisticData.put(getKey("deliveryProfile"), arg);
        return this;
    }

    /**
    * Display name of the variant, based on product's title + variant's title.
    */

    public String getDisplayName() {
        return (String) get("displayName");
    }

    public ProductVariant setDisplayName(String arg) {
        optimisticData.put(getKey("displayName"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public ProductVariant setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The featured image for the variant.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public ProductVariant setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * The inventory item, which is used to query for inventory information.
    */

    public InventoryItem getInventoryItem() {
        return (InventoryItem) get("inventoryItem");
    }

    public ProductVariant setInventoryItem(InventoryItem arg) {
        optimisticData.put(getKey("inventoryItem"), arg);
        return this;
    }

    /**
    * Whether customers are allowed to place an order for the product variant when it's out of stock.
    */

    public ProductVariantInventoryPolicy getInventoryPolicy() {
        return (ProductVariantInventoryPolicy) get("inventoryPolicy");
    }

    public ProductVariant setInventoryPolicy(ProductVariantInventoryPolicy arg) {
        optimisticData.put(getKey("inventoryPolicy"), arg);
        return this;
    }

    /**
    * The total sellable quantity of the variant.
    */

    public Integer getInventoryQuantity() {
        return (Integer) get("inventoryQuantity");
    }

    public ProductVariant setInventoryQuantity(Integer arg) {
        optimisticData.put(getKey("inventoryQuantity"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public ProductVariant setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The media associated with the product variant.
    */

    public MediaConnection getMedia() {
        return (MediaConnection) get("media");
    }

    public ProductVariant setMedia(MediaConnection arg) {
        optimisticData.put(getKey("media"), arg);
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

    public ProductVariant setMetafield(Metafield arg) {
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

    public ProductVariant setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The order of the product variant in the list of product variants. The first position in the list is
    * 1.
    */

    public Integer getPosition() {
        return (Integer) get("position");
    }

    public ProductVariant setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
    * The price of the product variant in the default shop currency.
    */

    public String getPrice() {
        return (String) get("price");
    }

    public ProductVariant setPrice(String arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * The product that this variant belongs to.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductVariant setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * A list of the product variant components.
    */

    public ProductVariantComponentConnection getProductVariantComponents() {
        return (ProductVariantComponentConnection) get("productVariantComponents");
    }

    public ProductVariant setProductVariantComponents(ProductVariantComponentConnection arg) {
        optimisticData.put(getKey("productVariantComponents"), arg);
        return this;
    }

    /**
    * Whether a product variant requires components. The default value is `false`.
    * If `true`, then the product variant can only be purchased as a parent bundle with components and it
    * will be omitted
    * from channels that don't support bundles.
    */

    public Boolean getRequiresComponents() {
        return (Boolean) get("requiresComponents");
    }

    public ProductVariant setRequiresComponents(Boolean arg) {
        optimisticData.put(getKey("requiresComponents"), arg);
        return this;
    }

    /**
    * List of product options applied to the variant.
    */

    public List<SelectedOption> getSelectedOptions() {
        return (List<SelectedOption>) get("selectedOptions");
    }

    public ProductVariant setSelectedOptions(List<SelectedOption> arg) {
        optimisticData.put(getKey("selectedOptions"), arg);
        return this;
    }

    /**
    * The total sellable quantity of the variant for online channels.
    * This doesn't represent the total available inventory or capture
    * [limitations based on customer
    * location](https://help.shopify.com/manual/markets/inventory_and_fulfillment).
    */

    public Integer getSellableOnlineQuantity() {
        return (Integer) get("sellableOnlineQuantity");
    }

    public ProductVariant setSellableOnlineQuantity(Integer arg) {
        optimisticData.put(getKey("sellableOnlineQuantity"), arg);
        return this;
    }

    /**
    * A list of all selling plan groups defined in the current shop associated with the product variant.
    */

    public SellingPlanGroupConnection getSellingPlanGroups() {
        return (SellingPlanGroupConnection) get("sellingPlanGroups");
    }

    public ProductVariant setSellingPlanGroups(SellingPlanGroupConnection arg) {
        optimisticData.put(getKey("sellingPlanGroups"), arg);
        return this;
    }

    /**
    * Count of selling plan groups associated with the product variant.
    */

    public Count getSellingPlanGroupsCount() {
        return (Count) get("sellingPlanGroupsCount");
    }

    public ProductVariant setSellingPlanGroupsCount(Count arg) {
        optimisticData.put(getKey("sellingPlanGroupsCount"), arg);
        return this;
    }

    /**
    * A case-sensitive identifier for the product variant in the shop.
    * Required in order to connect to a fulfillment service.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public ProductVariant setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
    * The tax code for the product variant.
    */

    public String getTaxCode() {
        return (String) get("taxCode");
    }

    public ProductVariant setTaxCode(String arg) {
        optimisticData.put(getKey("taxCode"), arg);
        return this;
    }

    /**
    * Whether a tax is charged when the product variant is sold.
    */

    public Boolean getTaxable() {
        return (Boolean) get("taxable");
    }

    public ProductVariant setTaxable(Boolean arg) {
        optimisticData.put(getKey("taxable"), arg);
        return this;
    }

    /**
    * The title of the product variant.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public ProductVariant setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public ProductVariant setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    /**
    * The unit price measurement for the variant.
    */

    public UnitPriceMeasurement getUnitPriceMeasurement() {
        return (UnitPriceMeasurement) get("unitPriceMeasurement");
    }

    public ProductVariant setUnitPriceMeasurement(UnitPriceMeasurement arg) {
        optimisticData.put(getKey("unitPriceMeasurement"), arg);
        return this;
    }

    /**
    * The date and time (ISO 8601 format) when the product variant was last modified.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public ProductVariant setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "availableForSale": return false;

            case "barcode": return false;

            case "compareAtPrice": return false;

            case "contextualPricing": return true;

            case "createdAt": return false;

            case "defaultCursor": return false;

            case "deliveryProfile": return true;

            case "displayName": return false;

            case "events": return true;

            case "id": return false;

            case "image": return true;

            case "inventoryItem": return true;

            case "inventoryPolicy": return false;

            case "inventoryQuantity": return false;

            case "legacyResourceId": return false;

            case "media": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "position": return false;

            case "price": return false;

            case "product": return true;

            case "productVariantComponents": return true;

            case "requiresComponents": return false;

            case "selectedOptions": return true;

            case "sellableOnlineQuantity": return false;

            case "sellingPlanGroups": return true;

            case "sellingPlanGroupsCount": return true;

            case "sku": return false;

            case "taxCode": return false;

            case "taxable": return false;

            case "title": return false;

            case "translations": return true;

            case "unitPriceMeasurement": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}


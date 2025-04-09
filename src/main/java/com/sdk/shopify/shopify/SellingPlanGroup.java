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
* Represents a selling method (for example, "Subscribe and save" or "Pre-paid"). Selling plan groups
* and associated records (selling plans and policies) are deleted 48 hours after a merchant
* uninstalls their subscriptions app. We recommend backing up these records if you need to restore
* them later.
*/
public class SellingPlanGroup extends AbstractResponse<SellingPlanGroup> implements HasPublishedTranslations, Node {
    public SellingPlanGroup() {
    }

    public SellingPlanGroup(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "appId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appliesToProduct": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "appliesToProductVariant": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "appliesToProductVariants": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "merchantCode": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "options": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "position": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariants": {
                    responseData.put(key, new ProductVariantConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productVariantsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "sellingPlans": {
                    responseData.put(key, new SellingPlanConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "summary": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

    public SellingPlanGroup(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "SellingPlanGroup";
    }

    /**
    * The ID for app, exposed in Liquid and product JSON.
    */

    public String getAppId() {
        return (String) get("appId");
    }

    public SellingPlanGroup setAppId(String arg) {
        optimisticData.put(getKey("appId"), arg);
        return this;
    }

    /**
    * Whether the given product is directly associated to the selling plan group.
    */

    public Boolean getAppliesToProduct() {
        return (Boolean) get("appliesToProduct");
    }

    public SellingPlanGroup setAppliesToProduct(Boolean arg) {
        optimisticData.put(getKey("appliesToProduct"), arg);
        return this;
    }

    /**
    * Whether the given product variant is directly associated to the selling plan group.
    */

    public Boolean getAppliesToProductVariant() {
        return (Boolean) get("appliesToProductVariant");
    }

    public SellingPlanGroup setAppliesToProductVariant(Boolean arg) {
        optimisticData.put(getKey("appliesToProductVariant"), arg);
        return this;
    }

    /**
    * Whether any of the product variants of the given product are associated to the selling plan group.
    */

    public Boolean getAppliesToProductVariants() {
        return (Boolean) get("appliesToProductVariants");
    }

    public SellingPlanGroup setAppliesToProductVariants(Boolean arg) {
        optimisticData.put(getKey("appliesToProductVariants"), arg);
        return this;
    }

    /**
    * The date and time when the selling plan group was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public SellingPlanGroup setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The merchant-facing description of the selling plan group.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public SellingPlanGroup setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The merchant-facing label of the selling plan group.
    */

    public String getMerchantCode() {
        return (String) get("merchantCode");
    }

    public SellingPlanGroup setMerchantCode(String arg) {
        optimisticData.put(getKey("merchantCode"), arg);
        return this;
    }

    /**
    * The buyer-facing label of the selling plan group.
    */

    public String getName() {
        return (String) get("name");
    }

    public SellingPlanGroup setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The values of all options available on the selling plan group. Selling plans are grouped together in
    * Liquid when they're created by the same app, and have the same `selling_plan_group.name` and
    * `selling_plan_group.options` values.
    */

    public List<String> getOptions() {
        return (List<String>) get("options");
    }

    public SellingPlanGroup setOptions(List<String> arg) {
        optimisticData.put(getKey("options"), arg);
        return this;
    }

    /**
    * The relative position of the selling plan group for display.
    */

    public Integer getPosition() {
        return (Integer) get("position");
    }

    public SellingPlanGroup setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
    * Product variants associated to the selling plan group.
    */

    public ProductVariantConnection getProductVariants() {
        return (ProductVariantConnection) get("productVariants");
    }

    public SellingPlanGroup setProductVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("productVariants"), arg);
        return this;
    }

    /**
    * A count of product variants associated to the selling plan group.
    */

    public Count getProductVariantsCount() {
        return (Count) get("productVariantsCount");
    }

    public SellingPlanGroup setProductVariantsCount(Count arg) {
        optimisticData.put(getKey("productVariantsCount"), arg);
        return this;
    }

    /**
    * Products associated to the selling plan group.
    */

    public ProductConnection getProducts() {
        return (ProductConnection) get("products");
    }

    public SellingPlanGroup setProducts(ProductConnection arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
    * A count of products associated to the selling plan group.
    */

    public Count getProductsCount() {
        return (Count) get("productsCount");
    }

    public SellingPlanGroup setProductsCount(Count arg) {
        optimisticData.put(getKey("productsCount"), arg);
        return this;
    }

    /**
    * Selling plans associated to the selling plan group.
    */

    public SellingPlanConnection getSellingPlans() {
        return (SellingPlanConnection) get("sellingPlans");
    }

    public SellingPlanGroup setSellingPlans(SellingPlanConnection arg) {
        optimisticData.put(getKey("sellingPlans"), arg);
        return this;
    }

    /**
    * A summary of the policies associated to the selling plan group.
    */

    public String getSummary() {
        return (String) get("summary");
    }

    public SellingPlanGroup setSummary(String arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public SellingPlanGroup setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appId": return false;

            case "appliesToProduct": return false;

            case "appliesToProductVariant": return false;

            case "appliesToProductVariants": return false;

            case "createdAt": return false;

            case "description": return false;

            case "id": return false;

            case "merchantCode": return false;

            case "name": return false;

            case "options": return false;

            case "position": return false;

            case "productVariants": return true;

            case "productVariantsCount": return true;

            case "products": return true;

            case "productsCount": return true;

            case "sellingPlans": return true;

            case "summary": return false;

            case "translations": return true;

            default: return false;
        }
    }
}


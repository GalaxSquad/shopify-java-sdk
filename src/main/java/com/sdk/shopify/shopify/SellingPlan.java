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
* Represents how a product can be sold and purchased. Selling plans and associated records (selling
* plan groups
* and policies) are deleted 48 hours after a merchant uninstalls their subscriptions app. We recommend
* backing
* up these records if you need to restore them later.
* For more information on selling plans, refer to
* [*Creating and managing selling
* plans*](https://shopify.dev/docs/apps/selling-strategies/subscriptions/selling-plans).
*/
public class SellingPlan extends AbstractResponse<SellingPlan> implements HasMetafieldDefinitions, HasMetafields, HasPublishedTranslations, Node {
    public SellingPlan() {
    }

    public SellingPlan(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "billingPolicy": {
                    responseData.put(key, UnknownSellingPlanBillingPolicy.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "category": {
                    SellingPlanCategory optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = SellingPlanCategory.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "deliveryPolicy": {
                    responseData.put(key, UnknownSellingPlanDeliveryPolicy.create(jsonAsObject(field.getValue(), key)));

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

                case "inventoryPolicy": {
                    SellingPlanInventoryPolicy optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SellingPlanInventoryPolicy(jsonAsObject(field.getValue(), key));
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

                case "pricingPolicies": {
                    List<SellingPlanPricingPolicy> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(UnknownSellingPlanPricingPolicy.create(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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

    public SellingPlan(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "SellingPlan";
    }

    /**
    * A selling plan policy which describes the recurring billing details.
    */

    public SellingPlanBillingPolicy getBillingPolicy() {
        return (SellingPlanBillingPolicy) get("billingPolicy");
    }

    public SellingPlan setBillingPolicy(SellingPlanBillingPolicy arg) {
        optimisticData.put(getKey("billingPolicy"), arg);
        return this;
    }

    /**
    * The category used to classify the selling plan for reporting purposes.
    */

    public SellingPlanCategory getCategory() {
        return (SellingPlanCategory) get("category");
    }

    public SellingPlan setCategory(SellingPlanCategory arg) {
        optimisticData.put(getKey("category"), arg);
        return this;
    }

    /**
    * The date and time when the selling plan was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public SellingPlan setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A selling plan policy which describes the delivery details.
    */

    public SellingPlanDeliveryPolicy getDeliveryPolicy() {
        return (SellingPlanDeliveryPolicy) get("deliveryPolicy");
    }

    public SellingPlan setDeliveryPolicy(SellingPlanDeliveryPolicy arg) {
        optimisticData.put(getKey("deliveryPolicy"), arg);
        return this;
    }

    /**
    * Buyer facing string which describes the selling plan commitment.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public SellingPlan setDescription(String arg) {
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
    * When to reserve inventory for a selling plan.
    */

    public SellingPlanInventoryPolicy getInventoryPolicy() {
        return (SellingPlanInventoryPolicy) get("inventoryPolicy");
    }

    public SellingPlan setInventoryPolicy(SellingPlanInventoryPolicy arg) {
        optimisticData.put(getKey("inventoryPolicy"), arg);
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

    public SellingPlan setMetafield(Metafield arg) {
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

    public SellingPlan setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * A customer-facing description of the selling plan.
    * If your store supports multiple currencies, then don't include country-specific pricing content,
    * such as "Buy monthly, get 10$ CAD off". This field won't be converted to reflect different
    * currencies.
    */

    public String getName() {
        return (String) get("name");
    }

    public SellingPlan setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The values of all options available on the selling plan. Selling plans are grouped together in
    * Liquid when they're created by the same app, and have the same `selling_plan_group.name` and
    * `selling_plan_group.options` values.
    */

    public List<String> getOptions() {
        return (List<String>) get("options");
    }

    public SellingPlan setOptions(List<String> arg) {
        optimisticData.put(getKey("options"), arg);
        return this;
    }

    /**
    * Relative position of the selling plan for display. A lower position will be displayed before a
    * higher position.
    */

    public Integer getPosition() {
        return (Integer) get("position");
    }

    public SellingPlan setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
    * Selling plan pricing details.
    */

    public List<SellingPlanPricingPolicy> getPricingPolicies() {
        return (List<SellingPlanPricingPolicy>) get("pricingPolicies");
    }

    public SellingPlan setPricingPolicies(List<SellingPlanPricingPolicy> arg) {
        optimisticData.put(getKey("pricingPolicies"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public SellingPlan setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "billingPolicy": return false;

            case "category": return false;

            case "createdAt": return false;

            case "deliveryPolicy": return false;

            case "description": return false;

            case "id": return false;

            case "inventoryPolicy": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "name": return false;

            case "options": return false;

            case "position": return false;

            case "pricingPolicies": return false;

            case "translations": return true;

            default: return false;
        }
    }
}


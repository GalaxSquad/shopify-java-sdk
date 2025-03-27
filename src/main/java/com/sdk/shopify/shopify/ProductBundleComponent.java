// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The product's component information.
*/
public class ProductBundleComponent extends AbstractResponse<ProductBundleComponent> {
    public ProductBundleComponent() {
    }

    public ProductBundleComponent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "componentProduct": {
                    responseData.put(key, new Product(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "componentVariants": {
                    responseData.put(key, new ProductVariantConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "componentVariantsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "optionSelections": {
                    List<ProductBundleComponentOptionSelection> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductBundleComponentOptionSelection(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "quantity": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantityOption": {
                    ProductBundleComponentQuantityOption optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductBundleComponentQuantityOption(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

    public String getGraphQlTypeName() {
        return "ProductBundleComponent";
    }

    /**
    * The product that's related as a component.
    */

    public Product getComponentProduct() {
        return (Product) get("componentProduct");
    }

    public ProductBundleComponent setComponentProduct(Product arg) {
        optimisticData.put(getKey("componentProduct"), arg);
        return this;
    }

    /**
    * The list of products' variants that are components.
    */

    public ProductVariantConnection getComponentVariants() {
        return (ProductVariantConnection) get("componentVariants");
    }

    public ProductBundleComponent setComponentVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("componentVariants"), arg);
        return this;
    }

    /**
    * The number of component variants for the product component.
    */

    public Count getComponentVariantsCount() {
        return (Count) get("componentVariantsCount");
    }

    public ProductBundleComponent setComponentVariantsCount(Count arg) {
        optimisticData.put(getKey("componentVariantsCount"), arg);
        return this;
    }

    /**
    * The options in the parent and the component options they're connected to, along with the chosen
    * option values
    * that appear in the bundle.
    */

    public List<ProductBundleComponentOptionSelection> getOptionSelections() {
        return (List<ProductBundleComponentOptionSelection>) get("optionSelections");
    }

    public ProductBundleComponent setOptionSelections(List<ProductBundleComponentOptionSelection> arg) {
        optimisticData.put(getKey("optionSelections"), arg);
        return this;
    }

    /**
    * The quantity of the component product set for this bundle line.
    * It will be null if there's a quantityOption present.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ProductBundleComponent setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The quantity as option of the component product. It will be null if there's a quantity set.
    */

    public ProductBundleComponentQuantityOption getQuantityOption() {
        return (ProductBundleComponentQuantityOption) get("quantityOption");
    }

    public ProductBundleComponent setQuantityOption(ProductBundleComponentQuantityOption arg) {
        optimisticData.put(getKey("quantityOption"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "componentProduct": return true;

            case "componentVariants": return true;

            case "componentVariantsCount": return true;

            case "optionSelections": return true;

            case "quantity": return false;

            case "quantityOption": return true;

            default: return false;
        }
    }
}


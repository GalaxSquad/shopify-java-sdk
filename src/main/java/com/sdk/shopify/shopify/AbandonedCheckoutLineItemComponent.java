// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The list of line item components that belong to a line item.
*/
public class AbandonedCheckoutLineItemComponent extends AbstractResponse<AbandonedCheckoutLineItemComponent> {
    public AbandonedCheckoutLineItemComponent() {
    }

    public AbandonedCheckoutLineItemComponent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "variantTitle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "AbandonedCheckoutLineItemComponent";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public AbandonedCheckoutLineItemComponent setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The variant image associated with the line item component.
    * NULL if the variant associated doesn't have an image.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public AbandonedCheckoutLineItemComponent setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * The quantity of the line item component.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public AbandonedCheckoutLineItemComponent setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * Title of the line item component.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public AbandonedCheckoutLineItemComponent setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The name of the variant.
    */

    public String getVariantTitle() {
        return (String) get("variantTitle");
    }

    public AbandonedCheckoutLineItemComponent setVariantTitle(String arg) {
        optimisticData.put(getKey("variantTitle"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "image": return true;

            case "quantity": return false;

            case "title": return false;

            case "variantTitle": return false;

            default: return false;
        }
    }
}


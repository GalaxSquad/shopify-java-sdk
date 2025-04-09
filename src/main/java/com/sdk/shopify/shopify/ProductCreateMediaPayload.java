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
* Return type for `productCreateMedia` mutation.
*/
public class ProductCreateMediaPayload extends AbstractResponse<ProductCreateMediaPayload> {
    public ProductCreateMediaPayload() {
    }

    public ProductCreateMediaPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "media": {
                    List<Media> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Media> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(UnknownMedia.create(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "mediaUserErrors": {
                    List<MediaUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MediaUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "product": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
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
        return "ProductCreateMediaPayload";
    }

    /**
    * The newly created media.
    */

    public List<Media> getMedia() {
        return (List<Media>) get("media");
    }

    public ProductCreateMediaPayload setMedia(List<Media> arg) {
        optimisticData.put(getKey("media"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MediaUserError> getMediaUserErrors() {
        return (List<MediaUserError>) get("mediaUserErrors");
    }

    public ProductCreateMediaPayload setMediaUserErrors(List<MediaUserError> arg) {
        optimisticData.put(getKey("mediaUserErrors"), arg);
        return this;
    }

    /**
    * The product associated with the media.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductCreateMediaPayload setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "media": return false;

            case "mediaUserErrors": return true;

            case "product": return true;

            default: return false;
        }
    }
}


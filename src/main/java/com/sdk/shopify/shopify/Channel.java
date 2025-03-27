// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A channel represents an app where you sell a group of products and collections.
* A channel can be a platform or marketplace such as Facebook or Pinterest, an online store, or POS.
*/
public class Channel extends AbstractResponse<Channel> implements Node {
    public Channel() {
    }

    public Channel(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "app": {
                    responseData.put(key, new App(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "collectionPublicationsV3": {
                    responseData.put(key, new ResourcePublicationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "collections": {
                    responseData.put(key, new CollectionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "hasCollection": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "productPublicationsV3": {
                    responseData.put(key, new ResourcePublicationConnection(jsonAsObject(field.getValue(), key)));

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

                case "supportsFuturePublishing": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

    public Channel(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Channel";
    }

    /**
    * The underlying app used by the channel.
    */

    public App getApp() {
        return (App) get("app");
    }

    public Channel setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The collection publications for the list of collections published to the channel.
    */

    public ResourcePublicationConnection getCollectionPublicationsV3() {
        return (ResourcePublicationConnection) get("collectionPublicationsV3");
    }

    public Channel setCollectionPublicationsV3(ResourcePublicationConnection arg) {
        optimisticData.put(getKey("collectionPublicationsV3"), arg);
        return this;
    }

    /**
    * The list of collections published to the channel.
    */

    public CollectionConnection getCollections() {
        return (CollectionConnection) get("collections");
    }

    public Channel setCollections(CollectionConnection arg) {
        optimisticData.put(getKey("collections"), arg);
        return this;
    }

    /**
    * Whether the collection is available to the channel.
    */

    public Boolean getHasCollection() {
        return (Boolean) get("hasCollection");
    }

    public Channel setHasCollection(Boolean arg) {
        optimisticData.put(getKey("hasCollection"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The name of the channel.
    */

    public String getName() {
        return (String) get("name");
    }

    public Channel setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The product publications for the list of products published to the channel.
    */

    public ResourcePublicationConnection getProductPublicationsV3() {
        return (ResourcePublicationConnection) get("productPublicationsV3");
    }

    public Channel setProductPublicationsV3(ResourcePublicationConnection arg) {
        optimisticData.put(getKey("productPublicationsV3"), arg);
        return this;
    }

    /**
    * The list of products published to the channel.
    */

    public ProductConnection getProducts() {
        return (ProductConnection) get("products");
    }

    public Channel setProducts(ProductConnection arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
    * The count of products published to the channel. Limited to a maximum of 10000.
    */

    public Count getProductsCount() {
        return (Count) get("productsCount");
    }

    public Channel setProductsCount(Count arg) {
        optimisticData.put(getKey("productsCount"), arg);
        return this;
    }

    /**
    * Whether the channel supports future publishing.
    */

    public Boolean getSupportsFuturePublishing() {
        return (Boolean) get("supportsFuturePublishing");
    }

    public Channel setSupportsFuturePublishing(Boolean arg) {
        optimisticData.put(getKey("supportsFuturePublishing"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "collectionPublicationsV3": return true;

            case "collections": return true;

            case "hasCollection": return false;

            case "id": return false;

            case "name": return false;

            case "productPublicationsV3": return true;

            case "products": return true;

            case "productsCount": return true;

            case "supportsFuturePublishing": return false;

            default: return false;
        }
    }
}


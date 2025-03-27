// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* A publication is a group of products and collections that is published to an app.
*/
public class Publication extends AbstractResponse<Publication> implements Node {
    public Publication() {
    }

    public Publication(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "autoPublish": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "catalog": {
                    Catalog optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCatalog.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "operation": {
                    PublicationOperation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownPublicationOperation.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

    public Publication(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Publication";
    }

    /**
    * Whether new products are automatically published to this publication.
    */

    public Boolean getAutoPublish() {
        return (Boolean) get("autoPublish");
    }

    public Publication setAutoPublish(Boolean arg) {
        optimisticData.put(getKey("autoPublish"), arg);
        return this;
    }

    /**
    * The catalog associated with the publication.
    */

    public Catalog getCatalog() {
        return (Catalog) get("catalog");
    }

    public Publication setCatalog(Catalog arg) {
        optimisticData.put(getKey("catalog"), arg);
        return this;
    }

    /**
    * The collection publications for the list of collections published to the publication.
    */

    public ResourcePublicationConnection getCollectionPublicationsV3() {
        return (ResourcePublicationConnection) get("collectionPublicationsV3");
    }

    public Publication setCollectionPublicationsV3(ResourcePublicationConnection arg) {
        optimisticData.put(getKey("collectionPublicationsV3"), arg);
        return this;
    }

    /**
    * The list of collections published to the publication.
    */

    public CollectionConnection getCollections() {
        return (CollectionConnection) get("collections");
    }

    public Publication setCollections(CollectionConnection arg) {
        optimisticData.put(getKey("collections"), arg);
        return this;
    }

    /**
    * Whether the collection is available to the publication.
    */

    public Boolean getHasCollection() {
        return (Boolean) get("hasCollection");
    }

    public Publication setHasCollection(Boolean arg) {
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
    * A background operation associated with this publication.
    */

    public PublicationOperation getOperation() {
        return (PublicationOperation) get("operation");
    }

    public Publication setOperation(PublicationOperation arg) {
        optimisticData.put(getKey("operation"), arg);
        return this;
    }

    /**
    * The product publications for the list of products published to the publication.
    */

    public ResourcePublicationConnection getProductPublicationsV3() {
        return (ResourcePublicationConnection) get("productPublicationsV3");
    }

    public Publication setProductPublicationsV3(ResourcePublicationConnection arg) {
        optimisticData.put(getKey("productPublicationsV3"), arg);
        return this;
    }

    /**
    * The list of products published to the publication.
    */

    public ProductConnection getProducts() {
        return (ProductConnection) get("products");
    }

    public Publication setProducts(ProductConnection arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
    * Whether the publication supports future publishing.
    */

    public Boolean getSupportsFuturePublishing() {
        return (Boolean) get("supportsFuturePublishing");
    }

    public Publication setSupportsFuturePublishing(Boolean arg) {
        optimisticData.put(getKey("supportsFuturePublishing"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "autoPublish": return false;

            case "catalog": return false;

            case "collectionPublicationsV3": return true;

            case "collections": return true;

            case "hasCollection": return false;

            case "id": return false;

            case "operation": return false;

            case "productPublicationsV3": return true;

            case "products": return true;

            case "supportsFuturePublishing": return false;

            default: return false;
        }
    }
}


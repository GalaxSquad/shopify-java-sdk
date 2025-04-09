// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A combined listing of products.
*/
public class CombinedListing extends AbstractResponse<CombinedListing> {
    public CombinedListing() {
    }

    public CombinedListing(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "combinedListingChildren": {
                    responseData.put(key, new CombinedListingChildConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "parentProduct": {
                    responseData.put(key, new Product(jsonAsObject(field.getValue(), key)));

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
        return "CombinedListing";
    }

    /**
    * A list of child products in the combined listing.
    */

    public CombinedListingChildConnection getCombinedListingChildren() {
        return (CombinedListingChildConnection) get("combinedListingChildren");
    }

    public CombinedListing setCombinedListingChildren(CombinedListingChildConnection arg) {
        optimisticData.put(getKey("combinedListingChildren"), arg);
        return this;
    }

    /**
    * The parent product.
    */

    public Product getParentProduct() {
        return (Product) get("parentProduct");
    }

    public CombinedListing setParentProduct(Product arg) {
        optimisticData.put(getKey("parentProduct"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "combinedListingChildren": return true;

            case "parentProduct": return true;

            default: return false;
        }
    }
}


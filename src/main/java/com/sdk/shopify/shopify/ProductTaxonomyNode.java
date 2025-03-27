// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a [Shopify product
* taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17)
* node.
*/
public class ProductTaxonomyNode extends AbstractResponse<ProductTaxonomyNode> implements Node {
    public ProductTaxonomyNode() {
    }

    public ProductTaxonomyNode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fullName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "isLeaf": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isRoot": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "name": {
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

    public ProductTaxonomyNode(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ProductTaxonomyNode";
    }

    /**
    * The full name of the product taxonomy node. For example,  Animals & Pet Supplies > Pet Supplies >
    * Dog Supplies > Dog Beds.
    */

    public String getFullName() {
        return (String) get("fullName");
    }

    public ProductTaxonomyNode setFullName(String arg) {
        optimisticData.put(getKey("fullName"), arg);
        return this;
    }

    /**
    * The ID of the product taxonomy node.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether the node is a leaf node.
    */

    public Boolean getIsLeaf() {
        return (Boolean) get("isLeaf");
    }

    public ProductTaxonomyNode setIsLeaf(Boolean arg) {
        optimisticData.put(getKey("isLeaf"), arg);
        return this;
    }

    /**
    * Whether the node is a root node.
    */

    public Boolean getIsRoot() {
        return (Boolean) get("isRoot");
    }

    public ProductTaxonomyNode setIsRoot(Boolean arg) {
        optimisticData.put(getKey("isRoot"), arg);
        return this;
    }

    /**
    * The name of the product taxonomy node. For example, Dog Beds.
    */

    public String getName() {
        return (String) get("name");
    }

    public ProductTaxonomyNode setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fullName": return false;

            case "id": return false;

            case "isLeaf": return false;

            case "isRoot": return false;

            case "name": return false;

            default: return false;
        }
    }
}


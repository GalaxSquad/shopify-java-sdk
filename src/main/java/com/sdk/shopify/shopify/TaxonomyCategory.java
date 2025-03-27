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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The details of a specific product category within the [Shopify product
* taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
*/
public class TaxonomyCategory extends AbstractResponse<TaxonomyCategory> implements Node {
    public TaxonomyCategory() {
    }

    public TaxonomyCategory(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "ancestorIds": {
                    List<ID> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ID(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "attributes": {
                    responseData.put(key, new TaxonomyCategoryAttributeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "childrenIds": {
                    List<ID> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ID(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "fullName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "isArchived": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "level": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "parentId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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

    public TaxonomyCategory(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "TaxonomyCategory";
    }

    /**
    * The IDs of the category's ancestor categories.
    */

    public List<ID> getAncestorIds() {
        return (List<ID>) get("ancestorIds");
    }

    public TaxonomyCategory setAncestorIds(List<ID> arg) {
        optimisticData.put(getKey("ancestorIds"), arg);
        return this;
    }

    /**
    * The attributes of the taxonomy category.
    */

    public TaxonomyCategoryAttributeConnection getAttributes() {
        return (TaxonomyCategoryAttributeConnection) get("attributes");
    }

    public TaxonomyCategory setAttributes(TaxonomyCategoryAttributeConnection arg) {
        optimisticData.put(getKey("attributes"), arg);
        return this;
    }

    /**
    * The IDs of the category's child categories.
    */

    public List<ID> getChildrenIds() {
        return (List<ID>) get("childrenIds");
    }

    public TaxonomyCategory setChildrenIds(List<ID> arg) {
        optimisticData.put(getKey("childrenIds"), arg);
        return this;
    }

    /**
    * The full name of the taxonomy category. For example, Animals & Pet Supplies > Pet Supplies > Dog
    * Supplies > Dog Beds.
    */

    public String getFullName() {
        return (String) get("fullName");
    }

    public TaxonomyCategory setFullName(String arg) {
        optimisticData.put(getKey("fullName"), arg);
        return this;
    }

    /**
    * The globally-unique ID of the TaxonomyCategory.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether the category is archived. The default value is `false`.
    */

    public Boolean getIsArchived() {
        return (Boolean) get("isArchived");
    }

    public TaxonomyCategory setIsArchived(Boolean arg) {
        optimisticData.put(getKey("isArchived"), arg);
        return this;
    }

    /**
    * Whether the category is a leaf category. A leaf category doesn't have any subcategories beneath it.
    * For example, in Animals & Pet Supplies > Pet Supplies > Dog Supplies > Dog Treadmills, Dog
    * Treadmills is a leaf category. The value is `true` when there are no `childrenIds` specified.
    */

    public Boolean getIsLeaf() {
        return (Boolean) get("isLeaf");
    }

    public TaxonomyCategory setIsLeaf(Boolean arg) {
        optimisticData.put(getKey("isLeaf"), arg);
        return this;
    }

    /**
    * Whether the category is a root category. A root category is at the top level of the category
    * hierarchy and doesn't have a parent category. For example, Animals & Pet Supplies. The value is
    * `true` when there's no `parentId` specified.
    */

    public Boolean getIsRoot() {
        return (Boolean) get("isRoot");
    }

    public TaxonomyCategory setIsRoot(Boolean arg) {
        optimisticData.put(getKey("isRoot"), arg);
        return this;
    }

    /**
    * The level of the category in the taxonomy tree. Levels indicate the depth of the category from the
    * root. For example, in Animals & Pet Supplies > Pet Supplies > Dog Supplies, Animals & Pet Supplies
    * is at level 1, Animals & Pet Supplies > Pet Supplies is at level 2, and Animals & Pet Supplies > Pet
    * Supplies > Dog Supplies is at level 3.
    */

    public Integer getLevel() {
        return (Integer) get("level");
    }

    public TaxonomyCategory setLevel(Integer arg) {
        optimisticData.put(getKey("level"), arg);
        return this;
    }

    /**
    * The name of the taxonomy category. For example, Dog Beds.
    */

    public String getName() {
        return (String) get("name");
    }

    public TaxonomyCategory setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The ID of the category's parent category.
    */

    public ID getParentId() {
        return (ID) get("parentId");
    }

    public TaxonomyCategory setParentId(ID arg) {
        optimisticData.put(getKey("parentId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "ancestorIds": return false;

            case "attributes": return true;

            case "childrenIds": return false;

            case "fullName": return false;

            case "id": return false;

            case "isArchived": return false;

            case "isLeaf": return false;

            case "isRoot": return false;

            case "level": return false;

            case "name": return false;

            case "parentId": return false;

            default: return false;
        }
    }
}


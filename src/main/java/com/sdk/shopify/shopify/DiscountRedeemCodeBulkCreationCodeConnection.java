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
* An auto-generated type for paginating through multiple DiscountRedeemCodeBulkCreationCodes.
*/
public class DiscountRedeemCodeBulkCreationCodeConnection extends AbstractResponse<DiscountRedeemCodeBulkCreationCodeConnection> {
    public DiscountRedeemCodeBulkCreationCodeConnection() {
    }

    public DiscountRedeemCodeBulkCreationCodeConnection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "edges": {
                    List<DiscountRedeemCodeBulkCreationCodeEdge> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DiscountRedeemCodeBulkCreationCodeEdge(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "nodes": {
                    List<DiscountRedeemCodeBulkCreationCode> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DiscountRedeemCodeBulkCreationCode(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "pageInfo": {
                    responseData.put(key, new PageInfo(jsonAsObject(field.getValue(), key)));

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
        return "DiscountRedeemCodeBulkCreationCodeConnection";
    }

    /**
    * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor
    * and the node.
    */

    public List<DiscountRedeemCodeBulkCreationCodeEdge> getEdges() {
        return (List<DiscountRedeemCodeBulkCreationCodeEdge>) get("edges");
    }

    public DiscountRedeemCodeBulkCreationCodeConnection setEdges(List<DiscountRedeemCodeBulkCreationCodeEdge> arg) {
        optimisticData.put(getKey("edges"), arg);
        return this;
    }

    /**
    * A list of nodes that are contained in DiscountRedeemCodeBulkCreationCodeEdge. You can fetch data
    * about an individual node, or you can follow the edges to fetch data about a collection of related
    * nodes. At each node, you specify the fields that you want to retrieve.
    */

    public List<DiscountRedeemCodeBulkCreationCode> getNodes() {
        return (List<DiscountRedeemCodeBulkCreationCode>) get("nodes");
    }

    public DiscountRedeemCodeBulkCreationCodeConnection setNodes(List<DiscountRedeemCodeBulkCreationCode> arg) {
        optimisticData.put(getKey("nodes"), arg);
        return this;
    }

    /**
    * An object that’s used to retrieve [cursor
    * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
    */

    public PageInfo getPageInfo() {
        return (PageInfo) get("pageInfo");
    }

    public DiscountRedeemCodeBulkCreationCodeConnection setPageInfo(PageInfo arg) {
        optimisticData.put(getKey("pageInfo"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "edges": return true;

            case "nodes": return true;

            case "pageInfo": return true;

            default: return false;
        }
    }
}


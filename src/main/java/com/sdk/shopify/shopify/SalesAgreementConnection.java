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
* An auto-generated type for paginating through multiple SalesAgreements.
*/
public class SalesAgreementConnection extends AbstractResponse<SalesAgreementConnection> {
    public SalesAgreementConnection() {
    }

    public SalesAgreementConnection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "edges": {
                    List<SalesAgreementEdge> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SalesAgreementEdge(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "nodes": {
                    List<SalesAgreement> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(UnknownSalesAgreement.create(jsonAsObject(element1, key)));
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
        return "SalesAgreementConnection";
    }

    /**
    * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor
    * and the node.
    */

    public List<SalesAgreementEdge> getEdges() {
        return (List<SalesAgreementEdge>) get("edges");
    }

    public SalesAgreementConnection setEdges(List<SalesAgreementEdge> arg) {
        optimisticData.put(getKey("edges"), arg);
        return this;
    }

    /**
    * A list of nodes that are contained in SalesAgreementEdge. You can fetch data about an individual
    * node, or you can follow the edges to fetch data about a collection of related nodes. At each node,
    * you specify the fields that you want to retrieve.
    */

    public List<SalesAgreement> getNodes() {
        return (List<SalesAgreement>) get("nodes");
    }

    public SalesAgreementConnection setNodes(List<SalesAgreement> arg) {
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

    public SalesAgreementConnection setPageInfo(PageInfo arg) {
        optimisticData.put(getKey("pageInfo"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "edges": return true;

            case "nodes": return false;

            case "pageInfo": return true;

            default: return false;
        }
    }
}


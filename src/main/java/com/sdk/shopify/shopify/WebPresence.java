// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* This can be a domain (e.g. `example.ca`), subdomain (e.g. `ca.example.com`), or subfolders of the
* primary
* domain (e.g. `example.com/en-ca`). Each web presence comprises one or more language
* variants.
* Note: while the domain/subfolders defined by a web presence are not applicable to
* custom storefronts, which must manage their own domains and routing, the languages chosen
* here do govern [the languages available on the Storefront
* API](https://shopify.dev/custom-storefronts/internationalization/multiple-languages) for the
* countries
* using this web presence.
*/
public class WebPresence extends AbstractResponse<WebPresence> implements Node {
    public WebPresence() {
    }

    public WebPresence(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "alternateLocales": {
                    List<ShopLocale> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopLocale(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "defaultLocale": {
                    responseData.put(key, new ShopLocale(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "domain": {
                    Domain optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Domain(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "markets": {
                    MarketConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "rootUrls": {
                    List<WebPresenceRootUrl> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new WebPresenceRootUrl(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "subfolderSuffix": {
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

    public WebPresence(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "WebPresence";
    }

    /**
    * The ShopLocale object for the alternate locales. When a domain is used, these locales will be
    * available as language-specific subfolders. For example, if English is an
    * alternate locale, and `example.ca` is the domain, then
    * `example.ca/en` will load in English.
    */

    public List<ShopLocale> getAlternateLocales() {
        return (List<ShopLocale>) get("alternateLocales");
    }

    public WebPresence setAlternateLocales(List<ShopLocale> arg) {
        optimisticData.put(getKey("alternateLocales"), arg);
        return this;
    }

    /**
    * The ShopLocale object for the default locale. When a domain is used, this is the locale that will
    * be used when the domain root is accessed. For example, if French is the default locale,
    * and `example.ca` is the domain, then `example.ca` will load in French.
    */

    public ShopLocale getDefaultLocale() {
        return (ShopLocale) get("defaultLocale");
    }

    public WebPresence setDefaultLocale(ShopLocale arg) {
        optimisticData.put(getKey("defaultLocale"), arg);
        return this;
    }

    /**
    * The web presence’s domain. This field will be null if `subfolderSuffix` is present.
    */

    public Domain getDomain() {
        return (Domain) get("domain");
    }

    public WebPresence setDomain(Domain arg) {
        optimisticData.put(getKey("domain"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The associated markets for this web presence.
    */

    public MarketConnection getMarkets() {
        return (MarketConnection) get("markets");
    }

    public WebPresence setMarkets(MarketConnection arg) {
        optimisticData.put(getKey("markets"), arg);
        return this;
    }

    /**
    * The list of root URLs for each of the web presence’s locales.
    */

    public List<WebPresenceRootUrl> getRootUrls() {
        return (List<WebPresenceRootUrl>) get("rootUrls");
    }

    public WebPresence setRootUrls(List<WebPresenceRootUrl> arg) {
        optimisticData.put(getKey("rootUrls"), arg);
        return this;
    }

    /**
    * The suffix of the subfolders defined by the web presence.
    * Example: in `/en-us` the subfolder suffix is `us`.
    * This field will be null if `domain` isn't null.
    */

    public String getSubfolderSuffix() {
        return (String) get("subfolderSuffix");
    }

    public WebPresence setSubfolderSuffix(String arg) {
        optimisticData.put(getKey("subfolderSuffix"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alternateLocales": return true;

            case "defaultLocale": return true;

            case "domain": return true;

            case "id": return false;

            case "markets": return true;

            case "rootUrls": return true;

            case "subfolderSuffix": return false;

            default: return false;
        }
    }
}


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

import java.io.Serializable;
import java.util.List;

public class CollectionInput implements Serializable {
    private Input<String> descriptionHtml = Input.undefined();

    private Input<String> handle = Input.undefined();

    private Input<ID> id = Input.undefined();

    private Input<ImageInput> image = Input.undefined();

    private Input<List<ID>> products = Input.undefined();

    private Input<CollectionRuleSetInput> ruleSet = Input.undefined();

    private Input<String> templateSuffix = Input.undefined();

    private Input<CollectionSortOrder> sortOrder = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<SEOInput> seo = Input.undefined();

    private Input<Boolean> redirectNewHandle = Input.undefined();

    public String getDescriptionHtml() {
        return descriptionHtml.getValue();
    }

    public Input<String> getDescriptionHtmlInput() {
        return descriptionHtml;
    }

    public CollectionInput setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = Input.optional(descriptionHtml);
        return this;
    }

    public CollectionInput setDescriptionHtmlInput(Input<String> descriptionHtml) {
        if (descriptionHtml == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.descriptionHtml = descriptionHtml;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public CollectionInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public CollectionInput setHandleInput(Input<String> handle) {
        if (handle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.handle = handle;
        return this;
    }

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public CollectionInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public CollectionInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public ImageInput getImage() {
        return image.getValue();
    }

    public Input<ImageInput> getImageInput() {
        return image;
    }

    public CollectionInput setImage(ImageInput image) {
        this.image = Input.optional(image);
        return this;
    }

    public CollectionInput setImageInput(Input<ImageInput> image) {
        if (image == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.image = image;
        return this;
    }

    public List<ID> getProducts() {
        return products.getValue();
    }

    public Input<List<ID>> getProductsInput() {
        return products;
    }

    public CollectionInput setProducts(List<ID> products) {
        this.products = Input.optional(products);
        return this;
    }

    public CollectionInput setProductsInput(Input<List<ID>> products) {
        if (products == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.products = products;
        return this;
    }

    public CollectionRuleSetInput getRuleSet() {
        return ruleSet.getValue();
    }

    public Input<CollectionRuleSetInput> getRuleSetInput() {
        return ruleSet;
    }

    public CollectionInput setRuleSet(CollectionRuleSetInput ruleSet) {
        this.ruleSet = Input.optional(ruleSet);
        return this;
    }

    public CollectionInput setRuleSetInput(Input<CollectionRuleSetInput> ruleSet) {
        if (ruleSet == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ruleSet = ruleSet;
        return this;
    }

    public String getTemplateSuffix() {
        return templateSuffix.getValue();
    }

    public Input<String> getTemplateSuffixInput() {
        return templateSuffix;
    }

    public CollectionInput setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = Input.optional(templateSuffix);
        return this;
    }

    public CollectionInput setTemplateSuffixInput(Input<String> templateSuffix) {
        if (templateSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.templateSuffix = templateSuffix;
        return this;
    }

    public CollectionSortOrder getSortOrder() {
        return sortOrder.getValue();
    }

    public Input<CollectionSortOrder> getSortOrderInput() {
        return sortOrder;
    }

    public CollectionInput setSortOrder(CollectionSortOrder sortOrder) {
        this.sortOrder = Input.optional(sortOrder);
        return this;
    }

    public CollectionInput setSortOrderInput(Input<CollectionSortOrder> sortOrder) {
        if (sortOrder == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sortOrder = sortOrder;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public CollectionInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public CollectionInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public CollectionInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public CollectionInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public SEOInput getSeo() {
        return seo.getValue();
    }

    public Input<SEOInput> getSeoInput() {
        return seo;
    }

    public CollectionInput setSeo(SEOInput seo) {
        this.seo = Input.optional(seo);
        return this;
    }

    public CollectionInput setSeoInput(Input<SEOInput> seo) {
        if (seo == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.seo = seo;
        return this;
    }

    public Boolean getRedirectNewHandle() {
        return redirectNewHandle.getValue();
    }

    public Input<Boolean> getRedirectNewHandleInput() {
        return redirectNewHandle;
    }

    public CollectionInput setRedirectNewHandle(Boolean redirectNewHandle) {
        this.redirectNewHandle = Input.optional(redirectNewHandle);
        return this;
    }

    public CollectionInput setRedirectNewHandleInput(Input<Boolean> redirectNewHandle) {
        if (redirectNewHandle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.redirectNewHandle = redirectNewHandle;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.descriptionHtml.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("descriptionHtml:");
            if (descriptionHtml.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, descriptionHtml.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.handle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("handle:");
            if (handle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, handle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.image.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("image:");
            if (image.getValue() != null) {
                image.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.products.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("products:");
            if (products.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : products.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.ruleSet.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ruleSet:");
            if (ruleSet.getValue() != null) {
                ruleSet.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.templateSuffix.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("templateSuffix:");
            if (templateSuffix.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, templateSuffix.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sortOrder.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sortOrder:");
            if (sortOrder.getValue() != null) {
                _queryBuilder.append(sortOrder.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : metafields.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.seo.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("seo:");
            if (seo.getValue() != null) {
                seo.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.redirectNewHandle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("redirectNewHandle:");
            if (redirectNewHandle.getValue() != null) {
                _queryBuilder.append(redirectNewHandle.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

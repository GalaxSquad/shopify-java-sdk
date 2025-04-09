// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ProductInput implements Serializable {
    private Input<String> descriptionHtml = Input.undefined();

    private Input<String> handle = Input.undefined();

    private Input<SEOInput> seo = Input.undefined();

    private Input<String> productType = Input.undefined();

    private Input<ID> category = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<String> templateSuffix = Input.undefined();

    private Input<String> giftCardTemplateSuffix = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<String> vendor = Input.undefined();

    private Input<Boolean> giftCard = Input.undefined();

    private Input<Boolean> redirectNewHandle = Input.undefined();

    private Input<List<ID>> collectionsToJoin = Input.undefined();

    private Input<List<ID>> collectionsToLeave = Input.undefined();

    private Input<CombinedListingsRole> combinedListingRole = Input.undefined();

    private Input<ID> id = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<List<OptionCreateInput>> productOptions = Input.undefined();

    private Input<ProductStatus> status = Input.undefined();

    private Input<Boolean> requiresSellingPlan = Input.undefined();

    private Input<ProductClaimOwnershipInput> claimOwnership = Input.undefined();

    public String getDescriptionHtml() {
        return descriptionHtml.getValue();
    }

    public Input<String> getDescriptionHtmlInput() {
        return descriptionHtml;
    }

    public ProductInput setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = Input.optional(descriptionHtml);
        return this;
    }

    public ProductInput setDescriptionHtmlInput(Input<String> descriptionHtml) {
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

    public ProductInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public ProductInput setHandleInput(Input<String> handle) {
        if (handle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.handle = handle;
        return this;
    }

    public SEOInput getSeo() {
        return seo.getValue();
    }

    public Input<SEOInput> getSeoInput() {
        return seo;
    }

    public ProductInput setSeo(SEOInput seo) {
        this.seo = Input.optional(seo);
        return this;
    }

    public ProductInput setSeoInput(Input<SEOInput> seo) {
        if (seo == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.seo = seo;
        return this;
    }

    public String getProductType() {
        return productType.getValue();
    }

    public Input<String> getProductTypeInput() {
        return productType;
    }

    public ProductInput setProductType(String productType) {
        this.productType = Input.optional(productType);
        return this;
    }

    public ProductInput setProductTypeInput(Input<String> productType) {
        if (productType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productType = productType;
        return this;
    }

    public ID getCategory() {
        return category.getValue();
    }

    public Input<ID> getCategoryInput() {
        return category;
    }

    public ProductInput setCategory(ID category) {
        this.category = Input.optional(category);
        return this;
    }

    public ProductInput setCategoryInput(Input<ID> category) {
        if (category == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.category = category;
        return this;
    }

    public List<String> getTags() {
        return tags.getValue();
    }

    public Input<List<String>> getTagsInput() {
        return tags;
    }

    public ProductInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public ProductInput setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public String getTemplateSuffix() {
        return templateSuffix.getValue();
    }

    public Input<String> getTemplateSuffixInput() {
        return templateSuffix;
    }

    public ProductInput setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = Input.optional(templateSuffix);
        return this;
    }

    public ProductInput setTemplateSuffixInput(Input<String> templateSuffix) {
        if (templateSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.templateSuffix = templateSuffix;
        return this;
    }

    public String getGiftCardTemplateSuffix() {
        return giftCardTemplateSuffix.getValue();
    }

    public Input<String> getGiftCardTemplateSuffixInput() {
        return giftCardTemplateSuffix;
    }

    public ProductInput setGiftCardTemplateSuffix(String giftCardTemplateSuffix) {
        this.giftCardTemplateSuffix = Input.optional(giftCardTemplateSuffix);
        return this;
    }

    public ProductInput setGiftCardTemplateSuffixInput(Input<String> giftCardTemplateSuffix) {
        if (giftCardTemplateSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftCardTemplateSuffix = giftCardTemplateSuffix;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public ProductInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public ProductInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public String getVendor() {
        return vendor.getValue();
    }

    public Input<String> getVendorInput() {
        return vendor;
    }

    public ProductInput setVendor(String vendor) {
        this.vendor = Input.optional(vendor);
        return this;
    }

    public ProductInput setVendorInput(Input<String> vendor) {
        if (vendor == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.vendor = vendor;
        return this;
    }

    public Boolean getGiftCard() {
        return giftCard.getValue();
    }

    public Input<Boolean> getGiftCardInput() {
        return giftCard;
    }

    public ProductInput setGiftCard(Boolean giftCard) {
        this.giftCard = Input.optional(giftCard);
        return this;
    }

    public ProductInput setGiftCardInput(Input<Boolean> giftCard) {
        if (giftCard == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftCard = giftCard;
        return this;
    }

    public Boolean getRedirectNewHandle() {
        return redirectNewHandle.getValue();
    }

    public Input<Boolean> getRedirectNewHandleInput() {
        return redirectNewHandle;
    }

    public ProductInput setRedirectNewHandle(Boolean redirectNewHandle) {
        this.redirectNewHandle = Input.optional(redirectNewHandle);
        return this;
    }

    public ProductInput setRedirectNewHandleInput(Input<Boolean> redirectNewHandle) {
        if (redirectNewHandle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.redirectNewHandle = redirectNewHandle;
        return this;
    }

    public List<ID> getCollectionsToJoin() {
        return collectionsToJoin.getValue();
    }

    public Input<List<ID>> getCollectionsToJoinInput() {
        return collectionsToJoin;
    }

    public ProductInput setCollectionsToJoin(List<ID> collectionsToJoin) {
        this.collectionsToJoin = Input.optional(collectionsToJoin);
        return this;
    }

    public ProductInput setCollectionsToJoinInput(Input<List<ID>> collectionsToJoin) {
        if (collectionsToJoin == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.collectionsToJoin = collectionsToJoin;
        return this;
    }

    public List<ID> getCollectionsToLeave() {
        return collectionsToLeave.getValue();
    }

    public Input<List<ID>> getCollectionsToLeaveInput() {
        return collectionsToLeave;
    }

    public ProductInput setCollectionsToLeave(List<ID> collectionsToLeave) {
        this.collectionsToLeave = Input.optional(collectionsToLeave);
        return this;
    }

    public ProductInput setCollectionsToLeaveInput(Input<List<ID>> collectionsToLeave) {
        if (collectionsToLeave == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.collectionsToLeave = collectionsToLeave;
        return this;
    }

    public CombinedListingsRole getCombinedListingRole() {
        return combinedListingRole.getValue();
    }

    public Input<CombinedListingsRole> getCombinedListingRoleInput() {
        return combinedListingRole;
    }

    public ProductInput setCombinedListingRole(CombinedListingsRole combinedListingRole) {
        this.combinedListingRole = Input.optional(combinedListingRole);
        return this;
    }

    public ProductInput setCombinedListingRoleInput(Input<CombinedListingsRole> combinedListingRole) {
        if (combinedListingRole == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.combinedListingRole = combinedListingRole;
        return this;
    }

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public ProductInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public ProductInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public ProductInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public ProductInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public List<OptionCreateInput> getProductOptions() {
        return productOptions.getValue();
    }

    public Input<List<OptionCreateInput>> getProductOptionsInput() {
        return productOptions;
    }

    public ProductInput setProductOptions(List<OptionCreateInput> productOptions) {
        this.productOptions = Input.optional(productOptions);
        return this;
    }

    public ProductInput setProductOptionsInput(Input<List<OptionCreateInput>> productOptions) {
        if (productOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productOptions = productOptions;
        return this;
    }

    public ProductStatus getStatus() {
        return status.getValue();
    }

    public Input<ProductStatus> getStatusInput() {
        return status;
    }

    public ProductInput setStatus(ProductStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public ProductInput setStatusInput(Input<ProductStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public Boolean getRequiresSellingPlan() {
        return requiresSellingPlan.getValue();
    }

    public Input<Boolean> getRequiresSellingPlanInput() {
        return requiresSellingPlan;
    }

    public ProductInput setRequiresSellingPlan(Boolean requiresSellingPlan) {
        this.requiresSellingPlan = Input.optional(requiresSellingPlan);
        return this;
    }

    public ProductInput setRequiresSellingPlanInput(Input<Boolean> requiresSellingPlan) {
        if (requiresSellingPlan == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requiresSellingPlan = requiresSellingPlan;
        return this;
    }

    public ProductClaimOwnershipInput getClaimOwnership() {
        return claimOwnership.getValue();
    }

    public Input<ProductClaimOwnershipInput> getClaimOwnershipInput() {
        return claimOwnership;
    }

    public ProductInput setClaimOwnership(ProductClaimOwnershipInput claimOwnership) {
        this.claimOwnership = Input.optional(claimOwnership);
        return this;
    }

    public ProductInput setClaimOwnershipInput(Input<ProductClaimOwnershipInput> claimOwnership) {
        if (claimOwnership == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.claimOwnership = claimOwnership;
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

        if (this.productType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productType:");
            if (productType.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, productType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.category.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("category:");
            if (category.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, category.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.tags.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tags:");
            if (tags.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : tags.getValue()) {
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

        if (this.giftCardTemplateSuffix.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("giftCardTemplateSuffix:");
            if (giftCardTemplateSuffix.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, giftCardTemplateSuffix.getValue().toString());
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

        if (this.vendor.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("vendor:");
            if (vendor.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, vendor.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.giftCard.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("giftCard:");
            if (giftCard.getValue() != null) {
                _queryBuilder.append(giftCard.getValue());
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

        if (this.collectionsToJoin.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("collectionsToJoin:");
            if (collectionsToJoin.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : collectionsToJoin.getValue()) {
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

        if (this.collectionsToLeave.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("collectionsToLeave:");
            if (collectionsToLeave.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : collectionsToLeave.getValue()) {
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

        if (this.combinedListingRole.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("combinedListingRole:");
            if (combinedListingRole.getValue() != null) {
                _queryBuilder.append(combinedListingRole.getValue().toString());
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

        if (this.productOptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productOptions:");
            if (productOptions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OptionCreateInput item1 : productOptions.getValue()) {
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

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.requiresSellingPlan.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("requiresSellingPlan:");
            if (requiresSellingPlan.getValue() != null) {
                _queryBuilder.append(requiresSellingPlan.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.claimOwnership.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("claimOwnership:");
            if (claimOwnership.getValue() != null) {
                claimOwnership.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

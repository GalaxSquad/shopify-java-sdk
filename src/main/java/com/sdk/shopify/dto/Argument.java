package com.sdk.shopify.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data transfer object for GraphQL query arguments.
 * Used to build pagination and filtering parameters for Shopify API queries.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Argument {

  /**
   * The ID of the resource to query.
   */
  private String id;

  /**
   * Number of items to return from the beginning of the list.
   * Used for forward pagination.
   */
  private Integer first;

  /**
   * Cursor for forward pagination, representing the position to continue from.
   */
  private String after;

  /**
   * Number of items to return from the end of the list.
   * Used for backward pagination.
   */
  private Integer last;

  /**
   * Cursor for backward pagination, representing the position to continue from.
   */
  private String before;

  /**
   * Whether to return results in reverse order.
   */
  private Boolean reverse;

  /**
   * Search query string for filtering results.
   */
  private String query;

  /**
   * Field name to sort results by.
   */
  private String sortKey;
  
  /**
   * Validates the pagination parameters to ensure they are properly set.
   * Either 'first' or 'last' should be set, but not both.
   * 
   * @throws IllegalArgumentException if both 'first' and 'last' are set
   */
  public void validatePagination() {
    if (first != null && last != null) {
      throw new IllegalArgumentException("Cannot specify both 'first' and 'last' pagination parameters");
    }
    
    if (first != null && first <= 0) {
      throw new IllegalArgumentException("'first' pagination parameter must be positive");
    }
    
    if (last != null && last <= 0) {
      throw new IllegalArgumentException("'last' pagination parameter must be positive");
    }
    
    if (after != null && before != null) {
      throw new IllegalArgumentException("Cannot specify both 'after' and 'before' cursors");
    }
  }

  public void defaultValues() {
    if (first == null) {
      first = 100;
    }
    if(sortKey == null) {
      sortKey = "CREATED_AT";
    }
  }
}

package com.lush.core.models;

import lombok.Data;

/**
 * EndpointDto
 * 
 * @author IT3
 *
 */
@Data
public class EndpointDto {

  /**
   * EndpointDto Info
   * 
   * @author IT3
   *
   */
  @Data
  public static class Info {

    /**
     * Endpoint uri.
     */
    private String uri;

    /**
     * Http protocol method.
     */
    private String method;
  }
}

package com.lush.core.models;

import lombok.Data;

/**
 * Response
 * 
 * @author IT3
 *
 */
@Data
public class Response {

  /**
   * Response status.
   */
  private String status;

  /**
   * Response message.
   */
  private String message;

  /**
   * Response data.
   */
  private Object data;

  /**
   * Description : Default constructor.
   */
  public Response() {
    this.status = "ok";
    this.message = "";
    this.data = "";
  }

  /**
   * Description : Constructor.
   *
   * @param paramStatus return status
   */
  public Response(String paramStatus) {
    this.status = paramStatus;
    this.message = "";
    this.data = "";
  }

  /**
   * Description : Constructor.
   *
   * @param paramStatus comment
   * @param paramMessage comment
   */
  public Response(String paramStatus, String paramMessage) {
    this.status = paramStatus;
    this.message = paramMessage;
    this.data = "";
  }
}

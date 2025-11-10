package com.horoscope.management.common;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ResponseWrapper<D, E> implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  private boolean success;
  
  private List<D> data;
  
  private List<E> error;
  
  private List<String> messages;
  
  public ResponseWrapper(List<D> data, List<E> error, Boolean success, List<String> messages) {
    this.data = data;
    this.success = success;
    this.error = error;
    this.messages = messages;
  }
  
  public ResponseWrapper(List<D> data, List<E> error, Boolean success) {
    this.data = data;
    this.success = success;
    this.error = error;
  }
  
  public ResponseWrapper() {
    // TODO Auto-generated constructor stub
  }

  
  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  public List<D> getData() {
    return data;
  }

  public void setData(List<D> data) {
    this.data = data;
  }
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public List<E> getError() {
    return error;
  }

  public void setError(List<E> error) {
    this.error = error;
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

}

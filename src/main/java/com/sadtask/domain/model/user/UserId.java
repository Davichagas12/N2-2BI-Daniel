package com.sadtask.domain.model.user;

import com.sadtask.domain.common.model.AbstractBaseId;

public class UserId extends AbstractBaseId {

  private static final long serialVersionUID = -3316570974935023332L;

  public UserId(long id) {
    super(id);
  }

  public String toString() {
    return String.valueOf(value());
  }
}

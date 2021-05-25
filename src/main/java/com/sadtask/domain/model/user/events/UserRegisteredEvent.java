package com.sadtask.domain.model.user.events;

import com.sadtask.domain.common.event.DomainEvent;
import com.sadtask.domain.common.event.TriggeredFrom;
import com.sadtask.domain.model.user.User;

public class UserRegisteredEvent extends DomainEvent {

  private static final long serialVersionUID = 2580061707540917880L;

  public UserRegisteredEvent(User user, TriggeredFrom triggeredFrom) {
    super(user.getId(), triggeredFrom);
  }

  @Override
  public String toString() {
    return "UserRegisteredEvent{userId=" + getUserId() + '}';
  }
}

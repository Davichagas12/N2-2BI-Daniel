package com.sadtask.domain.common.event;

public interface DomainEventPublisher {

  /**
   * Publish a domain event
   */
  void publish(DomainEvent event);
}

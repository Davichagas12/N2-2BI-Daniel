package com.sadtask.web.payload;

import com.sadtask.domain.application.commands.AddCardCommentCommand;
import com.sadtask.domain.model.card.CardId;

public class AddCardCommentPayload {

  private String comment;

  public AddCardCommentCommand toCommand(CardId cardId) {
    return new AddCardCommentCommand(cardId, comment);
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}

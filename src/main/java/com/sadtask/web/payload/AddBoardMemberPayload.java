package com.sadtask.web.payload;

import com.sadtask.domain.application.commands.AddBoardMemberCommand;
import com.sadtask.domain.model.board.BoardId;

public class AddBoardMemberPayload {

  private String usernameOrEmailAddress;

  public AddBoardMemberCommand toCommand(BoardId boardId) {
    return new AddBoardMemberCommand(boardId, usernameOrEmailAddress);
  }

  public void setUsernameOrEmailAddress(String usernameOrEmailAddress) {
    this.usernameOrEmailAddress = usernameOrEmailAddress;
  }
}

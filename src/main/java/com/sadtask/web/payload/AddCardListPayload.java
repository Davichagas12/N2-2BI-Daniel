package com.sadtask.web.payload;

import com.sadtask.domain.application.commands.AddCardListCommand;
import com.sadtask.domain.model.board.BoardId;

public class AddCardListPayload {

  private long boardId;
  private String name;
  private int position;

  public AddCardListCommand toCommand() {
    return new AddCardListCommand(new BoardId(boardId), name, position);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBoardId(long boardId) {
    this.boardId = boardId;
  }

  public void setPosition(int position) {
    this.position = position;
  }
}

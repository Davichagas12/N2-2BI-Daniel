package com.sadtask.web.payload;

import com.sadtask.domain.application.commands.CreateTeamCommand;

public class CreateTeamPayload {

  private String name;

  public CreateTeamCommand toCommand() {
    return new CreateTeamCommand(name);
  }

  public void setName(String name) {
    this.name = name;
  }
}

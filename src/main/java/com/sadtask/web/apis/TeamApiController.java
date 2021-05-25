package com.sadtask.web.apis;

import com.sadtask.domain.application.TeamService;
import com.sadtask.domain.application.commands.CreateTeamCommand;
import com.sadtask.domain.model.team.Team;
import com.sadtask.web.payload.CreateTeamPayload;
import com.sadtask.web.results.ApiResult;
import com.sadtask.web.results.CreateTeamResult;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TeamApiController extends AbstractBaseController {

  private TeamService teamService;

  public TeamApiController(TeamService teamService) {
    this.teamService = teamService;
  }

  @PostMapping("/api/teams")
  public ResponseEntity<ApiResult> createTeam(@RequestBody CreateTeamPayload payload,
                                              HttpServletRequest request) {
    CreateTeamCommand command = payload.toCommand();
    addTriggeredBy(command, request);

    Team team = teamService.createTeam(command);
    return CreateTeamResult.build(team);
  }
}

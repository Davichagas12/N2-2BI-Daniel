package com.sadtask.web.results;

import com.sadtask.domain.model.team.Team;
import org.springframework.http.ResponseEntity;

public class CreateTeamResult {

  public static ResponseEntity<ApiResult> build(Team team) {
    ApiResult apiResult = ApiResult.blank()
      .add("id", team.getId().value())
      .add("name", team.getName());
    return Result.ok(apiResult);
  }
}

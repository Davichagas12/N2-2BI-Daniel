package com.sadtask.web.apis;

import com.sadtask.domain.application.commands.AnonymousCommand;
import com.sadtask.domain.application.commands.UserCommand;
import com.sadtask.domain.model.user.SimpleUser;
import com.sadtask.utils.RequestUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.util.Assert;

import javax.servlet.http.HttpServletRequest;

public abstract class AbstractBaseController {

  void addTriggeredBy(UserCommand command, HttpServletRequest request) {
    Assert.notNull(request.getUserPrincipal(), "User principal must be present in the request");
    UsernamePasswordAuthenticationToken userPrincipal = (UsernamePasswordAuthenticationToken) request.getUserPrincipal();
    SimpleUser currentUser = (SimpleUser) userPrincipal.getPrincipal();
    command.triggeredBy(currentUser.getUserId(), RequestUtils.getIpAddress(request));
  }

  void addTriggeredBy(AnonymousCommand command, HttpServletRequest request) {
    command.triggeredBy(RequestUtils.getIpAddress(request));
  }
}

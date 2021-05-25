package com.sadtask.web.apis;

import com.sadtask.domain.application.UserService;
import com.sadtask.domain.application.commands.RegisterCommand;
import com.sadtask.domain.model.user.EmailAddressExistsException;
import com.sadtask.domain.model.user.RegistrationException;
import com.sadtask.domain.model.user.UsernameExistsException;
import com.sadtask.web.payload.RegistrationPayload;
import com.sadtask.web.results.ApiResult;
import com.sadtask.web.results.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class RegistrationApiController extends AbstractBaseController {

  private UserService service;

  public RegistrationApiController(UserService service) {
    this.service = service;
  }

  @PostMapping("/api/registrations")
  public ResponseEntity<ApiResult> register(@Valid @RequestBody RegistrationPayload payload,
                                            HttpServletRequest request) {
    try {
      RegisterCommand command = payload.toCommand();
      addTriggeredBy(command, request);

      service.register(command);
      return Result.created();
    } catch (RegistrationException e) {
      String errorMessage = "Registration failed";
      if (e instanceof UsernameExistsException) {
        errorMessage = "Username already exists";
      } else if (e instanceof EmailAddressExistsException) {
        errorMessage = "Email address already exists";
      }
      return Result.failure(errorMessage);
    }
  }
}

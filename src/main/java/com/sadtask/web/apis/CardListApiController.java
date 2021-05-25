package com.sadtask.web.apis;

import com.sadtask.domain.application.CardListService;
import com.sadtask.domain.application.commands.AddCardListCommand;
import com.sadtask.domain.application.commands.ChangeCardListPositionsCommand;
import com.sadtask.domain.model.cardlist.CardList;
import com.sadtask.web.payload.AddCardListPayload;
import com.sadtask.web.payload.ChangeCardListPositionsPayload;
import com.sadtask.web.results.AddCardListResult;
import com.sadtask.web.results.ApiResult;
import com.sadtask.web.results.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CardListApiController extends AbstractBaseController {

  private CardListService cardListService;

  public CardListApiController(CardListService cardListService) {
    this.cardListService = cardListService;
  }

  @PostMapping("/api/card-lists")
  public ResponseEntity<ApiResult> addCardList(@RequestBody AddCardListPayload payload,
                                               HttpServletRequest request) {
    AddCardListCommand command = payload.toCommand();
    addTriggeredBy(command, request);

    CardList cardList = cardListService.addCardList(command);
    return AddCardListResult.build(cardList);
  }

  @PostMapping("/api/card-lists/positions")
  public ResponseEntity<ApiResult> changeCardListPositions(@RequestBody ChangeCardListPositionsPayload payload,
                                                           HttpServletRequest request) {
    ChangeCardListPositionsCommand command = payload.toCommand();
    addTriggeredBy(command, request);

    cardListService.changePositions(command);
    return Result.ok();
  }
}

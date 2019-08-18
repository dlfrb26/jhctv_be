package jhctv.backend.presentation;

import jhctv.backend.service.GetTVListService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetTVListController {
//    private final GetTVListService getTVListService;

//    public GetTVListController(GetTVListService getTVListService) {
//        this.getTVListService = getTVListService;
//    }

    @RequestMapping(value = "/getTvList", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getTvList() {
//        return getTVListService.getTVListOutputEntity().getTest();
        return "test";
    }
}

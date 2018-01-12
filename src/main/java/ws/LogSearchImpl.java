package main.java.ws;

import main.java.entities.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;

@WebServlet("/logsearch")
@WebService
public class LogSearchImpl {

    @WebMethod
    public SearchInfoResult logSearch(SearchInfo searchInfo) {
        return new SearchInfoResult();
    }
}

package commands;

import javax.servlet.http.HttpServletRequest;

public class CommandStatistics extends Command {

    @Override
    public String getOrderName() {
        return "statistics";
    }

    @Override
    public Action executeAction(HttpServletRequest req) {
        int bookCount = dao.bookCount();
        double totalPrice = dao.totalPrice();
        double averagePrice = totalPrice / bookCount;

        req.setAttribute("bookCount", bookCount);
        req.setAttribute("averagePrice", averagePrice);

        return new Action("Statistics.jsp", false);
    }
}

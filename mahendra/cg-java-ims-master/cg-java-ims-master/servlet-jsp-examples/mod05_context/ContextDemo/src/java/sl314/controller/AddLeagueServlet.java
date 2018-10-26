package sl314.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
// Support classes
import java.io.IOException;
import java.io.PrintWriter;
// Model classes
import sl314.model.League;
import java.util.List;
import java.util.LinkedList;


public class AddLeagueServlet extends HttpServlet {
    
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        
        // Keep a set of strings to record form processing errors.
        List errorMsgs = new LinkedList();
        // Store this set in the request scope, in case we need to
        // send the ErrorPage view.
        request.setAttribute("errorMsgs", errorMsgs);
        
        try {
            
            // Retrieve form parameters.
            String yearStr = request.getParameter("year").trim();
            String season = request.getParameter("season").trim();
            String title = request.getParameter("title").trim();
            
            // Perform data conversions.
            int year = -1;
            try {
                year = Integer.parseInt(yearStr);
            } catch (NumberFormatException nfe) {
                errorMsgs.add("The 'year' field must be a positive integer.");
            }
            
            // Verify form parameters
            if ( (year != -1) && ((year < 2000) || (year > 2010)) ) {
                errorMsgs.add("The 'year' field must within 2000 to 2010.");
            }
            if ( season.equals("UNKNOWN") ) {
                errorMsgs.add("Please select a league season.");
            }
            if ( title.length() == 0 ) {
                errorMsgs.add("Please enter the title of the league.");
            }
            
            // Send the use back to the form, if there were errors
            if ( ! errorMsgs.isEmpty() ) {
                RequestDispatcher view
                        = request.getRequestDispatcher("add_league.view");
                view.forward(request, response);
                return;
            }
            
            // Perform business logic
            League league = new League(year, season, title);
            // Store the new league in the request-scope
            request.setAttribute("league", league);
            
            // Store the new league in the leagueList context-scope attribute
            ServletContext context = getServletContext();
            List leagueList = (List) context.getAttribute("leagueList");
            leagueList.add(league);
            
            // Send the Success view
            RequestDispatcher view
                    = request.getRequestDispatcher("success.view");
            view.forward(request, response);
            return;
            
            // Handle any unusual exceptions
        } catch (Exception e) {
            errorMsgs.add(e.getMessage());
            RequestDispatcher view
                    = request.getRequestDispatcher("add_league.view");
            view.forward(request, response);
            
            // Log stack trace
            e.printStackTrace(System.err);
            
        } // END of try-catch block
        
    } // END of doPost method
    
} // END of AddLeagueServlet class

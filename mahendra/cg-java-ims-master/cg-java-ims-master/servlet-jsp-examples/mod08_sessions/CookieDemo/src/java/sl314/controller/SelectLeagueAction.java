package sl314.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
// Struts classes
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
// Model classes
import sl314.model.RegisterService;
import sl314.model.League;
import sl314.model.ObjectNotFoundException;
import java.util.List;
import java.util.LinkedList;
import javax.servlet.ServletContext;


public class SelectLeagueAction extends Action {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) {
        
        // Keep a set of strings to record form processing errors.
        List errorMsgs = new LinkedList();
        // Store this set in the request scope, in case we need to
        // send the ErrorPage view.
        request.setAttribute("errorMsgs", errorMsgs);
        
        try {
            
            // Retrieve form parameters.
            String season = request.getParameter("season").trim();
            String yearStr = request.getParameter("year").trim();
            
            // Perform data conversions.
            int year = -1;
            try {
                year = Integer.parseInt(yearStr);
            } catch (NumberFormatException nfe) {
                errorMsgs.add("The 'year' field must be a positive integer.");
            }
            
            // Verify 'Select League' form fields
            if ( (year != -1) && ((year < 2000) || (year > 2010)) ) {
                errorMsgs.add("The 'year' field must within 2000 to 2010.");
            }
            if ( season.equals("UNKNOWN") ) {
                errorMsgs.add("Please select a league season.");
            }
            
            // Send the ErrorPage view if there were errors
            if ( ! errorMsgs.isEmpty() ) {
                return mapping.findForward("error");
            }
            
            // Perform business logic
            ServletContext context = getServlet().getServletContext();
            String dataDirectory = (String)context.getAttribute("sl314.model.dataDirectory");
            RegisterService registerSvc = new RegisterService(dataDirectory);
            
            // Retrieve the league
            League league = registerSvc.getLeague(year, season);
            
            // Store the league object in the session-scope
            HttpSession session = request.getSession();
            session.setAttribute("league", league);
            
            // Send the Success view
            return mapping.findForward("success");
            
            // Handle business exceptions
        } catch (ObjectNotFoundException onfe) {
            errorMsgs.add("The league you selected does not yet exist."
                    + " Please select another.");
            return mapping.findForward("error");
            
            // Handle any unusual exceptions
        } catch (RuntimeException e) {
            // Log stack trace
            e.printStackTrace(System.err);
            
            // Send the Error view if there were errors
            errorMsgs.add(e.getMessage());
            return mapping.findForward("error");
            
        } // END of try-catch block
        
    } // END of execute method
    
} // END of SelectLeagueAction class

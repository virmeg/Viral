<%@ page session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<%@ taglib prefix="forms" uri="http://www.soccer.org/forms.tld" %>

<%-- Generate the HTML response --%>
<html>

<head>
<title>Duke's Soccer League</title>
</head>

<body bgcolor='white'>

<table border='0' cellspacing='0' cellpadding='0' width='640'>

<tr height='100'>

  <td align='center' valign='center' width='160' height='100'>
    <img src='<c:url value="/images/DukeKick.gif"/>'
         alt='Duke's Soccer League Logo'>
  </td>

  <td bgcolor='#CCCCFF' align='center' valign='center' width='480' height='100'>

    <!-- START of banner -->
    <jsp:include page="/WEB-INF/view/common/banner.jsp">
      <jsp:param name="subTitle" value="Registration" />
    </jsp:include>
    <!-- END of banner -->

  </td>

</tr>

<tr valign='top'>

  <!-- START of navigation menu -->
  <td bgcolor='#CCCCFF' width='160' align='left'>
    <jsp:include page="/WEB-INF/view/common/navigation.jsp" />
  </td>
  <!-- END of navigation menu -->

  <td width='480' align='left'>

    <div style='margin-top: 0.1in; margin-left: 0.1in;
                margin-bottom: 0.1in; margin-right: 0.1in'>

    <!-- START of main content -->
    <%-- Retrieve the set of leagues from the LeagueService --%>
    <jsp:useBean id="leagueSvc" scope="page" class="sl314.model.LeagueService" />

    <%-- Create the Progress Monitor --%>
    <br/>
    <table border='1' cellspacing='0' cellpadding='0' width='100%'>
    <tr height='20'>
      <td bgcolor='#CCCCFF' align='center' valign='center' height='20'>
        <b>1) Select League</b>
      </td>
      <td bgcolor='#CCCCCC' align='center' valign='center' height='20'>
        <b>2) Enter Player Info</b>
      </td>
      <td bgcolor='#CCCCCC' align='center' valign='center' height='20'>
        <b>3) Select Division</b>
     </td>
    </tr>
    </table>
    <br/>

    <%-- Report any errors (if any) --%>
    <html:errors />

    <%-- Present the form --%>
    <form action='<c:url value="select_league.do" />' method='POST'>

    <%-- Repopulate the year field --%>
    Year: <input type='text' name='yearStr' value='${param.yearStr}' />
    <br/><br/>

    <%-- Repopulate the season drop-down menu --%>
    Season:
    <forms:select param='season'>
      <c:forEach var="season" items="${leagueSvc.allSeasons}">
        <forms:option value="${season}">${season}</forms:option>
      </c:forEach>
    </forms:select>
    <br/><br/>

    <input type='Submit' value='Continue...' />
    </form>
    <!-- END of main content -->

    </div>

  </td>
</tr>

<tr>
  <td width='160'>
    <!-- nothing here -->
  </td>
  <!-- START of copyright notice -->
  <td align='right' width='480'>
    <%@ include file="/WEB-INF/view/common/copyright.jsp" %>
  </td>
  <!-- END of copyright notice -->
</tr>

</table>

</body>

</html>

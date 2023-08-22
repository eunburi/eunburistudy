<%@page import="model_p.NoticeDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String mainUrl = "member/"+request.getAttribute("mainPage")+".jsp";
%>
<table  border="" style="border-collapse: collapse;">
	<tr>
		<td><jsp:include page="inc/header.jsp" /></td>
	</tr>
	<tr>
		<td><jsp:include page="<%=mainUrl %>" /></td>
	</tr>
	<tr>
		<td><jsp:include page="inc/footer.jsp" /></td>
	</tr>
</table>

	
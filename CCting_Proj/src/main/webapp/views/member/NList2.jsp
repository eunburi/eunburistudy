<%@page import="java.util.ArrayList"%>
<%@page import="model_p.NoticeDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>공지사항2</h1>

<table border="">
	<tr align="center">
		<td width="50px">번호</td>
		<td width="500px">내용</td>
		<td width="200px">작성일</td>
	</tr>
	
	
	
<%-- 		<%
	int i = 0;
	for(BoardDTO dto : (ArrayList<BoardDTO>) request.getAttribute("mainData")) {
	i++;
	%> --%>	
		
		<tr align="center">
		<td><%=i %></td>
		<td>
			<a href=""><%=dto.getNcontent() %></a>
		</td>
		<td>1</td>
		<td>2</td>
		<td>3</td>
	</tr>
	<%} %>
	<tr>
		<td colspan="5"  align="center"></td>
	</tr>
	<tr>
		<td colspan="5"  align="right">
			<a href="BWriteForm">글쓰기</a>
		</td>
	</tr>
</table>
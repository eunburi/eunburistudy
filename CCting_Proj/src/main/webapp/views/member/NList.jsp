<%@page import="java.util.ArrayList"%>
<%@page import="model_p.NoticeDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int itemsPerPage = 10;
ArrayList<NoticeDTO> mainData = (ArrayList<NoticeDTO>) request.getAttribute("mainData");
int totalItems = mainData.size();
int totalPages = (int) Math.ceil((double) totalItems / itemsPerPage);

String pageParam = request.getParameter("page");
int currentPage = (pageParam != null && !pageParam.isEmpty()) ? Integer.parseInt(pageParam) : 1;

int startIndex = (currentPage - 1) * itemsPerPage;
int endIndex = Math.min(startIndex + itemsPerPage, totalItems);

ArrayList<NoticeDTO> displayedData = new ArrayList<>(mainData.subList(startIndex, endIndex));
%>

<h1>공지사항</h1>

<table border="" align="center" width="99%" style="border-collapse: collapse;">
    <tr align="center">
        <td width="">번호</td>
        <td width="">제목</td> <!-- 여기서 제목으로 표시하도록 수정 -->
        <!-- 다른 열들... -->
    </tr>
    <%
    int i = startIndex + 1;
    for (NoticeDTO dto : displayedData) {
    %>
    <tr align="center">
        <td><%=i %></td>
        <td><%=dto.getNcontent() %></td> <!-- 여기서 제목에 해당하는 필드 사용 -->
        <td><%=dto.getNreg_date() %>
        <!-- 다른 열들... -->
    </tr>
    <% 
        i++;
    } 
    %>
    <!-- 페이지 번호 표시 부분도 수정 필요 -->
</table>
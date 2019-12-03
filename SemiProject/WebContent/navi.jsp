<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/css/bootstrap.min.css">

<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/js/bootstrap.min.js"></script>
<style>
#navBar{
   margin-top: 20px;
}
</style>

</head>
<body>
<!-- 게시판 네비 시작 -->
<ul class="nav nav-tabs" id="navBar">
   <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle text-dark" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">일정</a>
      <div class="dropdown-menu">
         <a class="dropdown-item" href="${pageContext.request.contextPath}/viewTask.pt" aria-selected="true">일정 게시판</a>
         <a class="dropdown-item" href="${pageContext.request.contextPath}/viewCalendar.pt">일정 캘린더</a>
      </div>
   </li>
   <li class="nav-item">
      <a class="nav-link text-dark" href="${pageContext.request.contextPath}/list.file">파일</a>
   </li>
   <li class="nav-item">
  		<a class="nav-link text-dark" href="${pageContext.request.contextPath}/list.pm">멤버</a>
   </li>
</ul>
<!-- 게시판 네비 끝 -->
</body>

</html>
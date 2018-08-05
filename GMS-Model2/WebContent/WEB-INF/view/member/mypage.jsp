<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="domain.*" %>
<!doctype html>
<html lang="en">
<jsp:include page="../common/head.jsp"/>
<jsp:include page="../common/head-function.jsp"/>
<body>
<div id="wrapper">
	<div id="header">
		<jsp:include page="../common/title-box.jsp"/>
		<jsp:include page="../common/login-box.jsp"/>
		<jsp:include page="../common/menu-box.jsp"/>
	</div>
	<div id="content">
		<div id="content-box">
			<h2>◆My Page◆</h2>
				<table id="mypage-table">
					<tr>
						<td id="mypage-img" rowspan="3" colspan="2"></td>
						<td>ID</td>
						<td>${user.memberId}</td>
					</tr>
					<tr>
						<td>이름 </td>
						<td>${user.name}</td>
					</tr>
					<tr>
						<td>생년월일</td>
						<td>${user.ssn}</td>
					</tr>
					<tr>
						<td>성별</td>
						<td>${user.gender}</td>
						<td>팀</td>
						<td>${user.teamId}</td>
					</tr>
					<tr>
						<td>나이</td>
						<td>${user.age}</td>
						<td>역할</td>
						<td>${user.roll}</td>
					</tr>
				</table>
				<br>
				<a id="logout-butt"><button>LOGOUT</button></a>
				<a id="update-butt"><button>UPDATE</button></a>
				<a id="delete-butt"><button>DELETE</button></a>
		</div>
	</div>
	<div id="footer">
		<jsp:include page="../common/footer.jsp"/> 
	</div>
</div>
<script>
	document.getElementById('logout-butt').addEventListener('click',function(){
		router.move({context : '${context}',
			domain : 'common',
			action : '',
			page : ''})
	});
	document.getElementById('update-butt').addEventListener('click',function(){
		router.move({context:'${context}',
			domain : 'member',
			action : 'move',
			page : 'update-form'})
	});
	document.getElementById('delete-butt').addEventListener('click',function(){
		router.move({context:'${context}',
			domain : 'member',
			action : 'move',
			page : 'delete-form'})
	});
</script>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- memberId, name, ssn(800101-1), password -->
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
			<form id="join-form">
				<h3>JOIN PAGE</h3>
				ID : <input type="text" name="userid" /><br>
				PW : <input type="text" name="password" /><br>
				NAME : <input type="text" name="username" /><br>
				SSN : <input type="text" name="userssn" /><br>	
				소속팀
				<input type="radio" name="teamid" value="" checked="checked"/>NONE
				<input type="radio" name="teamid" value="NOLJA"/>NOLJA
				<input type="radio" name="teamid" value="JIEUN_HOUSE"/>JIEUN-HOUSE
				<input type="radio" name="teamid" value="TURTLE_KING"/>TURTLE-KING
				<input type="radio" name="teamid" value="CODDING_ZZANG"/>CODDING-ZZANG<br>
				프로젝트역할
				<select name="roll" id="roll">
					<option value="leader">팀장</option>
					<option value="front">프론트개발</option>
					<option value="back">백단개발</option>
					<option value="android">안드로이드개발</option>
					<option value="minfe">민폐</option>
				</select><br>
				수강과목
				<input type="checkbox" name="subject" value="java" checked="checked"/>Java
				<input type="checkbox" name="subject" value="c-lang"/>C언어
				<input type="checkbox" name="subject" value="JSP"/>JSP
				<input type="checkbox" name="subject" value="PHP"/>PHP
				<input type="checkbox" name="subject" value="node-js"/>NodeJS
				<input type="checkbox" name="subject" value="linux"/>Linux
				<input type="checkbox" name="subject" value="html"/>HTML
				<input type="checkbox" name="subject" value="spring"/>Spring<br>
				<input id="join-form-btn" type="button" value="JOIN" />
			</form>
		</div>
	</div>
	<div id="footer">
		<jsp:include page="../common/footer.jsp"/> 
	</div>
</div>
<script>
document.getElementById('join-form-btn').addEventListener('click',
		function(){
	var form = document.getElementById('join-form');
	var arr = [form.userid.value,form.password.value,form.username.value,form.userssn.value];
	var x = service.nullChecker(arr)
	if(x.checker){
		member.join(arr);
		
		//form.gender.value = member.getGender();
		//form.age.value = member.getAge();
		
		/* var nameArr = ["action","page","gender","age"];
		var valueArr = ["join","user-login-form",member.getGender(),member.getAge()];
		for(var i=0;i<4;i++){
			var node = document.createElement('input');
			node.innerHTML = '<input type="hidden" name="'+nameArr[i]+'" value="'+valueArr[i]+'"/>';
			form.appendChild(node);
		}*/
			
		var arr = [{name : "action", value : "join"},
				{name : "gender", value : member.getGender()},
				{name : "age", value : member.getAge()}];
		
		for(var i in arr){
			var node = document.createElement('input');
			// node.innerHTML = '<input type="hidden" name="'+arr[i].name+'" value="'+arr[i].value+'"/>';
			// String값은 덜 쓰도록 한다.
			node.setAttribute('type', 'hidden');
			node.setAttribute('name', arr[i].name);
			node.setAttribute('value', arr[i].value);
			form.appendChild(node);
		}
			/* alert(form.action.value);
			alert(form.page.value);
			alert(form.gender.value);
			alert(form.age.value); */
			
		form.action = "${context}/member.do";
		form.method = "post";	
		form.submit();
	}else{
		alert(x.text);
	}
});
	
</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
customerInfo : ${customerInfo}<br>
<input type="text" id="cuiId" placeholder="아이디"><br>
<input type="password" id="cuiPwd" placeholder="비밀번호"><br>
<button onclick="login()">로그인</button>
<script>
function login(){
	var param = {
			cuiId : document.querySelector('#cuiId').value,
			cuiPwd : document.querySelector('#cuiPwd').value
	}
	var xhr = new XMLHttpRequest();
	xhr.open('POST','/login');
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4 && xhr.status==200){
			if(xhr.responseText){
				var res = JSON.parse(xhr.responseText);
				alert(res.cuiName + '님 반갑습니다.');
				location.href='/';
				return;
			}
			alert('아아디나 비밀번호를 확인해주세요.');
		}
	}
	xhr.setRequestHeader('content-type','application/json;charset=UTF-8');
	xhr.send(JSON.stringify(param));
}
</script>
</body>
</html>
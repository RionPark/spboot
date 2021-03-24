<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
니가 보고 싶은 fiiNum : ${param.fiiNum}
<table border="1">
	<tr>
		<th width="100">번호</th>
		<td data-col="fiiNum"></td>
	</tr>
	<tr>
		<th>제목</th>
		<td data-col="fiiTitle"></td>
	</tr>
	<tr>
		<th>번호</th>
		<td data-col="fiiContent"></td>
	</tr>
	<tr>
		<th>내용</th>
		<td data-col="fiiFilePath" data-type="img"></td>
	</tr>
</table>
<script>
var url = '/file-info?fiiNum=${param.fiiNum}';
window.onload = function(){
	var xhr = new XMLHttpRequest();
	xhr.open('GET', url);
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4 && xhr.status==200){
			console.log(xhr.responseText);
			var res = JSON.parse(xhr.responseText);
			var tds = document.querySelectorAll('td[data-col]');
			for(var td of tds){
				var col = td.getAttribute('data-col');
				var type = td.getAttribute('data-type');
				var data = res[col];
				if(type==='img'){
					data = '<img src="/resources/' + res[col] + '" width="400">'
				}
				td.innerHTML = data;
			}
		}
	}
	xhr.send();
}
</script>
</body>
</html>
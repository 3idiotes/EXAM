<!DOCTYPE html>
<html>
<head>
<title>index.html</title>

<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=GBK">

<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>
<#assign ppath= request.contextPath/> 
<body>
	<h1 style="color: red">欢迎进入在线考试系统</h1>
	<a href="${ppath}/user/youke">立即进入</a><br>
	<a href="${ppath}/user/index">登录</a><br>
	<a href="${ppath}/user/registerm">注册</a>
</body>
</html>

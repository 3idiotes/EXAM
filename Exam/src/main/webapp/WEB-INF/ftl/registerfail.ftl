<html>
<head>
<title>registerfail</title>

<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">

<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>
<#assign ppath= request.contextPath/>
<font color="red">${registermsg}</font>
<br>
<body>
	<a href="${ppath}/user/registerm">重新注册</a>
	<a href="${ppath}/index/index">返回首页</a>
</body>
</html>
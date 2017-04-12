<html>
<head>
<title>账户信息</title>

<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">

<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>
<#assign ppath= request.contextPath/>
<body>
	用户名：${registername}<hr>
	姓名：${username}<hr>
	年级：${year}级<hr>
	学院：${college}<hr>
	专业：${major}<hr>
	班级：${class}<hr>
	学号：${student}<hr>
</body>
</html>
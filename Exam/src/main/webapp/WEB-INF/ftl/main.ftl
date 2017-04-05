<html>
<head>

<title>My JSP 'welcome.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<#assign ppath= request.contextPath/>
<link rel="stylesheet" type="text/css" href="${ppath}/css/style.css" />

</head>


<frameset rows="40,*"  frameborder="no" border="0" framespacing="0">
	<frame src="${ppath}/head.jsp" noresize="noresize" frameborder="no" name="top" scrolling="no" marginwidth="0" marginheight="0" target="main" />
	<frameset cols="200,*" id="mainframe" frameborder="no" border="0" framespacing="0">
		<frame src="${ppath}/menu.jsp" name="menu" id="menu" marginwidth="0" marginheight="0" frameborder="0" scrolling="no" target="main" />
		<frame src="${ppath}/welcome.jsp" name="main" id="main" marginwidth="0" marginheight="0" frameborder="0" scrolling="auto" target="_self" />
	</frameset>
</frameset>

<noframes>
	<body>您的浏览器不支持框架。</body>
</noframes>
</html>

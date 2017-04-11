<html>
<head>
<title>我的错题集</title>

<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">

<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>
<#assign ppath= request.contextPath/>
<body>
	<font color="blue"><h3>不定项选择题<h3></font>
	<#list QueErrList as item>
		${item.text}&nbsp;&nbsp;答案：<font color="red">${item.answer}</font><br>
		<#if item.a ??>A.${item.a}&nbsp;&nbsp;</#if>
		<#if item.b ??>B.${item.b}&nbsp;&nbsp;</#if>
		<#if item.c ??>C.${item.c}&nbsp;&nbsp;</#if>
		<#if item.d ??>D.${item.d}&nbsp;&nbsp;</#if>
		<hr>
	</#list>
	<br>
	<font color="blue">简答题</font><br>
	<br>
	<#list BqErrList as item>
		${item.text}<br>
		答案：<font color="red">${item.answer}</font>
		<hr>
	</#list>
</body>
</html>
<html>
<head>
<title>历史考试</title>

<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">

<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>
<#assign ppath= request.contextPath/>
<body>
	<#list HisExamList as item>
		考试类型：<#if item.examtype == "0">
					随机考试&nbsp;&nbsp;
				<#elseif item.examtype == "1">
					错题考试&nbsp;&nbsp;
				</#if>
				<br>
		交卷时间：${item.submitime}
				<br>
		得分：${item.score}		
		<hr>
	</#list>
</body>
</html>
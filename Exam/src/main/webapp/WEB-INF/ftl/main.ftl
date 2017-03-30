<html>
  <head>
    
    <title>My JSP 'welcome.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  		<#if Session['username']?exists>
  			<font color="red">${username}同学，欢迎你！</font><br>
  		<#else>
  			<font color="red">欢迎游客！</font>	<br>
  		</#if>
   		welcome
  </body>
</html>

<html>
  <head>
    <title>index.html</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  <body>
  <#assign ppath= request.contextPath/> 
  	<font color="red">${loginmsg}</font><font color="red">${registermsg}</font><br>
    <form action="${ppath}/user/login" method="post">
    	用户名：<input type="text" name="username" id="username"/>
    	<br>
    	密&nbsp;&nbsp;码<input type="text" name="password" id="password"/>
    	<br>
    	<input type="submit" name="tijiao" value="登录"/>
    </form>
  </body>
</html>

<html>
<head>
<title>历史考试</title>

<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">

<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
<script type="text/javascript">
	function checkform1()
	{
	   if(document.form1.password.value!=document.form1.password1.value)
	   {
	    alert("两次输入密码不一致");
	    document.GetElementById("password").value="";
	    document.GetElementById("password1").value="";
	    return false;
	   }else{
	   	f1();
	   }
	  return true;  
	}
	function f1(){
		$.ajax({
            		data : "",
                    type : "POST",
                    url : "${ppath}/exam/userModify",
                    success : function(data) {
                    	alert(data);
                    	if(data == "1"){
                    		alert("修改成功！");
                    	}else if(data == "0"){
                    		alert("修改失败!");
                    	}
					}
                    });		
	}
</script>
</head>
<#assign ppath= request.contextPath/>
<body>
	<h3>账号修改</h3>
	<form action="${ppath}/exam/userModify" method="post" name="form1">
		用户名：<input type="text" name="username" value="${registername}"/><br>
		密码：<input type="password" id="password" name="password"/><br>
		再次输入密码：<input type="password" id="password1" name="password1"/><br>
		<input type="submit" name="tijiao" value="提交" onclick="return checkform1();"/>
	</form>
</body>
</html>
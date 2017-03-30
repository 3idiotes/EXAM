<#assign spring=JspTaglibs["http://www.springframework.org/tags"]/>
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"] />
<html>
  <head>
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<#assign ppath= request.contextPath/> 
	<script type="text/javascript" language="javascript" src="${ppath}/js/jquery-3.2.0.min.js"></script>
	<script type="text/javascript">
		function cityChange() {
            var type = $("#cid").val();
            var sel2 = $("#mid");  
            var CommitUrl = "${ppath}/user/getMByC";
			document.getElementById('mid').options.length = 0;
            $.ajax({
            		data : {cid:type},
                    type : "POST",
                    url : CommitUrl,
                    success : function(data) {
                    	sel2.append("<option disabled selected value>-请选择专业-</option>");              			  
                    	for ( var i = 0; i < data.length; i++) {  
 							sel2.append("<option value=" + data[i].mid + ">" + data[i].name + "</option>");  
						}
					}
                    });
        }
	</script>
  </head>
  
  <body>
  	<font color="red">${registermsg}</font><br>
    <form action="${ppath}/user/register" method="post">
    	入学年份：<select id="year" name="year"/>  
    			<option disabled selected value>-请选择年份-</option>
   				<#list yearList as item>
    				<option value="${item.year}">${item.year}</option>
				</#list>
			   </select><br>
		所在学院：<select id="cid" name="cid" onchange="javascript:cityChange()"/>  
				<option disabled selected value>-请选择学院-</option>
   				<#list collegeList as item>
    				<option value="${item.cid}">${item.name}</option>
				</#list>
			   </select><br>
		所在专业：<select id="mid" name="mid"/> 
					<option disabled selected value>-请选择专业-</option> 
			   </select><br>
		所在班级：<select id="classid" name="classid"/>  
				<option disabled selected value>-请选择班级-</option>
   				<#list classList as item>
    				<option value="${item.classid}">${item.classid}</option>
				</#list>
			   </select><br>
	             你的学号：<input type="number" name="sid" min="01" max="40"/><br>
	             你的名字：<input type="text" name="name" placeholder="请输入真实姓名"/><br>
	             请输入密码：<input type="text" name="password" placeholder="密码不能为空"/><br>
		<input type="submit" name="register" value="注册"/>
  	</form>
  </body>
</html>

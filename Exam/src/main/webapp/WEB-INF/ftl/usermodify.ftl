<html>
<head>
<title>历史考试</title>
<#assign ppath= request.contextPath/>
<script src="${ppath}/js/jquery-3.2.0.min.js" type="text/javascript"></script>
<script src="${ppath}/js/baseutil.js" type="text/javascript"></script>
<script src="${ppath}/js/layer.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${ppath}/css/style.css" />	
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

<body>
	
	<div class="tm_main">
    	
		<div class="tm_container">
			<ul class="tm_breadcrumb">
				<li><a href="${ppath}/welcome.jsp">首页</a> <span class="divider">&gt;</span></li>
				<li class="active">修改账户信息</li>
			</ul>
		</div>
        
        <div class="tm_container">
        	<div class="tm_navtitle">
				<h1>修改账户信息</h1>
                <span>在下列表单中修改您的账户信息</span>
            </div>
        </div>
        
        <br/>
        <div class="tm_container">
			<form action="${ppath}/exam/userModify" method="post" name="form1">
        	<table width="100%" cellpadding="5" border="0" class="tm_table_form">
            	<tbody>
                    <tr>
                        <th width="120">用户名 : </th>
                        <td><input type="text" name="username" value="${registername}" class="tm_txt" size="50" maxlength="30" disabled="true"/></td>
                    </tr>
					<tr>
                        <th>用户密码 : </th>
                        <td>
							<input type="password" id="password" name="password" class="tm_txt" size="50" maxlength="30" />
							<span class="tm_tip">请注意大小写</span> 

						</td>
                    </tr>
                    <tr>
                    	<th>确认密码：</th>
                    	<td>
                    		<input type="password" id="password" name="password" class="tm_txt" size="50" maxlength="30" />
                    	</td>
                    </tr>
                    
					
                </tbody>
                
                <tfoot>
                	<tr>
                    	<th></th>
                        <td>
                        	<button class="tm_btn tm_btn_primary" type="submit" onclick="return checkform1();">提交</button>
                        </td>
                    </tr>
                </tfoot>
            </table>

			</form>
        </div>
        
        
    </div>
</body>
</html>
<html>
<head>
<title>历史考试</title>
<#assign ppath= request.contextPath/>
<script src="${ppath}/js/jquery-3.2.0.min.js" type="text/javascript"></script>
<script src="${ppath}/js/baseutil.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${ppath}/css/style.css" />	
<script type="text/javascript">
	function validate() {
            var pw1 = document.getElementById("password").value;
            var pw2 = document.getElementById("password1").value;
            if(pw1 == "" || pw2 == ""){
            	alert("密码不能为空");
            	return false;
			}
            if(pw1 == pw2) {
                $.ajax({
            		data : {password : pw1},
                    type : "POST",
                    url : "${ppath}/exam/userModify",
                    success : function(data) {
                    	if(data == "1"){
                    		alert("修改成功！");
                    		window.location.href="${ppath}/welcome.jsp";
                    	}else if(data == "0"){
                    		alert("修改失败!");
                    	}
					}
				});	
				return true;
            }
            else {
            	alert("两次输入的密码不相同");
            	document.getElementById("password").value = "";
            	document.getElementById("password1").value = "";
                return false;
            }   
            return false;      
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
			<#-- <form action="${ppath}/exam/userModify" method="post" name="form1"> -->
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
                    		<input type="password" id="password1" name="password1" class="tm_txt" size="50" maxlength="30" />
                    	</td>
                    </tr>
                    
					
                </tbody>
                
                <tfoot>
                	<tr>
                    	<th></th>
                        <td>
                        	<button class="tm_btn tm_btn_primary" type="submit" onclick="return validate();">提交</button>
                        </td>
                    </tr>
                </tfoot>
            </table>

			<#-- </form> -->
        </div>
        
        
    </div>
</body>
</html>
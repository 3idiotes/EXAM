<html>
<head>
<title>index.html</title>
<meta name="content-type" content="text/html; charset=UTF-8">
<#assign ppath= request.contextPath/>
<link rel="stylesheet" type="text/css" href="${ppath}/css/style.css" />
<script src="${ppath}/js/baseutil.js" type="text/javascript"></script>
<script src="${ppath}/js/jquery-3.2.0.min.js" type="text/javascript"></script>
<style type="text/css">
.tm_login_body {
	background: url('${ppath}/images/bgpic.jpg');
	background-size: cover;
	-moz-background-size: cover;
	background-repeat: no-repeat;
}

.tm_login_container {
	width: 500px;
	margin: 200px auto;
	clear: both
}

.tm_login_title {
	height: 80px;
	margin: 10px 0 15px 0;
	background: #fff;
	text-align: center;
	border-bottom: solid 1px #eee;
}

.tm_login_title img {
	height: 50px;
}

.tm_login_title span {
	font-size: 23px;
	line-height: 80px;
	font-family: 'Microsoft Yahei', Tahoma, Geneva, 'Simsun';
}

.tm_login_form {
	width: 100%;
	height: 320px;
	clear: both;
	-moz-border-radius: 8px;
	-webkit-border-radius: 8px;
	border-radius: 8px;
	padding: 1px;
	background: #fff;
}

.tm_login_table {
	width: 400px;
	margin: 20px auto;
}

.tm_login_table tr th {
	width: 100px;
}

.tm_login_table tr td {
	width: 300px;
	text-align: left
}

.tm_login_title_table {
	width: 400px;
	margin: 0px auto;
}

.tm_login_title_table tr th {
	width: 100px;
}

.tm_login_title_table tr td {
	width: 300px;
	text-align: left
}

.tm_login_foot {
	width: 100%;
	line-height: 20px;
	text-align: center;
	clear: both;
	margin: 20px 0
}

html {
	overflow: hidden;
}

body {
	overflow: hidden;
}

td {
	text-align: center;
}
</style>

<script type="text/javascript">

 function doLogin(){
   var username = $("input[name='username']").val();
   var password = $("input[name='password']").val();
   if(baseutil.isEmpty(username)){
					alert('没有填写用户名');
					return;
	}
   if(baseutil.isEmpty(password)){
					alert('没有填写登录密码');
					return;
	}
	var CommitUrl = "${ppath}/user/login";	
		$.ajax({
            		data : {username:username, password:password},
                    type : "POST",
                    url : CommitUrl,
                    success : function(data) {
                    	if(data != ""){
                    		window.location.href="${ppath}/user/main";
                    	}else{
                    		alert("登录失败，用户名或密码错误！");
    					}
					}
                    });
 }
 
 function doRegister(){
   window.location.href="${ppath}/user/registerm";
 }
 
</script>

</head>
<body class="tm_login_body">

	<div class="tm_login_container">
		<div class="tm_login_form">
			<div class="tm_login_title">
				<table border="0" cellpadding="0" cellspacing="0"
					class="tm_login_title_table">
					<tr>

						<td></td>
						<td><span>在线考试系统</span></td>
						<td></td>

					</tr>
				</table>
			</div>

			<table border="0" cellpadding="5" cellspacing="0"
				class="tm_login_table">

				<tr>

					<th>用户名</th>
					<td><input type="text" class="tm_txt" name="username"
						maxlength="20" value="${registername}" style="width:255px" /></td>
				</tr>
				<tr>
					<th>密 &nbsp; 码</th>
					<td><input type="password" class="tm_txt" name="password"
						maxlength="20" value="" style="width:255px" /></td>
				</tr>

				<tr>
					<th></th>
					<td>
						<div style="margin-top:10px">
							<button type="button" class="tm_btn tm_btn_primary"
								style="width:50%" onclick="doLogin();">登录</button>

							<button type="button" class="tm_btn" style="width:40%"
								onclick="doRegister();">注册</button>
						</div>
					</td>
				</tr>

				<tr>
					<th></th>
					<td></td>
				</tr>
			</table>

		</div>

		<div class="tm_login_foot">
			<div>推荐使用Chrome内核、FireFox浏览器访问系统</div>
			<div>fdafsfassf &copy; TomExam.com All Right Reserved 2017-2066</div>
		</div>
	</div>

</body>
</html>

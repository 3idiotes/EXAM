<html>
<head>

<title>注册</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<#assign ppath= request.contextPath/>
<link rel="stylesheet" type="text/css" href="${ppath}/css/style.css" />
<style>
.tm_register_body {
	background: url('${ppath}/images/bgpic.jpg');
	background-size: cover;
	-moz-background-size: cover;
	background-repeat: no-repeat;
}

.tm_register_container {
	width: 500px;
	margin: 100px auto;
	clear: both
}

.tm_register_title {
	height: 80px;
	margin: 10px 0 15px 0;
	background: #fff;
	text-align: center;
	border-bottom: solid 1px #eee;
}

.tm_register_title img {
	height: 50px;
}

.tm_register_title span {
	font-size: 25px;
	line-height: 80px;
	font-family: 'Microsoft Yahei', Tahoma, Geneva, 'Simsun';
}

.tm_register_form {
	width: 100%;
	height: 630px;
	clear: both;
	-moz-border-radius: 8px;
	-webkit-border-radius: 8px;
	border-radius: 8px;
	padding: 1px;
	background: #fff;
}

.tm_register_table {
	width: 400px;
	margin: 20px auto;
}

.tm_register_table caption {
	text-align: center;
	margin: 0 0 10px 0
}

.tm_register_table tr th {
	width: 100px;
}

.tm_register_table tr td {
	width: 300px;
	text-align: left
}

.tm_register_title_table {
	width: 400px;
	margin: 0px auto;
}

.tm_register_title_table tr th {
	width: 100px;
}

.tm_register_title_table tr td {
	width: 300px;
	text-align: left
}

.tm_register_foot {
	width: 100%;
	line-height: 20px;
	text-align: center;
	clear: both;
	margin: 20px 0
}

.pw-strength {
	clear: both;
	margin-bottom: 15px;
	position: relative;
	top: 10px;
	width: 180px;
}

.pw-bar {
	background: rgba(0, 0, 0, 0) url("${ppath}/images/pwd-1.png") no-repeat
		scroll 0 0;
	height: 14px;
	overflow: hidden;
	width: 179px;
}

.pw-bar-on {
	background: rgba(0, 0, 0, 0) url("${ppath}/images/pwd-2.png") no-repeat
		scroll 0 0;
	height: 14px;
	left: 2px;
	position: absolute;
	top: 0;
	transition: width 0.5s ease-in 0s;
	width: 0;
}

.pw-weak .pw-defule {
	width: 0;
}

.pw-weak .pw-bar-on {
	width: 60px;
}

.pw-medium .pw-bar-on {
	width: 120px;
}

.pw-strong .pw-bar-on {
	width: 179px;
}

.pw-txt {
	overflow: hidden;
	padding-top: 2px;
	width: 180px;
}

.pw-txt span {
	color: #707070;
	float: left;
	font-size: 12px;
	text-align: center;
	width: 58px;
}
</style>




<script type="text/javascript" language="javascript"
	src="${ppath}/js/jquery-3.2.0.min.js"></script>
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
        
        function doGoBack(){
        	window.location.href="${ppath}/user/deleteQue";
        }
	</script>
</head>

<body class="tm_register_body">

	<div class="tm_register_container">
		<div class="tm_register_form">
			<div class="tm_register_title">
				<table border="0" cellpadding="0" cellspacing="0"
					class="tm_register_title_table">
					<tr>
						<td></td>
						<td><span>注册新用户</span></td>
						<td></td>
					</tr>
				</table>
			</div>

			<center>
				<h1 style="color:red">${registermsg}</h1>
			</center>
			<form action="${ppath}/user/register" method="post">
				<table border="0" cellpadding="5" cellspacing="0"
					class="tm_register_table">
					<caption>


						<p>填写以下表单信息，注册成为新用户</p>



					</caption>
					<tr>
						<th>入学年份</th>
						<td><select id="year" name="year" />
							<option disabled selected value>-请选择年份-</option> <#list yearList
							as item>
							<option value="${item.year}">${item.year}</option> </#list> </select> <span
							class="tm_required">*</span></td>
					</tr>
					<tr>
						<th>所在学院</th>
						<td><select id="cid" name="cid"
							onchange="javascript:cityChange()" />
							<option disabled selected value>-请选择学院-</option> <#list
							collegeList as item>
							<option value="${item.cid}">${item.name}</option> </#list> </select> <span
							class="tm_required">*</span></td>
					</tr>
					<tr>
						<th>所在专业</th>
						<td><select id="mid" name="mid" />
							<option disabled selected value>-请选择专业-</option> </select> <span
							class="tm_required">*</span></td>
					</tr>
					<tr>
						<th>所在班级</th>
						<td><select id="classid" name="classid" />
							<option disabled selected value>-请选择班级-</option> <#list classList
							as item>
							<option value="${item.classid}">${item.classid}</option> </#list>
							</select> <span class="tm_required">*</span></td>
					</tr>

					<tr>
						<th>你的学号</th>
						<td><input type="number" name="sid" min="01" max="40"
							class="validate[required,minSize[6]] tm_txt" /> <span
							class="tm_required">*</span></td>
					</tr>
					<tr>
						<th>真实姓名</th>
						<td><input type="text"
							class="validate[required,minSize[6]] tm_txt" name="name"
							maxlength="30" value="" style="width:200px" /> <span
							class="tm_required">*</span></td>
					</tr>
					<tr>
						<th>密码</th>
						<td><input type="password"
							class="validate[required,equals[u_userpass]] tm_txt"
							name="password" maxlength="30" value="" style="width:200px" /> <span
							class="tm_required">*</span></td>
					</tr>
					<tr>
						<th>确认密码</th>
						<td><input type="password"
							class="validate[required,equals[u_userpass]] tm_txt"
							name="repassword" maxlength="30" value="" style="width:200px" />
							<span class="tm_required">*</span></td>
					</tr>

					<tr>
						<th></th>
						<td>
							<div style="margin-top:40px">


								<button type="submit" class="tm_btn tm_btn_primary"
									style="width:50%">提交</button>




								<button type="button" class="tm_btn" onclick="doGoBack();"
									style="width:30%">返回</button>
							</div>
						</td>
					</tr>
					<tr>
						<th></th>
						<td></td>
					</tr>
				</table>
			</form>
		</div>

		<div class="tm_register_foot">
			<div>推荐使用Chrome内核、FireFox浏览器访问系统</div>
			<div>Copyright &copy; TomExam.com All Right Reserved 2009-2016</div>
		</div>
	</div>

</body>

</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>head</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<script type="text/javascript">
		var tm_var_menustatus = 0;
		function tm_switch_menu(){
			if(tm_var_menustatus==0){
				tm_var_menustatus = 1;
				$('#mainframe', window.parent.document).attr("cols","0,*");
			}else{
				tm_var_menustatus = 0;
				$('#mainframe', window.parent.document).attr("cols","200,*");
			}
			
		}

		var tm = {
			logout : function(){
				if(window.confirm('确定要退出登录吗？')){
					$.ajax({
						type: "POST",
						url: "exam/loginOut",
						data: "",
						success: function(msg){
							top.location.href="index/index";
						},
						error : function(){
							top.location.href = "";
						}
					});
				}
			}
		};

		var tm_activemenu = function(obj){
			$(obj).parent().parent().children("li").attr("class","");
			$(obj).parent().attr("class","active");
		}

	</script>
</head>
<body>
	<div class="tm_head">


		<div class="tm_head_switch">
			<a href="javascript:void(0);" onclick="tm_switch_menu()"><img
				src="images/ico_lines.png" /></a>
		</div>

		<div class="tm_head_menu">
			<ul>
			</ul>
		</div>

		<div class="tm_head_tools">
			<img src=" images/ico_account.png" align="absmiddle" /> <span
				style="cursor:pointer"
				title='真实姓名 : ${sessionScope.username}   &#10学号 : ${sessionScope.registername} '>
				${sessionScope.username} </span> | <a href="exam/toUserModify" target="main">账号修改</a> | <a
				href="javascript:void(0);" onclick="return tm.logout();">退出</a>
		</div>



	</div>

	
</body>
</html>
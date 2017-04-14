<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>menu</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<script type="text/javascript">
	function tm_toggle_menu(obj) {
		$(obj).parent().siblings().toggle();
	}
	function tm_mark_current_menuitem() {

	}

	$(document).ready(function() {
		$(".tm_menu_item ul li a").click(function() {
			$(".tm_menu_item ul li").removeClass("itemon");
			$(this).parent().addClass("itemon");
		});

	});

	document.oncontextmenu = function() {
		return false;
	}
</script>

<style>
.tmc_menu_qdb {
	background: url('images/menu_qdb.png') no-repeat 8px 8px;
}

.tmc_menu_paper {
	background: url('images/menu_paper.png') no-repeat 8px 8px;
}

.tmc_menu_analysis {
	background: url('mages/menu_analysis.png') no-repeat 8px 8px;
}

.tmc_menu_user {
	background: url('images/menu_users.png') no-repeat 8px 8px;
}

.tmc_menu_interaction {
	background: url('images/menu_interaction.png') no-repeat 8px
		8px;
}

.tmc_menu_system {
	background: url('images/menu_system.png') no-repeat 8px 8px;
}

.tmc_menu_learn {
	background: url('images/menu_learn.png') no-repeat 8px 8px;
}

.tmc_menu_test {
	background: url('images/menu_test.png') no-repeat 8px 8px;
}

.tmc_menu_self {
	background: url('images/menu_self.png') no-repeat 8px 8px;
}

.tmc_menu_account {
	background: url('images/menu_account.png') no-repeat 8px 8px;
}
</style>
</head>
<body oncontextmenu="return false">

	<div class="tm_menu">





		<div class="tm_menu_item clearfix">
			<h2>
				<a href="javascript:void(0);" onclick="tm_toggle_menu(this)"
					class="tmc_menu_test">我的考试</a>
			</h2>
			<ul>
				<li><a href="exam/myExam" target="main">我的试卷</a></li>
				<li><a href="exam/hisExam" target="main">历史考试</a></li>
			</ul>
		</div>

		<div class="tm_menu_item clearfix">
			<h2>
				<a href="javascript:void(0);" onclick="tm_toggle_menu(this)"
					class="tmc_menu_self">自我检测</a>
			</h2>
			<ul>
				<li><a href="user/selftest/new.thtml" target="main">自我检测</a></li>
				<li><a href="user/selftest/history.thtml" target="main">自我检测记录</a></li>
			</ul>
		</div>

		<div class="tm_menu_item clearfix">
			<h2>
				<a href="javascript:void(0);" onclick="tm_toggle_menu(this)"
					class="tmc_menu_learn">学习系统</a>
			</h2>
			<ul>
				<li><a href="user/course/list.thtml" target="main">课程列表</a></li>
				<li><a href="user/course/my.thtml" target="main">我的课程</a></li>
			</ul>
		</div>

		<div class="tm_menu_item clearfix">
			<h2>
				<a href="javascript:void(0);" onclick="tm_toggle_menu(this)"
					class="tmc_menu_account">个人信息</a>
			</h2>
			<ul>
				<li><a href="exam/getErrQueList" target="main">我的错题集</a></li>
				<li><a href="exam/userMessage" target="main">账户信息</a></li>
			</ul>
		</div>


	</div>


</body>
</html>
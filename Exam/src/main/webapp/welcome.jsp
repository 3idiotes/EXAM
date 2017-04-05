<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
</head>
<body>

	<div class="tm_main" style="min-width:1000px">

		<div class="tm_container">
			<ul class="tm_breadcrumb">
				<li>首页</li>
			</ul>
		</div>

		<div class="tm_container">
			<div class="tm_navtitle">
				<h1>欢迎使用</h1>
				<span>欢迎使用在线考试系统</span>
			</div>
		</div>



		<script src="inc/js/layer/layer.js" type="text/javascript"></script>

		<script type="text/javascript">
				var tm = {
					startExam : function(obj, pid){
						var _tr = $(obj).parent().parent();
						var _p_name = _tr.children("td").eq(0).text();
						var _p_time = _tr.children("td").eq(2).text();
						var _p_totalscore = _tr.children("td").eq(4).text();
						var _p_passscore = _tr.children("td").eq(5).text();
						

						var html = [];
						html.push('<div style="margin:20px">');
						html.push('	<p style="line-height:20px">确定进入试卷并开始考试吗？</p>');
						
						html.push('	<table style="margin:0 auto; width:350px" border="0" cellpadding="0" cellspacing="0">');
						html.push('	<tr>');
						html.push('		<td width="80"><img src="skins/images/paper_pencil.png" width="60" /></td>');
						html.push('		<td><p><b>试卷名称</b>：'+_p_name+'<p>');
						html.push('			<p><b>考试时长</b>：'+_p_time+'<p>');
						html.push('			<p><b>卷面总分</b>：'+_p_totalscore+'<p>');
						html.push('			<p><b>及格分数</b>：'+_p_passscore+'<p>');
						html.push('		</td>');
						html.push('	</tr>');
						html.push('</table>');

						html.push('<p style="text-align:center; margin-top:30px">');
						html.push('<button class="tm_btn tm_btn_primary" type="button" onclick="tm.joinExam(\''+pid+'\',this)">确定</button>');
						html.push('</p>');

						html.push('</div>');

						layer.open({
						  type: 1,
						  title: '开始考试',
						  shadeClose: true,
						  shade: 0.8,
						  area: ['450px', '310px'],
						  content: html.join("")
						}); 

						return false;
					},
					joinExam : function(pid, _me){
						$(_me).text('请稍等...');
						$(_me).attr("disabled", true);
						setTimeout(function(){
							window.location.href="http://demo.tomexam.com/user/paper/paper_detail.thtml?pid="+pid;
						}, 3000);
					}
				};
			</script>

		<div class="tm_container">
			<div class="tm_blocker2">
				<h2>系统公告</h2>
				<table width="100%" cellpadding="10" border="0" class="tm_news_list">
					<thead>
						<tr>
							<th
								style="background:#f5f5f5; text-align:left; border-bottom:solid 1px #ddd">标题</th>
							<th style="background:#f5f5f5; border-bottom:solid 1px #ddd">发布时间</th>
						</tr>
					</thead>
					<tbody>




						<tr>
							<td>[<a href="">系统公告</a>] <a
								href="">震惊！退役军人竟暴打52岁老人</a></td>
							<td width="150">time</td>
						</tr>

						<tr>
							<td>[<a href="">系统公告</a>] <a
								href="">你知道吗，在中国每过一分钟生命就消耗60秒！</a></td>
							<td width="150">time</td>
						</tr>

						<tr>
							<td>[<a href="">系统公告</a>] <a
								href="">谁能想到30岁的他在20年前还是个孩子！</a></td>
							<td width="150">time</td>
						</tr>




					</tbody>
				</table>
			</div>
		</div>


		<div class="tm_container">
			<div class="tm_blocker2">
				<h2>输入输入输入</h2>
				<table width="100%" cellpadding="10" border="0"
					class="tm_table_list">
					<thead>
						<tr>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
						</tr>
					</thead>
					<tbody>




						<!-- 当前日期 -->



						<!-- 当前试卷的截止日期 -->


						<tr>
							<td>456123</td>
							<td>输入输入输入<br />输入输入输入
							</td>
							<td><span class="tm_label">输入输入输入</span> 输入输入输入</td>
							<td>输入输入输入</td>
							<td><span class="tm_label">输入输入输入</span></td>
							<td><span class="tm_label">输入输入输入</span></td>
							<td><font color="gray">输入输入输入</font></td>
						</tr>

						<!-- 当前试卷的截止日期 -->


						<tr>
							<td>输入输入输入</td>
							<td>输入输入输入<br />输入输入输入
							</td>
							<td><span class="tm_label">输入输入输入</span>输入输入输入</td>
							<td><b>输入输入输入</b></td>
							<td><span class="tm_label">输入输入输入</span></td>
							<td><span class="tm_label">输入输入输入</span></td>
							<td><font color="gray">输入输入输入</font></td>
						</tr>



					</tbody>
				</table>
			</div>
		</div>

		<div class="tm_container">
			<div class="tm_blocker2">
				<h2>输入输入输入</h2>
				<table width="100%" cellpadding="10" border="0"
					class="tm_table_list">
					<thead>
						<tr>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
							<th>输入输入输入</th>
						</tr>
					</thead>
					<tbody>




						<tr>
							<td>输入输入输入</td>
							<td><span class="tm_label">输入输入输入</span> 输入输入输入</td>
							<td><span class="tm_label">输入输入输入</span> 输入输入输入</td>
							<td>输入输入输入<br />输入输入输入
							</td>
							<td><font color="gray"><b>输入输入输入</b></font></td>
							<td><font color="gray">--</font></td>
						</tr>

						<tr>
							<td>输入输入输入</td>
							<td><span class="tm_label">输入输入输入</span> 输入输入输入</td>
							<td><span class="tm_label">输入输入输入</span> 输入输入输入</td>
							<td>输入输入输入<br />输入输入输入
							</td>
							<td><font color="gray"><b>输入输入输入</b></font></td>
							<td><font color="gray">--</font></td>
						</tr>

						<tr>
							<td>输入输入输入</td>
							<td><span class="tm_label">输入输入输入</span> 输入输入输入</td>
							<td><span class="tm_label">输入输入输入</span> 输入输入输入</td>
							<td>输入输入输入<br />输入输入输入
							</td>
							<td><span class="tm_label">输入输入输入</span> <font color="red"><b>输入输入输入</b></font>




							</td>
							<td><a
								href="">详情</a>




							</td>
						</tr>



					</tbody>
				</table>
			</div>
		</div>

		<div class="tm_container"></div>




	</div>

	<p>&nbsp;</p>
</body>
</html>
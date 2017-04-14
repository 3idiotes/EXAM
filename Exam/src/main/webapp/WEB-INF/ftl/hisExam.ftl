<html>
<head>
<title>历史考试</title>

<#assign ppath= request.contextPath/>
<script src="${ppath}/js/jquery-3.2.0.min.js" type="text/javascript"></script>
<script src="${ppath}/js/baseutil.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${ppath}/css/style.css" />	

</head>
<body>
	<div class="tm_main">
    	
		<div class="tm_container">
			<ul class="tm_breadcrumb">
				<li><a href="${ppath}/welcome.jsp">首页</a> <span class="divider">&gt;</span></li>
				<li class="active">历史考试信息</li>
			</ul>
		</div>
        
        <div class="tm_container">
        	<div class="tm_navtitle">
				<h1>历史考试信息</h1>
                <span>以下列表为参加过的考试详情</span>
            </div>
        </div>
        
        <br/>
        <table class="tm_table_list" width="100%" border="0" cellpadding="10">
            	<thead>
                	<tr>
                        <th>试卷类型</th>
						<th>交卷时间</th>
                        <th>卷面总分</th>
                    </tr>
                </thead>
                
               	<#list HisExamList as item>
                <tbody>
                
					<tr style="background:#ffffff">
                		<td><#if item.examtype == "0">
							随机考试
							<#elseif item.examtype == "1">
							错题考试
							</#if></td>
						<td>${item.submitime}</td>
						<td>${item.score}</td>
					</tr>
				 
                </tbody>
               </#list>
              
            </table>
        
        
    </div>
	
	
</body>
</html>
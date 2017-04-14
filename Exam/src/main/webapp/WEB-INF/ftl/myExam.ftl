
<html>
<head>
<title>我的试卷</title>

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
				<li class="active">我的试卷</li>
			</ul>
		</div>
        
        <div class="tm_container">
        	<div class="tm_navtitle">
				<h1>我的试卷</h1>
                <span>我的试卷，选择测试类型。</span>
            </div>
        </div>
		<br/>
		
		<table class="tm_table_list" width="100%" border="0" cellpadding="10">
            	<thead>
                	<tr>
                        <th>试卷类型</th>
                        <th>卷面总分</th>
                        <th>及格分数</th>
                        <th>操作</th>
                    </tr>
                </thead>
                
               	
                <tbody>
                
					<tr style="background:#ffffff">
                		<td>随机考试</td>
						<td>100</td>
						<td>60</td>
						<td><input type="button" class="tm_btn tm_btn_primary" onclick="" value="选择考试"/></td>
					</tr>
					
					<tr style="background:#ffffff">
                		<td>错题考试</td>
						<td>100</td>
						<td>60</td>
						<td><input type="button" class="tm_btn tm_btn_primary" onclick="" value="选择考试"/></td>
					</tr>
				 
                </tbody>
               
              
            </table>
		
		
      
    </div>


</body>
</html>
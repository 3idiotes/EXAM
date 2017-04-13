<html>
<head>
<title>账户信息</title>
<#assign ppath= request.contextPath/>
<script src="${ppath}/js/jquery-3.2.0.min.js" type="text/javascript"></script>
<script src="${ppath}/js/baseutil.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${ppath}/css/style.css" />	

</head>
<#assign ppath= request.contextPath/>
<body>
	
	<div class="tm_main">
    	
		<div class="tm_container">
			<ul class="tm_breadcrumb">
				<li><a href="${ppath}/welcome.jsp">首页</a> <span class="divider">&gt;</span></li>
				<li class="active">账户信息</li>
			</ul>
		</div>
        
        <div class="tm_container">
        	<div class="tm_navtitle">
				<h1>账户信息</h1>
                <span>以下列表显示当前用户信息</span>
            </div>
        </div>
        
        <br/>
        <div class="tm_container">
			
        	<table width="100%" cellpadding="5" border="0" class="tm_table_form">
            	<tbody>
                    <tr>
                        <th width="120">账户名 : </th>
                        <td><a>${registername}</a></td>
                    </tr>
					<tr>
                        <th>姓名 : </th>
                        <td>
							<a>${username}</a>
						</td>
                    </tr>
                    <tr>
                    	<th>年级：</th>
                    	<td>
                    		<a>${year}</a>级
                    	</td>
                    </tr>
                    <tr>
                    	<th>学院：</th>
                    	<td>
                    		<a>${college}</a>
                    	</td>
                    </tr>
                    <tr>
                    	<th>专业：</th>
                    	<td>
                    		<a>${major}</a>
                    	</td>
                    </tr>
                    <tr>
                    	<th>班级：</th>
                    	<td>
                    		<a>${class}</a>
                    	</td>
                    </tr>
                    <tr>
                    	<th>学好：</th>
                    	<td>
                    		<a>${student}</a>
                    	</td>
                    </tr>
                    
					
                </tbody>
                
                
            </table>

			
        </div>
        
        
    </div>
	
</body>
</html>
<html>
<head>
<title>我的收藏</title>

<#assign ppath= request.contextPath/>
<script src="${ppath}/js/jquery-3.2.0.min.js" type="text/javascript"></script>
<script src="${ppath}/js/baseutil.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${ppath}/css/style.css" />	

<style>
    	.tm_collection{margin: 10px 10px; position: relative;}
    	.tm_collection p{ text-align:left; margin: 0 0; padding: 0 40px 0 0; white-space:normal; }
    	.tm_collection h1{ text-align:left; margin: 0 0; padding: 0 40px 0 0; font-weight: normal; font-size: 12px;}
    	.tm_collection h2{ text-align:left; margin: 0 0; padding: 0 40px 0 0; font-weight: normal; font-size: 12px;}
    	.tm_collection h5{ text-align:left; margin: 0 0; padding: 0 0; font-weight: normal; font-size: 12px; position: absolute; top: 0; right: 5px}
    	.tm_collection h5 a{display: block; width: 16px; height: 16px; background: url('${ppath}/images/delete.png') no-repeat;}
		.tm_collection hr{height:1px;border:none;border-top:1px dashed #eee;}
		.tm_collection div{text-align:left; color:#aaa; line-height:20px;}

		.tm_collection ul{margin:5px 0; padding:0; list-style:none; text-align:left}
		.tm_collection ul li{}
		.tm_collection ul li p{display:inline}

</style>


<script type="text/javascript">
	function deleteCollection(){
		alert("deletedTest");
	}
</script>

</head>
<body>
	<div class="tm_main">
    	
		<div class="tm_container">
			<ul class="tm_breadcrumb">
				<li><a href="common/welcome.thtml">首页</a> <span class="divider">&gt;</span></li>
				<li class="active">我的收藏</li>
			</ul>
		</div>
        
        <div class="tm_container">
        	<div class="tm_navtitle">
				<h1>我的收藏</h1>
                <span>试题收藏夹，如下列表是收藏过的考试试题。</span>
            </div>
        </div>

		
        
        <div class="tm_container">
        	<table width="100%" cellpadding="0" border="0">
        		<tr>
        			<td valign="top">
						
						
						<div style="padding:8px; border:solid 1px #eee;">
							不定项选择题
						</div>

        				<table width="100%" border="0" class="tm_table_list">
			                <tbody>
								
								<tr>
									<td>
										
										<div class="tm_collection">											
													<p></p>				
													<ul>
														
													</ul>
													<h1><b>标准答案 : </b></h1>
											
											<hr/>
											
											<div></div>
										</div>
										
									</td>
								</tr>								
							</tbody>
			            </table>
						
        			</td>
        		</tr>
        	</table>
        </div>        
    </div>
</body>
</html>
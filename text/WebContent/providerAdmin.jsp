<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
<script type="text/javascript" src="jslib/jquery-3.1.1.min.js"></script>
<link type="text/css" rel="stylesheet" href="css/style.css">
<script type="text/javascript">

function doit(flag,id)
{
	if(flag=="del")
	{
		if(confirm("确认删除吗？")!=true)
			return;
	}
	window.location = "provider.do?id="+id+"&flag="+flag;
}
 
 $(function(){
	 
	 $("#zcx").click(function(){
				alert("aaa");
		 $.ajax({
			 
				type:"get",
				url:"suppcx",
				async:true,
				success:function(re){
					
					$("[name='r']").remove();
					var $al=$.parseJSON(re);
					
					for(var i=0;i<$al.length;i++){
						$("<tr  name='r' class='tt"+i+"'></tr>").appendTo(".list");
						$("<td  name='r' class='td"+i+"1' width='70' height='29'></td>").appendTo(".tt"+i);
						$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].id).appendTo(".td"+i+"1");
						$("<td  name='r' width='80' class='td"+i+"2'></td").appendTo(".tt"+i);
						$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].name).appendTo(".td"+i+"2");
						$("<td  name='r'  width='80' class='td"+i+"3'></td").appendTo(".tt"+i);
						$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].describe).appendTo(".td"+i+"3");
						$("<td  name='r' width='80' class='td"+i+"4'></td").appendTo(".tt"+i);
						$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].username).appendTo(".td"+i+"4");
						$("<td  name='r' width='80' class='td"+i+"5'></td").appendTo(".tt"+i);
						$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].tel).appendTo(".td"+i+"5");
						$("<td  name='r' width='80' class='td"+i+"6'></td").appendTo(".tt"+i);
						$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].addres).appendTo(".td"+i+"6");
					
					}
				},
				
				error:function(){
					alert("error")
				},
				data:{
					name:$("[name='providerName']").val(),
					describe:$("[name=providerDesc]").val()
				}
			})
			
	 
	 
	 });
	 });

</script>
<script type="text/javascript">

	
$.ajax({
	type:"get",
	url:"supper",
	async:true,
	success:function(re){
		
		var $al=$.parseJSON(re);
	
		for(var i=0;i<$al.length;i++){
			$("<tr  name='r' class='tt"+i+"'></tr>").appendTo(".list");
			$("<td  name='r' class='td"+i+"1' width='70' height='29'></td>").appendTo(".tt"+i);
			$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].id).appendTo(".td"+i+"1");
			$("<td  name='r' width='80' class='td"+i+"2'></td").appendTo(".tt"+i);
			$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].name).appendTo(".td"+i+"2");
			$("<td  name='r'  width='80' class='td"+i+"3'></td").appendTo(".tt"+i);
			$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].describe).appendTo(".td"+i+"3");
			$("<td  name='r' width='80' class='td"+i+"4'></td").appendTo(".tt"+i);
			$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].username).appendTo(".td"+i+"4");
			$("<td  name='r' width='80' class='td"+i+"5'></td").appendTo(".tt"+i);
			$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].tel).appendTo(".td"+i+"5");
			$("<td  name='r' width='80' class='td"+i+"6'></td").appendTo(".tt"+i);
			$("<div name='r' class='STYLE1' align='center'></div>").html($al[i].addres).appendTo(".td"+i+"6");
		}
	
		
		
		
		
	
	
	},
	error:function(){
		alert("error")
	},

});

</script>

</head>
<body>
<div class="menu">

<table>
<tbody><tr><td><form method="post" id="fr">
<input name="flag" value="search" type="hidden">
供应商名称：<input name="providerName" class="input-text" type="text"> &nbsp;&nbsp;&nbsp;&nbsp;供应商描述：<input name="providerDesc" class="input-text" type="text">&nbsp;&nbsp;&nbsp;&nbsp;<input id="zcx" value="组 合 查 询" type="button">
</form></td></tr>
</tbody></table>
</div>
<div class="main">
<div class="optitle clearfix">
<em><input value="添加数据" class="input-button" onclick="window.location='providerAdd.html'" type="button"></em>
		<div class="title">供应商管理&gt;&gt;</div>
	</div>

	<div class="content">
<table class="list">
  <tbody><tr>
    <td width="70" height="29"><div class="STYLE1" align="center">编号</div></td>
    <td width="80"><div class="STYLE1" align="center">供应商名称</div></td>
    <td width="100"><div class="STYLE1" align="center">供应商描述</div></td>
    <td width="100"><div class="STYLE1" align="center">联系人</div></td>

    <td width="100"><div class="STYLE1" align="center">电话</div></td>
    <td width="100"><div class="STYLE1" align="center">地址</div></td>
  </tr>

  
</tbody></table>
	</div>
</div>
</body></html>
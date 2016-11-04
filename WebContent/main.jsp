<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/main_css.css">
<script type="text/javascript" src="js/main_js.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页面Main</title>
</head>
<body>
	
	<div id="main_body" >
		<div id="main_lianjie">我以有账号登录后台&nbsp;<a href="index.jsp">快速登录</a></div>
		<div id="main_photo">
				<IMG src="photo/2.jpg" style="display:none;"id="div1" border="0">
				<IMG src="photo/4.jpg" style="display:none;"id="div2" border="0">
				<IMG src="photo/3.jpg" style="display:none;" id="div3" border="0">
			
		</div>
	</div>
	<div id="main_wei">
			<ul>
			<li>心制集团|</li>
			<li>心制集团|</li>
			<li>心制集团|</li>
			<li>心制集团|</li>
			<li>心制集团|</li>
			<li>心制集团|</li>
			<li>心制集团|</li>
			<li>心制集团|</li>
			<li>心制集团|</li>
			<li>心制集团|</li>
			<li>心制集团</li>
			</ul>
	</div>


</body>
<SCRIPT language="JavaScript">
                var NowFrame = 1;
				var MaxFrame =3;
				function show() {
					for(var i=1;i<(MaxFrame+1);i++){
					if(i==NowFrame)
					document.getElementById('div'+NowFrame).style.display ='';    //当前图片显示
					else
					document.getElementById('div'+i).style.display ='none';   //其他的图片隐藏
					}
			       { if(NowFrame == MaxFrame)  //定义下一张显示的图片
					NowFrame = 1;
				   else
					NowFrame++;}
					 theTimer=setTimeout('show()', 3000);  //设置定时器，显示下一张显示的图片
				}
				window.onload=show();		
</SCRIPT>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/js.js"></script>
<link rel="stylesheet" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
	<!--导航栏开始-->
		<div id="header">
			<div id="header_loginLine">
				<a href="#">返回主页</a>
			</div>
		</div>
	<!--导航栏结束-->
	<!--网页内容开始-->
		<div id="wai">
			<div id="wai_head">
				<span onclick = "qiehuan1()"><a href="#">账号注册</a></span>
				<span>|</span>
				<span onclick = "qiehuan2()"><a href="#">账号登录</a></span>
			</div>
			<div id="login_body">
			<div id="shouji">
				<form action="loginAction_addLogin" method="post">
					<div>
						<input type="text"  name="log.loginName" value="用户注册" class="inputt" onclick="this.value=''"/>
					</div>
					<div>
						<input type="password" name="log.loginPas"   class="inputt"  onclick="this.value=''" />
					</div>
					<div>
						<input type="submit" value="立即注册" id="aa"/>
					</div>
				</form>
			</div>
			
			<!-- 登录页面 -->
			<div id="zhanghu">
				<form action="loginAction_querylogin" method="post">
					<div>
						<input type="text" name="log.loginName" value="用户登录" class="inputt" onclick="this.value=''"/>
					</div>
					<div>
						<input  type="password" name="log.loginPas"  class="inputt" onclick="this.value=''"/>
					</div>
					<div>
						<input type="submit" value="立即登录" id="aa"/>
					</div>
				</form>
			</div>
			</div>
		</div>
</body>
</html>
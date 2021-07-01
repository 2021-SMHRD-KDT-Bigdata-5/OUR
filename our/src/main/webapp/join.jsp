<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<title>Generic - Forty by HTML5 UP</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css" />
	<noscript>
		<link rel="stylesheet" href="assets/css/noscript.css" />
	</noscript>
</head>
<style> </style>
<body class="is-preload" style="text-align : center;">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<a href="index.html" class="logo"><strong>Forty</strong> <span>by HTML5 UP</span></a>
			
		</header>

		<!-- Menu -->
	

		<!-- One -->
		<section id="one">
			<div class="inner">
		
				<ul class="actions vertical">
							<li><h3 align="center" >회원가입</h3></li>
								<form action="JoinCon" method="post">
									<li><input type="text" name="id" placeholder="아이디를 입력하세요"
              									 id="input_id"> <input type="button" value="중복체크"
               									 onclick="idCheck()"> <span id="sp"></span></li>
									
									
									<li><input type="password"  placeholder="PW를 입력하세요" name="pw"></li>
									<li><input type="text"  placeholder="이름을 입력하세요" name="name"></li>
									<li><input type="submit" value="가입완료" class="button fit"></li>
								</form>
						</ul>
			
			</div>
		</section>



	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>
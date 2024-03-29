<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 검색</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>

<%
	List<Map<String, Object>> list = new ArrayList<>();
	Map<String, Object> map = new HashMap<String, Object>() {{ put("name", "버거킹"); put("menu", "햄버거"); put("point", 4.3); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "BBQ"); put("menu", "치킨"); put("point", 3.8); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "교촌치킨"); put("menu", "치킨"); put("point", 4.1); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "도미노피자"); put("menu", "피자"); put("point", 4.5); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "맥도날드"); put("menu", "햄버거"); put("point", 3.8); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "BHC"); put("menu", "치킨"); put("point", 4.2); } };
	list.add(map);
	map = new HashMap<String, Object>() {{ put("name", "반올림피자"); put("menu", "피자"); put("point", 4.3); } };
	list.add(map);

	
%>

<%
	String inputMenu = request.getParameter("menu");
	String pointCheck = request.getParameter("pointCheck");
	
	if (pointCheck == null) {
		pointCheck = "";
	}
%>

	<div class="container text-center">
		<div>
			<h1>검색 결과</h1>
		</div>
			
		<table class="table ">
			<tr>
				<th>메뉴</th>
				<th>상호</th>
				<th>별점</th>
			</tr>

<%
	for(Map<String, Object> store : list) {
		if (store.get("menu").equals(inputMenu)) {
			// 4.0 이하 제외 체크된 경우
			if (pointCheck.equals("on")) {
				if ((double) store.get("point") > 4.0) {
%>
			<tr>
				<td><%= store.get("menu") %></td>
				<td><%= store.get("name") %></td>
				<td><%= store.get("point") %></td>
			</tr>

<%
				}
			}

			else if (pointCheck.isEmpty()) {
%>
			<tr>
				<td><%= store.get("menu") %></td>
				<td><%= store.get("name") %></td>
				<td><%= store.get("point") %></td>
			</tr>
<%
			}
		}
	}
%>			
		</table>

	</div>


</body>
</html>
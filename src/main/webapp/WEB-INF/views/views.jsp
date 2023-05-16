<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <form action="write.do" method="post">
        <label>HIT: int</label>
        <input type="text" name="hit"><br />
        <label>Title</label>
        <input type="text" name="title"><br />
        <label>WriteDate</label>
        <input type="text" name="writeDate"><br />
        <label>Writer</label>
        <input type="text" name="writer">
        <button>버튼</button>
    </form>
    ${list}
</body>
</html>
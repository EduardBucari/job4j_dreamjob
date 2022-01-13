<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.io.File" %>
<!doctype html>
<html lang="en">
<head>
    <title>Удаление</title>
</head>
<body>
<%
    String id = request.getParameter("id");
    File file = new File("c:\\images\\" + id + ".jpeg");
    System.out.println(file.delete());
%>
<script type="text/javascript">
    setTimeout('window.location="candidates.do"',5);
</script>
</body>
</html>

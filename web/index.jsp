<%--
  Created by IntelliJ IDEA.
  User: 红菱
  Date: 2018/1/2
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Servlet验证码生成</title>
    <script type="text/javascript">
      function reloadCode() {
          var time = new Date().getTime();
          document.getElementById("imagecode").src="<%=request.getContextPath()%>/servlet/ImageServlet?d="+time;
      }
    </script>
  </head>
  <body>
  <form method="get" action="<%=request.getContextPath()%>/servlet/LoginServlet">
  验证码：<input type="text" name="checkcode"/>
  <img alt="验证码" id="imagecode" src="<%=request.getContextPath()%>/servlet/ImageServlet"/>
  <a href="javascript:reloadCode();">看不清楚</a>
  <br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>

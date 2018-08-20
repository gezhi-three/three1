<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/16
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>新增部门</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="place">
    <span>位置:</span>
    <ul class="placeul">
        <li><a href="index.html">首页</a></li>
        <li><a href="addjob.html">部门列表</a></li>
    </ul>
</div>

<div class="formbody">
    <div class="formtitle"><span>用户信息</span></div>

    <form action="/Section/add" method="post">
        <ul class="forminfo">
            <li><label>部门编号</label><input name="sectionId" type="text" class="dfinput"/>
                <i class="required">*</i>
            </li>
            <li><label>部门名称</label><input name="sectionName" type="text" class="dfinput"/>
                <i class="required">*</i>
            </li>
            <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认新增"/></li>
        </ul>
    </form>
</div>
</body>
</html>

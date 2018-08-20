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
    <title>新增用户</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="place">
    <span>位置:</span>
    <ul class="placeul">
        <li><a href="index.html">首页</a></li>
        <li><a href="addjob.html">用户管理</a></li>
    </ul>
</div>

<div class="formbody">
    <div class="formtitle"><span>用户信息</span></div>

    <form action="/Users/add" method="post">
        <ul class="forminfo">
            <li><label>用户名称</label><input name="usersUsername" type="text" class="dfinput"/>
                <i class="required">*</i>
            </li>
            <li><label>用户密码</label><input name="usersPassword" type="text" class="dfinput"/>
                <i class="required">*</i>
            </li>
            <li><label>用户状态</label><input name="usersState" type="text" class="dfinput"/>
                <i class="required">*</i>
            </li>
            <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认新增"/></li>
        </ul>
    </form>
</div>
</body>
</html>


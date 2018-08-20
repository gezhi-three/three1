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
    <title>新增职位</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="place">
    <span>位置:</span>
    <ul class="placeul">
        <li><a href="index.html">首页</a></li>
        <li><a href="addjob.html">职位管理</a></li>
    </ul>
</div>

<div class="formbody">
    <div class="formtitle"><span>新增职位</span></div>

    <form action="/Position/add" method="post">
        <ul class="forminfo">
            <li><label>职位名称</label><input name="positionName" type="text" class="dfinput"/>
                <i class="required">*</i>
            </li>
            <li><label>职位权限</label><input name="sectionPermission" type="text" class="dfinput"/>
                <i class="required">*</i>
            </li>
            <li><label>职位工资</label><input name="sectionSalary" type="text" class="dfinput"/>
                <i class="required">*</i>
            </li>
            <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认新增"/></li>
        </ul>
    </form>
</div>
</body>
</html>

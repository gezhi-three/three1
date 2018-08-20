<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/16
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>修改部门信息</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="place">
    <span>位置:</span>
    <ul class="placeul">
        <li><a href="/index">首页</a></li>
        <li><a href="/department/adddepartment">修改部门信息</a></li>
    </ul>
</div>

<div class="formbody">

    <div class="formtitle"><span>部门信息</span></div>
    <form action="/Section/mit">
        <ul class="forminfo">
            <li>
                <label>部门编号</label>
                <input name="sectionId" type="text" class="dfinput" value="${section.sectionId}" readonly="readonly"/>
                <i class="required">*</i>
            </li>
            <li>
            <li><label>部门名称</label><input name="sectionName" type="text" class="dfinput"
                                          value="${section.sectionName}"/>
                <i style="color: red;">*</i>
            </li>
            <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认修改"/></li>
        </ul>
    </form>
</div>
</body>
</html>

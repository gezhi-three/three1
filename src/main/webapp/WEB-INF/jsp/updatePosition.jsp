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
    <title>修改职位信息</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="place">
    <span>位置:</span>
    <ul class="placeul">
        <li><a href="/index">首页</a></li>
        <li><a href="/department/adddepartment">职位管理</a></li>
    </ul>
</div>

<div class="formbody">

    <div class="formtitle"><span>修改职位信息</span></div>
    <form action="/Position/mit">
        <ul class="forminfo">
            <li>
                <label>职位编号</label>
                <input name="positionId" type="text" class="dfinput" value="${position.positionId}" readonly="readonly"/>
                <i class="required">*</i>
            </li>
            <li>
            <li>
                <label>职位名称</label>
                <input name="positionName" type="text" class="dfinput" value="${position.positionName}"/>
                <i style="color: red;">*</i>
            </li>
            <li>
                <label>职位权限</label>
                <input name="positionPermission" type="text" class="dfinput" value="${position.positionPermission}"/>
                <i style="color: red;">*</i>
            </li>
            <li>
                <label>职位工资</label>
                <input name="positionSalary" type="text" class="dfinput" value="${position.positionSalary}"/>
                <i style="color: red;">*</i>
            </li>
            <li>
                <label>&nbsp;</label>
                <input name="" type="submit" class="btn" value="确认修改"/>
            </li>
        </ul>
    </form>
</div>
</body>
</html>

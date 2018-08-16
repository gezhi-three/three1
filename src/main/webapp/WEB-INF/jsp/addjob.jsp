<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>新增就业信息</title>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>

<body>

<div class="place">
    <span>位置:</span>
    <ul class="placeul">
        <li><a href="index.html">首页</a></li>
        <li><a href="addjob.html">新增用户信息</a></li>
    </ul>
</div>

<div class="formbody">
    <div class="formtitle"><span>用户信息</span></div>

    <ul class="forminfo">
        <form action="/addSection_S">
        <li><label>部门编号</label><input id="sectionId" type="text" class="dfinput"/></li>
        <li><label>部门名称</label><input id="sectionName" type="text" class="dfinput"/></li>
        <li><label>&nbsp;</label><input name="" type="button" class="btn" value="确认新增"/></li>
        </form>
    </ul>
</div>
</body>
</html>

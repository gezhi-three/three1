<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/15
  Time: 20:1
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Title</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="/css/employee.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="/js/jquery.js"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $(".click").click(function () {
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function () {
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function () {
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function () {
                $(".tip").fadeOut(100);
            });

        });
    </script>
</head>
<body>
<div class="place">
    <span>位置:</span>
    <ul class="placeul">
        <li><a href="index.html">首页</a></li>
        <li><a href="addjob.html">职位管理</a></li>
    </ul>
</div>

<div class="rightinfo">
    <div class="tools">

        <ul class="toolbar">
            <li class="click"><span><img src="/images/t01.png"/></span><a href="#">添加</a></li>
        </ul>
    </div>
    <table class="tablelist">
        <thead>
        <tr>
            <th>职位编号<i class="sort"><img src="/images/px.gif"/></i></th>
            <th>职位名称</th>
            <th>职位权限</th>
            <th>职位工资</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <list model.list as Position>
            <c:forEach items="${list}" var="list">
                <tr>
                    <td>${list.positionId}</td>
                    <td>${list.positionName}</td>
                    <td>${list.positionPermission}</td>
                    <td>${list.positionSalary}</td>
                    <td>
                        <a href="/Position/updatePosition?positionId=${list.positionId}" class="tablelink">修改</a>
                        <a href="/Position/deletePosition?positionId=${list.positionId}" class="tablelink">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </list>
        </tbody>
    </table>
    <div class="tip">
        <div class="tiptop"><span>提示信息</span><a></a></div>

        <div class="tipinfo">
            <span><img src="/images/ticon.png"/></span>
            <div class="tipright">
                <p>是否确认对信息的修改 ？</p>
                <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
            </div>
        </div>

        <div class="tipbtn">
            <input name="" type="button" class="sure" value="确定"/>&nbsp;
            <input name="" type="button" class="cancel" value="取消"/>
        </div>

    </div>
</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>
</body>
</html>

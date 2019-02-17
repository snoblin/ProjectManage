<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>result2</title>
</head>
<style>
	table{
		width: 100%;
		border-collapse: collapse;
	}
</style>
<body>
	<form method="post" action="tongji.action">
		<label>选择排序基准：
			<select name="jizhu">
				<option value="sbdw">申报单位</option>
				<option value="ktjb">项目级别</option>
				<option value="zjf">经费</option>
				<option value="pzsj">时间节点</option>
			</select>
		</label>
		<label>选择排序方式：
			<select name="fangshi">
				<option value="ASC">升序</option>
				<option value="DESC">降序</option>
			</select>
		</label>
		<input id="button" type="submit" value="确认"/>
	</form>
	<hr/>
	<table border="1">
		<thead>
			<tr>
				<th>课题方向</th>
				<th>课题类别</th>
				<th>课题属性</th>
				<th>课题级别</th>
				<th>学科分类</th>
				<th>申报单位</th>
				<th>项目名称</th>
				<th>负责人</th>
				<th>经费来源</th>
				<th>项目批号</th>
				<th>结题方式</th>
				<th>拨付途径</th>
				<th>批准时间</th>
				<th>研究周期</th>
				<th>总经费（万）</th>
				<th>项目第一参与</th>
				<th>项目第二参与</th>
				<th>项目第三参与</th>
				<th>项目第四参与</th>
				<th>项目第五参与</th>
				<th>是否提交</th>
				<th>是否立项</th>
			</tr>
		</thead>
		<tbody id="tb1">
			<c:forEach items="${sessionScope.infoList2}" var="info">
				<tr>
					<td>${info.ktfx}</td>
					<td>${info.ktlb}</td>
					<td>${info.ktsx}</td>
					<td>${info.ktjb}</td>
					<td>${info.xkfl}</td>
					<td>${info.sbdw}</td>
					<td>${info.projectname}</td>
					<td>${info.fzr}</td>
					<td>${info.jfly}</td>
					<td>${info.projectno}</td>
					<td>${info.jtfs}</td>
					<td>${info.bftj}</td>
					<td>${info.pzsj}</td>
					<td>${info.wcsj}</td>
					<td>${info.zjf}</td>
					<td>${info.member1}</td>
					<td>${info.member2}</td>
					<td>${info.member3}</td>
					<td>${info.member4}</td>
					<td>${info.member5}</td>
					<td>${info.sftj}</td>
					<td>${info.sflx}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table> 
</body>
</html>
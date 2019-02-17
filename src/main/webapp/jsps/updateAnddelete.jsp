<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UpdateAndDelete</title>
</head>
<style>
	table{
		width: 100%;
		border-collapse: collapse;
	}
</style>
<body>
	<form method="post" action="updateordelete.action">
		<label>输入录入时间：<input name="date" id="time" type="date"/></label>
		<input id="button" type="submit" value="确认"/>
	</form>
	<hr>
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
				<th>确认更新</th>
				<th>确认删除</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${sessionScope.infoList2}" var="info">
				<form method="post">
					<tr>
					<td><input type="text" value=${info.ktfx} name="text1"/></td>
					<td><input type="text" value=${info.ktlb} name="text2"/></td>
					<td><input type="text" value=${info.ktsx} name="text3"/></td>
					<td><input type="text" value=${info.ktjb} name="text4"/></td>
					<td><input type="text" value=${info.xkfl} name="text5"/></td>
					<td><input type="text" value=${info.sbdw} name="text6"/></td>
					<td><input type="text" value=${info.projectname} name="text7"/></td>
					<td><input type="text" value=${info.fzr} name="text8"/></td>
					<td><input type="text" value=${info.jfly} name="text9"/></td>
					<td><input type="text" value=${info.projectno} name="text10"/></td>
					<td><input type="text" value=${info.jtfs} name="text11"/></td>
					<td><input type="text" value=${info.bftj} name="text12"/></td>
					<td><input type="text" value=${info.pzsj} name="text13"/></td>
					<td><input type="text" value=${info.wcsj} name="text14"/></td>
					<td><input type="text" value=${info.zjf} name="text15"/></td>
					<td><input type="text" value=${info.member1} name="text16"/></td>
					<td><input type="text" value=${info.member2} name="text17"/></td>
					<td><input type="text" value=${info.member3} name="text18"/></td>
					<td><input type="text" value=${info.member4} name="text19"/></td>
					<td><input type="text" value=${info.member5} name="text20"/></td>
					<td><input type="text" value=${info.sftj} name="text21"/></td>
					<td>${info.sflx}</td>
					<td><input type="submit" formaction="update.action" value="修改" name="update"/></td>
					<td><input type="submit" formaction="delete.action" value="删除" name="delete"/></td>
				</tr>
				</form>
			</c:forEach>
		</tbody>
	</table> 
    </form>
</body>
</html>
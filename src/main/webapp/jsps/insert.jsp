<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert</title>
</head>
<style type="text/css">
	body{
        font-family: "microsoft yahei";
	}
	table{
		border-spacing:20px;
	}
	td{ 
		width:220px;
	}
	.td1,.td2{
		height:30px;
	}
	.button-1,.button-2{
		height:100%;
		width:100%;
		background-color: dimgrey;
	}
	input{
		display:block;
		border: 1px solid #e9ecef;
        border-radius: .25rem;
        height:25px;
        width: 90%;
	}
	.radio1,.radio2,.radio3,.radio4{
		display:inline;
		height:auto;
		width:20%;
	}
</style>
<body>
    <form method="POST" action="insert.action">
		<table align="center">
			<thead>
			<tr>
				<td><label>课题方向:<br/><input type="text" name="text1"/></label></td>
				<td><label>课题类别:<br/><input type="text" name="text2"/></label></td>
				<td><label>课题属性:<br/><input type="text" name="text3"/></label></td>
				<td><label>课题级别:<br/><input type="text" name="text4"/></label></td>
			</tr>
			<tr>
				<td><label>学科分类:<br/><input type="text" name="text5"/></label></td>
				<td><label>申报单位:<br/><input type="text" name="text6"/></label></td>
				<td><label>项目名称:<br/><input type="text" name="text7"/></label></td>
				<td><label>负责人:<br/><input type="text" name="text8"/></label></td>
			</tr>
			<tr>
				<td><label>经费来源:<br/><input type="text" name="text9"/></label></td>
				<td><label>项目批号:<br/><input type="text" name="text10"/></label></td>
				<td><label>结题方式:<br/><input type="text" name="text11"/></label></td>
				<td><label>拨付途径:<br/><input type="text" name="text12"/></label></td>
			</tr>
			<tr>
				<td><label>批准时间:<br/><input type="date" name="text13"/></label></td>
				<td><label>研究周期:<br/><input type="date" name="text14"/></label></td>
				<td><label>总经费（万）:<br/><input type="text" name="text15"/></label></td>
				<td><label>项目第一参与:<br/><input type="text" name="text16"/></label></td>
			</tr>
			<tr>
				<td><label>项目第二参与:<br/><input type="text" name="text17"/></label></td>
				<td><label>项目第三参与:<br/><input type="text" name="text18"/></label></td>
				<td><label>项目第四参与:<br/><input type="text" name="text19"/></label></td>
				<td><label>项目第五参与:<br/><input type="text" name="text20"/></label></td>
			</tr>
			</thead>
			<tbody>
			<tr>
				<td>
					<span>是否提交:</span>&nbsp;
					<label>Y:<input type="radio" name="radioG1" value="是" class="radio1"/></label>
					<label>N:<input type="radio" name="radioG1" value="否" class="radio2"/></label>
				</td>
			</tr>
			</tbody>
			<tfoot>
			<tr>
				<td class="td1" colspan="4">
					<input class="button-1" id="button-1" type="submit" value="提交"/>
				</td>
			</tr>
			<br/>
			<tr>
				<td class="td2" colspan="4">
					<input class="button-2" id="button-2" type="reset" value="重置"/>
				</td>
			</tr>
			</tfoot>
		</table>
    </form>
</body>
</html>
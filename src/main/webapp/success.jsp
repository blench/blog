<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>${request.info }</title>
<link rel="stylesheet" href="image/style.css" />
</head>

<body topmargin="0" leftmargin="0" bgcolor="#f3f3f3">
	<form id="Form1" method="post">
		<table width="1000" cellpadding="0" cellspacing="0" border="0">
			<tr height="100">
				<td colspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td align="right" width="400"><img src="image/success.gif"></td>
				<td width="20">&nbsp;</td>
				<td valign="top">
					<table width="400" border="1" cellpadding="0" cellspacing="0"
						style="BORDER-RIGHT: #cccccc 1px solid; BORDER-TOP: #cccccc 1px solid; BORDER-LEFT: #cccccc 1px solid; BORDER-BOTTOM: #cccccc 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #ffffff">
						<tr height="30">
							<td colspan="2" align="center" background="image/main/l-bg5.jpg"><font
								color="#ffff66"><b>成功</b></font></td>
						</tr>
						<tr height="150">
							<td align="center"></td>
							<%
								String url = (String) request.getAttribute("url");
								System.out.print(url);
								response.setHeader("REFRESH", "3;URL=" + url);
							%>
							<td><p>${request.info}3秒后自动跳转...如果没有跳转请<a href="${request.url }" color="red">点击这里</a></p></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

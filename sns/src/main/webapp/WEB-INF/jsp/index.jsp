<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>进销存管理系统</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<STYLE type=text/css>BODY {
	FONT-SIZE: 12px; COLOR: #000; LINE-HEIGHT: 20px; FONT-FAMILY: "宋体"
}
TD {
	FONT-SIZE: 12px; COLOR: #000; LINE-HEIGHT: 20px; FONT-FAMILY: "宋体"
}
TH {
	FONT-SIZE: 12px; COLOR: #000; LINE-HEIGHT: 20px; FONT-FAMILY: "宋体"
}
A:visited {
	FONT-SIZE: 12px; COLOR: #000; TEXT-DECORATION: none
}
A:link {
	FONT-SIZE: 12px; COLOR: #000; TEXT-DECORATION: none
}
</STYLE>

<META content="MSHTML 6.00.6000.16981" name=GENERATOR></HEAD>
<BODY bgColor=#afd3f7>
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<SCRIPT language=javascript>
	var flag = false;
	function check() {
		if($("input[name='vipNumber']").val().trim() == ""
			|| $("input[name='password']").val().trim() == "") {
			alert("密码或账号不能为空");
			return false;
		} else {
			return true;
		}
		
	}
</SCRIPT>

<TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%" align=center 
border=0>
  <TBODY>
  <TR>
    <TD vAlign=center align=middle>
      <FORM id="loginFrom" action="/login" method=post>
      <TABLE cellSpacing=0 cellPadding=0 width=494 align=center border=0>
        <TBODY>
        <TR>
          <TD vAlign=top background=/images/login_1.jpg 
          height=95>&nbsp;</TD></TR>
        <TR>
          <TD vAlign=top background=/images/login_2.jpg 
            height=166><TABLE cellSpacing=6 cellPadding=0 width="100%" 
              border=0><TBODY>
              <tr><TD width="50%">&nbsp;</TD>
                <TD width="14%"><B>${accountError }</B> </TD></tr>
              <TR>
                <TD width="50%" height=26>&nbsp;</TD>
                <TD width="14%"><B>用户帐号:</B> </TD>
                <TD width="36%"><INPUT style="WIDTH: 120px"
                  name="vip_number"></TD></TR>
              <tr><TD width="50%">&nbsp;</TD>
                <TD><B>${pwdError }</B> </TD></tr>
              <TR>
                <TD height=28>&nbsp;</TD>
                <TD><B>登录密码:</B> </TD>
                <TD><INPUT style="WIDTH: 120px" type=password
                  name="password"></TD></TR>
              <TR>
                <TD height=29>&nbsp;</TD>
                <TD>&nbsp;</TD>
                <TD><INPUT style="WIDTH: 81px; HEIGHT: 22px" 
                  onclick="check()" type=image 
                  src="/images/login_dot.jpg" 
              name=submit></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></FORM></TD></TR>
  <TR>
    <TD vAlign=top align=middle>联系电话: 13667373582<BR>开发商：逆熵<A href="#" 
      target=_blank>#</A></TD></TR></TBODY></TABLE></BODY></HTML>

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
<SCRIPT language=javascript>
	function check() {
		if (document.form1.username.value == ""
				|| document.form1.password.value == "") {
			alert("请输入用户名称和口令！");
			return false;
		}
	}
</SCRIPT>

<TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%" align=center 
border=0>
  <TBODY>
  <TR>
    <TD vAlign=center align=middle>
      <FORM name=form1 action=HTML/index.htm method=post>
      <TABLE cellSpacing=0 cellPadding=0 width=494 align=center border=0>
        <TBODY>
        <TR>
          <TD vAlign=top background=HTML/images/login_1.jpg 
          height=95>&nbsp;</TD></TR>
        <TR>
          <TD vAlign=top background=HTML/images/login_2.jpg 
            height=166><TABLE cellSpacing=6 cellPadding=0 width="100%" 
              border=0><TBODY>
              <TR>
                <TD width="50%" height=26>&nbsp;</TD>
                <TD width="14%"><B>ç¨æ·å¸å·:</B> </TD>
                <TD width="36%"><INPUT style="WIDTH: 120px" value=user 
                  name=username></TD></TR>
              <TR>
                <TD height=28>&nbsp;</TD>
                <TD><B>ç»å½å¯ç :</B> </TD>
                <TD><INPUT style="WIDTH: 120px" type=password value=123 
                  name=password></TD></TR>
              <TR>
                <TD height=29>&nbsp;</TD>
                <TD>&nbsp;</TD>
                <TD><INPUT style="WIDTH: 81px; HEIGHT: 22px" 
                  onclick=form1.submit() type=image 
                  src="HTML/images/login_dot.jpg" 
              name=submit></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></FORM></TD></TR>
  <TR>
    <TD vAlign=top align=middle>èç³»çµè¯: 0755-6238383 3620858 <BR>å¼ååï¼éè¶è½¯ä»¶å¬å¸ <A href="#" 
      target=_blank>#</A></TD></TR></TBODY></TABLE></BODY></HTML>

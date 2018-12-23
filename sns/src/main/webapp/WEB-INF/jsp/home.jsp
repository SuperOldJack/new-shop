<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>逆熵3</title>
 <!--  <link rel="stylesheet" href="/bootstrap/css/bootstrap.css" > -->
  <link rel="stylesheet" href="/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/home.css">
  <script type="text/javascript"src="/js/material-components-web.min.js"></script>
  <script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
  <script type="text/javascript" src="/js/Chart.min.js"></script>
  <script type="text/javascript" src="/js/progressbar.min.js"></script>
  <script type="text/javascript" src="/js/misc.js"></script>
  <script type="text/javascript" src="/js/material.js"></script>
  <script type="text/javascript" src="/js/dashboard.js"></script>
  <script type="text/javascript" src="/js/home.js"></script>
  <script type="text/javascript" src="/js/jq-slideVerify.js"></script>
  <!-- <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script> -->
  <script type="text/javascript" src="/calendar/WdatePicker.js"></script>
  
  <script type="text/javascript" src="/js/websocket/orderGoodsSocket.js"></script>
</head>

<body>
  <div class="body-wrapper">
    <aside class="mdc-persistent-drawer mdc-persistent-drawer--open">
      <nav class="mdc-persistent-drawer__drawer">
        <div class="mdc-persistent-drawer__toolbar-spacer">
          <a href="#" class="brand-logo">
						<img src="images/logo.svg" alt="logo">
					</a>
        </div>
        <div class="mdc-list-group">
          <nav class="mdc-list mdc-drawer-menu">
          <!-- 采购管理 -->
         <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="purchase">
				<a class="mdc-drawer-link" href="#"> <i
					class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon"
					aria-hidden="true">dashboard</i>
						采购管理
					 <i
					class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
				</a>
				<div class="mdc-expansion-panel" id="purchase">
                <nav class="mdc-list mdc-drawer-submenu">
                
                </nav>
              </div>
            </div>
            <!-- 销售管理 -->
            <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="sell">
				<a class="mdc-drawer-link" href="#"> <i
					class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon"
					aria-hidden="true">dashboard</i>
						销售管理
					 <i
					class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
				</a>
				<div class="mdc-expansion-panel" id="sell">
                <nav class="mdc-list mdc-drawer-submenu">

                </nav>
              </div>
            </div>
           <!--  库存管理 -->
            <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="stock">
				<a class="mdc-drawer-link" href="#"> <i
					class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon"
					aria-hidden="true">dashboard</i>
						库存管理
					 <i
					class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
				</a>
				<div class="mdc-expansion-panel" id="stock">
                <nav class="mdc-list mdc-drawer-submenu">

                </nav>
              </div>
            </div>
			<!--财务管理 -->
            <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="finance">
				<a class="mdc-drawer-link" href="#"> <i
					class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon"
					aria-hidden="true">dashboard</i>
						财务管理
					 <i
					class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
				</a>
				<div class="mdc-expansion-panel" id="finance">
                <nav class="mdc-list mdc-drawer-submenu">

                </nav>
              </div>
            </div>
           <!--  库存和单据查询 -->
            <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="stockAndBill">
				<a class="mdc-drawer-link" href="#"> <i
					class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon"
					aria-hidden="true">dashboard</i>
						库存和单据查询
					 <i
					class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
				</a>
				<div class="mdc-expansion-panel" id="stockAndBill">
                <nav class="mdc-list mdc-drawer-submenu">

                </nav>
              </div>
            </div>
            <!-- 其他报表 -->
            <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="other">
				<a class="mdc-drawer-link" href="#"> <i
					class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon"
					aria-hidden="true">dashboard</i>
						其他报表
					 <i
					class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
				</a>
				<div class="mdc-expansion-panel" id="other">
                <nav class="mdc-list mdc-drawer-submenu">
                  
                </nav>
              </div>
            </div>
            <!-- 基础资料 -->
            <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="basicData">
				<a class="mdc-drawer-link" href="#"> <i
					class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon"
					aria-hidden="true">dashboard</i>
						基础资料
					 <i
					class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
				</a>
				<div class="mdc-expansion-panel" id="basicData">
                <nav class="mdc-list mdc-drawer-submenu">

                </nav>
              </div>
            </div>
            <!-- 系统管理 -->
            <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="system">
				<a class="mdc-drawer-link" href="#"> <i
					class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon"
					aria-hidden="true">dashboard</i>
						系统管理
					 <i
					class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
				</a>
				<div class="mdc-expansion-panel" id="system">
                <nav class="mdc-list mdc-drawer-submenu">

                </nav>
              </div>
            </div>
          </nav>
        </div>
      </nav>
    </aside>
    <header class="mdc-toolbar mdc-elevation--z4 mdc-toolbar--fixed">
      <div class="mdc-toolbar__row">
        <section class="mdc-toolbar__section mdc-toolbar__section--align-start">
          <a href="#" class="menu-toggler material-icons mdc-toolbar__menu-icon">menu</a>
          <span class="mdc-toolbar__input">
            <div class="mdc-text-field">
              <input type="text" class="mdc-text-field__input" id="css-only-text-field-box" placeholder="Search anything...">
            </div>
          </span>
        </section>
        <section class="mdc-toolbar__section mdc-toolbar__section--align-end" role="toolbar">
 			<a class="mdc-button mdc-button--unelevated mdc-ripple-upgraded" data-mdc-auto-init="MDCRipple" style="--mdc-ripple-fg-size:38.7054px; --mdc-ripple-fg-scale:2.16696;">
                	用户：${vip.vip_number }
             </a>
          <div class="mdc-menu-anchor">
            <a href="#" class="mdc-toolbar__icon mdc-ripple-surface" data-mdc-auto-init="MDCRipple">
              <i class="material-icons">widgets</i>
            </a>
          </div>
          <div class="mdc-menu-anchor">
            <a href="#" class="mdc-toolbar__icon toggle mdc-ripple-surface" data-toggle="dropdown" toggle-dropdown="notification-menu" data-mdc-auto-init="MDCRipple">
              <i class="material-icons">notifications</i>
              	<!-- 消息通知图标 -->
              <span class="dropdown-count">0</span>
            </a>
            <div class="mdc-simple-menu mdc-simple-menu--right" tabindex="-1" id="notification-menu">
              <ul class="mdc-simple-menu__items mdc-list" role="menu" aria-hidden="true">
                <li class="mdc-list-item" role="menuitem" tabindex="0">
                  <i class="material-icons mdc-theme--primary mr-1">email</i>
                  One unread message
                </li>
                <li class="mdc-list-item" role="menuitem" tabindex="0">
                  <i class="material-icons mdc-theme--primary mr-1">group</i>
                  One event coming up
                </li>
                <li class="mdc-list-item" role="menuitem" tabindex="0">
                  <i class="material-icons mdc-theme--primary mr-1">cake</i>
                  It's Aleena's birthday!
                </li>
              </ul>
            </div>
          </div>
          <div class="mdc-menu-anchor">
            <a href="#" class="mdc-toolbar__icon mdc-ripple-surface" data-mdc-auto-init="MDCRipple">
              <i class="material-icons">widgets</i>
            </a>
          </div>
          <div class="mdc-menu-anchor mr-1">
            <a href="#" class="mdc-toolbar__icon toggle mdc-ripple-surface" data-toggle="dropdown" toggle-dropdown="logout-menu" data-mdc-auto-init="MDCRipple">
              <i class="material-icons">more_vert</i>
            </a>
            <div class="mdc-simple-menu mdc-simple-menu--right" tabindex="-1" id="logout-menu">
                <ul class="mdc-simple-menu__items mdc-list" role="menu" aria-hidden="true">
                  <li class="mdc-list-item" role="menuitem" tabindex="0">
                    <i class="material-icons mdc-theme--primary mr-1">settings</i>
                    Settings
                  </li>
                  <li class="mdc-list-item" role="menuitem" tabindex="0" onclick="output()">
                    <i class="material-icons mdc-theme--primary mr-1" >power_settings_new</i>
                    	退出登录
                  </li>
                </ul>
            </div>
          </div>
        </section>
      </div>
    </header>
		<div class="page-wrapper mdc-toolbar-fixed-adjust">
			<main class="content-wrapper" id="main">
				
			</main>
		</div>
	</div>
	<div class="modal_bg modal_hide" onclick="hideModal()"></div>
	<div class="lr_modal modal_hide">
		<div class="lr_logo_div">
			<img class="logo_img" alt="" src="images/ns3_1.png">
		</div>
		<div id="regForm" class="modal_hide lr_from ">
			<form>
				<div class="form-group">
					<label for="email">手机号:</label> <input type="text"
						class="form-control">
				</div>
				<div class="form-group">
					<label for="pwd">密码:</label> <input type="password"
						class="form-control">
				</div>
				<div class="verify-wrap" id="verify-wrap"></div>
				
				<div class="submit_div">
					<button type="submit" class="submit_btn" onclick="regSubmit()">注册</button>
				</div>
			</form>
		</div>

		<div id="loginForm" class="lr_from">
			<form id="loginForm" action="/login" method="get">
				<div class="form-group">
					<label for="email">账号:</label> <input type="text"
						class="form-control" name="vip_number">
				</div>
				<div class="form-group">
					<label for="pwd">密码:</label> <input type="password"
						class="form-control" name="password">
				</div>
				<div class="submit_div"><!-- " -->
					<button type="submit" class="submit_btn" onclick="loginSubmit()">登录</button>
				</div>
			</form>
		</div>
		<div class="propmt_text">
			<span>已有账号?</span><a onclick="changeLR()">登录</a>
		</div>
	</div>
</body>

</html>
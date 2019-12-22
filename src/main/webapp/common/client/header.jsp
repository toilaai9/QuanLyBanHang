<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- HEADER -->
<header>
	<!-- TOP HEADER -->
	<div id="top-header">
		<div class="container">
			<ul class="header-links pull-left">
				<li><a href="#"><i class="fa fa-phone"></i> +021-95-51-84</a></li>
				<li><a href="#"><i class="fa fa-envelope-o"></i>
						email@email.com</a></li>
				<li><a href="#"><i class="fa fa-map-marker"></i> 1734
						Stonecoal Road</a></li>
			</ul>
			<ul class="header-links pull-right">
				<li>
					<div class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown"
							aria-expanded="true"> <i class="fa fa-user-o"
							visibility="hidden"></i>Login

						</a>
						<div class="cart-dropdown">
							<div class="cart-list">
								<form action="${pageContext.request.contextPath}/login"
									method="post" name="formdangnhap">
									<div class="input-group mb-3">
										<input type="text" name="username" class="form-control"
											placeholder="Username" required>
										<div class="input-group-append">
											<div class="input-group-text">
												<span class="fas fa-envelope"></span>
											</div>
										</div>
									</div>
									<div class="input-group mb-3">
										<input type="text" name="password" class="form-control"
											placeholder="Password" required>
										<div class="input-group-append">
											<div class="input-group-text">
												<span class="fas fa-lock"></span>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-8">
											<div class="icheck-primary">
												<input type="checkbox" id="remember"> <label
													for="remember"> Remember Me </label>
											</div>
										</div>
										<!-- /.col -->
										<div class="col-4">
											<button type="submit" name="submit"
												class="btn btn-primary btn-block">Sign In</button>
										</div>
										<!-- /.col -->
									</div>
								</form>
								</body>

							</div>
						</div>
					</div> <!-- /Cart -->



				</li>
				<li><a href="#"><i class="fa fa-user-o"></i> My Account</a></li>
			</ul>
		</div>
	</div>
	<!-- /TOP HEADER -->

	<!-- MAIN HEADER -->
	<div id="header">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<!-- LOGO -->
				<div class="col-md-3">
					<div class="header-logo">
						<a href="${pageContext.request.contextPath}" class="logo"> <img
							src="${pageContext.request.contextPath}/template/client/img/logo.png"
							alt="">
						</a>
					</div>
				</div>
				<!-- /LOGO -->

				<!-- SEARCH BAR -->
				<div class="col-md-6">
					<div class="header-search">
						<form>
							<select class="input-select">
								<option value="0">All Categories</option>
								<option value="1">Category 01</option>
								<option value="1">Category 02</option>
							</select> <input class="input" placeholder="Search here">
							<button class="search-btn">Search</button>
						</form>
					</div>
				</div>
				<!-- /SEARCH BAR -->

				<!-- ACCOUNT -->
				<div class="col-md-3 clearfix">
					<div class="header-ctn">
						<!-- Wishlist -->
						<div>
							<a href="#"> <i class="fa fa-heart-o"></i> <span>Your
									Wishlist</span>
								<div class="qty">2</div>
							</a>
						</div>
						<c:if test="${sessionScope.cart == null}">
						<h3>ko có sp</h3>
						</c:if>
						<!-- /Wishlist -->
						<c:forEach var="item" items="${sessionScope.cart }">
							<c:set var="sl" value="${sl + 1 }"></c:set>
						</c:forEach>
						<!-- Cart -->
						<div class="dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown"
								aria-expanded="true"> <i class="fa fa-shopping-cart"></i> <span>Your
									Cart</span>
								<div class="qty">${sl }</div>
							</a>
							<div class="cart-dropdown">
								<div class="cart-list">
									<c:forEach var="item" items="${sessionScope.cart }">
										<c:set var="total"
											value="${total + item.hang.donGia * item.soLuong }"></c:set>
										<div class="product-widget">
											<div class="product-img">
												<img src="${pageContext.request.contextPath}/template/client/img/${item.hang.imageLink }" alt="">
											</div>
											<div class="product-body">
												<h3 class="product-name">
													<a href="#">${item.hang.tenHang }</a>
												</h3>
												<h4 class="product-price">
													<span class="qty">${item.soLuong }x</span>
													<fmt:formatNumber type="currency"
														value="${item.hang.donGia }" />
												</h4>
											</div>
											<a href="${pageContext.request.contextPath}/remove/${item.hang.maHang }"
												onclick="return confirm('Are you sure?')"><button
													class="delete">
													<i class="fa fa-close"></i>
												</button></a>

										</div>
									</c:forEach>


								</div>
								<div class="cart-summary">
									<small>${sl } mặt hàng</small>
									<h5>
										TỔNG TIỀN:
										<fmt:formatNumber type="currency" value="${total }" />
									</h5>
								</div>
								<div class="cart-btns">
									<a href="${pageContext.request.contextPath}/cart">Xem giỏ hàng</a> <a href="${pageContext.request.contextPath}/checkout">Thanh toán <i
										class="fa fa-arrow-circle-right"></i></a>
								</div>
							</div>
						</div>
						<!-- /Cart -->

						<!-- Menu Toogle -->
						<div class="menu-toggle">
							<a href="#"> <i class="fa fa-bars"></i> <span>Menu</span>
							</a>
						</div>
						<!-- /Menu Toogle -->
					</div>
				</div>
				<!-- /ACCOUNT -->
			</div>
			<!-- row -->
		</div>
		<!-- container -->
	</div>
	<!-- /MAIN HEADER -->
</header>
<!-- /HEADER -->
<nav id="navigation">
	<!-- container -->
	<div class="container">
		<!-- responsive-nav -->
		<div id="responsive-nav">
			<!-- NAV -->
			<ul class="main-nav nav navbar-nav">
				<li class="active"><a href="${pageContext.request.contextPath}">Home</a></li>
				<li><a href="#">Hot Deals</a></li>
				<li><a href="#">Categories</a></li>
				<li><a href="#">Laptops</a></li>
				<li><a href="#">Smartphones</a></li>
				<li><a href="#">Cameras</a></li>
				<li><a href="#">Accessories</a></li>
			</ul>
			<!-- /NAV -->
		</div>
		<!-- /responsive-nav -->
	</div>
	<!-- /container -->
</nav>
<!-- /NAVIGATION -->

<!-- SECTION -->
<div class="section">
	<!-- container -->
	<div class="container">
		<!-- row -->
		<div class="row">
			<!-- shop -->
			<div class="col-md-4 col-xs-6">
				<div class="shop">
					<div class="shop-img">
						<img src="./img/shop01.png" alt="">
					</div>
					<div class="shop-body">
						<h3>
							Laptop<br>Collection
						</h3>
						<a href="#" class="cta-btn">Shop now <i
							class="fa fa-arrow-circle-right"></i></a>
					</div>
				</div>
			</div>
			<!-- /shop -->

			<!-- shop -->
			<div class="col-md-4 col-xs-6">
				<div class="shop">
					<div class="shop-img">
						<img src="./img/shop03.png" alt="">
					</div>
					<div class="shop-body">
						<h3>
							Accessories<br>Collection
						</h3>
						<a href="#" class="cta-btn">Shop now <i
							class="fa fa-arrow-circle-right"></i></a>
					</div>
				</div>
			</div>
			<!-- /shop -->

			<!-- shop -->
			<div class="col-md-4 col-xs-6">
				<div class="shop">
					<div class="shop-img">
						<img src="./img/shop02.png" alt="">
					</div>
					<div class="shop-body">
						<h3>
							Cameras<br>Collection
						</h3>
						<a href="#" class="cta-btn">Shop now <i
							class="fa fa-arrow-circle-right"></i></a>
					</div>
				</div>
			</div>
			<!-- /shop -->
		</div>
		<!-- /row -->
	</div>
	<!-- /container -->
</div>
<!-- /SECTION -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- NAVIGATION -->


<!-- SECTION -->
<div class="section">
	<!-- container -->
	<div class="container">
		<!-- row -->
		<div class="row">

			<!-- section title -->
			<div class="col-md-12">
				<div class="section-title">
					<h3 class="title">New Products</h3>
					<div class="section-nav">
						<ul class="section-tab-nav tab-nav">
							<li class="active"><a data-toggle="tab" href="#tabAll">All</a></li>
							<c:forEach items="${loaiHang }" var="lh">
								<li><a data-toggle="tab" href="#${lh.maLoai }">${lh.tenLoai }
								</a></li>
							</c:forEach>

						</ul>
					</div>
				</div>
			</div>
			<!-- /section title -->

			<!-- Products tab & slick -->
			<div class="col-md-12">
				<div class="row">
					<div class="products-tabs">
						<!-- tab -->
						<c:forEach items="${loaiHang}" var="lh" varStatus="i">
							<c:choose>
								<c:when test="${lh.maLoai == 1  }">
									<!--  bh kiểm tra từng loại hàng  -->
									<!-- laoij hang bang 1 thi load tivi  -->
									<div id="${lh.maLoai }" class="tab-pane">
										<!-- bo cai active di -->
										<div class="products-slick" data-nav="#slick-nav-1">
											<c:forEach items="${tivi }" var="tv">
												<div class="product">
													<div class="product-img">
														<img
															src="${pageContext.request.contextPath}/template/client/img/${tv.imageLink }"
															alt="">
														<div class="product-label">
															<span class="sale"></span> <span class="new"></span>
														</div>
													</div>
													<div class="product-body">
														<h3 class="product-name">
															<a
																href="${pageContext.request.contextPath}/chitiet?id=${tv.maHang}">${tv.tenHang }</a>
														</h3>
														<h4 class="product-price">
															<fmt:formatNumber type="currency" value="${tv.donGia }" />
														</h4>
														<div class="product-rating">
															<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i>
														</div>
														<div class="product-btns">
															<button class="add-to-wishlist">
																<i class="fa fa-heart-o"></i><span class="tooltipp">add
																	to wishlist</span>
															</button>

															<button class="quick-view">
																<a
																	href="${pageContext.request.contextPath}/chitiet?id=${tv.maHang}"><i
																	class="fa fa-eye"></i><span class="tooltipp">Xem
																		Chi Tiết</span></a>
															</button>

														</div>
													</div>
													<div class="add-to-cart">
													<a href="${pageContext.request.contextPath}/buy/${tv.maHang }">
														<button class="add-to-cart-btn">
															<i class="fa fa-shopping-cart"></i> Thêm Vào Giỏ Hàng
														</button>
														</a>
													</div>
												</div>
											</c:forEach>
										</div>
									</div>

								</c:when>

								<c:when test="${lh.maLoai ==2 }">
									<div id="${lh.maLoai }" class="tab-pane">
										<!-- bo cai active di -->
										<div class="products-slick" data-nav="#slick-nav-1">
											<c:forEach items="${tainghe }" var="tn">
												<div class="product">
													<div class="product-img">
														<img
															src="${pageContext.request.contextPath}/template/client/img/${tn.imageLink }"
															alt="">
														<div class="product-label">
															<span class="sale"></span> <span class="new"></span>
														</div>
													</div>
													<div class="product-body">
														<h3 class="product-name">
															<a
																href="${pageContext.request.contextPath}/chitiet?id=${tn.maHang}">${tn.tenHang }</a>
														</h3>
														<h4 class="product-price">
															<fmt:formatNumber type="currency" value="${tn.donGia }" />
														</h4>
														<div class="product-rating">
															<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i>
														</div>
														<div class="product-btns">
															<button class="add-to-wishlist">
																<i class="fa fa-heart-o"></i><span class="tooltipp">add
																	to wishlist</span>
															</button>

															<button class="quick-view">
																<a
																	href="${pageContext.request.contextPath}/chitiet?id=${tn.maHang}"><i
																	class="fa fa-eye"></i><span class="tooltipp">Xem
																		Chi Tiết</span></a>
															</button>

														</div>
													</div>
													<div class="add-to-cart">
													<a href="${pageContext.request.contextPath}/buy/${tn.maHang }">
														<button class="add-to-cart-btn">
															<i class="fa fa-shopping-cart"></i> Thêm Vào Giỏ Hàng
														</button>
														</a>
													</div>
												</div>
											</c:forEach>
										</div>
									</div>
								</c:when>
								<c:when test="${lh.maLoai ==3 }">
									<div id="${lh.maLoai }" class="tab-pane">
										<!-- bo cai active di -->
										<div class="products-slick" data-nav="#slick-nav-1">
											<c:forEach items="${dienthoai }" var="dt">
												<div class="product">
													<div class="product-img">
														<img
															src="${pageContext.request.contextPath}/template/client/img/${dt.imageLink }"
															alt="">
														<div class="product-label">
															<span class="sale"></span> <span class="new"></span>
														</div>
													</div>
													<div class="product-body">
														<h3 class="product-name">
															<a
																href="${pageContext.request.contextPath}/chitiet?id=${dt.maHang}">${dt.tenHang }</a>
														</h3>
														<h4 class="product-price">
															<fmt:formatNumber type="currency" value="${dt.donGia }" />
														</h4>
														<div class="product-rating">
															<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i>
														</div>
														<div class="product-btns">
															<button class="add-to-wishlist">
																<i class="fa fa-heart-o"></i><span class="tooltipp">add
																	to wishlist</span>
															</button>

															<button class="quick-view">
																<a href="${pageContext.request.contextPath}/chitiet?id=${dt.maHang}"><i
																	class="fa fa-eye"></i><span class="tooltipp">Xem
																		Chi Tiết</span></a>
															</button>

														</div>
													</div>
													<div class="add-to-cart">
													<a href="${pageContext.request.contextPath}/buy/${dt.maHang }">
														<button class="add-to-cart-btn">
															<i class="fa fa-shopping-cart"></i> Thêm Vào Giỏ Hàng
														</button>
														</a>
													</div>
												</div>
											</c:forEach>
										</div>
									</div>
								</c:when>
								<c:when test="${lh.maLoai ==4 }">
									<div id="${lh.maLoai }" class="tab-pane">
										<!-- bo cai active di -->
										<div class="products-slick" data-nav="#slick-nav-1">
											<c:forEach items="${maytinh }" var="mt">
												<div class="product">
													<div class="product-img">
														<img
															src="${pageContext.request.contextPath}/template/client/img/${mt.imageLink }"
															alt="">
														<div class="product-label">
															<span class="sale"></span> <span class="new"></span>
														</div>
													</div>
													<div class="product-body">
														<h3 class="product-name">
															<a
																href="${pageContext.request.contextPath}/chitiet?id=${mt.maHang}">${mt.tenHang }</a>
														</h3>
														<h4 class="product-price">
															<fmt:formatNumber type="currency" value="${mt.donGia }" />
														</h4>
														<div class="product-rating">
															<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i>
														</div>
														<div class="product-btns">
															<button class="add-to-wishlist">
																<i class="fa fa-heart-o"></i><span class="tooltipp">add
																	to wishlist</span>
															</button>

															<button class="quick-view">
																<a href="${pageContext.request.contextPath}/chitiet?id=${mt.maHang}"><i
																	class="fa fa-eye"></i><span class="tooltipp">Xem Chi Tiết</span></a>
															</button>

														</div>
													</div>
													<div class="add-to-cart">
													<a href="${pageContext.request.contextPath}/buy/${mt.maHang }">
														<button class="add-to-cart-btn">
															<i class="fa fa-shopping-cart"></i> Thêm Vào Giỏ Hàng
														</button>
														</a>
													</div>
												</div>
											</c:forEach>
										</div>
									</div>
								</c:when>
								<c:when test="${lh.maLoai ==7 }">
									<div id="${lh.maLoai }" class="tab-pane">
										<!-- bo cai active di -->
										<div class="products-slick" data-nav="#slick-nav-1">
											<c:forEach items="${tulanh }" var="tl">
												<div class="product">
													<div class="product-img">
														<img
															src="${pageContext.request.contextPath}/template/client/img/${tl.imageLink }"
															alt="">
														<div class="product-label">
															<span class="sale"></span> <span class="new"></span>
														</div>
													</div>
													<div class="product-body">
														<h3 class="product-name">
															<a
																href="${pageContext.request.contextPath}/chitiet?id=${tl.maHang}">${tl.tenHang }</a>
														</h3>
														<h4 class="product-price">
															<fmt:formatNumber type="currency" value="${tl.donGia }" />
														</h4>
														<div class="product-rating">
															<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i>
														</div>
														<div class="product-btns">
															<button class="add-to-wishlist">
																<i class="fa fa-heart-o"></i><span class="tooltipp">add
																	to wishlist</span>
															</button>

															<button class="quick-view">
																<a
																	href="${pageContext.request.contextPath}/chitiet?id=${tl.maHang}"><i
																	class="fa fa-eye"></i><span class="tooltipp">Xem
																		Chi Tiết</span></a>
															</button>

														</div>
													</div>
													<div class="add-to-cart">
													<a href="${pageContext.request.contextPath}/buy/${tl.maHang }">
														<button class="add-to-cart-btn">
															<i class="fa fa-shopping-cart"></i> Thêm Vào Giỏ Hàng
														</button>
														</a>
													</div>
												</div>
											</c:forEach>
										</div>
							
									</div>
								</c:when>
								<c:when test="${lh.maLoai ==9 }">
									<div id="${lh.maLoai }" class="tab-pane">
										<div class="products-slick" data-nav="#slick-nav-1">
											<c:forEach items="${mayquat }" var="mq">
												<div class="product">
													<div class="product-img">
														<img
															src="${pageContext.request.contextPath}/template/client/img/${mq.imageLink }"
															alt="">
														<div class="product-label">
															<span class="sale"></span> <span class="new"></span>
														</div>
													</div>
													<div class="product-body">
														<h3 class="product-name">
															<a
																href="${pageContext.request.contextPath}/chitiet?id=${mq.maHang}">${mq.tenHang }</a>
														</h3>
														<h4 class="product-price">
															<fmt:formatNumber type="currency" value="${mq.donGia }" />
														</h4>
														<div class="product-rating">
															<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i>
														</div>
														<div class="product-btns">
															<button class="add-to-wishlist">
																<i class="fa fa-heart-o"></i><span class="tooltipp">add
																	to wishlist</span>
															</button>

															<button class="quick-view">
																<a
																	href="${pageContext.request.contextPath}/chitiet?id=${mq.maHang}"><i
																	class="fa fa-eye"></i><span class="tooltipp">Xem
																		Chi Tiết</span></a>
															</button>

														</div>
													</div>
													<div class="add-to-cart">
													<a href="${pageContext.request.contextPath}/buy/${mq.maHang }">
														<button class="add-to-cart-btn">
															<i class="fa fa-shopping-cart"></i> Thêm Vào Giỏ Hàng
														</button>
														</a>
													</div>
												</div>
											</c:forEach>
										</div>
									</div>
								</c:when>
								<c:otherwise>
									<div id="tabAll" class="tab-pane active">
										<div class="products-slick" data-nav="#slick-nav-1">
											<c:forEach items="${hang }" var="h">
												<div class="product">
													<div class="product-img">
														<img
															src="${pageContext.request.contextPath}/template/client/img/${h.imageLink }"
															alt="">
														<div class="product-label">
															<span class="sale"></span> <span class="new"></span>
														</div>
													</div>
													<div class="product-body">
														<h3 class="product-name">
															<a
																href="${pageContext.request.contextPath}/chitiet?id=${h.maHang}">${h.tenHang }</a>
														</h3>
														<h4 class="product-price">
															<fmt:formatNumber type="currency" value="${h.donGia }" />
														</h4>
														<div class="product-rating">
															<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i> <i class="fa fa-star"></i> <i
																class="fa fa-star"></i>
														</div>
														<div class="product-btns">
															<button class="add-to-wishlist">
																<i class="fa fa-heart-o"></i><span class="tooltipp">add
																	to wishlist</span>
															</button>

															<button class="quick-view">
																<a
																	href="${pageContext.request.contextPath}/chitiet?id=${h.maHang}"><i
																	class="fa fa-eye"></i><span class="tooltipp">Xem
																		Chi Tiết</span></a>
															</button>

														</div>
													</div>

													<div class="add-to-cart">
													<a href="${pageContext.request.contextPath}/buy/${h.maHang }">
														<button class="add-to-cart-btn">
															<i class="fa fa-shopping-cart"></i> Thêm Vào Giỏ Hàng
														</button>
														</a>
													</div>
												</div>
											</c:forEach>

										</div>
										
									</div>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<div id="slick-nav-1" class="products-slick-nav"></div>

					</div>
				</div>
			</div>

		</div>
		<!-- /row -->
	</div>
	<!-- /container -->
</div>
<!-- /SECTION -->

<!-- HOT DEAL SECTION -->
<div id="hot-deal" class="section">
	<!-- container -->
	<div class="container">
		<!-- row -->
		<div class="row">
			<div class="col-md-12">
				<div class="hot-deal">
					<ul class="hot-deal-countdown">
						<li>
							<div>
								<h3>02</h3>
								<span>Days</span>
							</div>
						</li>
						<li>
							<div>
								<h3>10</h3>
								<span>Hours</span>
							</div>
						</li>
						<li>
							<div>
								<h3>34</h3>
								<span>Mins</span>
							</div>
						</li>
						<li>
							<div>
								<h3>60</h3>
								<span>Secs</span>
							</div>
						</li>
					</ul>
					<h2 class="text-uppercase">hot deal this week</h2>
					<p>New Collection Up to 50% OFF</p>
					<a class="primary-btn cta-btn" href="#">Shop now</a>
				</div>
			</div>
		</div>
		<!-- /row -->
	</div>
	<!-- /container -->
</div>
<!-- /HOT DEAL SECTION -->


<!-- SECTION -->
<div class="section">
	<!-- container -->
	<div class="container">
		<!-- row -->
		<div class="row">
			<div class="col-md-4 col-xs-6">
				<div class="section-title">
					<h4 class="title">Top selling</h4>
					<div class="section-nav">
						<div id="slick-nav-3" class="products-slick-nav"></div>
					</div>
				</div>


				<div></div>
			</div>
		</div>

		<div class="col-md-4 col-xs-6">
			<div class="section-title">
				<h4 class="title">Top selling</h4>
				<div class="section-nav">
					<div id="slick-nav-4" class="products-slick-nav"></div>
				</div>
			</div>

			<div class="products-widget-slick" data-nav="#slick-nav-4">
				<div>
					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product04.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- /product widget -->

					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product05.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- /product widget -->

					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product06.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- product widget -->
				</div>

				<div>
					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product07.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- /product widget -->

					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product08.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- /product widget -->

					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product09.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- product widget -->
				</div>
			</div>
		</div>

		<div class="clearfix visible-sm visible-xs"></div>

		<div class="col-md-4 col-xs-6">
			<div class="section-title">
				<h4 class="title">Top selling</h4>
				<div class="section-nav">
					<div id="slick-nav-5" class="products-slick-nav"></div>
				</div>
			</div>

			<div class="products-widget-slick" data-nav="#slick-nav-5">
				<div>
					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product01.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- /product widget -->

					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product02.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- /product widget -->

					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product03.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- product widget -->
				</div>

				<div>
					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product04.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- /product widget -->

					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product05.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- /product widget -->

					<!-- product widget -->
					<div class="product-widget">
						<div class="product-img">
							<img src="./img/product06.png" alt="">
						</div>
						<div class="product-body">
							<p class="product-category">Category</p>
							<h3 class="product-name">
								<a href="#">product name goes here</a>
							</h3>
							<h4 class="product-price">
								$980.00
								<del class="product-old-price">$990.00</del>
							</h4>
						</div>
					</div>
					<!-- product widget -->
				</div>
			</div>
		</div>

	</div>
	<!-- /row -->
</div>
<!-- /container -->
</div>
<!-- /SECTION -->

<!-- NEWSLETTER -->
<div id="newsletter" class="section">
	<!-- container -->
	<div class="container">
		<!-- row -->
		<div class="row">
			<div class="col-md-12">
				<div class="newsletter">
					<p>
						Sign Up for the <strong>NEWSLETTER</strong>
					</p>
					<form>
						<input class="input" type="email" placeholder="Enter Your Email">
						<button class="newsletter-btn">
							<i class="fa fa-envelope"></i> Subscribe
						</button>
					</form>
					<ul class="newsletter-follow">
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#"><i class="fa fa-instagram"></i></a></li>
						<li><a href="#"><i class="fa fa-pinterest"></i></a></li>
					</ul>
				</div>
			</div>
		</div>
		<!-- /row -->
	</div>
	<!-- /container -->
</div>
<!-- /NEWSLETTER -->

</body>
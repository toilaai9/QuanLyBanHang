<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<c:forEach items="${hang_chitiet}" var="h">
					<div class="col-md-5 col-md-push-2">
						<div id="product-main-img">
							<div class="product-preview">
								<img
									src="${pageContext.request.contextPath}/template/client//img/${h.imageLink }"
									alt="">
							</div>

							<div class="product-preview">
								<img
									src="${pageContext.request.contextPath}/template/client//img/${h.imageLink }"
									alt="">
							</div>

							<div class="product-preview">
								<img
									src="${pageContext.request.contextPath}/template/client//img/${h.imageLink }"
									alt="">
							</div>

							<div class="product-preview">
								<img
									src="${pageContext.request.contextPath}/template/client//img/${h.imageLink }"
									alt="">
							</div>
						</div>
					</div>
					<!-- /Product main img -->

					<!-- Product thumb imgs -->
					<div class="col-md-2  col-md-pull-5">
						<div id="product-imgs">
							<div class="product-preview">
								<img
									src="${pageContext.request.contextPath}/template/client//img/${h.imageLink }"
									alt="">
							</div>

							<div class="product-preview">
								<img
									src="${pageContext.request.contextPath}/template/client//img/${h.imageLink }"
									alt="">
							</div>

							<div class="product-preview">
								<img
									src="${pageContext.request.contextPath}/template/client//img/${h.imageLink }"
									alt="">
							</div>

							<div class="product-preview">
								<img
									src="${pageContext.request.contextPath}/template/client//img/${h.imageLink }"
									alt="">
							</div>
						</div>
					</div>
					<!-- /Product thumb imgs -->

					<!-- Product details -->
					<div class="col-md-5">
						<div class="product-details">
							<h2 class="product-name">${h.tenHang }</h2>
							<div>
								<div class="product-rating">
									<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star-o"></i>
								</div>
								<a class="review-link" href="#">10 Review(s) | Add your
									review</a>
							</div>
							<div>
								<h3 class="product-price">
									<fmt:formatNumber type="currency" value="${h.donGia }" />
									<del class="product-old-price">$990.00</del>
								</h3>
								<span class="product-available">In Stock</span>
							</div>
							<p>${h.tTThem }</p>


							<div class="add-to-cart">
								<div class="qty-label">
									Qty
									<div class="input-number">
										<input type="number"> <span class="qty-up">+</span> <span
											class="qty-down">-</span>
									</div>
								</div>
								<button class="add-to-cart-btn">
									<i class="fa fa-shopping-cart"></i> add to cart
								</button>
							</div>
						</div>
					</div>
					<!-- /Product details -->
				</c:forEach>
				<!-- Product main img -->


				<!-- Product tab -->

				<!-- /product tab -->
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<script
		src="${pageContext.request.contextPath}/template/client/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/template/client/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/template/client/js/slick.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/template/client/js/nouislider.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/template/client/js/jquery.zoom.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/template/client/js/main.js"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="section">
	<!-- container -->
	<div class="container">
		<!-- row -->
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="products-tabs">
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
													class="fa fa-eye"></i><span class="tooltipp">Xem Chi
														Tiết</span></a>
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
				</div>
			</div>
		</div>
	</div>
</div>
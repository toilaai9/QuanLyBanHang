<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/client/css/linearicons.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/client/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/client/css/themify-icons.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/client/css/owl.carousel.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/client/css/nice-select.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/client/css/nouislider.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/client/css/ion.rangeSlider.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/client/css/ion.rangeSlider.skinFlat.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/client/css/main.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/client/css/style_img.css">
</head>
<body>
	<!--================Cart Area =================-->
	<style>
.cart_area {
	display: none;
}
</style>
	<style>
.cart_area {
	display: unset;
}
</style>

	<section class="cart_area">
		<div class="container">
			<div class="cart_inner">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>

								<th scope="col">Sản Phẩm</th>
								<th scope="col">Giá</th>
								<th scope="col">Số Lượng</th>
								<th scope="col">Tổng Giá</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<tr>

								<td>
									<div class="media">
										<div class="col-md-6">
											<div>
												<img style="height: 150px;"
													src="">
											</div>
										</div>
										<div class="col-md-6"
											style="padding-top: 60px; padding-bottom: 30px; vertical-align: middle; align-self: center;">
										</div>
								</td>

								<td>
									<h5 id="pr_
										" data-id="
										">
									</h5>
								</td>
								<td>
									<div class="product_count">
										<input type="text" name="qty"
											id="qt_" value="1
										" title="Quantity:" class="input-text qty" readonly>
										<button class="increase items-count" id="plus"
											data-id=""
											type="button">
											<i class="fa fa-caret-up"></i>
										</button>
										<button class="reduced items-count" id="minus"
											data-id=""
											type="button">
											<i class="fa fa-caret-down"></i>
										</button>
									</div>
								</td>
								<td>
									<h5 id="tt_
										">
									</h5>
								</td>
								<td><span><button class="delete_product"
											type="button" id="delete_product"
											data-id=""
											value="">
											<i class="fa fa-trash"></i>
										</button></span></td>
							</tr>
							<tr class="bottom_button">
								<td><a class="gray_btn" id="delete_cart"
									data-id=""
										href="#">Xóa Giỏ Hàng</a></td>
								<td></td>
								<td></td>
								<td>
									<div>
										<a class="primary-btn" id="thanhtoan" href="">Thanh Toán</a>

									</div>
								</td>
								<td></td>
							</tr>

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>
	<!--================End Cart Area =================-->
 <script src="${pageContext.request.contextPath}/template/client/js/vendor/jquery-2.2.4.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
	 crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath}/template/client/js/vendor/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/template/client/js/jquery.ajaxchimp.min.js"></script>
	<script src="${pageContext.request.contextPath}/template/client/js/jquery.nice-select.min.js"></script>
	<script src="${pageContext.request.contextPath}/template/client/js/jquery.sticky.js"></script>
    <script src="${pageContext.request.contextPath}/template/client/js/nouislider.min.js"></script>
	<script src="${pageContext.request.contextPath}/template/client/js/jquery.magnific-popup.min.js"></script>
	<script src="${pageContext.request.contextPath}/template/client/js/owl.carousel.min.js"></script>
	<!--gmaps Js-->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
	<script src="${pageContext.request.contextPath}/template/client/js/gmaps.min.js"></script>
	<script src="${pageContext.request.contextPath}/template/client/js/main.js"></script>
</body>
</html>
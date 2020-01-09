<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="container margin_60" style="width: 608px;">
	<section class="content-header">
		<div>
			<h1>THÊM HÀNG</h1>
		</div>
	</section>
	<section class="content">
		<div class="row">
			<div class="col-md-12">
				<div class="">

					<!-- MyUploadForm -->
					<form:form modelAttribute="hangInfo" method="POST"
						action="${pageContext.request.contextPath}/admin/hang/addhang/them"
						enctype="multipart/form-data">
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label>Tên Hàng</label>

									<form:input path="tenHang" class="form-control"
										placeholder="Nhập tên hàng" id="tenHang" />

								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Đơn Giá</label>
									<form:input path="donGia" class="form-control"
										placeholder="Nhập tên hàng" id="donGia" />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label>VAT</label>
									<form:input path="vAT" class="form-control"
										placeholder="Nhập tên hàng" id="vAT" />
								</div>
							</div>

							<div class="col-sm-6">
								<div class="form-group">
									<label>Loại Hàng</label>  
									<form:select path="maLoai" class="form-control custom-select">
										<form:options items="${loaiHang}" itemLabel="tenLoai"
											itemValue="maLoai" />
									</form:select>


								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label>Nhà Sản Xuất</label>
									<form:input path="nhaSX" class="form-control"
										placeholder="Nhập tên hàng" id="nhaSX" />

								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Ngày Sản Xuất</label>
									<form:input path="ngaySX" class="form-control"
										placeholder="Nhập tên hàng" id="ngaySX" />

								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label>Số Lượng</label>
									<form:input path="soLuongHang" class="form-control"
										placeholder="Nhập tên hàng" id="soLuongHang" />

								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Trạng Thái</label>
									<form:select path="trangThaiHang" class="form-control custom-select">
										<form:option value="0" label="Đã bán" />
										<form:option value="1" label="Chưa bán" />
									</form:select>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<label>Thông Tin Thêm</label>
									
									<form:textarea path="tTThem" id="tTThem" class="form-control" style="height: 150px;"
											placeholder="Nhập giới thiệu về hàng"/>
									
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label>Thời Gian BH</label>
									<form:input path="tGBaoHanh" class="form-control"
										placeholder="Nhập tên hàng" id="tGBaoHanh" />

								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Thêm Ảnh Hàng</label>
									<form:input path="anh" type="file"
										></form:input>
									
								</div>
							</div>
						</div>
						<div class="row" style="margin-top: 10px">
							<div class="col-sm-6">
								<button type="submit" id="btn-them-truyen"
									class="btn btn-primary" >Thêm</button>

								<a href="${pageContext.request.contextPath}/admin/hang" class="btn btn-info "> <span></span> Cancel
								</a>
							</div>
						</div>
					</form:form>

				</div>
			</div>
		</div>
	</section>
</div>
<

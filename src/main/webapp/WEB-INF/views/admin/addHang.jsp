<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/common/taglib.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="container margin_60"style="width: 608px;">
    <section class="content-header">      
        <div >
            <h1>THÊM HÀNG</h1>
        </div>
    </section>
    <section class="content">
      	<div class="row">
        	<div class="col-md-12">
          		<div class="">
          			<form method="post"  id="form-addhang" action="${pageContext.request.contextPath}/admin/hang/addhang/them">
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label>Tên Hàng</label>
									<input type="text" class="form-control" id="" name="txttenhang" >
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Đơn Giá</label>
									<input type="number" min="1" class="form-control" id="" name="txtdongia">
								</div>
							</div>
						</div>
							<!-- End row -->
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label>VAT</label>
									<input type="number" min="1" id="form-control" name="txtvat" class="form-control" >
								</div>
							</div>
              
							<div class="col-sm-6">
								<div class="form-group">
									<label>Loại Hàng</label>
									
				                    <select name="maloai" class="form-control custom-select">
				                    <c:forEach items="${loaiHang }" var="l">				                  
				                      <option  value="${l.maLoai }">
				                      ${l.tenLoai}				                         
				                      </option>	
				                      </c:forEach>			                    
				                    </select>	
				                    								
                    			</div>
							</div>
						</div>
              			<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label>Nhà  Sản Xuất</label>
									<input type="text" id="form-control" name="txtnhasx" class="form-control" >
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Ngày Sản Xuất</label>
									<input type="text" id="" name="txtngaysx" class="form-control" placeholder="yyyy-mm-dd">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label>Số Lượng</label>
									<input type="number" min="1" class="form-control" id="" name="txtsoluong" >
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Trạng Thái</label>
				                    <select name="trangthai" class="form-control custom-select"  readonly >				                  
				                      <option  value="0">
				                         Bán
				                      </option>		
				                      <option  value="1">
				                         Chưa Bán
				                      </option>			                    
				                    </select>			
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<label>Thông Tin Thêm</label>
									<textarea rows="5" id="" name="txtttthem" class="form-control" style="height:150px;"></textarea>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<label>Thời Gian BH</label>
									<input type="text" id="" name="txttgbaohanh" class="form-control">
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Thêm Ảnh Hàng</label>
									
									<input type="file" value="" name="Img" id="file-2" class="inputfile "  style="width: 2px;height: 2px;opacity: 0;overflow: hidden;position: absolute;z-index: -1;">
									<label for="file-2"><svg xmlns="http://www.w3.org/2000/svg" height="25" viewBox="0 0 20 17"><path d="M10 0l-5.2 4.9h3.3v5.1h3.8v-5.1h3.3l-5.2-4.9zm9.3 11.5l-3.2-2.1h-2l3.4 2.6h-3.5c-.1 0-.2.1-.2.1l-.8 2.3h-6l-.8-2.2c-.1-.1-.1-.2-.2-.2h-3.6l3.4-2.6h-2l-3.2 2.1c-.4.3-.7 1-.6 1.5l.6 3.1c.1.5.7.9 1.2.9h16.3c.6 0 1.1-.4 1.3-.9l.6-3.1c.1-.5-.2-1.2-.7-1.5z">
									</path></svg><span>Chọn ảnh cho mặt hàng tại đây</span></label>
								</div>	
							</div>
						</div>            			<div class="row" style="margin-top: 10px" >   
            				<div class="col-sm-6"> 
						          <button type="submit" name="submit" class="btn btn-success float-left"> Thêm Hàng</button>
						          
						          <a href="" class="btn btn-info " >
						            <span ></span> Cancel
						          </a>
          					</div>
        				</div>
        			</form>
          		</div>
        	</div>  
        </div>  
    </section>
</div>
<
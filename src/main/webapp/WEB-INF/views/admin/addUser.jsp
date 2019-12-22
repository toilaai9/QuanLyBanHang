<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body class="hold-transition register-page">

<div class="content-wrapper">
<div class="register-box" style="padding-left:300px;padding-right:300px;width: auto;" >
  <div class="register-logo">
    <a ><b>Thêm ADMIN</b></a>
  </div>

  <div class="card">
    <div class="card-body register-card-body">
      <form action="${pageContext.request.contextPath}/template/admin/index.html" method="post">
      <div class="input-group mb-3">
          <input type="username" class="form-control" placeholder="Username"required>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="text" class="form-control" placeholder="Full name"required>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-user"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control" placeholder="Password"required>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control" placeholder="Retype password"required>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="address" class="form-control" placeholder="Address"required>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-edit"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="phonenumber" class="form-control" placeholder="Phone number">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-phone"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
        <div class="col-sm-offset-4 col-sm-10">
          <label for="file-2"> <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 20 17"><path d="M10 0l-5.2 4.9h3.3v5.1h3.8v-5.1h3.3l-5.2-4.9zm9.3 11.5l-3.2-2.1h-2l3.4 2.6h-3.5c-.1 0-.2.1-.2.1l-.8 2.3h-6l-.8-2.2c-.1-.1-.1-.2-.2-.2h-3.6l3.4-2.6h-2l-3.2 2.1c-.4.3-.7 1-.6 1.5l.6 3.1c.1.5.7.9 1.2.9h16.3c.6 0 1.1-.4 1.3-.9l.6-3.1c.1-.5-.2-1.2-.7-1.5z"></path></svg><span><-Choose an avatar here</span></label>
        <input required type="file" value="" name="Img" id="file-2" style="width: 2px;height: 2px;opacity: 0;overflow: hidden;position: absolute;z-index: -1;" >
        </div>
      </div>
        <div class="row">
          <div class="col-8">
            
          </div>
          <!-- /.col -->
          <div class="col-4">
            <button type="submit" class="btn btn-primary btn-block">Thêm</button>
          </div>
          <!-- /.col -->
        </div>
      </form>

      <div class="social-auth-links text-light"> 
      <a href="login.html" class="text-right">I already have a membership</a>
    </div>
    <!-- /.form-box -->
  </div><!-- /.card -->
</div>
</div>
</body>
</html>
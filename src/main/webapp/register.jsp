<!DOCTYPE html>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<html lang="en">
  <tags:head title="Profile Manager | Registration"/>

  <body>

    <div class="container">

      <form class="form-signin" role="form" method="post" action="./register">
        <h2 class="form-signin-heading">Please Register</h2>
        <input type="email" class="form-control" placeholder="Username" name="username" required autofocus>
        <input type="password" class="form-control" placeholder="Password" name="password" required>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->

</body>
</html>
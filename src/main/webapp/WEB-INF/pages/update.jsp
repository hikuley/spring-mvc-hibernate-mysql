<%--
  Created by IntelliJ IDEA.
  User: hikuley
  Date: 22.10.2014
  Time: 00:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <title></title>
</head>
<body>
<div class="col-md-4" style="margin: 20px">

    <form role="form" method="post" action="/articleUpdate">
        <input value="${article.id}" name="id" type="hidden" id="id"/>

        <div class="form-group">
            <label for="exampleInputEmail11">Kitab Adı</label>
            <input value="${article.title}" name="title" type="text" class="form-control" id="exampleInputEmail11"
                   placeholder="Kitabın Adı">
        </div>
        <div class="form-group">
            <label for="exampleInputEmail12">Yazar Adı</label>
            <input value="${article.title}" name="author" type="text" class="form-control" id="exampleInputEmail12"
                   placeholder="Yazar Adı">
        </div>

        <div class="form-group">
            <label for="exampleInputEmail13">Kategori</label>
            <input value="${article.category}" name="category" type="text" class="form-control" id="exampleInputEmail13"
                   placeholder="Yazar">
        </div>

        <div class="form-group">
            <label for="exampleInputEmail14">İçerik</label>
            <input value="${article.content}" name="content" type="text" class="form-control" id="exampleInputEmail14"
                   placeholder="Yazar">
        </div>

        <button style="float: right" type="submit" class="btn btn-default">Kaydet</button>
    </form>
</div>

</body>
</html>

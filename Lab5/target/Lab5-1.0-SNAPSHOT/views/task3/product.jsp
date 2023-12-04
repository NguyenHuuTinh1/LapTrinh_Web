<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: huuti
  Date: 12/3/2023
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link
            href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.0.0/mdb.min.css"
            rel="stylesheet"
    />
</head>
<body>
<section style="background-color: #eee;">
    <div class="text-center container py-5">
        <h4 class="mt-4 mb-5"><strong>Bestsellers</strong></h4>

        <div class="row">
            <c:forEach items="${products}" var="product">
                <div class="col-lg-4 col-md-12 mb-4">
                    <div class="card">

                        <div class="bg-image hover-zoom ripple ripple-surface ripple-surface-light"
                             data-mdb-ripple-color="light">
                            <img src="${product.image}"
                                 class="w-100"/>
                            <a href="#!">
                                <div class="mask">
                                    <div class="d-flex justify-content-start align-items-end h-100">
                                        <h5><span class="badge bg-primary ms-2">New</span></h5>
                                    </div>
                                </div>
                                <div class="hover-overlay">
                                    <div class="mask" style="background-color: rgba(251, 251, 251, 0.15);"></div>
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <a href="" class="text-reset">
                                <h5 class="card-title mb-3">${product.name}</h5>
                            </a>
                            <a href="" class="text-reset">
                                <p>${product.catetory}</p>
                            </a>
                            <h6 class="mb-3">${product.price}</h6>
                        </div>

                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

</section>

</body>
</html>

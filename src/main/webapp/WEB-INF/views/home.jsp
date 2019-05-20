<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<title>MyToDo</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
<style>
html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
</style>
<script>
	


</script>
<body class="w3-light-grey">

<!-- Top container -->
<div class="w3-bar w3-top w3-black w3-large" style="z-index:4">
  <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i>  Menu</button>
  <span class="w3-bar-item w3-right"><i class="fas fa-clipboard-list w3-xxxsmall"></i> MyToDo</span>
</div>
<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;" id="mySidebar"><br>
  <div class="w3-container">
    <h5>Menu</h5>
  </div>
  <div class="w3-bar-block">
    <a href="#" class="w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black" onclick="w3_close()" title="close menu"><i class="fa fa-remove fa-fw"></i>  Close Menu</a>
    <a href="home.do" class="w3-bar-item w3-button w3-padding"><i class="fas fa-list fa-fw"></i>  Overview</a>
    <a href="now.do" class="w3-bar-item w3-button w3-padding"><i class="far fa-clipboard fa-fw"></i>  NOW</a>
    <a href="done.do" class="w3-bar-item w3-button w3-padding"><i class="fas fa-check fa-fw"></i>  DONE</a>
    <a href="later.do" class="w3-bar-item w3-button w3-padding"><i class="fas fa-stopwatch fa-fw"></i>  LATER</a><br>
  </div>
</nav>


<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px;margin-top:43px;">

  <!-- Header -->
  <header class="w3-container" style="padding-top:22px">
    <h5><b>My Dashboard</b></h5>
  </header>

  <div class="w3-row-padding w3-margin-bottom">
    <div class="w3-quarter">
    
      <div class="w3-container w3-red w3-padding-16">
        <div class="w3-left"><i class="fas fa-stopwatch w3-xxxlarge"></i></div>
        <div class="w3-right w3-xxxlarge">
          <h3>${numOfLater}</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>LATER</h4>
      </div>
     
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-orange w3-text-white w3-padding-16">
        <div class="w3-left"><i class="far fa-clipboard w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>${numOfNow}</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>NOW</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-green w3-text-white w3-padding-16">
        <div class="w3-left"><i class="fas fa-check w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>${numOfDone}</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>DONE</h4>
      </div>
    </div>
  </div>
  
  <hr width="100%" color="white" size="4">
  
  <div class="w3-container w3-padding-16 w3-light-grey">	
	  <section>
			<c:choose>
				<c:when test="${centerpage != null}">
					<jsp:include page="${centerpage}.jsp"></jsp:include>
				</c:when>
				<c:otherwise>
					<jsp:include page="center.jsp"></jsp:include>
				</c:otherwise>
			</c:choose>
	  </section>
  </div>

    <!-- Footer -->
  <footer class="w3-container w3-padding-16 w3-light-grey">
    <button onclick="document.getElementById('id01').style.display='block'" class="w3-button w3-blue w3-xlarge w3-right">add</button>
  <hr>
  <div id="id01" class="w3-modal">
    <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

      <div class="w3-center"><br>
        <span onclick="document.getElementById('id01').style.display='none'" class="w3-button w3-xlarge w3-hover-red w3-display-topright" title="Close Modal">&times;</span>
      </div>

      <form class="w3-container" action="upload.do" method="POST">
        <div class="w3-section">
          <div class="w3-row">
      		<div class="w3-col m2 text-center">
        		<h4>title</h4>
      		</div>
      	    <div class="w3-col m10 w3-container">
        	  	<input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="title" name="title" required>
            </div>
		  </div>
		</div>
	    <div class="w3-section">
          <div class="w3-row">
      		<div class="w3-col m2 text-center">
        		<h4>deadline</h4>
      		</div>
      	    <div class="w3-col m10 w3-container">
        	    <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Username" name="dlDate" required>
            </div>
		  </div>
		</div>
		<div class="w3-section">
          <div class="w3-row">
      		<div class="w3-col m2 text-center">
        		<h4>state</h4>
      		</div>
      	    <div class="w3-col m10 w3-container">
        		<input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Username" name="state" required>
            </div>
		  </div>
		</div>
		<div class="w3-section">
          <div class="w3-row">
      		<div class="w3-col m2 text-center">
        		<h4>priority</h4>
      		</div>
      	    <div class="w3-col m10 w3-container">
        		<input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Username" name="priority" required>
            </div>
		  </div>
		</div>
        <div class="w3-section">
          <div class="w3-row">
      		<div class="w3-col m2 text-center">
        		<h4>content</h4>
      		</div>
      	    <div class="w3-col m10 w3-container">
        		<input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Username" name="content" required>
            </div>
		  </div>    
        </div> 
     
        <input class="w3-check w3-margin-top" type="checkbox" checked="checked"> Remember me
        
        <div class="w3-row w3-border-top w3-padding-16 w3-light-grey">
      	  <div class="w3-col m6 w3-container">
 			<button class="w3-button w3-block w3-green w3-section w3-padding w3-right" type="submit">등록</button>       
      	  </div>
          <div class="w3-col m6 w3-container">
            <button class="w3-button w3-block w3-red w3-section w3-padding w3-right" onclick="document.getElementById('id01').style.display='none'" type="button">취소</button>  
          </div>
		</div>
      </form>

      <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
        </div>
      </div>
  </div>
  </footer>

  <!-- End page content -->
</div>

<script>
// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}
</script>

</body>
</html>

/**
 * 
 */
$(document).ready(function(){
	$("#log").click(function(){
		var x=$("#name").val();
		var y=$("#password").val();
		$.ajax({
			type:"post",
			url:"login",
			data:{
				username:x,password:y
			},
			success: function (responsetext){
				//alert(responsetext);
				if($.trim(responsetext)=="success")
					{
						$("#success").slideDown('fast').delay(2000).slideUp('fast');
						//setTimeout(window.location="./getpagination?pageindex=1",5000);
						setTimeout(function(){
							window.location="./getpagination?pageindex=1";
						}, 3000);
					}
				else
					{
					$("#failure").slideDown('fast').delay(3000).slideUp('fast');
					}
			},
			error:function(responsetext1)
			{
				//alert ("failure");
				$("#failure").slideDown('fast').delay(3000).slideUp('fast');
			},
			
		});
	});
});
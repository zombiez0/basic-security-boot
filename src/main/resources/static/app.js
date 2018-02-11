function getData(url){
	$.ajax({
		  url: url,
		  cache: false,
		  success: function(data){
			  console.log(data);			  
		  },
		  error: function(msg){
			  console.log(msg);
		  }
		});
}

function getHelloData(){
	getData("/hello/");
}

function getDemoData(){
	getData("/demo/");
}

function getAllowAllData(){
	getData("/allowall/");
}

$("#hello").click(function() {
	getHelloData();
});

$("#demo").click(function() {
	getDemoData();
});

$("#allowall").click(function() {
	getAllowAllData();
});



function getTotal(data, url) {
	$.ajax({
		type: "get",
		url: url,
		data: data,
		success: function(data) {
			$("#total").html(data);
			$("#pagination").twbsPagination("changeTotalPages", Math.ceil(data / pageSize), 1);
		}
	})
};

function getTotalPost(url) {
	$.ajax({
		type: "get",
		url: url,
		success: function(data) {
			$("#total").html(data);
			$("#pagination").twbsPagination("changeTotalPages", Math.ceil(data / pageSize), 1);
		}
	})
};

//pagination 출력
function getPagination() {
	$('#pagination').twbsPagination({
		startPage: 1,
		totalPages: 1,
		visiblePages: 5,
		first: '<span sris-hidden="true">«</span>',
		last: '<span sris-hidden="true">»</span>',
		prev: "&lt;",
		next: "&gt;",
		onPageClick: function(event, page) {
			getList(page);
		}
	})
}
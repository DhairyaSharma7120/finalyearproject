function addState() {

	if ($('#stateName').val().trim() === '') {
		$('#stateName').focus()
		showErrorToast('Please Select State Name')
		return false;
	} else if ($('#stateName').val().length < 3) {
		$('#stateName').focus()
		showErrorToast('Please Enter Valid State Name')		
		return false;
	} else if ($('#stateDescription').val().trim() === '') {
		$('#stateDescription').focus()
		showErrorToast('Please Enter State Description')		
		return false;
	}else {
		return true;
	}
}

function addCity() {

	if ($('#stateVOId').val() === 'none') {
		$('#stateVOId').focus()
		showErrorToast('Please Select State Name')
		return false;
	} else if ($('#cityName').val().trim() === '') {
		$('#cityName').focus()
		showErrorToast('Please Enter City Name')
		return false;
	} else if ($('#cityName').val().length < 3) {
		$('#cityName').focus()
		showErrorToast('Please Enter Valid City Name')		
		return false;
	} else if ($('#cityDescription').val().trim() === '') {
		$('#cityDescription').focus()
		showErrorToast('Please Enter City Description')		
		return false;
	}else {
		return true;
	}
}
function addArea() {

	if ($('#stateVOId').val() === 'none') {
		$('#stateVOId').focus()
		showErrorToast('Please Select State Name')
		return false;
	} else if ($('#cityVOId').val() === 'none') {
			$('#cityVOId').focus()
			showErrorToast('Please Select City Name')
			return false;
	} else if ($('#areaName').val().trim() === '') {
		$('#areaName').focus()
		showErrorToast('Please Enter Area Name')
		return false;
	} else if ($('#areaName').val().length < 3) {
		$('#areaName').focus()
		showErrorToast('Please Enter Valid Area Name')		
		return false;
	}else {
		return true;
	}
}

function addConstructionStatus() {

	if ($('#constructionstatusName').val().trim() === '') {
		$('#constructionstatusName').focus()
		showErrorToast('Please Select Construction Status')
		return false;
	} else if ($('#constructionstatusName').val().length < 3) {
		$('#areaName').focus()
		showErrorToast('Please Enter Valid Construction Status')		
		return false;
	} else if ($('#constructionstatusDescription').val().trim() === '') {
		$('#constructionstatusDescription').focus()
		showErrorToast('Please Enter  Description')		
		return false;
	}else {
		return true;
	}
}

function addProperty() {

	if ($('#categoryVOId').val() === 'none') {
		$('#categoryVOId').focus()
		showErrorToast('Please Select Category Name')
		return false;
	} else if ($('#subcategoryVOId').val() === 'none') {
			$('#subcategoryVOId').focus()
			showErrorToast('Please Select Subcategory Name')
			return false;
	} else if ($('#constructionstatusVOId').val() === 'none') {
		$('#constructionstatusVOId').focus()
		showErrorToast('Please Select Construction Status')
		return false;
	} else if ($('#stateVOId').val() === 'none') {
			$('#stateVOId').focus()
			showErrorToast('Please Select State Name')
			return false;
	} else if ($('#cityVOId').val() === 'none') {
			$('#cityVOId').focus()
			showErrorToast('Please Select City Name')
			return false;
	} else if ($('#areaVOId').val() === 'none') {
		$('#areaVOId').focus()
		showErrorToast('Please Select Area Name')
		return false;
	} else if ($('#bhkName').val().trim() === '') {
		$('#bhkName').focus()
		showErrorToast('Please Enter BHK')		
		return false;
	} else if ($('#propertyAreaName').val().trim() === '') {
		$('#propertyAreaName').focus()
		showErrorToast('Please Enter Property Area Size')		
		return false;
	} else if ($('#ownerName').val().trim() === '') {
			$('#ownerName').focus()
			showErrorToast('Please Enter Owner Name')		
			return false;
	} else if ($('#ownerContact').val().trim() === '') {
		$('#ownerContact').focus()
		showErrorToast('Please Enter Phone Number')		
		return false;
	} else if ($('#ownerContact').val().length < 10) {
		$('#ownerContact').focus()
		showErrorToast('Please Enter Valid Phone Number')		
		return false;
	} else if ($('#ownerEmail').val().trim() === '') {
		$('#ownerEmail').focus()
		showErrorToast('Please Enter Email Id')		
		return false;
	} else if ($('#ownerEmail').val().trim() === '/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/') { 
		$('#ownerEmail').focus()
		showErrorToast('Please Enter Valid Email Id')		
		return false;
	} else if ($('#ownerAddress').val().trim() === '') {
		$('#ownerAddress').focus()
		showErrorToast('Please Enter Address')		
		return false;

	}else {
		return true;
	}
}

function addCategory() {

	if ($('#categoryName').val().trim() === '') {
		$('#categoryName').focus()
		showErrorToast('Please Select Category Name')
		return false;
	} else if ($('#categoryName').val().length < 3) {
			$('#categoryName').focus()
			showErrorToast('Please Enter Valid Category Name')		
			return false;
	} else if ($('#categoryDescription').val().trim() === '') {
		$('#categoryDescription').focus()
		showErrorToast('Please Enter Category Description')		
		return false;
	}else {
		return true;
	}
}

function addSubCategory() {
	if ($('#categoryVOId').val() === 'none') {
		$('#categoryVOId').focus()
		showErrorToast('Please Select Category')
		return false;
	} else if ($('#subCategoryName').val().trim() === '') {
		$('#subCategoryName').focus()
		showErrorToast('Please Select Subcategory Name')
		return false;
	} else if ($('#subCategoryName').val().length < 3) {
		$('#subCategoryName').focus()
		showErrorToast('Please Enter Valid Subcategory Name')		
		return false;
	} else if ($('#subCategoryDescription').val().trim() === '') {
		$('#subCategoryDescription').focus()
		showErrorToast('Please Enter Subcategory Description')		
		return false;
	}else {
		return true;
	}
}



/**
 * Get the list of all employees
 * 
 * @param $scope
 * @param $http
 */
function getListOfAllEmployees($scope, $http) {
    $http.get(accontant_base_url+'home/employeesList.json').success(function(data){
    	$scope.employees = data.employees;
    });
}
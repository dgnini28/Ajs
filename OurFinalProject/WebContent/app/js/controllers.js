/* Controllers */
angular.module('myapp.controllers',[]).controller('clientController',["$scope","clientService","$routeParams","$rootScope","$window" ,function($scope,clientService,$routeParams,$rootScope,$window) {
	
	
	//alert("hiiii");
	$scope.addClient = function() {
		//alert("inside client cntrl 1.....");
		//alert($scope.clientData);
		clientService.submit($scope.clientData);
		console.log("Client added Successfully....."
				+ $scope.clientData);
		$scope.clientData = {};
	}
	
	$scope.deleteClient = function(clientname) {
				//alert($scope.clientname);
				$routeParams.clientName=$scope.clientname;
				$scope.remainingClients=[];
				$scope.remainingClients=clientService.Delete({
					clientName : $scope.clientname
				})
	}
	
	$scope.viewAllClients=function()
	{	
		//alert("in view all functions");
		$scope.clientList=[];

		clientService.getAll(function(data)
				{
			
					$scope.clientList=data;
				}
		
		);
	}
	
	$scope.updateClient=function(clnt_name)
	{
		alert("In client update method"+clnt_name);
		$routeParams.clientName=clnt_name;
		clientService.updateClient(
				{
					clientName : clnt_name
				})
				alert("After client update");
	}
	
	
	$scope.getClientByName = function(clientname) {
	
		$routeParams.clientName=$scope.clientname;
	
$scope.clientByName=clientService.get({
		clientName : $routeParams.clientName
		},


		function()
		{   
			$rootScope.clientByName=$scope.clientByName;

			console.log($rootScope.clientByName);

			$window.location.href = "#/clientupdate";
		})
	
	
								
		
		
		/*alert("inside get by name cntrl 1.....");
		
		  var entry = Post.get({ name: $scope.clientname }, function() {
			  alert("Hello")
			    console.log(entry);
			  });*/
	}
	
	
}]).controller('userController',["userService","$scope", "$routeParams","$rootScope","$window",function(userService,$scope,$routeParams,$rootScope,$window) {
	
//	alert("bye..select cntrl");
	$scope.addUser = function() {
	//	alert("inside user cntrl 1.....");
		//alert($scope.userData);
		userService.submit($scope.userData);
		console.log("User added Successfully....."
				+ $scope.userData);
		$scope.userData = {};
	}
	
	$scope.deleteUser = function() {
			//	alert($scope.userid);
				$routeParams.userId=$scope.userid;
				
				userService.Delete({
					userid : $scope.userid
				})
	}
	
	$scope.viewAllUser=function()
	{	
		//alert("in view all functions");
		$scope.UserList=[];		

		userService.getAll(function(data)
				{
			
					$scope.UserList=data;
				}
		
		);
	
	
		
	
	}
	
	$scope.getUserById = function() {
	//	alert("user by id function");
		//alert($scope.userid);
		$routeParams.userid=$scope.userid;
	$scope.user=userService.get({
		userid : $routeParams.userid
		},
		function()
		{   
			$rootScope.userByid=$scope.user;
		//	alert("in the get by id function befor console");
			console.log($rootScope.userByid);
		//	alert("in the get by id function after console");
			$window.location.href = "#/userupdate";
		})
	
	
		
	};	
}]);




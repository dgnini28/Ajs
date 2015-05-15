var myapp = angular.module('myapp', ['ngRoute','ngResource','myapp.controllers','myapp.services']);
 


myapp.config(['$routeProvider',function($routeProvider) {
    $routeProvider.
        when('/clientregistration', {templateUrl: 'app/partials/clientregistration.html' ,controller:'clientController'}).
    	when('/singleclient', {templateUrl: 'app/partials/singleclient.html',controller:'clientController'}).
    	when('/clientupdate', {templateUrl: 'app/partials/clientupdate.html',controller:'clientController'}).
    	when('/deleteclient', {templateUrl: 'app/partials/deleteclient.html',controller:'clientController'}).
    	 when('/userregistration', {templateUrl: 'app/partials/userregistration.html',controller:'userController'}).
     	when('/Singleuser', {templateUrl: 'app/partials/Singleuser.html',controller:'userController'}).
     	when('/userupdate', {templateUrl: 'app/partials/userupdate.html',controller:'userController'}).
     	when('/deleteuser', {templateUrl: 'app/partials/deleteuser.html',controller:'userController'}).
     	when('/allclients', {templateUrl: 'app/partials/allclient.html',controller:'clientController'}).
     	when('/allusers', {templateUrl: 'app/partials/allusers.html',controller:'userController'}).
        otherwise({
            redirectTo: '/'
          });
     
    
}]);    








   
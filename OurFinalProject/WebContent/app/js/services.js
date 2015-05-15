angular.module('myapp.services',[]).service('clientService', function($resource) {
	 console.log("i am in service");
	 return $resource('', {}, {
	     	submit:{
	     		method:'POST', 
	     		url:'rest/clients'
	     			},
	     			getAll : {
						method : 'GET',
						isArray : true,
						url : 'rest/clients'
	     			},
			Delete : {
			method : 'DELETE',
			url : 'rest/clients' + '/:clientName',
			params : {
				clientName : "@clientName",
				
			},
		},
		updateClient:
			{
			
				method:'PUT',
				url : 'rest/clients' + '/:clientName',
				params : {
					clientName : "@clientName",
					
				},
			},
		get:
		{
			method: 'GET',
			url : 'rest/clients' + '/:clientName',
			params : {
				clientName : "@clientName"
			},
		}
		});
}).service('userService', function($resource) {
console.log("i am in user service");
return $resource('', {}, {
	submit : {
		method : 'POST',
		url : 'rest/users'
	},
	getAll : {
		method : 'GET',
		isArray : true,
		url : 'rest/users'
		},
Delete : {
method : 'DELETE',
url : 'rest/users' + '/:userid',
params : {
userid : "@userid"
},
},
get:
{
method: 'GET',
url : 'rest/users' + '/:userid',
params : {
userid : "@userid"
},
}
    
});


})

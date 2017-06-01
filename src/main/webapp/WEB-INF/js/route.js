/**
 * Created by Administrator on 2017/6/1.
 */
angular.module('myApp', ['ngRoute'])
    .controller('HomeController', function ($scope, $route) { $scope.$route = $route;})
    .controller('welcomeController', function ($scope, $route) { $scope.$route = $route;})
    .config(function ($routeProvider) {
        $routeProvider.
        when('/home', {
            templateUrl: 'embedded.home.html',
            controller: 'HomeController'
        }).
        when('/about', {
            templateUrl: 'page/policy.html',
            controller: 'PolicyController'
        }).
        when('/welcome', {
            templateUrl: 'welcome.html',
            controller: 'welcomeController'
        }).
        otherwise({
            redirectTo: '/home'
        });
    });
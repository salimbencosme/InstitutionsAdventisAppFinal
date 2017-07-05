/**
 * Created by salim on 6/18/2017.
 */
angular.module("institutionmodule")
.config(function($routeProvider){

        $routeProvider
            .when("/",{
               templateUrl: "/app/components/institution/view.html",
                controller: "institutioncontroller"

            })

            .when("/districts",{
                templateUrl: "/app/components/district/view.html",
                controller: "districtcontroller"

            })

            .when("/associationormission",{
                templateUrl: "/app/components/associationormission/view.html",
                controller: "associationormissioncontroller"

            })

            .when("/union",{
                templateUrl: "/app/components/union/view.html",
                controller: "unioncontroller"

            })



        .otherwise("/");



    })

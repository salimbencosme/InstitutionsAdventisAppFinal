/**
 * Created by salim on 6/18/2017.
 */

angular.module("institutionmodule")
    .service('utilsService', function ($location,$route) {


        this.loadAPage = function( url){

            $location.path(url);
            $route.reload()

        }


    });
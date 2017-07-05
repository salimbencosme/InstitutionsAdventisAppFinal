/**
 * Created by salim on 6/18/2017.
 */

angular.module("institutionmodule")
    .service('typeInstitutionService', function ($http, $q) {

        this.urlBase = "http://localhost:8081";

        this.getAllTypeInstitutions = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/getalltype/").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }

    });
/**
 * Created by salim on 6/18/2017.
 */

angular.module("institutionmodule")
    .service('institutionService', function ($http, $q) {

        this.urlBase = "http://localhost:8081";

        this.getAllInstitutions = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/getallinstitution/").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }




        this.saveInstitution = function (tempForm) {

            var defer = $q.defer();
            $http.post(this.urlBase + '/saveinstitution/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(error);
                });

            return defer.promise;
        };


        this.updateInstitution = function (tempForm) {

            var defer = $q.defer();
            $http.put(this.urlBase + '/updateinstitution/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(null);
                });
            return defer.promise;
        };


        this.deleteInstitution = function (tempForm) {

            var defer = $q.defer();
            $http.put(this.urlBase + '/deleteinstitution/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(null);
                });
            return defer.promise;
        };



    });
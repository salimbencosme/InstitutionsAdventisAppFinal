/**
 * Created by salim on 6/18/2017.
 */

angular.module("institutionmodule")
    .service('unionService', function ($http, $q) {

        this.urlBase = "http://localhost:8081";

        this.getAllUnions = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/getallunions/").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }

        this.getAllUnionModels = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/getallunionsmodel/").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }


        this.getAllCountries = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/getallcontries/").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }


        this.saveUnion = function (tempForm) {

            var defer = $q.defer();
            $http.post(this.urlBase + '/saveunion/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(error);
                });

            return defer.promise;
        };


        this.updateUnion = function (tempForm) {

            var defer = $q.defer();
            $http.put(this.urlBase + '/updateunion/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(null);
                });
            return defer.promise;
        };


        this.deleteUnion = function (tempForm) {

            var defer = $q.defer();
            $http.put(this.urlBase + '/deleteunion/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(null);
                });
            return defer.promise;
        };


    });
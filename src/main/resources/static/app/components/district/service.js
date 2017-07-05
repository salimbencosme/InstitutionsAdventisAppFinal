/**
 * Created by salim on 6/18/2017.
 */

angular.module("institutionmodule")
    .service('districtService', function ($http, $q) {

        this.urlBase = "http://localhost:8081";

        this.getAllDistricts = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/getalldistrict/").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }

        this.getAllDistrictsModel = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/getalldistrictmodel/").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }


        this.getAllAssocciationOrMission = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/getallassociationormission/").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }





        this.saveDistrict = function (tempForm) {

            var defer = $q.defer();
            $http.post(this.urlBase + '/savedistrict/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(error);
                });

            return defer.promise;
        };


        this.updateDistrict = function (tempForm) {

            var defer = $q.defer();
            $http.put(this.urlBase + '/updatedistrict/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(null);
                });
            return defer.promise;
        };


        this.deleteDistrict = function (tempForm) {

            var defer = $q.defer();
            $http.put(this.urlBase + '/deletedistrict/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(null);
                });
            return defer.promise;
        };


    });
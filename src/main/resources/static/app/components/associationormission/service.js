/**
 * Created by salim on 6/18/2017.
 */

angular.module("institutionmodule")
    .service('associationormissionService', function ($http, $q) {

        this.urlBase = "http://localhost:8081";

        this.getAllAssociationOrMission = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/getallassociationormission/").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }


        this.getAllAssociationOrMissionModel = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/getallassociationormissionmodel/").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }







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





        this.saveAssociationOrMission = function (tempForm) {

            var defer = $q.defer();
            $http.post(this.urlBase + '/saveassociationormission/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(error);
                });

            return defer.promise;
        };


        this.updateAssociationOrMission = function (tempForm) {

            var defer = $q.defer();
            $http.put(this.urlBase + '/updateassociationormission/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(null);
                });
            return defer.promise;
        };


        this.deleteAssociationOrMission = function (tempForm) {

            var defer = $q.defer();
            $http.put(this.urlBase + '/deleteassociationormission/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(null);
                });
            return defer.promise;
        };


    });
angular.module("institutionmodule")
    .controller("districtcontroller", function ($scope,$window,$timeout, districtService,utilsService) {

        $scope.showDistrictForm = false;
        $scope.titleForm = "New District";
        $scope.typeMessage = "";
        $scope.textMessage = "";
        $scope.showMessage= false;


        $scope.callMessageComponent =  function($type,$text,$showornot){
            $scope.typeMessage = $type;
            $scope.textMessage = $text;
            $scope.showMessage= $showornot;
        }


        $scope.goToMainPage = function(){
            utilsService.loadAPage("/");
        }

        $scope.loadDistrictsList = function(){
            $scope.districtsList = [];
            districtService.getAllDistrictsModel().then(function (response) {
                $scope.districtsList = response.data;
            });
        }


        $scope.loadAssociationOrMissionSelectList = function () {
            districtService.getAllAssocciationOrMission().then(function (response) {

                    $scope.associationOrMissionSelectList = response.data;
            });
        }


        $scope.cleanFormDistrict = function(){
            $scope.titleForm = "New District";
            $scope.formDistrict = {};
            $scope.formDistrict.zone = 1;
            $scope.formDistrict.idassociationormission = 1;
            $scope.showDistrictForm = true;
            $scope.showSaveButton = true;
            $scope.showUpdateButton = false;
            $scope.showDeleteButton = false;

            $scope.loadAssociationOrMissionSelectList();

            $window.scrollTo(0, 0);

            $timeout(function() {
                $scope.cForm.$setPristine();
                $scope.cForm.$submitted = false;
            })

        }

        $scope.selectDistrict = function($district){
            $scope.titleForm = "District: "+$district.district.district;
            $scope.formDistrict = $district.district;

            $scope.loadAssociationOrMissionSelectList();

            $scope.showDistrictForm = true;
            $scope.showSaveButton = false;
            $scope.showUpdateButton = true;
            $scope.showDeleteButton = true;

            $window.scrollTo(0, 0);

        }

        $scope.hideDistrictForm = function(){
            $scope.showDistrictForm = false;
        }



        //CRUD


        $scope.saveDistrict = function () {
            districtService.saveDistrict($scope.formDistrict).then(function (response) {
                if(response.data != null){

                    var isSaved = response.data;

                    console.log("isSaved: "+isSaved);

                    if(isSaved === 'true'){
                        console.log("TRUE: "+isSaved );
                        $scope.callMessageComponent("sucess","District saved",true);
                        $scope.cleanFormDistrict();
                        $scope.loadDistrictsList();
                    }else{

                        console.log("FALSE: "+isSaved );
                        $scope.callMessageComponent("fail","ccoun't save District information. One similar is aready saved",true);
                    }
                }else{
                    console.log("que vino cuando  es null: "+response.data);
                    console.log("No se puede guardar");
                }
            });
        };


        $scope.updateDistrict = function () {
            districtService.updateDistrict($scope.formDistrict).then(function (response) {
                if(response.data != null){
                    var isUpdated = response.data;

                    console.log("isUpdated: "+isUpdated);

                    if(isUpdated === 'true'){
                        console.log("TRUE: "+isUpdated );
                        $scope.callMessageComponent("sucess","District updated",true);
                        $scope.loadDistrictsList();
                    }else{

                        console.log("FALSE: "+isUpdated );
                        $scope.callMessageComponent("fail","coudn't update District information.",true);
                    }
                }else{
                    console.log("No se pudo actualizar");
                }
            });
        };


        $scope.deleteDistrict = function () {
            districtService.deleteDistrict($scope.formDistrict).then(function (response) {
                if(response.data != null){

                    var isDeleted = response.data;

                    console.log("isDeleted: "+isDeleted);

                    if(isDeleted === 'true'){
                        console.log("TRUE: "+isDeleted );
                        $scope.callMessageComponent("sucess","District deleted",true);
                        $scope.cleanFormDistrict();
                        $scope.loadDistrictsList();
                        $scope.showDistrictForm = false;
                    }else{

                        console.log("FALSE: "+isSaved );
                        $scope.callMessageComponent("fail","ccoun't deleted Institution information.",true);
                    }



                }else{
                    console.log("No se pudo eliminar");
                }
            });
        };

        //END CRUD


    });
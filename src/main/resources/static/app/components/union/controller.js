angular.module("institutionmodule")
    .controller("unioncontroller", function ($scope,$window,$timeout, unionService,utilsService) {

        $scope.showUnionForm = false;
        $scope.titleForm = "New Union";
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

        $scope.loadUnionList = function(){
            $scope.unionList = [];
            unionService.getAllUnionModels().then(function (response) {
                $scope.unionList = response.data;
            });

        }


        $scope.loadCountriesSelectList = function () {
            unionService.getAllCountries().then(function (response) {
                    $scope.countriesSelectList = response.data;
            });
        }


        $scope.cleanFormUnion = function(){
            $scope.titleForm = "New Union";
            $scope.unionForm = {};
            $scope.unionForm.idcountry = 196;

            $scope.showUnionForm = true;
            $scope.showSaveButton = true;
            $scope.showUpdateButton = false;
            $scope.showDeleteButton = false;

            $scope.loadCountriesSelectList();

            $window.scrollTo(0, 0);

            $timeout(function() {
                $scope.cForm.$setPristine();
                $scope.cForm.$submitted = false;
            })

        }

        $scope.selectUnion = function($union){
            $scope.titleForm = "Union: "+$union.union.unionname;
            $scope.unionForm = $union.union;

            $scope.loadCountriesSelectList();

            $scope.showUnionForm = true;
            $scope.showSaveButton = false;
            $scope.showUpdateButton = true;
            $scope.showDeleteButton = true;

            $window.scrollTo(0, 0);

        }

        $scope.hideUnionForm = function(){
            $scope.showUnionForm = false;
        }



        //CRUD


        $scope.saveUnion = function () {
            unionService.saveUnion($scope.unionForm).then(function (response) {
                if(response.data != null){

                    var isSaved = response.data;

                    console.log("isSaved: "+isSaved);

                    if(isSaved === 'true'){
                        console.log("TRUE: "+isSaved );
                        $scope.callMessageComponent("sucess","Union saved",true);
                        $scope.cleanFormUnion();
                        $scope.loadUnionList();
                    }else{

                        console.log("FALSE: "+isSaved );
                        $scope.callMessageComponent("fail","ccoun't save Union information. One similar is aready saved",true);
                    }
                }else{
                    console.log("que vino cuando  es null: "+response.data);
                    console.log("No se puede guardar");
                }
            });
        };


        $scope.udpateUnion = function () {
            unionService.updateUnion($scope.unionForm).then(function (response) {
                if(response.data != null){
                    var isUpdated = response.data;

                    console.log("isUpdated: "+isUpdated);

                    if(isUpdated === 'true'){
                        console.log("TRUE: "+isUpdated );
                        $scope.callMessageComponent("sucess","Union updated",true);
                        $scope.loadUnionList();
                    }else{

                        console.log("FALSE: "+isUpdated );
                        $scope.callMessageComponent("fail","coudn't update Union information.",true);
                    }
                }else{
                    console.log("No se pudo actualizar");
                }
            });
        };


        $scope.deleteUnion= function () {
            unionService.deleteUnion($scope.unionForm).then(function (response) {
                if(response.data != null){

                    var isDeleted = response.data;

                    console.log("isDeleted: "+isDeleted);

                    if(isDeleted === 'true'){
                        console.log("TRUE: "+isDeleted );
                        $scope.callMessageComponent("sucess","Union deleted",true);
                        $scope.cleanFormUnion();
                        $scope.loadUnionList();
                        $scope.showUnionForm = false;
                    }else{

                        console.log("FALSE: "+isSaved );
                        $scope.callMessageComponent("fail","ccoun't deleted Union information.",true);
                    }



                }else{
                    console.log("No se pudo eliminar");
                }
            });
        };

        //END CRUD


    });
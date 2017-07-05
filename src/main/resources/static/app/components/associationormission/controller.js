angular.module("institutionmodule")
    .controller("associationormissioncontroller", function ($scope,$window,$timeout, associationormissionService,utilsService) {

        $scope.showAssociationOrMissionForm = false;
        $scope.titleForm = "New Association or Mission";
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

        $scope.loadAssociationOrMissionList = function(){
            $scope.associationOrMissionList = [];
            associationormissionService.getAllAssociationOrMissionModel().then(function (response) {
                $scope.associationOrMissionList = response.data;
            });
        }


        $scope.loadUnionSelectList = function () {
            associationormissionService.getAllUnions().then(function (response) {
                    $scope.UnionSelectList = response.data;
            });
        }


        $scope.cleanFormAssociationOrMission = function(){
            $scope.titleForm = "New Association or Mission";
            $scope.AssociationOrMissionForm = {};
            $scope.AssociationOrMissionForm.idunion = 1;
            $scope.AssociationOrMissionForm.type = 'true';

            $scope.showAssociationOrMissionForm = true;
            $scope.showSaveButton = true;
            $scope.showUpdateButton = false;
            $scope.showDeleteButton = false;

            $scope.loadUnionSelectList();

            $window.scrollTo(0, 0);

            $timeout(function() {
                $scope.cForm.$setPristine();
                $scope.cForm.$submitted = false;
            })

        }

        $scope.selectAssociationOrMission = function($associationormission){
            $scope.titleForm = "AssociationOrMission: "+$associationormission.associationormission.name;
            $scope.AssociationOrMissionForm = $associationormission.associationormission;
            $scope.AssociationOrMissionForm.type = String($associationormission.associationormission.type);
            $scope.loadUnionSelectList();

            $scope.showAssociationOrMissionForm = true;
            $scope.showSaveButton = false;
            $scope.showUpdateButton = true;
            $scope.showDeleteButton = true;

            $window.scrollTo(0, 0);

        }

        $scope.hideAssociationOrMissionForm = function(){
            $scope.showAssociationOrMissionForm = false;
        }



        //CRUD


        $scope.saveAssociationOrMission = function () {
            associationormissionService.saveAssociationOrMission($scope.AssociationOrMissionForm).then(function (response) {
                if(response.data != null){

                    var isSaved = response.data;

                    console.log("isSaved: "+isSaved);

                    if(isSaved === 'true'){
                        console.log("TRUE: "+isSaved );
                        $scope.callMessageComponent("sucess","Association or Mission saved",true);
                        $scope.cleanFormAssociationOrMission();
                        $scope.loadAssociationOrMissionList();
                    }else{

                        console.log("FALSE: "+isSaved );
                        $scope.callMessageComponent("fail","ccoun't save Association or Mission information. One similar is aready saved",true);
                    }
                }else{
                    console.log("que vino cuando  es null: "+response.data);
                    console.log("No se puede guardar");
                }
            });
        };


        $scope.udpateAssociationOrMission = function () {
            associationormissionService.updateAssociationOrMission($scope.AssociationOrMissionForm).then(function (response) {
                if(response.data != null){
                    var isUpdated = response.data;

                    console.log("isUpdated: "+isUpdated);

                    if(isUpdated === 'true'){
                        console.log("TRUE: "+isUpdated );
                        $scope.callMessageComponent("sucess","Association or Mission updated",true);
                        $scope.loadAssociationOrMissionList();
                    }else{

                        console.log("FALSE: "+isUpdated );
                        $scope.callMessageComponent("fail","coudn't update Association or Mission information.",true);
                    }
                }else{
                    console.log("No se pudo actualizar");
                }
            });
        };


        $scope.deleteAssociationOrMission= function () {
            associationormissionService.deleteAssociationOrMission($scope.AssociationOrMissionForm).then(function (response) {
                if(response.data != null){

                    var isDeleted = response.data;

                    console.log("isDeleted: "+isDeleted);

                    if(isDeleted === 'true'){
                        console.log("TRUE: "+isDeleted );
                        $scope.callMessageComponent("sucess","Association or Mission deleted",true);
                        $scope.cleanFormAssociationOrMission();
                        $scope.loadAssociationOrMissionList();
                        $scope.showAssociationOrMissionForm = false;
                    }else{

                        console.log("FALSE: "+isSaved );
                        $scope.callMessageComponent("fail","ccoun't deleted Association or Mission  information.",true);
                    }



                }else{
                    console.log("No se pudo eliminar");
                }
            });
        };

        //END CRUD


    });
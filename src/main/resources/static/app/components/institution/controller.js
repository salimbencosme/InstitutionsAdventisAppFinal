angular.module("institutionmodule")
    .controller("institutioncontroller", function ($scope,$window,$timeout, institutionService,typeInstitutionService,utilsService,districtService) {

        $scope.latitudeLogitudWherePageIsOpen = [19.0000000,-70.6667000]; //Dominican Republic
        $scope.prename  = "Iglesia adventista del septimo dia";
        $scope.showInstitutionForm = false;
        $scope.typeMessage = "";
        $scope.textMessage = "";
        $scope.showMessage= false;
        $scope.typeSelect = 0;


        $scope.callMessageComponent =  function($type,$text,$showornot){
            $scope.typeMessage = $type;
            $scope.textMessage = $text;
            $scope.showMessage= $showornot;
        }

        typeInstitutionService.getAllTypeInstitutions().then(function (response) {
            $scope.typeinstitutions = response.data;
            var firstOption  = { "idtypeinstitutions": 0, "active": true, "typename": "All" };
            $scope.typeinstitutions.unshift(firstOption);
        });



        $scope.loadInstitutionList = function(){
            institutionService.getAllInstitutions().then(function (response) {

                $scope.institutions = [];
                $scope.institutionsTemp = response.data;

                for(var x=0;x<$scope.institutionsTemp.length;x++){
                    $scope.institutions.push([{'checked' : true},$scope.institutionsTemp[x]]);
                }
            });

        }

        $scope.selectAll = function(){
            for(var x=0;x<$scope.institutions.length;x++){
                $scope.institutions[x][0].checked = true;
            }
            if($scope.typeSelect != null)
                $scope.typeSelect = 0;
        }

        $scope.deselectAll = function(){
            for(var x=0;x<$scope.institutions.length;x++){
                $scope.institutions[x][0].checked = false;
            }
            if($scope.typeSelect != null)
                $scope.typeSelect = 0;
        }


        $scope.refreshInstitutionBaseOnSelectedType = function(){

            for(var x=0;x<$scope.institutions.length;x++){

                switch ($scope.typeSelect){

                    case 0:
                        $scope.institutions[x][0].checked = true;
                        break;
                    case 1:

                        if($scope.institutions[x][1].typeinstitutions.typename === 'Chursh'){
                            $scope.institutions[x][0].checked = true;
                        }else{
                            $scope.institutions[x][0].checked = false;
                        }
                        break;

                    case 2:
                        if($scope.institutions[x][1].typeinstitutions.typename === 'School'){
                            $scope.institutions[x][0].checked = true;
                        }else{
                            $scope.institutions[x][0].checked = false;
                        }
                        break;
                    case 3:
                        if($scope.institutions[x][1].typeinstitutions.typename === 'University'){
                            $scope.institutions[x][0].checked = true;
                        }else{
                            $scope.institutions[x][0].checked = false;
                        }
                        break;

                    case 4:
                        if($scope.institutions[x][1].typeinstitutions.typename === 'Hospital'){
                            $scope.institutions[x][0].checked = true;
                        }else{
                            $scope.institutions[x][0].checked = false;
                        }
                        break;

                    case 5:
                        if($scope.institutions[x][1].typeinstitutions.typename === 'Restaurant'){
                            $scope.institutions[x][0].checked = true;
                        }else{
                            $scope.institutions[x][0].checked = false;
                        }
                        break;
                }

            }

        }




// FORM SELECTS AND CRUD
        typeInstitutionService.getAllTypeInstitutions().then(function (response) {
            $scope.selectTypeInstitutionsList = response.data;
        });

        districtService.getAllDistricts().then(function (response) {
            $scope.selectDsitrictList = response.data;
        });


        $scope.saveInsttituion = function () {
            institutionService.saveInstitution($scope.institutionsForm).then(function (response) {
                if(response.data != null){

                    var isSaved = response.data;

                    console.log("isSaved: "+isSaved);

                    if(isSaved === 'true'){
                        console.log("TRUE: "+isSaved );
                        $scope.callMessageComponent("sucess","Institution saved",true);
                        $scope.loadFormAddInstitutions();
                        $scope.loadInstitutionList();
                    }else{

                        console.log("FALSE: "+isSaved );
                        $scope.callMessageComponent("fail","ccoun't save Institution information. One similar is aready saved",true);
                    }
                }else{
                    console.log("que vino cuando  es null: "+response.data);
                    console.log("No se puede guardar");
                }
            });
        };


        $scope.updateInsttituion = function () {
            institutionService.updateInstitution($scope.institutionsForm).then(function (response) {
                if(response.data != null){
                    var isUpdated = response.data;

                    console.log("isUpdated: "+isUpdated);

                    if(isUpdated === 'true'){
                        console.log("TRUE: "+isUpdated );
                        $scope.callMessageComponent("sucess","Institution updated",true);
                        $scope.loadInstitutionList();
                    }else{

                        console.log("FALSE: "+isUpdated );
                        $scope.callMessageComponent("fail","coudn't update Institution information.",true);
                    }
                }else{
                    console.log("No se pudo actualizar");
                }
            });
        };


        $scope.deleteInsttituion = function () {
            institutionService.deleteInstitution($scope.institutionsForm).then(function (response) {
                if(response.data != null){

                    var isDeleted = response.data;

                    console.log("isDeleted: "+isDeleted);

                    if(isDeleted === 'true'){
                        console.log("TRUE: "+isDeleted );
                        $scope.callMessageComponent("sucess","Institution deleted",true);
                        $scope.loadFormAddInstitutions();
                        $scope.loadInstitutionList();
                        $scope.showInstitutionForm = false;
                    }else{

                        console.log("FALSE: "+isSaved );
                        $scope.callMessageComponent("fail","ccoun't deleted Institution information.",true);
                    }



                }else{
                    console.log("No se pudo eliminar");
                }
            });
        };

//END FORM SELECTS AND CRUD

// UTILITY CRUD
        $scope.loadFormAddInstitutions = function(){
            $scope.titleForm="Add new institution";
            $scope.showSaveButton = true;
            $scope.showUpdateButton = false;
            $scope.showDeleteButton = false;
            $scope.institutionsForm = {};
            $scope.institutionsForm.idtypeinstitutions = 1;
            $scope.institutionsForm.iddistrict = 1;
            $scope.showInstitutionForm = true;

            $window.scrollTo(0, 0);

            $timeout(function() {
                $scope.cForm.$setPristine();
                $scope.cForm.$submitted = false;
            })

        }

        $scope.loadInfoInstitutionToBeUpdatedOrDeleted = function($temp){
            $scope.titleForm="Institution selected: "+$temp[1].institutions.name;
            $scope.showSaveButton = false;
            $scope.showUpdateButton = true;
            $scope.showDeleteButton = true;
            $scope.institutionsForm = $temp[1].institutions;
            $scope.showInstitutionForm = true;
            $window.scrollTo(0, 0);
        }

        $scope.hideInstitutionForm = function(){
            $scope.showInstitutionForm = false;
            $scope.institutionsForm = {};
        }
//END UTILITY CRUD


 //URLS

        $scope.manageUrlsMentinance = function($urlToCall){

            switch ($urlToCall){

                case 1:
                    utilsService.loadAPage("/districts");
                    break;
                case 2:
                    utilsService.loadAPage("/associationormission");
                    break;

                case 3:
                    utilsService.loadAPage("/union");
                    break;



            }
        }

 //END URLS


        $scope.$on('mapInitialized', function (event, map) {
            $scope.objMapa = map;
        });

        $scope.showInfoWindow = function (event, p) {
            var infowindow = new google.maps.InfoWindow();
            var center = new google.maps.LatLng(p[1].institutions.latitude,p[1].institutions.longitude);

            infowindow.setContent(
                '<h5>' + p[1].institutions.name+ '<small> ('+p[1].typeinstitutions.typename+')</small>'+'</h5>'+
                '<h6>District: <small>'+p[1].district.district+'</small></h6>' +
                '<h6>Address: <small>'+p[1].institutions.address+'</small></h6>' +
                '<h6>Contact information: <small>'+p[1].institutions.contactinformation+'</small></h6>' );

            infowindow.setPosition(center);
            infowindow.open($scope.objMapa);
        };



    });
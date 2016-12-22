app.controller('Pessoa', function($scope, $http) {
    $http.get('http://localhost:8080/controle-chamados/public/pessoa/').
        then(function(response) {
            $scope.pessoas = response.data;
        });
});


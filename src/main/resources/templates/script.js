$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/movie/jaws"
    }).then(function(data, status, jqxhr) {
       $('.response').append("HOLAAAAAAAS");
       $('.response').append(data);

    });
});
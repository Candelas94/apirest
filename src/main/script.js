$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/movie/jaws"
    }).then(function(data, status, jqxhr) {
    //    $('.response').append(data.id);
    //    $('.greeting-content').append(data.content);
       console.log('RESPONSEEEEE', data);
       console.log('?????', jqxhr);
       $('.response').append("HOLAAAAAAAS");
       $('.response').append(data);

    });
});
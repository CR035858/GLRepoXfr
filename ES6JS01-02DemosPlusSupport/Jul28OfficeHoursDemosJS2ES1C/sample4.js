// Objects
var movies = {
    movieName : 'HKHK',
    releaseDate : '30/05/2022',
    
    collections : 2000000,
    distributors : [
        'dist1','dist2','dist3'
    ],
    cast : {
        cast1 : 'Sallu',
        cast2 : 'Rekha',
        cast3 : 'Rakhi'
    },
    addToColl : function(amt)
    {
        movies.collections += amt;
    }
};
console.log(movies);
console.log(movies.cast);
console.log(movies.distributors[1]);
console.log(movies.cast.cast1);
console.log(movies.cast.cast2);
console.log(movies.cast.cast3);
movies.addToColl(20000);
console.log(movies);
movies.director = 'Shankar Menon';
console.log(movies);
movies.addToDistr = function (distr){
this.distributors[this.distributors.length] = distr;
}
movies.addToDistr('distr4');
console.log(movies);
delete movies.movieName;
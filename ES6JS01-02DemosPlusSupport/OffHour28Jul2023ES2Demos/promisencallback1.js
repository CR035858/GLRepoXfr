const sum = (x,y) => {
    const promise = new Promise( (resolve, reject) => {

        setTimeout (  () => {
            cb( x + y);
        },2000);

    }) ;
   
    return promise;
}
console.log(sum (10,20, function(result) {
    console.log(result);

    sum(result, 30, function(result){
        console.log(result);
    });
}))
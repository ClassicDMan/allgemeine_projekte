
hello(goodbye);




function hello(callback){
        console.log("Hello");
        callback();

}

function leave(){
    console.log("leave");
}

function goodbye(){
    console.log("Goodbye");
}
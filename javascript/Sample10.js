simpleGreetProvider = function(){
    return "Hello ";
}

timelyGreetProvider = function(){
    greet="";

    hour = (new Date()).getHours();

    if (hour>=3 && hour<=11) greet="Good Morning ";
    else if(hour<=15) greet="Good Afternoon ";
    else greet="Good Evening ";

    return greet;
}

function greetUser(userName,greetProvider){
    return greetProvider() + " " + userName;
}
console.log(greetUser("Srinivas", simpleGreetProvider));

console.log(greetUser("Srinivas",timelyGreetProvider));

console.log(greetUser("Srinivas", function() { return "Sasriakal ";}));

console.log(greetUser("Vamsy",()=>"Namasthey "));

console.log(greetUser("Vamsy",()=>"Vanakkam "));
console.log(greetUser("Vamsy",()=>"Namaskar "));
(function(){
    console.log("has to execute her right away..!");    
})();